/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Shail
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public boolean isOrganizationExists(Organization.Type type){
        for(Organization o: this.organizationList){
            if(o.getOrganizationType().equals(type)){
                return true;
            }
        }
        return false;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        switch(type){
            case Doctor:
                organization = new DoctorOrganization();
                organizationList.add(organization);
                break;
            case Lab:
                organization = new LabOrganization();
                organizationList.add(organization);
                break;
            case AdministrativeStaff:
                organization = new AdministrativeStaffOrganization();
                organizationList.add(organization);
                break;
            case Patient:
                organization = new PatientOrganization();
                organizationList.add(organization);
                break;
        }
        return organization;
    }
    
    public Organization searchOrganization(Organization.Type orgType){
        for(Organization o: organizationList){
            if(o.getOrganizationType().getValue().equals(orgType.getValue())){
                return o;
            }
        }
        return null;
    }
}