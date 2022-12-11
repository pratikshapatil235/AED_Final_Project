package model.enterprise;
import model.organization.Organization;
import java.util.ArrayList;
import java.util.List;
import model.patient.PawPatientDirectory;
import model.role.Role;


public class HealthCareEnterprise extends Enterprise{
    private PawPatientDirectory patientDirectory;

    public HealthCareEnterprise(String name) {
        super(name, EnterpriseType.HealthCenter);
        patientDirectory = new PawPatientDirectory();
    }

    @Override
    public ArrayList<Role> getValidRole() {
        return null;
    }

    public List<Organization.Type> getTypesOfOrganizations() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Veterinarian);
        orgTypes.add(Organization.Type.Lab);
        orgTypes.add(Organization.Type.PawPatient);
        orgTypes.add(Organization.Type.Accountant);

        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public PawPatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PawPatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    
}
