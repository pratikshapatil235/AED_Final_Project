package model.role;
import model.PawcareSystem;
import model.userAccount.User;
import model.enterprise.Enterprise;
import model.organization.Organization;


import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

public class TestingLabAssistantRole extends Role{
    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

}
