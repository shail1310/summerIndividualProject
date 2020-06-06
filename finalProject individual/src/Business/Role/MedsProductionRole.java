/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.WebMedical;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DrugCompanyRole.MedsCompanyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shail
 */
public class MedsProductionRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, WebMedical business) {
        return new MedsCompanyWorkAreaJPanel(userProcessContainer, account, enterprise, business);
    }

    @Override
    public RoleType getRoleType() {
        return RoleType.MedsProduction;
    }
    
}
