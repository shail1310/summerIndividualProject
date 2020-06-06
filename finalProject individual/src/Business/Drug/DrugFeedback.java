/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Drug;

import Business.Role.Role;

/**
 *
 * @author nikhil
 */
public class DrugFeedback {
    private String advEvent;
    private String eventDescription;
    private String feedbackProvider;
    private String personRole;
    private String state;
    private String severity;
    
    public String getAdvEvent() {
        return advEvent;
    }

    public void setAdvEvent(String advEvent) {
        this.advEvent = advEvent;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    
    
    public String getFeedbackProvider() {
        return feedbackProvider;
    }

    public void setFeedbackProvider(String feedbackProvider) {
        this.feedbackProvider = feedbackProvider;
    }
    
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    

    

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return advEvent;
    }
    
    
}
