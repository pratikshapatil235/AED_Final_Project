package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import model.userAccount.User;
import userinterface.AdministrativeRole.EnterpriseAdminWorkAreaJPanel;
import javax.swing.JPanel;


public class EnterpriseAdminRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem ecosystem) {
        return new EnterpriseAdminWorkAreaJPanel(userProcessContainer, enterprise, account,ecosystem);
    }

    
    
}
