package model.organization;

import model.role.AngelInvestorRole;
import model.role.Role;
import java.util.ArrayList;

public class FinancialOrganization extends Organization {

   public FinancialOrganization() {
        super(Organization.Type.AngelInvestor.getValue());
    }

    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AngelInvestorRole());
        return roles;
    }
    
}
