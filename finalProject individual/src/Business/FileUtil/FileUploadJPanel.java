/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FileUtil;

import Business.WebMedical;
import Business.Patient.Patient;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class FileUploadJPanel extends javax.swing.JPanel {

    JFileChooser fileChooser;
    FileInputStream in;
    FileOutputStream out;
    File file;
    JPanel userProcContainer;
    Patient patient;
    String task;
    String date;
    String testName;
    String medicationPurpose;
    String destFileName;
    public static final String MEDICATIONS = "Medications";
    public static final String TESTS = "Tests";

    public FileUploadJPanel(JPanel userProcContainer, Patient p, String task, 
            String date, String testNameORMedicationPurpose) {
        initComponents();
        this.userProcContainer = userProcContainer;
        this.patient = p;
        this.task = task;
        this.date = date;
        this.date = this.date.replace(' ', '_');
        
        switch (task) {
            case MEDICATIONS:
                this.medicationPurpose = testNameORMedicationPurpose;
                this.medicationPurpose = this.medicationPurpose.replace(' ', '_');
                break;
            case TESTS:
                this.testName = testNameORMedicationPurpose;
                this.testName = this.testName.replace(' ', '_');
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFileName = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
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
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saveJButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(saveJButton)
                .addGap(44, 44, 44)
                .addComponent(backJButton)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        FileChannel source = null;
        FileChannel destination = null;
        try {

            source = in.getChannel();
            destination = out.getChannel();

            long transfered = 0;
            long bytes = source.size();
            while (transfered < bytes) {
                transfered += destination.transferFrom(source, 0, source.size());
                destination.position(transfered);
            }
            switch (task) {
                case MEDICATIONS:
                    this.patient.getPatientMedications().add(destFileName);
                    break;
                case TESTS:
                    this.patient.getLabTestHistory().add(destFileName);
                    break;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FileUploadJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (source != null) {
                try {
                    source.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileUploadJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileUploadJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (destination != null) {
                try {
                    destination.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileUploadJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (out != null) {
                try {
                    out.flush();  
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileUploadJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Files Saved");
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcContainer.remove(this);
        CardLayout layout = (CardLayout)userProcContainer.getLayout();
        layout.previous(userProcContainer);

    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField txtFileName;
    // End of variables declaration//GEN-END:variables
}
