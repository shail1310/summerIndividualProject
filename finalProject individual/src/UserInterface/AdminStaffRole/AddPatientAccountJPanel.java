/*
 * 
 */

package UserInterface.AdminStaffRole;

import Business.WebMedical;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Patient.PatientDir;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Util.ProjectUtil;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shail
 */
public class AddPatientAccountJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private PatientOrganization patientOrg;
    private PatientDir patientDir;
    private UserAccountDirectory patientAccountDirectory;
    public AddPatientAccountJPanel(JPanel upc, PatientOrganization patientOrg) {
        initComponents();
        this.upc = upc;
        this.patientOrg = patientOrg;
        this.patientDir = patientOrg.getPatientDir();
        this.patientAccountDirectory = patientOrg.getUserAccountDirectory();
        populatePatientCombo();
        populateUserAccountTbl();
    }

    private void populatePatientCombo(){
        patientCombo.removeAllItems();
        
        for(Patient p: patientDir.getPatientDir()){
            patientCombo.addItem(p);
        }
    }
    
    private void populateUserAccountTbl(){
        DefaultTableModel model = (DefaultTableModel) userTbl.getModel();
        
        model.setRowCount(0);
        for (UserAccount ua : patientAccountDirectory.getUserAccountList()){
            Object[] row = new Object[2];
            row[0] = ua;
            row[1] = ua.getRole();
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        createUserBtn = new javax.swing.JButton();
        userNameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientCombo = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        pwdTxt = new javax.swing.JPasswordField();
        deleteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 550));
        jPanel1.setLayout(null);

        createUserBtn.setBackground(new java.awt.Color(51, 51, 51));
        createUserBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        createUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        createUserBtn.setText("Create");
        createUserBtn.setBorder(null);
        createUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createUserBtn);
        createUserBtn.setBounds(456, 385, 80, 30);

        userNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        userNameTxt.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        userNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(userNameTxt);
        userNameTxt.setBounds(173, 243, 146, 26);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(55, 246, 100, 21);

        userTbl.setBackground(new java.awt.Color(51, 51, 51));
        userTbl.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        userTbl.setForeground(new java.awt.Color(255, 255, 255));
        userTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "User Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        userTbl.setSelectionBackground(new java.awt.Color(51, 171, 159));
        jScrollPane1.setViewportView(userTbl);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(62, 85, 474, 74);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(65, 281, 90, 21);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(75, 206, 80, 21);

        patientCombo.setBackground(new java.awt.Color(51, 51, 51));
        patientCombo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        patientCombo.setForeground(new java.awt.Color(255, 255, 255));
        patientCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(patientCombo);
        patientCombo.setBounds(173, 203, 146, 26);

        backjButton1.setBackground(new java.awt.Color(51, 51, 51));
        backjButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("Back");
        backjButton1.setBorder(null);
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backjButton1);
        backjButton1.setBounds(62, 385, 80, 30);

        pwdTxt.setBackground(new java.awt.Color(51, 51, 51));
        pwdTxt.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        pwdTxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pwdTxt);
        pwdTxt.setBounds(173, 278, 146, 26);

        deleteBtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(null);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn);
        deleteBtn.setBounds(456, 166, 80, 30);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CREATE USER ACCOUNT");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 6, 440, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserBtnActionPerformed
        String userName = userNameTxt.getText();
        char[] passwordArray = pwdTxt.getPassword();
        
        if(ProjectUtil.isFeildEmpty(userName) || passwordArray == null || passwordArray.length == 0){
            JOptionPane.showMessageDialog(null, "User Name or password field can not be empty");
            return;
        }
        
        String password = String.valueOf(passwordArray);
        
        Patient patient;
        if(patientCombo.getSelectedItem() != null){
            patient = (Patient) patientCombo.getSelectedItem();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a patient from the combo box");
            return;
        }
        
        if(WebMedical.checkIfUsernameIsUnique(userName)){
            patientAccountDirectory.createPatientUserAccount(userName, password, patient, new PatientRole());
        }else{
            JOptionPane.showMessageDialog(null, "Username isnt unique");
            return;
        }

        populateUserAccountTbl();
        JOptionPane.showMessageDialog(null, "Patient account created successfully");
    }//GEN-LAST:event_createUserBtnActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int row = userTbl.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        UserAccount userAccount = (UserAccount) userTbl.getValueAt(row, 0);

        patientAccountDirectory.deleteUserAccount(userAccount);
        JOptionPane.showMessageDialog(null, "User account deleted successfully");
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox patientCombo;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JTable userTbl;
    // End of variables declaration//GEN-END:variables
}
