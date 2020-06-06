/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.UserAccount;

import Business.Patient.Patient;

/**
 *
 * @author Shail
 */
public class PatientAccount extends UserAccount{
    private Patient patientAccount;

    public Patient getPatientAccount() {
        return patientAccount;
    }

    public void setPatientAccount(Patient patientAccount) {
        this.patientAccount = patientAccount;
    }
    
}
