package model.organization;
import java.util.ArrayList;
import model.role.TestingLabAssistantRole;
import model.role.Role;

public class TestingLabOrganization extends Organization{

    public TestingLabOrganization() {
        super(Organization.Type.Lab.getValue());
    }
    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TestingLabAssistantRole());
        return roles;
    }

    
    
}
