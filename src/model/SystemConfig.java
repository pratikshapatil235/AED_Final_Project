package model;

import model.employee.Employee;
import model.role.SystemAdminRole;
import model.userAccount.User;


public class SystemConfig {
    
    public static PawcareSystem configure(){
        
        PawcareSystem pawcareSystem = PawcareSystem.getInstance();
        
        System.out.println("Pawcare ");
        System.out.println(pawcareSystem);
        
        Employee employee = pawcareSystem.getEmployeeDirectory().createEmployee("sysadmin");
        
        System.out.println("Employee ");
        System.out.println(employee);
        
        User userAccount = pawcareSystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        System.out.println("UserAccount ");
        System.out.println(userAccount);
        
        return pawcareSystem;
    }
    
}
