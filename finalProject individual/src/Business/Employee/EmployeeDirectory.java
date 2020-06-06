/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Shail
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setEmpName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public boolean isEmployeeExists(String name){
        for(Employee employee: this.employeeList){
            if(employee.getEmpName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    
    public void deleteEmployee(Employee employee){
        employeeList.remove(employee);
    }
}