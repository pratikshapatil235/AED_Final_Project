package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.HealthCareOfficerOrganization;
import model.organization.Organization;
import model.userAccount.User;
import javax.swing.JPanel;
import userinterface.HealthcareOfficerRole.OfficerWorkAreaJPanel;

public class NGOHealthOfficerRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User userAccount, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new OfficerWorkAreaJPanel(userProcessContainer, userAccount, (HealthCareOfficerOrganization)organization, enterprise);
    }
    
}
