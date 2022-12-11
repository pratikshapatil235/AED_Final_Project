package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.userAccount.User;
import model.organization.DoctorOrganization;
import model.organization.Organization;
import userinterface.veterinarianRole.VeterinarianWorkAreaJPanel;
import javax.swing.JPanel;

public class VeterinarianRole extends Role{
    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User userAccount, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new VeterinarianWorkAreaJPanel(userProcessContainer, userAccount, (DoctorOrganization)organization, enterprise);
    }

    
}
