package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import model.userAccount.User;
import javax.swing.JPanel;
import userinterface.pawPatientRole.PawPatientWorkAreaJPanel;

public class PatientRole extends Role{
     @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new PawPatientWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
}
