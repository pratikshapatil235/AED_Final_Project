package model.enterprise;

import model.insurance.InsurancePolicyDirectory;
import model.insuranceCustomer.InsuranceCustomerDirectory;
import model.organization.Organization;
import model.role.Role;
import java.util.ArrayList;
import java.util.List;

public class PawInsuranceEnterprise extends Enterprise {

    private InsuranceCustomerDirectory insuranceCustomerDirectory;

    private InsurancePolicyDirectory insurancePolicyDirectory;

    public PawInsuranceEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.PawInsurance);
        insuranceCustomerDirectory = new InsuranceCustomerDirectory();
        insurancePolicyDirectory = new InsurancePolicyDirectory();

    }

    @Override
    public ArrayList<Role> getValidRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getTypesOfOrganizations() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsuranceAgent);
        orgTypes.add(Organization.Type.InsurancePolicyPlanner);
        orgTypes.add(Organization.Type.InsuranceFinanceOrganization);

        return orgTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
        return insuranceCustomerDirectory;
    }

    public void setInsuranceCustomerDirectory(InsuranceCustomerDirectory insuranceCustomerDirectory) {
        this.insuranceCustomerDirectory = insuranceCustomerDirectory;
    }

    public InsurancePolicyDirectory getInsurancePolicyDirectory() {
        return insurancePolicyDirectory;
    }

    public void setInsurancePolicyDirectory(InsurancePolicyDirectory insurancePolicyDirectory) {
        this.insurancePolicyDirectory = insurancePolicyDirectory;
    }

}
