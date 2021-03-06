/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugCompanyRole;

import Business.Drug.Drug;
import Business.Drug.DrugDirectory;
import Business.Enterprise.Enterprise;
import Business.WebMedical;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.util.SortOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author Shail
 */
public class MedsFeedbackJPanel extends javax.swing.JPanel {

    JPanel upc;
    Enterprise enterprise;
    WebMedical webMedical;
    UserAccount userAccount;
    DrugDirectory medsDir;

    public MedsFeedbackJPanel(JPanel userProcessContainer, UserAccount ua, Enterprise enterprise,
            WebMedical webMedical) {
        initComponents();
        this.upc = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = ua;
        this.webMedical = webMedical;
        this.medsDir = webMedical.getNetwork(enterprise.getNetName()).getNationalDrugDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drugAdverseEventsOverview = new javax.swing.JButton();
        drugWithMostAdverseEvents = new javax.swing.JButton();
        drugWithMostFatalAdverseEvents = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 33, 33));
        setLayout(null);

        drugAdverseEventsOverview.setBackground(new java.awt.Color(51, 51, 51));
        drugAdverseEventsOverview.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        drugAdverseEventsOverview.setForeground(java.awt.Color.white);
        drugAdverseEventsOverview.setText("Meds Adverse Events overview");
        drugAdverseEventsOverview.setBorder(null);
        drugAdverseEventsOverview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugAdverseEventsOverviewActionPerformed(evt);
            }
        });
        add(drugAdverseEventsOverview);
        drugAdverseEventsOverview.setBounds(60, 93, 300, 44);

        drugWithMostAdverseEvents.setBackground(new java.awt.Color(51, 51, 51));
        drugWithMostAdverseEvents.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        drugWithMostAdverseEvents.setForeground(java.awt.Color.white);
        drugWithMostAdverseEvents.setText("Meds with most Adverse Events");
        drugWithMostAdverseEvents.setBorder(null);
        drugWithMostAdverseEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugWithMostAdverseEventsActionPerformed(evt);
            }
        });
        add(drugWithMostAdverseEvents);
        drugWithMostAdverseEvents.setBounds(60, 165, 300, 44);

        drugWithMostFatalAdverseEvents.setBackground(new java.awt.Color(51, 51, 51));
        drugWithMostFatalAdverseEvents.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        drugWithMostFatalAdverseEvents.setForeground(java.awt.Color.white);
        drugWithMostFatalAdverseEvents.setText("Meds with most fatal Adverse Events");
        drugWithMostFatalAdverseEvents.setBorder(null);
        drugWithMostFatalAdverseEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugWithMostFatalAdverseEventsActionPerformed(evt);
            }
        });
        add(drugWithMostFatalAdverseEvents);
        drugWithMostFatalAdverseEvents.setBounds(60, 239, 330, 44);

        backJButton.setBackground(new java.awt.Color(51, 51, 51));
        backJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backJButton.setForeground(java.awt.Color.white);
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(60, 322, 78, 42);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEDS FEEDBACK");
        add(jLabel1);
        jLabel1.setBounds(155, 26, 295, 49);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\shail\\OneDrive\\Desktop\\finalProject indivifual\\stats.png")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(360, 60, 600, 490);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shail\\OneDrive\\Desktop\\finalProject indivifual\\bw grad.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-280, -370, 1360, 1010);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void drugAdverseEventsOverviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugAdverseEventsOverviewActionPerformed
        CategoryDataset data = createDataset();
        JFreeChart chart = createChart(data);
        ChartFrame chartFrame = new ChartFrame("Adverse Events Statistics", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(500, 500);
    }//GEN-LAST:event_drugAdverseEventsOverviewActionPerformed

    private void drugWithMostAdverseEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugWithMostAdverseEventsActionPerformed
        int adverseCount = 0;
        Drug drugWithMostAdverseEvent = null;
        for(Drug drug: medsDir.getDrugList()){
            if(drug.getDrugFeedbacks().size() > adverseCount){
                adverseCount = drug.getDrugFeedbacks().size();
                drugWithMostAdverseEvent = drug;
            }
        }
        
        if(drugWithMostAdverseEvent != null){
            ViewAdverseEventsJPanel viewDrugAdverseEvent = new ViewAdverseEventsJPanel(
                upc, drugWithMostAdverseEvent);
        upc.add("ViewAdverseEventsJPanel", viewDrugAdverseEvent);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
        }else{
            JOptionPane.showMessageDialog(null, "No adverse events recorded for any drug yet");
        }
        
    }//GEN-LAST:event_drugWithMostAdverseEventsActionPerformed

    private void drugWithMostFatalAdverseEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugWithMostFatalAdverseEventsActionPerformed
        int fataAdvCount = 0;
        Drug drugWithMostFatalAdverseEvent = null;
        for(Drug drug: medsDir.getDrugList()){
            if(drug.getFatalAdvEventCount() > fataAdvCount){
                fataAdvCount = drug.getFatalAdvEventCount();
                drugWithMostFatalAdverseEvent = drug;
            }
        }
        
        if(drugWithMostFatalAdverseEvent != null){
            ViewAdverseEventsJPanel viewDrugAdverseEvent = new ViewAdverseEventsJPanel(
                upc, drugWithMostFatalAdverseEvent);
        upc.add("ViewAdverseEventsJPanel", viewDrugAdverseEvent);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
        }else{
            JOptionPane.showMessageDialog(null, "No fatal adverse events recorded for any drugs yet");
        }
    }//GEN-LAST:event_drugWithMostFatalAdverseEventsActionPerformed

    private CategoryDataset createDataset() {

        DefaultCategoryDataset drugDataset = new DefaultCategoryDataset();

        for (Drug drug : webMedical.getNetwork(enterprise.getNetName()).getNationalDrugDirectory().getDrugList()) {
            drugDataset.addValue(drug.getDrugFeedbacks().size(), numberOfAdverseEvents, drug.getMedicineName());
        }
        return drugDataset;
    }

    private static JFreeChart createChart(CategoryDataset categorydataset) {
        JFreeChart jfreechart = ChartFactory.createBarChart(TITLE,
                catAxisLabel, catAxisValue, categorydataset,
                PlotOrientation.HORIZONTAL, true, true, false);
        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();

        categoryplot.setDomainGridlinesVisible(true);
        categoryplot.setRangePannable(true);
        categoryplot.setRangeZeroBaselineVisible(true);
        categoryplot.configureRangeAxes();

        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        LayeredBarRenderer layeredbarrenderer = new LayeredBarRenderer();
        layeredbarrenderer.setDrawBarOutline(false);
        categoryplot.setRenderer(layeredbarrenderer);
        categoryplot.setRowRenderingOrder(SortOrder.DESCENDING);

        return jfreechart;
    }

    // Constants
    public static String numberOfAdverseEvents = "Number of Products Sold";
    public static String TITLE = "Overview of drug adverse events";
    public static String catAxisLabel = "Drug";
    public static String catAxisValue = "Number of adverse events";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton drugAdverseEventsOverview;
    private javax.swing.JButton drugWithMostAdverseEvents;
    private javax.swing.JButton drugWithMostFatalAdverseEvents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
