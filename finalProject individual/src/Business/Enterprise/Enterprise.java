/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.AdminRole;
import Business.Role.MedsProductionRole;
import Business.Role.DrugAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Shail
 */
public abstract class Enterprise extends Organization{
    private String netName;
    private String netState;
    private EnterpriseType entType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String name, EnterpriseType type, String state) {
        super(name);
        this.entType = type;
        this.netState = state;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        DrugCompany("DrugCompany"),
        FDA("FoodAndDrugApproval");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public String getNetState() {
        return netState;
    }

    public void setNetState(String netState) {
        this.netState = netState;
    }

    public EnterpriseType getEntType() {
        return entType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }
    
    public boolean isEnterpriseAdminExists(){
        for(UserAccount ua: this.getUserAccountDirectory().getUserAccountList()){
            if(ua.getRole() instanceof AdminRole || ua.getRole() instanceof DrugAdminRole 
                    || ua.getRole() instanceof MedsProductionRole){
                return true;
            }
        }
        return false;
    }
    
    public UserAccount getEnterpriseAdmin(){
        for(UserAccount ua: this.getUserAccountDirectory().getUserAccountList()){
            if(ua.getRole().getRoleType().equals(Role.RoleType.Admin)){
                return ua;
            }
        }
        return null;
    }
   }
