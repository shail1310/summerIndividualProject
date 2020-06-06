/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author Shail
 */
public class Drug {
    private String medicineName;
    private String safetyIssues;
    private ArrayList<String> manufacturerList;
    private boolean fdaApproved = false;
    private ArrayList<DrugFeedback> drugFeedbacks;
    private int fatalAdvEventCount = 0;

    public int getFatalAdvEventCount() {
        return fatalAdvEventCount;
    }

    public void incrementFatalAdverseEventCount(){
        fatalAdvEventCount ++;
    }
    
    public Drug() {
        manufacturerList = new ArrayList();
        drugFeedbacks = new ArrayList();
    }
    
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getSafetyIssues() {
        return safetyIssues;
    }

    public void setSafetyIssues(String safetyIssues) {
        this.safetyIssues = safetyIssues;
    }

    public ArrayList<String> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(ArrayList<String> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public boolean isFdaApproved() {
        return fdaApproved;
    }

    public void setFdaApproved(boolean fdaApproved) {
        this.fdaApproved = fdaApproved;
    }

    public ArrayList<DrugFeedback> getDrugFeedbacks() {
        return drugFeedbacks;
    }

    public void setDrugFeedbacks(ArrayList<DrugFeedback> drugFeedbacks) {
        this.drugFeedbacks = drugFeedbacks;
    }

    @Override
    public String toString() {
        return medicineName;
    }
}
