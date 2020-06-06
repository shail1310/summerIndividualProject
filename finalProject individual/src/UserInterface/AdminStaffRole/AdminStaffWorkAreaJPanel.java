/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminStaffRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class AdminStaffWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcContainer;
    private Enterprise enterprise;
    private PatientOrganization patientOrganization;
    private UserAccount ua;

    public AdminStaffWorkAreaJPanel(JPanel userProcContainer, UserAccount ua, Enterprise enterprise) {
        initComponents();
        this.userProcContainer = userProcContainer;
        this.enterprise = enterprise;
        this.ua = ua;
        this.patientOrganization = (PatientOrganization) enterprise.getOrganizationDirectory().searchOrganization(
                Organization.Type.Patient);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPatientButton = new javax.swing.JButton();
        addPatientAccountButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 33, 33));
        setForeground(java.awt.Color.white);

        addPatientButton.setBackground(new java.awt.Color(0, 150, 136));
        addPatientButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addPatientButton.setForeground(java.awt.Color.white);
        addPatientButton.setText("Add Patient");
        addPatientButton.setBorder(null);
        addPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientButtonActionPerformed(evt);
            }
        });

        addPatientAccountButton.setBackground(new java.awt.Color(255, 193, 7));
        addPatientAccountButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addPatientAccountButton.setForeground(java.awt.Color.black);
        addPatientAccountButton.setText("Add Patient User Account");
        addPatientAccountButton.setBorder(null);
        addPatientAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPatientAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(addPatientAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientButtonActionPerformed
        if (patientOrganization != null) {
            CardLayout layout = (CardLayout) userProcContainer.getLayout();
            userProcContainer.add("AddPatientAccountJPanel", new AddPatientInformationJPanel(
                    userProcContainer, patientOrganization, enterprise, ua, true));
            layout.next(userProcContainer);
        } else {
            JOptionPane.showMessageDialog(null, "No patient organization created, please contact administrator");
        }
    }//GEN-LAST:event_addPatientButtonActionPerformed

    private void addPatientAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientAccountButtonActionPerformed
        if (patientOrganization != null) {
            CardLayout layout = (CardLayout) userProcContainer.getLayout();
            userProcContainer.add("AddPatientAccountJPanel", new AddPatientAccountJPanel(
                    userProcContainer, patientOrganization));
            layout.next(userProcContainer);
        } else {
            JOptionPane.showMessageDialog(null, "No patient organization created, please contact administrator");
        }
    }//GEN-LAST:event_addPatientAccountButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientAccountButton;
    private javax.swing.JButton addPatientButton;
    // End of variables declaration//GEN-END:variables
}
