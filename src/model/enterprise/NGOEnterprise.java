package model.enterprise;

import model.organization.Organization;
import model.role.Role;
import java.util.ArrayList;
import java.util.List;

public class NGOEnterprise extends Enterprise {

    public NGOEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.NGO);
    }

    @Override
    public ArrayList<Role> getValidRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getTypesOfOrganizations() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.HealthcareOfficer);
        orgTypes.add(Organization.Type.NGOHead);
        orgTypes.add(Organization.Type.AngelInvestor);

        return orgTypes;
    }

}
