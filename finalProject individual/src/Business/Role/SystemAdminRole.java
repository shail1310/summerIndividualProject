/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.WebMedical;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shail
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel upc, UserAccount account, Organization organization, Enterprise enterprise, WebMedical webMedical) {
        return new SystemAdminWorkAreaJPanel(upc, webMedical);
    }

    @Override
    public RoleType getRoleType() {
        return RoleType.SysAdmin;
    }
}
