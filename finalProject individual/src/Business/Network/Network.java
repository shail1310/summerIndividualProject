/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Drug.DrugDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Shail
 */
public class Network {
    
    private String countryName;
    private EnterpriseDirectory enterpriseDirectory;
    private DrugDirectory nationalDrugDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        nationalDrugDirectory = new DrugDirectory();
    }

    public DrugDirectory getNationalDrugDirectory() {
        return nationalDrugDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public void setNationalDrugDirectory(DrugDirectory nationalDrugDirectory) {
        this.nationalDrugDirectory = nationalDrugDirectory;
    }
    
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return countryName;
    }
    
    
}
