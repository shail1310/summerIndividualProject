/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author nikhil
 */
public class UserAccount {
    
    private Role role;
    private String username;
    private String password;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}