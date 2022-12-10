package model.organization;

import model.role.InsuranceAgentRole;
import model.role.Role;
import java.util.ArrayList;

public class InsuranceAgentOrganization extends Organization {

    public InsuranceAgentOrganization() {
        super(Organization.Type.InsuranceAgent.getValue());
    }

    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAgentRole());
        return roles;
    }

}
