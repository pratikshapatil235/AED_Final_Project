package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.InsuranceFinanceOrganizatio
        n;
import model.organization.Organization;
import model.userAccount.User;
import javax.swing.JPanel;
import userinterface.InsuranceFinanceRole.InsuranceFinanceWorkAreaJPanel;

public class InsuranceFinanceManagerRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new InsuranceFinanceWorkAreaJPanel(userProcessContainer, account, (InsuranceFinanceOrganization)organization, enterprise);
    }
    
}
