package model.organization;

import model.role.AccountantRole;
import model.role.Role;
import java.util.ArrayList;

public class BillingOrganization extends Organization {

    public BillingOrganization() {
        super(Organization.Type.Accountant.getValue());

    }

    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountantRole());
        return roles;
    }

}
