/*
 *
 */
package Business.Employee;

/**
 *
 * @author Shail
 */
public class Employee {
    
    private String empName;
    private int userID;
    private static int count = 1;

    public Employee() {
        userID = count;
        count++;
    }

    public int getUserID() {
        return userID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName;
    }
    
    
}
