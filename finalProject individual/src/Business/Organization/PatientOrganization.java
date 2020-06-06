/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Patient.PatientDir;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shail
 */
public class PatientOrganization extends Organization{

    private PatientDir patientDir;
    public PatientOrganization() {
        super(Organization.Type.Patient.getValue());
        this.patientDir = new PatientDir();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }

    @Override
    public Type getOrganizationType() {
        return Organization.Type.Patient;
    }

    public PatientDir getPatientDir() {
        return patientDir;
    }
    
}
