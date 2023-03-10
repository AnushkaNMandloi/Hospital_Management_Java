/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DoctorLogin;

import Directories.CommunityDirectory;
import PatientLogin.*;
import uiForPatient.*;
import Directories.DoctorDirectory;
import Directories.EncounterHistory;
import Directories.HospitalDirectory;
import Directories.PatientDirectory;
import Directories.PersonDirectory;
import assignment.pkg2.Validations;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import smallClasses.Encounter;
import smallClasses.House;
import smallClasses.Patient;
import smallClasses.VitalSigns;

/**
 *
 * @author anush
 */
public class PatientData extends javax.swing.JPanel {

    /**
     * Creates new form viewPatientData
     */
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    CommunityDirectory communityDirectory;
    EncounterHistory encounterhistory;
    Patient patient;
    Validations v;
    public PatientData(DoctorDirectory doctorList, PatientDirectory patientList, PersonDirectory personList, HospitalDirectory hospitalList, CommunityDirectory communityDirectory, EncounterHistory encounterhistory) {
        initComponents();
        this.doctorList = doctorList;
        this.patientList = patientList;
        this.personList = personList;
        this.hospitalList = hospitalList;
        this.communityDirectory = communityDirectory;
        this.encounterHistory = encounterHistory;
        patient = new Patient();
        v = new Validations();
        populateData();
    }

//    public PatientData() {
//        initComponents();
//        populateData();
//    }

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
        jButton1 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        patientId = new javax.swing.JTextField();
        patientName = new javax.swing.JTextField();
        patientVitalSign = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        encounterHistory = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 255));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person Id", "Patient Id", "Name ", "Gender", "Person Typel", "Email", "Password", "Phone number", "Birthdate", "Apartment no", "Building name", "Street", "Community code", "City", "State", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Add Encounter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setText("Get Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        encounterHistory.setBackground(new java.awt.Color(204, 204, 255));
        encounterHistory.setText("Encounter History");
        encounterHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(patientVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(encounterHistory)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(encounterHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String sf = searchField.getText();
        Search(sf);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((patientTable.getSelectionModel().isSelectionEmpty())){
           JOptionPane.showMessageDialog(this, "Please select a row");
           return;
        }
        int rowIndex = patientTable.getSelectedRow();
        if(rowIndex <0){
            JOptionPane.showMessageDialog(this, "Select a row to delete");
            return;
        }
        System.out.println(patientList.getLength());
        DefaultTableModel model = (DefaultTableModel)patientTable.getModel();
        patientList.deletePatient(rowIndex);
        populateData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if((patientTable.getSelectionModel().isSelectionEmpty())){
           JOptionPane.showMessageDialog(this, "Please select a row");
           return;
        }
        int rowIndex = patientTable.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        patientId.setText(model.getValueAt(rowIndex, 1).toString());
        int id = Integer.parseInt(model.getValueAt(rowIndex, 1).toString());
        patientName.setText(model.getValueAt(rowIndex, 2).toString());
        String name = model.getValueAt(rowIndex, 2).toString();
        
        for(Patient p: patientList.getData()){
            if(id==p.getPatientId() && name.equals(p.getName())){
                patient = p;
                break;
            }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            if(patientVitalSign.getText()==null && date.getDate()==null){
                JOptionPane.showMessageDialog(this, "Please enter data");
                return;
            }
            if(v.isValidString(patientVitalSign.getText())){
                VitalSigns vs = new VitalSigns();
                vs.setName(patientVitalSign.getText());
                Encounter encounter = new Encounter();
                encounter.setVitalSign(vs);
                encounter.setDate(String.valueOf(date.getDate()));
                if(patient!=null){
                patient.setEncounter(encounter);
                patient.addEnountertoHistory(encounter);
                    System.out.println("Encounter added successfully");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Patient empty");
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void encounterHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterHistoryActionPerformed
        // TODO add your handling code here:
        viewEncounterHistory veh = new viewEncounterHistory(doctorList, patientList, personList, hospitalList, communityDirectory, encounterhistory, patient);
        veh.setVisible(true);
    }//GEN-LAST:event_encounterHistoryActionPerformed

    public void Search(String str){
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        patientTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton encounterHistory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientId;
    private javax.swing.JTextField patientName;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField patientVitalSign;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        //pd = new PatientDirectory();
        //patientList = new ArrayList<>(patientList);
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        for (Patient entry : patientList.getData()) {

            Object[] row = new Object[16];
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
            model.addRow(row);
        }

    }
}
