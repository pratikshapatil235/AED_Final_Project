package model.organization;

import model.employee.EmployeeDirectory;
import model.role.Role;
import model.userAccount.UserDirectory;
import model.taskbuffer.TaskBuffer;
import java.util.ArrayList;


public abstract class Organization {

    private String organizationName;
    private TaskBuffer workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    

    public enum Type {

        //HealthCareSystem Organization Types:
        Admin("Admin Organization"), Veterinarian("Veterinarian Organization"), Lab("Lab Organization"), PawPatient("Patient Organization"), Accountant("Accountant Organization"),
        //Insurance Organization Types:
        InsuranceAgent("Insurance Agent Organization"), InsurancePolicyPlanner("Insurance Policy Planning Organization"), InsuranceFinanceOrganization("Insurance Finance Organization"),
        //Ngo Organization Types
        AngelInvestor("AngelInvestor Organization"), NGOHead("Secretary Organization"), HealthcareOfficer("Healthcare Officer Organization"),
        //Emergency Rescue Organization types
        Rescuer("Rescuer Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.organizationName = name;
        workQueue = new TaskBuffer();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getValidRole();

    public UserDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return organizationName;
    }

    public TaskBuffer getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.organizationName = name;
    }

    public void setWorkQueue(TaskBuffer workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }

}
