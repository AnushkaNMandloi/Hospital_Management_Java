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
import java.text.SimpleDateFormat;
import java.util.Date;
import smallClasses.Encounter;
import smallClasses.Patient;
import smallClasses.VitalSigns;

/**
 *
 * @author anush
 */
public class encounterAdd extends javax.swing.JPanel {

    /**
     * Creates new form encounterAdd
     */
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    EncounterHistory encounterHistory;
    CommunityDirectory communityDirectory;
    Patient patient;

    public encounterAdd() {
        initComponents();
    }

    public encounterAdd(DoctorDirectory doctorList, PatientDirectory patientList, PersonDirectory personList, HospitalDirectory hospitalList, EncounterHistory encounterHistory, CommunityDirectory communityDirectory , Patient patient) {
        initComponents();
        this.doctorList = doctorList;
        this.patientList = patientList;
        this.personList = personList;
        this.hospitalList = hospitalList;
        this.encounterHistory = encounterHistory;
        this.communityDirectory = communityDirectory;
        this.patient = patient;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientencounterId = new javax.swing.JTextField();
        patientVitalSign = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        patientEncounterDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("Encounter Id");

        jLabel2.setText("Vital Sign");

        jLabel3.setText("Date");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Add Encounter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientencounterId)
                            .addComponent(patientVitalSign)
                            .addComponent(patientEncounterDate, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jButton1)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientencounterId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientEncounterDate, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("patient name: " + patient.getName());

        VitalSigns vs = new VitalSigns();
        //int encounterId = Integer.parseInt(patientencounterId.getText());
        vs.setName(patientVitalSign.getText());
        String encounterDate;
        SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
        encounterDate = sdf.format(patientEncounterDate.getDate());
        
        //Encounter encounter = new Encounter();
        Encounter encounter = encounterHistory.addNewEncounter();
        encounter.setDate(encounterDate);
        encounter.setVitalSign(vs);

        for (Patient p : patientList.getData()) {
            if (p.getPatientId() == patient.getPatientId() && p.getPassword().equals(patient.getPassword())) {
                p.setEncounter(encounter);
                p.setEncounterHistory(encounterHistory);
                System.out.println("get encounter: " + p.getEncounter().getVitalSign().getName());
                break;
            }
        }
        //System.out.println(patient.getEncounterHistory().getData().get(0).get);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JDateChooser patientEncounterDate;
    private javax.swing.JTextField patientVitalSign;
    private javax.swing.JTextField patientencounterId;
    // End of variables declaration//GEN-END:variables
}
