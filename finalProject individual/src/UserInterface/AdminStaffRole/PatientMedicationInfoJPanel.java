/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminStaffRole;

import Business.Enterprise.Enterprise;
import Business.FileUtil.FileUploadJPanel;
import Business.Patient.Allergy;
import Business.Patient.Patient;
import Business.Patient.PatientDir;
import Business.UserAccount.UserAccount;
import Business.Util.ProjectUtil;
import Business.WorkQueue.AddPatientToSystemRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class PatientMedicationInfoJPanel extends javax.swing.JPanel {

    private JPanel userProcContainer;
    private PatientDir patientDir;
    private Patient patient;
    private Enterprise enterprise;
    private UserAccount ua;

    public PatientMedicationInfoJPanel(JPanel userProcContainer, Enterprise enterprise, PatientDir patientDir,
            Patient patient, UserAccount ua) {
        initComponents();
        this.userProcContainer = userProcContainer;
        this.enterprise = enterprise;
        this.patientDir = patientDir;
        this.patient = patient;
        this.ua = ua;
        populateAllergyCombo();
        txtDate.setText("DD-MMM-YYYY");
        txtTestDate.setText("DD-MM-YYYY");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        addAllergy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        allergyTypeCombo = new javax.swing.JComboBox();
        nextJButton1 = new javax.swing.JButton();
        uploadMedication = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTestName = new javax.swing.JTextField();
        uploadTestReports = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTestDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPurpose = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 33, 33));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Allergies");
        jLabel1.setAutoscrolls(true);

        submitJButton.setBackground(new java.awt.Color(0, 150, 136));
        submitJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitJButton.setForeground(java.awt.Color.white);
        submitJButton.setText("Submit");
        submitJButton.setBorder(null);
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Medications");
        jLabel3.setAutoscrolls(true);

        addAllergy.setBackground(new java.awt.Color(0, 150, 136));
        addAllergy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addAllergy.setForeground(java.awt.Color.white);
        addAllergy.setText("Add Allergy Info");
        addAllergy.setBorder(null);
        addAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAllergyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Allergy Type");

        txtDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Description");

        allergyTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nextJButton1.setBackground(new java.awt.Color(244, 67, 54));
        nextJButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nextJButton1.setForeground(java.awt.Color.white);
        nextJButton1.setText("Back");
        nextJButton1.setBorder(null);
        nextJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJButton1ActionPerformed(evt);
            }
        });

        uploadMedication.setBackground(new java.awt.Color(0, 150, 136));
        uploadMedication.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        uploadMedication.setForeground(java.awt.Color.white);
        uploadMedication.setText("Upload Medication");
        uploadMedication.setBorder(null);
        uploadMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadMedicationActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Medical Tests and Reports");
        jLabel2.setAutoscrolls(true);

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Medication Date");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Test Name");

        txtTestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestNameActionPerformed(evt);
            }
        });

        uploadTestReports.setBackground(new java.awt.Color(255, 193, 7));
        uploadTestReports.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        uploadTestReports.setForeground(java.awt.Color.black);
        uploadTestReports.setText("Upload Test Report");
        uploadTestReports.setBorder(null);
        uploadTestReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadTestReportsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Test Date");

        txtTestDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTestDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestDateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Medication Purpose");

        txtPurpose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPurpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurposeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(allergyTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(uploadMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadTestReports, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(nextJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtDate))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPurpose))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTestDate))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTestName))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uploadMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allergyTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTestDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uploadTestReports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateAllergyCombo() {
        allergyTypeCombo.removeAllItems();
        for (Allergy.AllergyType type : Allergy.AllergyType.values()) {
            allergyTypeCombo.addItem(type);
        }
    }

    private void addAllergyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAllergyActionPerformed
        String allergyDesc = txtDesc.getText();
        if (allergyTypeCombo.getSelectedItem() != null
                && !ProjectUtil.isFeildEmpty(allergyDesc)) {
            patient.getAllergyInformation().addAllergy(
                    (Allergy.AllergyType) allergyTypeCombo.getSelectedItem(),
                    txtDesc.getText());
            JOptionPane.showMessageDialog(null, "Allergy Information added");
        } else {
            JOptionPane.showMessageDialog(null, "Enter valid allergy information");
        }
    }//GEN-LAST:event_addAllergyActionPerformed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if(patientDir.searchPatient(patient.getFullName()) != null){
            JOptionPane.showMessageDialog(null, "Patient information already submitted in system");
            return;
        }
        
        patientDir.getPatientDir().add(patient);

        AddPatientToSystemRequest request = new AddPatientToSystemRequest();
        request.setHospitalName(enterprise.getName());
        request.setPatientId(patient.getPatientId());
        request.setNetwork(enterprise.getNetName());
        request.setState(enterprise.getNetState());
        request.setMessage("Add Patient to system");
        request.setStatus("Sent");
        request.setSender(ua);

        UserAccount enterpriseAdmin = enterprise.getEnterpriseAdmin();
        enterpriseAdmin.getWorkQueue().getWorkRequestList().add(request);
        
        JOptionPane.showMessageDialog(null, "Patient Information is added in system");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void nextJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJButton1ActionPerformed
        userProcContainer.remove(this);
        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        layout.previous(userProcContainer);
    }//GEN-LAST:event_nextJButton1ActionPerformed

    private void uploadMedicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadMedicationActionPerformed
        String medicationDate = txtDate.getText();
        String medicationPurpose = txtPurpose.getText();

        if (!ProjectUtil.isFeildEmpty(medicationDate)
                && !ProjectUtil.isFeildEmpty(medicationPurpose)) {
            CardLayout layout = (CardLayout) userProcContainer.getLayout();
            userProcContainer.add("FileUploadJPanel", new FileUploadJPanel(
                    userProcContainer, patient, "Medications", medicationDate, medicationPurpose));
            layout.next(userProcContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Medication date and purpose can't be empty");
        }

    }//GEN-LAST:event_uploadMedicationActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void uploadTestReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadTestReportsActionPerformed
        String testName = txtTestName.getText();
        String testDate = txtTestDate.getText();

        if (!ProjectUtil.isFeildEmpty(testName) && !ProjectUtil.isFeildEmpty(testDate)) {
            CardLayout layout = (CardLayout) userProcContainer.getLayout();
            userProcContainer.add("FileUploadJPanel", new FileUploadJPanel(
                    userProcContainer, patient, "Tests", txtTestDate.getText(), txtTestName.getText()));
            layout.next(userProcContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Test date and name can't be empty");
        }
    }//GEN-LAST:event_uploadTestReportsActionPerformed

    private void txtTestDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTestDateActionPerformed

    private void txtTestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTestNameActionPerformed

    private void txtPurposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurposeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAllergy;
    private javax.swing.JComboBox allergyTypeCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton nextJButton1;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtTestDate;
    private javax.swing.JTextField txtTestName;
    private javax.swing.JButton uploadMedication;
    private javax.swing.JButton uploadTestReports;
    // End of variables declaration//GEN-END:variables
}
