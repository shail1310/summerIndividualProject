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
public class DiagnosisHistory {
    ArrayList<Diagnosis> diagnosisList;

    public DiagnosisHistory() {
        diagnosisList = new ArrayList();
    }
    
    public Diagnosis AddDignosisInformation(){
        Diagnosis diagnosis = new Diagnosis();
        diagnosisList.add(diagnosis);
        return diagnosis;
    }

    public ArrayList<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }
    
    
}
