/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Patient.VitalSign;
import Business.Patient.VitalSignHistory;
import java.awt.CardLayout;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class RecordVitalSignJPanel extends javax.swing.JPanel {

    private VitalSignHistory vitalSignHistory;
    private JPanel userProcContainer;
    private int patientAge;

    public RecordVitalSignJPanel(JPanel userProcContainer,
            VitalSignHistory vitalSignHistory, int patientAge) {
        initComponents();
        this.userProcContainer = userProcContainer;
        this.vitalSignHistory = vitalSignHistory;
        this.patientAge = patientAge;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recordVitalSignJButton = new javax.swing.JButton();
        weightJTextField = new javax.swing.JTextField();
        systBlPreJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        creatVitalSignJLabel = new javax.swing.JLabel();
        systBlPreJLabel = new javax.swing.JLabel();
        weightJLabel = new javax.swing.JLabel();
        respRateJLabel = new javax.swing.JLabel();
        respRateJTextField = new javax.swing.JTextField();
        heartRateJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 33, 33));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(450, 450));

        recordVitalSignJButton.setBackground(new java.awt.Color(0, 150, 136));
        recordVitalSignJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        recordVitalSignJButton.setForeground(java.awt.Color.white);
        recordVitalSignJButton.setText("Record Vital Sign");
        recordVitalSignJButton.setBorder(null);
        recordVitalSignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordVitalSignJButtonActionPerformed(evt);
            }
        });

        weightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightJTextFieldActionPerformed(evt);
            }
        });

        systBlPreJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systBlPreJTextFieldActionPerformed(evt);
            }
        });

        heartRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartRateJTextFieldActionPerformed(evt);
            }
        });

        creatVitalSignJLabel.setBackground(new java.awt.Color(33, 33, 33));
        creatVitalSignJLabel.setText("Record Vital Sign");

        systBlPreJLabel.setText("Systolic Blood Pressure");

        weightJLabel.setText("Weight in Pounds");

        respRateJLabel.setText("Respiratory Rate");

        respRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respRateJTextFieldActionPerformed(evt);
            }
        });

        heartRateJLabel.setText("Heart Rate");

        backJButton.setBackground(new java.awt.Color(244, 67, 54));
        backJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backJButton.setForeground(java.awt.Color.white);
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heartRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systBlPreJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systBlPreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recordVitalSignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(creatVitalSignJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(creatVitalSignJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respRateJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartRateJLabel)
                    .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systBlPreJLabel)
                    .addComponent(systBlPreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightJLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recordVitalSignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void weightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightJTextFieldActionPerformed

    private void systBlPreJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systBlPreJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_systBlPreJTextFieldActionPerformed

    private void heartRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartRateJTextFieldActionPerformed

    private void respRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respRateJTextFieldActionPerformed

    private void recordVitalSignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordVitalSignJButtonActionPerformed
        int respiratoryRate;
        int heartRate;
        int systolicBloodPressure;
        int weight;
        String timestamp;

        try {
            respiratoryRate = Integer.parseInt(respRateJTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Respiratory value should be Numeric Integer!!");
            return;
        }

        try {
            heartRate = Integer.parseInt(heartRateJTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Heart Rate value should be Numeric Integer!!");
            return;
        }

        try {
            systolicBloodPressure = Integer.parseInt(systBlPreJTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Systolic Blood Pressure value should be Numeric Integer!!");
            return;
        }

        try {
            weight = Integer.parseInt(weightJTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Weight of the patient should be Numeric Integer!!");
            return;
        }

        timestamp = getCurrentTimestamp();
        setVitalSignProperties(respiratoryRate, heartRate, systolicBloodPressure, weight, timestamp);
        clearVitalSignJTextFields();
        JOptionPane.showMessageDialog(null, "Vital Sign added to Vital Sign "
                + "History of the patient");
    }//GEN-LAST:event_recordVitalSignJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcContainer.remove(this);

        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        layout.previous(userProcContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private String getCurrentTimestamp() {
        Calendar calender = Calendar.getInstance();
        Date date = calender.getTime();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp.toString();
    }

    private void setVitalSignProperties(int respRate, int heartRate, int systBlPre,
            int weight, String timestamp) {
        VitalSign vitalSign = this.vitalSignHistory.AddVitalSign();
        vitalSign.setRespRate(respRate);
        vitalSign.setHeartRate(heartRate);
        vitalSign.setBloodPressure(systBlPre);
        vitalSign.setWieghtInPounds(weight);
        vitalSign.setTimestamp(timestamp);
        vitalSign.setVitalSignStatus(vitalSign.evaluateVitalSignStatus(this.patientAge));
    }

    private void clearVitalSignJTextFields() {
        respRateJTextField.setText("");
        heartRateJTextField.setText("");
        systBlPreJTextField.setText("");
        weightJTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel creatVitalSignJLabel;
    private javax.swing.JLabel heartRateJLabel;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JButton recordVitalSignJButton;
    private javax.swing.JLabel respRateJLabel;
    private javax.swing.JTextField respRateJTextField;
    private javax.swing.JLabel systBlPreJLabel;
    private javax.swing.JTextField systBlPreJTextField;
    private javax.swing.JLabel weightJLabel;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
