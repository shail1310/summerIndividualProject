package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Shail
 */
public class ConfigureASystem {
    
    public static WebMedical configure(){
        
        WebMedical system = WebMedical.getInstance();
        
        //Create a network then an enterprise
        //initialize organizations
        //add  employees 
        //create their specific user accounts
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Shail Parikh");
        
        UserAccount ua = system.getUserAccountDirectory().createEmployeeUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
