/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.WebMedical;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EnterpriseAdminRole.EnterpriseAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shail
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, WebMedical business) {
        return new EnterpriseAdminWorkAreaJPanel(userProcessContainer, enterprise, business, account);
    }

    @Override
    public RoleType getRoleType() {
        return RoleType.Admin;
    }
}
