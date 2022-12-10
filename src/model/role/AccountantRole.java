package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.BillingOrganization;
import model.organization.Organization;
import model.userAccount.User;
import javax.swing.JPanel;
import userinterface.HealthcareAccountantRole.AccountantWorkAreaJPanel;

public class AccountantRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem ecosystem) {
        return new AccountantWorkAreaJPanel(userProcessContainer, account, (BillingOrganization)organization, enterprise, ecosystem);
    }
    
}
