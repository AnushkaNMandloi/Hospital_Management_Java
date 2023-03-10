/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PatientLogin;

import Directories.CommunityDirectory;
import uiForPatient.*;
import Directories.DoctorDirectory;
import Directories.EncounterHistory;
import Directories.HospitalDirectory;
import Directories.PatientDirectory;
import Directories.PersonDirectory;
import smallClasses.Encounter;
import smallClasses.Patient;
import smallClasses.VitalSigns;
import uiForSystemAdmin.SystemAdminPage;

/**
 *
 * @author anush
 */
public class PatientPage extends javax.swing.JFrame {

    
    /**
     * Creates new form PatientPage
     */
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    EncounterHistory encounterHistory;
    CommunityDirectory communityDirectory;
    Patient patient;
    public PatientPage() {
        initComponents();
    }
    
    public PatientPage(DoctorDirectory doctorList, PatientDirectory patientList, PersonDirectory personList, HospitalDirectory hospitalList, EncounterHistory encounterHistory, CommunityDirectory communityDirectory , Patient patient){
        initComponents();
        this.doctorList = doctorList;
        this.patientList = patientList;
        this.personList = personList;
        this.hospitalList = hospitalList;
        this.encounterHistory = encounterHistory;
        this.communityDirectory = communityDirectory;
        this.patient = patient;
    }
    
    public PatientPage(DoctorDirectory doctorList, PatientDirectory patientList, PersonDirectory personList, HospitalDirectory hospitalList,CommunityDirectory communityDirectory, EncounterHistory encounterhistory){
        initComponents();
        this.doctorList = doctorList;
        this.patientList = patientList;
        this.personList = personList;
        this.hospitalList = hospitalList;
        this.encounterHistory = encounterHistory;
        this.communityDirectory = communityDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPatientPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        rightPatientPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPatientPanel.setBackground(new java.awt.Color(102, 102, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Doctors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Add encounters");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(204, 204, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Encounter history");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setText("View Hospital");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPatientPanelLayout = new javax.swing.GroupLayout(leftPatientPanel);
        leftPatientPanel.setLayout(leftPatientPanelLayout);
        leftPatientPanelLayout.setHorizontalGroup(
            leftPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPatientPanelLayout.setVerticalGroup(
            leftPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPatientPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftPatientPanel);

        rightPatientPanel.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout rightPatientPanelLayout = new javax.swing.GroupLayout(rightPatientPanel);
        rightPatientPanel.setLayout(rightPatientPanelLayout);
        rightPatientPanelLayout.setHorizontalGroup(
            rightPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        rightPatientPanelLayout.setVerticalGroup(
            rightPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightPatientPanel);

        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        encounterAdd ea = new encounterAdd(doctorList, patientList, personList, hospitalList, encounterHistory, communityDirectory, patient);
        rightPatientPanel.add(ea);
        jSplitPane1.setRightComponent(ea);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewSearchDoctorData vd = new viewSearchDoctorData(doctorList,patientList,personList,hospitalList,communityDirectory, encounterHistory, patient);
        rightPatientPanel.add(vd);
        jSplitPane1.setRightComponent(vd);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new SystemAdminPage().toFront();
        new SystemAdminPage().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println("Patient page -> encounterhistory");
        encounterHistory eh = new encounterHistory(doctorList, patientList, personList, hospitalList, encounterHistory, communityDirectory, patient);
        rightPatientPanel.add(eh);
        jSplitPane1.setRightComponent(eh);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SearchHospitalData shd = new SearchHospitalData(doctorList, patientList, personList, hospitalList, communityDirectory, encounterHistory);
        rightPatientPanel.add(shd);
        jSplitPane1.setRightComponent(shd);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPatientPanel;
    private javax.swing.JPanel rightPatientPanel;
    // End of variables declaration//GEN-END:variables
}
