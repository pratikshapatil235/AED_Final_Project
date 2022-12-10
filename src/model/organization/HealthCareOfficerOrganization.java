package model.organization;

import model.role.Role;
import java.util.ArrayList;
import model.role.NGOHealthOfficerRole;
import model.role.TestingLabAssistantRole;


public class HealthCareOfficerOrganization extends Organization{

    public HealthCareOfficerOrganization() {
                super(Organization.Type.HealthcareOfficer.getValue());

    }
    
    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOHealthOfficerRole());
        return roles;
    }

    
}
