package model.insuranceCustomer;

import java.util.ArrayList;
import java.util.List;


public class InsuranceCustomerDirectory {

    private List<InsuranceCustomer> insuranceCustomers = new ArrayList<>();

    public List<InsuranceCustomer> getInsuranceCustomers() {
        return insuranceCustomers;
    }

    public void setInsuranceCustomers(List<InsuranceCustomer> insuranceCustomers) {
        this.insuranceCustomers = insuranceCustomers;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insuranceCustomers + '}';
    }

}
