package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import model.organization.FinancialOrganization;
import model.userAccount.User;
import javax.swing.JPanel;
import userinterface.AngelInvestorRole.AngelInvestmentWorkAreaJPanel;

public class AngelInvestorRole extends Role {

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User userAccount, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new AngelInvestmentWorkAreaJPanel(userProcessContainer, userAccount, (FinancialOrganization)organization, enterprise);
    }
    
}
