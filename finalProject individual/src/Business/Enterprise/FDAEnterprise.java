/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.DrugAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nikhil
 */
public class FDAEnterprise extends Enterprise{

    public FDAEnterprise(String name, String state) {
        super(name, EnterpriseType.FDA, null);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DrugAdminRole());
        return roles;
    }

    @Override
    public Type getOrganizationType() {
        return Type.FDA;
    }
    
}
