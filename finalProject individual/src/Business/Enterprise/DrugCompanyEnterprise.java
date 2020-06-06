/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.MedsProductionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shail
 */
public class DrugCompanyEnterprise extends Enterprise{

    private ArrayList<String> drugList;
    
    public DrugCompanyEnterprise(String name, String state) {
        super(name, EnterpriseType.DrugCompany, state);
        drugList = new ArrayList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedsProductionRole());
        return roles;
    }

    public ArrayList<String> getDrugList() {
        return drugList;
    }
    

    @Override
    public Type getOrganizationType() {
        return Organization.Type.DrugCompany;
    }
    
    
}
