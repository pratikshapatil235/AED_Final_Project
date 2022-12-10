
package model.patient;

import java.util.ArrayList;
import java.util.List;

public class PawPatientDirectory {
    
    private List<PawPatient> patients = new ArrayList<>();

    public List<PawPatient> getPatients() {
        return patients;
    }

    public void setPatients(List<PawPatient> patients) {
        this.patients = patients;
    }
    
}
