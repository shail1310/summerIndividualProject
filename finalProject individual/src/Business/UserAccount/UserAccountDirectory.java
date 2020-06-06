/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nikhil
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String user, String pwd){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(user) && ua.getPassword().equals(pwd)){
                return ua;
            }
        return null;
    }
    
    public PatientAccount createPatientUserAccount(String user, String pwd, Patient patient, Role role){
        PatientAccount patientAccount = new PatientAccount();
        patientAccount.setUsername(user);
        patientAccount.setPassword(pwd);
        patientAccount.setPatientAccount(patient);
        patientAccount.setRole(role);
        userAccountList.add(patientAccount);
        return patientAccount;
    } 
    
    public EmployeeAccount createEmployeeUserAccount(String user, String pwd, Employee employee, Role role){
        EmployeeAccount userAccount = new EmployeeAccount();
        userAccount.setUsername(user);
        userAccount.setPassword(pwd);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
   public void deleteUserAccount(UserAccount user){
       userAccountList.remove(user);
   }
}
