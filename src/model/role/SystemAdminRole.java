package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import model.userAccount.User;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

public class SystemAdminRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, PawcareSystem ecosystem) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
    }
    
}
