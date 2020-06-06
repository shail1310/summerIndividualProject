/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DrugCompanyRole;

import Business.Drug.Drug;
import Business.Drug.DrugDirectory;
import Business.Enterprise.DrugCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.WebMedical;
import Business.UserAccount.UserAccount;
import Business.Util.ProjectUtil;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.FDAApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Shail
 */
public class ManageMedsManufacturingJPanel extends javax.swing.JPanel {

    JPanel upc;
    DrugCompanyEnterprise enterprise;
    WebMedical webMedical;
    UserAccount userAccount;
    DrugDirectory medsDirectory;
    
    public ManageMedsManufacturingJPanel(JPanel userProcessContainer,UserAccount ua, Enterprise enterprise, 
            WebMedical system) {
        initComponents();
        this.upc = userProcessContainer;
        this.enterprise = (DrugCompanyEnterprise)enterprise;
        this.userAccount = ua;
        this.webMedical = system;
        medsDirectory = system.getNetwork(enterprise.getNetName()).getNationalDrugDirectory();
        populateDrugTable();
    }

    private void populateDrugTable(){
        DefaultTableModel model = (DefaultTableModel) medsTable.getModel();

        model.setRowCount(0);
        
        for (String drugName : enterprise.getDrugList()) {
            
            Drug drug = medsDirectory.findDrugInformation(drugName);
            
            if(drug != null){
                Object[] row = new Object[3];
                row[0] = drug;
                row[1] = drug.isFdaApproved();
                row[2] = (drug.isFdaApproved()? "FDA Approval recieved" : 
                        "FDA Approval pending");
                
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medsTable = new javax.swing.JTable();
        addNewMedBtn = new javax.swing.JButton();
        approvalBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        respRateJLabel = new javax.swing.JLabel();
        medsTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        medsSafetyIssuesTxt = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 33, 33));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDS CATLOG MANAGER WORKAREA");
        add(jLabel1);
        jLabel1.setBounds(180, 60, 700, 49);

        jScrollPane1.setForeground(java.awt.Color.white);

        medsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "FDA Approved", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medsTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 292, 452, 91);

        addNewMedBtn.setBackground(new java.awt.Color(51, 51, 51));
        addNewMedBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addNewMedBtn.setForeground(java.awt.Color.white);
        addNewMedBtn.setText("Add New Medicine");
        addNewMedBtn.setBorder(null);
        addNewMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMedBtnActionPerformed(evt);
            }
        });
        add(addNewMedBtn);
        addNewMedBtn.setBounds(323, 484, 189, 42);

        approvalBtn.setBackground(new java.awt.Color(51, 51, 51));
        approvalBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        approvalBtn.setForeground(java.awt.Color.white);
        approvalBtn.setText("Send For Drug Approval");
        approvalBtn.setBorder(null);
        approvalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalBtnActionPerformed(evt);
            }
        });
        add(approvalBtn);
        approvalBtn.setBounds(60, 413, 228, 41);

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backBtn.setForeground(java.awt.Color.white);
        backBtn.setText("Back");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(60, 484, 70, 42);

        respRateJLabel.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        respRateJLabel.setForeground(java.awt.Color.white);
        respRateJLabel.setText("Drug Name");
        add(respRateJLabel);
        respRateJLabel.setBounds(60, 154, 146, 21);

        medsTxt.setForeground(new java.awt.Color(51, 51, 51));
        medsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medsTxtActionPerformed(evt);
            }
        });
        add(medsTxt);
        medsTxt.setBounds(224, 154, 288, 30);

        jScrollPane2.setForeground(java.awt.Color.white);

        medsSafetyIssuesTxt.setColumns(20);
        medsSafetyIssuesTxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        medsSafetyIssuesTxt.setRows(5);
        jScrollPane2.setViewportView(medsSafetyIssuesTxt);

        add(jScrollPane2);
        jScrollPane2.setBounds(224, 194, 288, 68);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Drug Safety Issues");
        add(jLabel8);
        jLabel8.setBounds(60, 194, 146, 24);

        refreshBtn.setBackground(new java.awt.Color(51, 51, 51));
        refreshBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        refreshBtn.setForeground(java.awt.Color.white);
        refreshBtn.setText("Refresh");
        refreshBtn.setBorder(null);
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn);
        refreshBtn.setBounds(433, 413, 79, 41);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\shail\\OneDrive\\Desktop\\finalProject indivifual\\catlog.png")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(580, 230, 530, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shail\\OneDrive\\Desktop\\finalProject indivifual\\bw grad.jpg")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-570, -270, 1600, 940);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addNewMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMedBtnActionPerformed
        String drugName = medsTxt.getText();
        String drugSafetyIssues = medsSafetyIssuesTxt.getText();
        
        if(ProjectUtil.isFeildEmpty(drugName) ||
                ProjectUtil.isFeildEmpty(drugSafetyIssues)){
            JOptionPane.showMessageDialog(null, "Enter medicine name and its safety issues !");
            return;
        }

        Drug drug = medsDirectory.findDrugInformation(drugName);
        
        if(drug == null){
            drug = medsDirectory.addNewDrug();
            drug.setMedicineName(drugName);
            drug.setSafetyIssues(medsSafetyIssuesTxt.getText());
            drug.getManufacturerList().add(enterprise.getName());
            enterprise.getDrugList().add(drugName);
        }else{
            drug.getManufacturerList().add(enterprise.getName());
            enterprise.getDrugList().add(drugName);
        }
        
        JOptionPane.showMessageDialog(null, "Medicines added to Manufacturing List");
    }//GEN-LAST:event_addNewMedBtnActionPerformed

    private void medsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medsTxtActionPerformed

    private void approvalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalBtnActionPerformed
        int row = medsTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row of meds to be approved");
            return;
        }
        
        Enterprise fda = webMedical.getNetwork(enterprise.getNetName()).getEnterpriseDirectory().getEnterprise(
                null, Enterprise.EnterpriseType.FDA, null);
        
        if(fda == null){
            JOptionPane.showMessageDialog(null, "There is no drug administration enterprise for your network");
            return;
        }

        Drug drug = (Drug)medsTable.getValueAt(row, 0);
        
        if(drug.isFdaApproved()){
            JOptionPane.showMessageDialog(null, "Meds are Already approved");
            return;
        }
        
        FDAApprovalWorkRequest fdaApprovalRequest;
        
        for(WorkRequest wr: fda.getWorkQueue().getWorkRequestList()){
            
             fdaApprovalRequest = (FDAApprovalWorkRequest)wr;
            
            if(fdaApprovalRequest.getDrug().getMedicineName().equals(drug.getMedicineName())){
                JOptionPane.showMessageDialog(null, "FDA approval request already sent");
                return;
            }
        }
        
        fdaApprovalRequest = new FDAApprovalWorkRequest();
        
        fdaApprovalRequest.setDrug(drug);
        fdaApprovalRequest.setMessage("Approval Request");
        fdaApprovalRequest.setSender(userAccount);
        
        fda.getWorkQueue().getWorkRequestList().add(fdaApprovalRequest);
        JOptionPane.showMessageDialog(null, "Drug Approval Request sent");
    }//GEN-LAST:event_approvalBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        populateDrugTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewMedBtn;
    private javax.swing.JButton approvalBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea medsSafetyIssuesTxt;
    private javax.swing.JTable medsTable;
    private javax.swing.JTextField medsTxt;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel respRateJLabel;
    // End of variables declaration//GEN-END:variables
}
