/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.WebMedical;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Shail
 */
public abstract class Role {
    
    public enum RoleType{
        SysAdmin("System Admin"),
        Admin("Admin"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        LabEmployee("Lab Employee"),
        AdministrativeEmployee("Administrative Staff"),
        PharmacyCompany("Pharmacy"),
        Patient("Patient"),
        MedsProduction("MedsCompany"),
        FDA("Food and Drug Administration");
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            WebMedical business);
    public abstract RoleType getRoleType();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}