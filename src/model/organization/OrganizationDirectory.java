package model.organization;

import model.organization.Organization.Type;
import static model.organization.Organization.Type.InsuranceFinanceOrganization;
import java.util.ArrayList;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationsDirectory;

    public OrganizationDirectory() {
        organizationsDirectory = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationsDirectory() {
        return organizationsDirectory;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null; 
        
             
        return organization;
    }
}