

package model.role;
import model.organization.NGOHeadOrganization;
import model.userAccount.User;
import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import javax.swing.JPanel;
import userinterface.NGOHeadRole.NGOHeadWorkAreaJPanel;

public class NGOHeadRole extends Role{

    @Override
    public JPanel displayWorkArea(JPanel userProcessContainer, User userAccount, Organization organization, Enterprise enterprise, PawcareSystem business) {
        return new NGOHeadWorkAreaJPanel(userProcessContainer, userAccount, 
                (NGOHeadOrganization)organization, enterprise, business);
    }
    
}
