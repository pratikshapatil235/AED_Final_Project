package model.enterprise;

import java.util.ArrayList;
import java.util.List;
import model.organization.Organization;
import model.role.Role;

public class EmergencyRescueEnterprise extends Enterprise{
    
    public EmergencyRescueEnterprise(String name) {
       super(name, EnterpriseType.EmergencyRescue);
    }

    @Override
    public List<Type> getTypesOfOrganizations() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Rescuer);

        return orgTypes;
    }

    @Override
    public ArrayList<Role> getValidRole() {
        return null;
    }

    
}
