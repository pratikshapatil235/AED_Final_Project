package model.organization;

import model.role.NGOHeadRole;
import model.role.Role;
import java.util.ArrayList;

public class NGOHeadOrganization extends Organization {

    public NGOHeadOrganization() {
        super(Organization.Type.NGOHead.getValue());
    }

    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOHeadRole());
        return roles;
    }
    
}
