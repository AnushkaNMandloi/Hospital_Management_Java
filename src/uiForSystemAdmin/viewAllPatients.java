/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uiForSystemAdmin;

import Directories.CommunityDirectory;
import Directories.DoctorDirectory;
import Directories.EncounterHistory;
import Directories.HospitalDirectory;
import Directories.PatientDirectory;
import Directories.PersonDirectory;
import javax.swing.table.DefaultTableModel;
import smallClasses.Hospital;
import smallClasses.Patient;

/**
 *
 * @author anush
 */
public class viewAllPatients extends javax.swing.JFrame {

    /**
     * Creates new form viewAllPatients
     */
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    CommunityDirectory communityDirectory;
    EncounterHistory encounterhistory;
    public viewAllPatients() {
        initComponents();
    }
    
    public viewAllPatients(DoctorDirectory doctorList, PatientDirectory patientList, PersonDirectory personList, HospitalDirectory hospitalList, CommunityDirectory communityDirectory, EncounterHistory encounterhistory){
        initComponents();
        this.doctorList = doctorList;
        this.patientList = patientList;
        this.personList = personList;
        this.hospitalList = hospitalList;
        this.communityDirectory = communityDirectory;
        this.encounterhistory = encounterhistory;
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person Id", "Patient Id", "Name ", "Gender", "Person Typel", "Email", "Password", "Phone number", "Birthdate", "Apartment no", "Building name", "Street", "Community code", "City", "State", "Country", "doctor Id", "doctor name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(viewAllPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewAllPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewAllPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewAllPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewAllPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        for (Patient entry : patientList.getData()) {

            Object[] row = new Object[18];
            row[0] = entry.getId();
            row[1] = entry.getPatientId();
            row[2] = entry.getName();
            row[3] = entry.getGender();
            row[4] = entry.getPersonType();
            row[5] = entry.getEmail();
            row[6] = entry.getPassword();
            row[7] = entry.getPhone_number();
            row[8] = entry.getBirthDate();
            row[9] = entry.getHouse().getApt_No();
            row[10] = entry.getHouse().getBuildingName();
            row[11] = entry.getHouse().getStreet();
            row[12] = entry.getHouse().getCommunityCode();
            row[13] = entry.getHouse().getCity().getCityName();
            row[14] = entry.getHouse().getState();
            row[15] = entry.getHouse().getCountry();
            row[16] = entry.getDoctorId();
            row[17] = entry.getDoctorName();
            model.addRow(row);
        }
    }
}