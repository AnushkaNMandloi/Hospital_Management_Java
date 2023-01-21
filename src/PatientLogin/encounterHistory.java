/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PatientLogin;

import Directories.CommunityDirectory;
import Directories.DoctorDirectory;
import Directories.EncounterHistory;
import Directories.HospitalDirectory;
import Directories.PatientDirectory;
import Directories.PersonDirectory;
import javax.swing.table.DefaultTableModel;
import smallClasses.Doctor;
import smallClasses.Encounter;
import smallClasses.Patient;

/**
 *
 * @author anush
 */
public class encounterHistory extends javax.swing.JPanel {

    /**
     * Creates new form encounterHistory
     */
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    EncounterHistory encounterHistory;
    CommunityDirectory communityDirectory;
    Patient patient;
    public encounterHistory() {
        initComponents();
        populateTable();
    }
    
    public encounterHistory(DoctorDirectory doctorList, PatientDirectory patientList, PersonDirectory personList, HospitalDirectory hospitalList, EncounterHistory encounterHistory, CommunityDirectory communityDirectory, Patient patient){
        initComponents();
        this.doctorList = doctorList;
        this.patientList = patientList;
        this.personList = personList;
        this.hospitalList = hospitalList;
        this.encounterHistory = encounterHistory;
        this.communityDirectory = communityDirectory;
        this.patient = patient;
        populateTable();
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
        encounterTable = new javax.swing.JTable();

        encounterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Encounter Date", "Encounter Vital Sign"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(encounterTable);
        if (encounterTable.getColumnModel().getColumnCount() > 0) {
            encounterTable.getColumnModel().getColumn(0).setResizable(false);
            encounterTable.getColumnModel().getColumn(1).setResizable(false);
            encounterTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable encounterTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        System.out.println("inside populate table");
        DefaultTableModel model = (DefaultTableModel) encounterTable.getModel();
        model.setRowCount(0);
        for (Encounter entry : encounterHistory.getData()) {   
            Object[] row = new Object[3];
            row[0] = patient.getPatientId();
            row[1] = entry.getDate();
            row[2] = entry.getVitalSign().getName();
            model.addRow(row);
        }
    }
}
