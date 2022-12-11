package model.userAccount;

import model.employee.Employee;
import model.role.Role;

import java.util.ArrayList;

public class UserDirectory {

    private ArrayList<User> userAccountList;

    public UserDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userAccountList;
    }

    public User authenticateUser(String username, String password) {
        for (User ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }

        return null;
    }

    public User createUserAccount(String username, String password, Employee employee, Role role) {
        User userAccount = new User();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (User ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
