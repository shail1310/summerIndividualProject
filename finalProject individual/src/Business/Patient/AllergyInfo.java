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
 * 
 */
public class AllergyInfo {
    ArrayList<Allergy> allergyList;

    public AllergyInfo() {
       allergyList = new ArrayList();
    }

    public ArrayList<Allergy> getAllergyList() {
        return allergyList;
    }
    
    public void addAllergy(Allergy.AllergyType type, String description){
        allergyList.add(new Allergy(type, description));
    }
}
