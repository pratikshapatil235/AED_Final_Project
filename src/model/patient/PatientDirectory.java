
package model.patient;

import java.util.ArrayList;
import java.util.List;

public class PatientDirectory {
    
    private List<Patient> patients = new ArrayList<>();

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
}
