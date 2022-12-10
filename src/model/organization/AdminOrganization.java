package model.organization;
import model.role.EnterpriseAdminRole;
import model.role.Role;
import java.util.ArrayList;


public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
     
}
