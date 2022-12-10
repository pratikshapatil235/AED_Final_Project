package model.organization;

import model.role.InsuranceFinanceManagerRole;
import model.role.Role;
import java.util.ArrayList;

public class InsuranceFinanceOrganization extends Organization {

    public InsuranceFinanceOrganization() {
        super(Organization.Type.InsuranceFinanceOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceFinanceManagerRole());
        return roles;
    }

}
