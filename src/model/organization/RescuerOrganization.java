package model.organization;

import java.util.ArrayList;
import model.role.Role;
import model.role.RescuerRole;


public class RescuerOrganization extends Organization{
        public RescuerOrganization() {
        super(Organization.Type.Rescuer.getValue());
    }

    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RescuerRole());
        return roles;
    }

    
}
