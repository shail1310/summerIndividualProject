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
public class Patient {
    private String patientId;
    private String fullName;    
    private String phoneNo;
    private int age;
    private String dob;
    private String sex;
    private String language;
    private String smokingStatus;
    private String problems;
    private String emailId;
    private AllergyInfo allergyInformation;
    private VitalSignHistory vsh;
    private DiagnosisHistory dignosisHistory;
    private ArrayList<String> labTestAndReports = new ArrayList();
    private ArrayList<String> patientMedications = new ArrayList();

    

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    public Patient() {
        allergyInformation = new AllergyInfo();
        vsh = new VitalSignHistory();
        dignosisHistory = new DiagnosisHistory();
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public VitalSignHistory getVsh() {
        return vsh;
    }

    public void setVsh(VitalSignHistory vsh) {
        this.vsh = vsh;
    }
    
    public ArrayList<String> getLabTestHistory() {
        return labTestAndReports;
    }

    public void setLabTestHistory(ArrayList labTestAndReports) {
        this.labTestAndReports = labTestAndReports;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public AllergyInfo getAllergyInformation() {
        return allergyInformation;
    }

    public void setAllergyInformation(AllergyInfo allergyInformation) {
        this.allergyInformation = allergyInformation;
    }

    public ArrayList<String> getPatientMedications() {
        return patientMedications;
    }

    public void setPatientMedications(ArrayList<String> patientMedications) {
        this.patientMedications = patientMedications;
    }

    @Override
    public String toString() {
        return fullName;
    }

    public DiagnosisHistory getDignosisHistory() {
        return dignosisHistory;
    }
    
    
}
