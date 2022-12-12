package model.role;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import model.userAccount.User;
import javax.swing.JPanel;

public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Veterinarian("Veterinarian"),
        TestingLabAssistant("TestingLab Assistant"),
        PawPatient("PawPatient"),
        Accountant("Accountant"),
        InsuranceAgent("Insurance Agent"),
        InsurancePlanner("Insurance Policy Planner"),
        InsuranceFinanceManager("Insurance Finance Manager"),
        NGOHealthOfficer("NGO Health Officer"),
        AngelInvestor("AngelInvestor"),
        NGOHead("NGO Head");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel displayWorkArea(JPanel userProcessContainer,
            User account,
            Organization organization,
            Enterprise enterprise,
            PawcareSystem ecosystem);

    @Override
    public String toString() {
        String className = this.getClass().getName();
        String[] splitStr = className.split("\\.");
        return splitStr[splitStr.length - 1];
    }

}
