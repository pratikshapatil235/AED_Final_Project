package model.userAccount;

import model.employee.Employee;
import model.role.Role;
import model.taskbuffer.TaskBuffer;


public class User {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private TaskBuffer workQueue;

    public User() {
        workQueue = new TaskBuffer();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public TaskBuffer getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}