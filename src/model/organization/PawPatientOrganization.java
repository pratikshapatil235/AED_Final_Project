package model.organization;
import java.util.ArrayList;
import model.role.PatientRole;
import model.role.VeterinarianRole;
import model.role.Role;
// Extended Organization
public class PawPatientOrganization extends Organization{

    public PawPatientOrganization() {
        
        super(Organization.Type.PawPatient.getValue());
    }
    
    @Override
    public ArrayList<Role> getValidRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        return roles;
    }

}
