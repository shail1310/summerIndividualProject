/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.EnterpriseAdminRole;

import Business.WebMedical;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AddPatientToSystemRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhil
 */
public class AddPatientToSystemJPanel extends javax.swing.JPanel {

    private JPanel userProcContainer;
    private UserAccount ua;
    private WebMedical system;
    
    public AddPatientToSystemJPanel(JPanel userProcContainer, WebMedical system,
            UserAccount ua) {
        initComponents();
        this.userProcContainer = userProcContainer;
        this.system = system;
        this.ua = ua;
    }

    private void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) addPatientToSystemReqJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : ua.getWorkQueue().getWorkRequestList()) {
            if (request instanceof AddPatientToSystemRequest) {
                AddPatientToSystemRequest addPatientReq = (AddPatientToSystemRequest) request;

                Object[] row = new Object[7];
                row[0] = request;
                row[1] = addPatientReq.getMessage();
                row[2] = addPatientReq.getReceiver();
                row[3] = addPatientReq.getNetwork();
                row[4] = addPatientReq.getState();
                row[5] = addPatientReq.getHospitalName();
                row[6] = addPatientReq.getStatus();
                model.addRow(row);
            }
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

        assignToMeJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        addPatientJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addPatientToSystemReqJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 33, 33));
        setPreferredSize(new java.awt.Dimension(600, 515));

        assignToMeJButton.setBackground(new java.awt.Color(255, 193, 7));
        assignToMeJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        assignToMeJButton.setForeground(java.awt.Color.black);
        assignToMeJButton.setText("Assign to me");
        assignToMeJButton.setBorder(null);
        assignToMeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(211, 47, 47));
        backJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backJButton.setForeground(java.awt.Color.black);
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addPatientJButton.setBackground(new java.awt.Color(0, 150, 136));
        addPatientJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addPatientJButton.setForeground(java.awt.Color.white);
        addPatientJButton.setText("Add Patient to System");
        addPatientJButton.setBorder(null);
        addPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientJButtonActionPerformed(evt);
            }
        });

        addPatientToSystemReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Message", "Receiver", "Network", "State", "Hospital Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(addPatientToSystemReqJTable);

        refreshTestJButton.setBackground(java.awt.Color.white);
        refreshTestJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        refreshTestJButton.setForeground(java.awt.Color.black);
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(null);
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(assignToMeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(assignToMeJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignToMeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButtonActionPerformed
        int row = addPatientToSystemReqJTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        AddPatientToSystemRequest addPatientRequest = (AddPatientToSystemRequest) 
                addPatientToSystemReqJTable.getValueAt(row, 0);
        addPatientRequest.setReceiver(ua);
        addPatientRequest.setStatus("Processing");
        JOptionPane.showMessageDialog(null, "Request Assigned");
    }//GEN-LAST:event_assignToMeJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcContainer.remove(this);
        CardLayout layout = (CardLayout) userProcContainer.getLayout();
        layout.previous(userProcContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientJButtonActionPerformed
        int row = addPatientToSystemReqJTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        AddPatientToSystemRequest addPatientRequest = (AddPatientToSystemRequest) 
                addPatientToSystemReqJTable.getValueAt(row, 0);
        system.addPatientMapping(addPatientRequest.getPatientId(), 
                addPatientRequest.getNetwork(), addPatientRequest.getState(), 
                addPatientRequest.getHospitalName());
        addPatientRequest.setStatus("Completed");
        
        JOptionPane.showMessageDialog(null, "Patient added to system");
    }//GEN-LAST:event_addPatientJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientJButton;
    private javax.swing.JTable addPatientToSystemReqJTable;
    private javax.swing.JButton assignToMeJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    // End of variables declaration//GEN-END:variables
}
