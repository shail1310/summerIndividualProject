/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugCompanyRole;

import Business.Drug.Drug;
import Business.Drug.DrugFeedback;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shail
 */
public class ViewAdverseEventsJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private Drug drugWithMostAdverseEvents;

    public ViewAdverseEventsJPanel(JPanel userProcContainer, Drug drugWithMostAdverseEvents) {
        initComponents();
        this.upc = userProcContainer;
        this.drugWithMostAdverseEvents = drugWithMostAdverseEvents;
        medNameTxt.setText(drugWithMostAdverseEvents.getMedicineName());
        populateAdverseEventTable();
    }

    private void populateAdverseEventTable() {
        DefaultTableModel model = (DefaultTableModel) adverseEventsTable.getModel();

        model.setRowCount(0);

        for (DrugFeedback drugFeedBack : drugWithMostAdverseEvents.getDrugFeedbacks()) {

            Object[] row = new Object[5];
            row[0] = drugFeedBack;
            row[1] = drugFeedBack.getFeedbackProvider();
            row[2] = drugFeedBack.getPersonRole();
            row[3] = drugFeedBack.getSeverity();
            row[4] = drugFeedBack.getState();
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adverseEventsTable = new javax.swing.JTable();
        respRateJLabel = new javax.swing.JLabel();
        medNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        advEventsDetailsTxt = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 33, 33));
        setLayout(null);
        add(jLabel1);
        jLabel1.setBounds(127, 22, 0, 0);

        jScrollPane1.setForeground(java.awt.Color.white);

        adverseEventsTable.setBackground(new java.awt.Color(51, 51, 51));
        adverseEventsTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adverseEventsTable.setForeground(new java.awt.Color(255, 255, 255));
        adverseEventsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adverse Event", "Feedback From", "Role", "Severity", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(adverseEventsTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 80, 608, 89);

        respRateJLabel.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        respRateJLabel.setForeground(java.awt.Color.white);
        respRateJLabel.setText("Medicine Name");
        add(respRateJLabel);
        respRateJLabel.setBounds(40, 200, 204, 28);

        medNameTxt.setForeground(java.awt.Color.white);
        medNameTxt.setEnabled(false);
        medNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNameTxtActionPerformed(evt);
            }
        });
        add(medNameTxt);
        medNameTxt.setBounds(480, 200, 171, 22);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("ADVERSE EVENTS ");
        add(jLabel2);
        jLabel2.setBounds(338, 13, 337, 49);

        viewBtn.setBackground(new java.awt.Color(51, 51, 51));
        viewBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        viewBtn.setForeground(java.awt.Color.white);
        viewBtn.setText("View Detail Event Decription");
        viewBtn.setBorder(null);
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn);
        viewBtn.setBounds(130, 370, 299, 44);

        jScrollPane2.setForeground(java.awt.Color.white);

        advEventsDetailsTxt.setColumns(20);
        advEventsDetailsTxt.setRows(5);
        jScrollPane2.setViewportView(advEventsDetailsTxt);

        add(jScrollPane2);
        jScrollPane2.setBounds(40, 270, 246, 80);

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
        backBtn.setBounds(40, 440, 86, 42);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\shail\\OneDrive\\Desktop\\finalProject indivifual\\adverse effects.png")); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(530, 180, 840, 460);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\shail\\OneDrive\\Desktop\\finalProject indivifual\\bw grad.jpg")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, -170, 1110, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void medNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medNameTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int row = adverseEventsTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        DrugFeedback drugFeedBack = (DrugFeedback)adverseEventsTable.getValueAt(row, 0);
        
        advEventsDetailsTxt.setText(drugFeedBack.getEventDescription());
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea advEventsDetailsTxt;
    private javax.swing.JTable adverseEventsTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField medNameTxt;
    private javax.swing.JLabel respRateJLabel;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
