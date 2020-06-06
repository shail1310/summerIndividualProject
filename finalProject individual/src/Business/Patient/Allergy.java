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
public class Allergy {
    private AllergyType allergyType;
    private String description;

    public Allergy(AllergyType type, String description) {
        this.allergyType = type;
        this.description = description;
    }
    
     public enum AllergyType{
        DrugAllergy("Drug"),
        FoodAllergy("Food");
        
        private String value;

        private AllergyType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public AllergyType getAllergyType() {
        return allergyType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return allergyType.value;
    }
    
    
}
