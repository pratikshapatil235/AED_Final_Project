package model.role;
import javax.swing.JPanel;
import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.DoctorOrganization;
import model.userAccount.User;
import model.organization.Organization;
import model.organization.RescuerOrganization;
import userinterface.RescuerRole.RescuerWorkAreaJPanel;


public class RescuerRole extends Role{
    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User userAccount, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new RescuerWorkAreaJPanel(userProcessContainer, userAccount, (RescuerOrganization)organization, enterprise);
    }

    
    
}
