/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.WebMedical;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcContainer;
    private UserAccount ua;
    private DoctorOrganization doctorOrg;
    private Enterprise enterprise;
    private WebMedical system;

    public DoctorWorkAreaJPanel(JPanel userProcContainer, UserAccount ua, DoctorOrganization doctorOrg,
            Enterprise enterprise, WebMedical system) {
        initComponents();
        this.userProcContainer = userProcContainer;
        this.ua = ua;
        this.doctorOrg = doctorOrg;
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPatientButton = new javax.swing.JButton();
        viewLabTestButton = new javax.swing.JButton();
        reqPatInfoButton = new javax.swing.JButton();
        drugFeedbackButton = new javax.swing.JButton();
        drugSafetyIssuesButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 33, 33));

        searchPatientButton.setBackground(new java.awt.Color(255, 167, 51));
        searchPatientButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchPatientButton.setForeground(java.awt.Color.black);
        searchPatientButton.setText("View Patient Information");
        searchPatientButton.setBorder(null);
        searchPatientButton.setPreferredSize(null);
        searchPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientButtonActionPerformed(evt);
            }
        });

        viewLabTestButton.setBackground(new java.awt.Color(0, 105, 95));
        viewLabTestButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewLabTestButton.setForeground(java.awt.Color.white);
        viewLabTestButton.setText("View Lab Test Request");
        viewLabTestButton.setBorder(null);
        viewLabTestButton.setPreferredSize(null);
        viewLabTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLabTestButtonActionPerformed(evt);
            }
        });

        reqPatInfoButton.setBackground(java.awt.Color.white);
        reqPatInfoButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reqPatInfoButton.setForeground(java.awt.Color.black);
        reqPatInfoButton.setText("Request Patient Information");
        reqPatInfoButton.setBorder(null);
        reqPatInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqPatInfoButtonActionPerformed(evt);
            }
        });

        drugFeedbackButton.setBackground(new java.awt.Color(255, 193, 7));
        drugFeedbackButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        drugFeedbackButton.setForeground(java.awt.Color.black);
        drugFeedbackButton.setText("Provide Drug Feedback");
        drugFeedbackButton.setBorder(null);
        drugFeedbackButton.setPreferredSize(null);
        drugFeedbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugFeedbackButtonActionPerformed(evt);
            }
        });

        drugSafetyIssuesButton.setBackground(new java.awt.Color(51, 171, 159));
        drugSafetyIssuesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        drugSafetyIssuesButton.setForeground(java.awt.Color.black);
        drugSafetyIssuesButton.setText("Drug Safety Issues");
        drugSafetyIssuesButton.setBorder(null);
        drugSafetyIssuesButton.setPreferredSize(null);
        drugSafetyIssuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugSafetyIssuesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewLabTestButton, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(drugSafetyIssuesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drugFeedbackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reqPatInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(viewLabTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drugSafetyIssuesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drugFeedbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reqPatInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientButtonActionPerformed
        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        userProcContainer.add("ViewPatientInformationJPanel", new ViewPatientInformationJPanel(
                userProcContainer, ua, enterprise));
        layout.next(userProcContainer);
    }//GEN-LAST:event_searchPatientButtonActionPerformed

    private void viewLabTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLabTestButtonActionPerformed
        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        userProcContainer.add("ViewLabTestRequestJPanel", new ViewLabTestRequestJPanel(
                userProcContainer, ua, doctorOrg, enterprise));
        layout.next(userProcContainer);
    }//GEN-LAST:event_viewLabTestButtonActionPerformed

    private void reqPatInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqPatInfoButtonActionPerformed
        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        userProcContainer.add("ReqPatientInfoOverNetworkJPanel", new ReqPatientInfoOverNetworkJPanel(
                userProcContainer, ua, enterprise));
        layout.next(userProcContainer);
    }//GEN-LAST:event_reqPatInfoButtonActionPerformed

    private void drugFeedbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugFeedbackButtonActionPerformed
        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        userProcContainer.add("DoctorDrugFeedBackJPanel", new DrugFeedBackJPanel(
                        userProcContainer, enterprise, system, ua));
        layout.next(userProcContainer);
    }//GEN-LAST:event_drugFeedbackButtonActionPerformed

    private void drugSafetyIssuesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugSafetyIssuesButtonActionPerformed
        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        userProcContainer.add("DrugSafetyIssuesJPanel", new DrugSafetyIssuesPanel(
                        userProcContainer, system, enterprise));
        layout.next(userProcContainer);
    }//GEN-LAST:event_drugSafetyIssuesButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drugFeedbackButton;
    private javax.swing.JButton drugSafetyIssuesButton;
    private javax.swing.JButton reqPatInfoButton;
    private javax.swing.JButton searchPatientButton;
    private javax.swing.JButton viewLabTestButton;
    // End of variables declaration//GEN-END:variables
}
