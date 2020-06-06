/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author nikhil
 */
public class DrugDirectory {
    ArrayList<Drug> drugList;

    public DrugDirectory() {
        drugList = new ArrayList();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }
    
    public Drug findDrugInformation(String drugName){
        for(Drug drug: drugList){
            if(drug.getMedicineName().equalsIgnoreCase(drugName)){
                return drug;
            }
        }
        return null;
    }
    
    public Drug addNewDrug(){
        Drug drug = new Drug();
        drugList.add(drug);
        return drug;
    }
}
