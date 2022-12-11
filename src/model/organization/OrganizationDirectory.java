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
        
     
        if (type.getValue().equals(Type.Veterinarian.getValue())){
            organization = new DoctorOrganization();
            organizationsDirectory.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new TestingLabOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.PawPatient.getValue())) {
            organization = new PawPatientOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.Accountant.getValue())) {
            organization = new BillingOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.HealthcareOfficer.getValue())) {
            organization = new HealthCareOfficerOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.NGOHead.getValue())) {
            organization = new NGOHeadOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.AngelInvestor.getValue())) {
            organization = new FinancialOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.InsuranceAgent.getValue())) {
            organization = new InsuranceAgentOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.InsuranceFinanceOrganization.getValue())) {
            organization = new InsuranceFinanceOrganization();
            organizationsDirectory.add(organization);
        } else if(type.getValue().equals(Type.InsurancePolicyPlanner.getValue())) {
            organization = new InsurancePolicyPlannerOrganization();
            organizationsDirectory.add(organization);
        } else if (type.getValue().equals(Type.Rescuer.getValue())) {
            organization = new RescuerOrganization();
            organizationsDirectory.add(organization);
        }
       
        return organization;
    }
}