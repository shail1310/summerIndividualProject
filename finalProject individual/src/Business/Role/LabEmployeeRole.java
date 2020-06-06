/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.WebMedical;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.LabAssistantRole.LabEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shail
 */
public class LabEmployeeRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, WebMedical business) {
        return new LabEmployeeWorkAreaJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise);
    }

    @Override
    public RoleType getRoleType() {
        return RoleType.LabEmployee;
    }
    
    
}
