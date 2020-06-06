/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

/**
 *
 * @author Shail
 */
public class Diagnosis {
    private String problem;
    private String diagnosisInfo;
    private String treatmentDate;
    private String doctorName;

   

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

     public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDiagnosisInfo() {
        return diagnosisInfo;
    }

    public void setDiagnosisInfo(String diagnosisInfo) {
        this.diagnosisInfo = diagnosisInfo;
    }

    public String getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(String treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    @Override
    public String toString() {
        return problem;
    }
    
    
}
