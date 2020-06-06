/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nikhil
 */
public class HospitalEnterprise extends Enterprise{
    public HospitalEnterprise(String name, String state) {
        super(name, EnterpriseType.Hospital, state);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public Type getOrganizationType() {
        return null;
    }
}
