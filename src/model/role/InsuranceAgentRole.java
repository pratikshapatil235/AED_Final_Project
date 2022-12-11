package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.InsuranceAgentOrganization;
import model.organization.Organization;
import model.userAccount.User;
import javax.swing.JPanel;
import userinterface.InsuranceAgentRole.InsuranceAgentWorkAreaJPanel;

public class InsuranceAgentRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem business) {
     return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, (InsuranceAgentOrganization)organization, enterprise);
    }
    
}
