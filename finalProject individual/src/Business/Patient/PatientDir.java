/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Shail
 */
public class PatientDir {
    ArrayList<Patient> patientDir;

    public PatientDir() {
        patientDir = new ArrayList();
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }
    
    public Patient searchPatient(String patientName){
        for(Patient p: patientDir){
            if(p.getFullName().equalsIgnoreCase(patientName)){
                return p;
            }
        }
        return null;
    }
    
}
