package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.InsurancePolicyPlannerOrganization;
import model.organization.Organization;
import model.userAccount.User;
import javax.swing.JPanel;
import userinterface.InsurancePolicyPlannerRole.InsurancePolicyPlannerWorkAreaJPanel;

public class InsurancePolicyPlannerRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new InsurancePolicyPlannerWorkAreaJPanel(userProcessContainer, account, (InsurancePolicyPlannerOrganization)organization, enterprise);
    }
    
}
