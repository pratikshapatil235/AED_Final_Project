package model.organization;

import model.role.InsurancePolicyPlannerRole;
import model.role.Role;
import java.util.ArrayList;

public class InsurancePolicyPlannerOrganization extends Organization {

    public InsurancePolicyPlannerOrganization() {
        super(Organization.Type.InsurancePolicyPlanner.getValue());
    }

    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsurancePolicyPlannerRole());
        return roles;
    }
    
}
