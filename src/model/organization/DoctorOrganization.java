package model.organization;
import java.util.ArrayList;
import model.role.VeterinarianRole;
import model.role.Role;



public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.Type.Veterinarian.getValue());
    }
    
    // added veterinarian role in roles arraylist 
    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VeterinarianRole());
        return roles;
    }

    
    
    
}
