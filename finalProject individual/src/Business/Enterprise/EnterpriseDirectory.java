/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author nikhil
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String state){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name, state);
            enterpriseList.add(enterprise);
        }else if(type == Enterprise.EnterpriseType.DrugCompany){
            enterprise = new DrugCompanyEnterprise(name, state);
            enterpriseList.add(enterprise);
        }else if(type == Enterprise.EnterpriseType.FDA){
            enterprise = new FDAEnterprise(name, null);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public Enterprise getEnterprise(String state, Enterprise.EnterpriseType type, String name){
        for(Enterprise enterprise: enterpriseList){
            
            if(type == Enterprise.EnterpriseType.FDA){
                if(enterprise instanceof FDAEnterprise){
                    return enterprise;
                }
            }else if(enterprise.getNetState().equalsIgnoreCase(state) &&
                    enterprise.getEntType().equals(type) &&
                    enterprise.getName().equalsIgnoreCase(name)){
                return enterprise;
            }
        }
        return null;
    }
    
    public boolean isFDAEnterpriseExists(){
        for(Enterprise enterprise: enterpriseList){
            if(enterprise instanceof FDAEnterprise){
                return true;
            }
        }
        return false;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
}
