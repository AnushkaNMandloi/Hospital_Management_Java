/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiForPatient;

import Directories.CommunityDirectory;
import Directories.DoctorDirectory;
import Directories.EncounterHistory;
import Directories.HospitalDirectory;
import Directories.PatientDirectory;
import Directories.PersonDirectory;
import assignment.pkg2.Validations;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import smallClasses.City;
import smallClasses.Encounter;
import smallClasses.House;
import smallClasses.Patient;
import smallClasses.VitalSigns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import smallClasses.Community;

/**
 *
 * @author anush
 */
public class createPatient extends javax.swing.JPanel {

    /**
     * Creates new form createPatient
     */
    DoctorDirectory doctorList;
    PatientDirectory patientList;
    PersonDirectory personList;
    HospitalDirectory hospitalList;
    CommunityDirectory communityDirectory;
    EncounterHistory encounterhistory;
    Validations v;
    Community community;
    //Patient p;

//    public createPatient(){
//        initComponents();
//        
//        //p = new Patient();
//    }
//    
    public createPatient(DoctorDirectory doctorList, PatientDirectory patientList, PersonDirectory personList, HospitalDirectory hospitalList,CommunityDirectory communityDirectory, EncounterHistory encounterhistory) {
        initComponents();
        this.doctorList = doctorList;
        this.patientList = patientList;
        this.personList = personList;
        this.hospitalList = hospitalList;
        this.communityDirectory = communityDirectory;
        this.encounterhistory = encounterhistory;
        v = new Validations();
        community = new Community();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        patientEmail = new javax.swing.JTextField();
        patientPassword = new javax.swing.JTextField();
        patientNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        patientGender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        patientAptNo = new javax.swing.JTextField();
        patientBuilding = new javax.swing.JTextField();
        patientStreet = new javax.swing.JTextField();
        patientCommunityCode = new javax.swing.JTextField();
        patientCity = new javax.swing.JTextField();
        patientState = new javax.swing.JTextField();
        patientCountry = new javax.swing.JTextField();
        patientPersonType = new javax.swing.JComboBox<>();
        patientBirthdate = new com.toedter.calendar.JDateChooser();
        addPatientButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enter Patient Details");

        jLabel2.setText("Name");

        jLabel3.setText("Person Type");

        jLabel4.setText("Email");

        jLabel5.setText("Password");

        jLabel6.setText("Phone Number");

        jLabel7.setText("Birthdate");

        jLabel8.setText("Apartment Number");

        jLabel9.setText("Building Name");

        jLabel10.setText("Street");

        jLabel11.setText("Community Code");

        jLabel12.setText("City");

        jLabel13.setText("State");

        jLabel14.setText("Gender");

        patientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Trans", "Other" }));

        jLabel15.setText("Country");

        patientCommunityCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCommunityCodeActionPerformed(evt);
            }
        });

        patientState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientStateActionPerformed(evt);
            }
        });

        patientPersonType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor" }));

        addPatientButton.setBackground(new java.awt.Color(204, 204, 255));
        addPatientButton.setText("Add Patient");
        addPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(patientEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientNumber, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientPassword)
                    .addComponent(patientGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientPersonType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientBirthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patientAptNo)
                    .addComponent(patientBuilding)
                    .addComponent(patientStreet)
                    .addComponent(patientCommunityCode)
                    .addComponent(patientCity)
                    .addComponent(patientState)
                    .addComponent(patientCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(patientBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientPersonType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(patientCommunityCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(patientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(patientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(patientState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel15)
                                .addComponent(patientCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(patientBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientAptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(patientStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientCommunityCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCommunityCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientCommunityCodeActionPerformed

    private void patientStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientStateActionPerformed

    private void addPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientButtonActionPerformed
        // TODO add your handling code here:
        try {

            if (patientName.getText() == null
                    || patientAptNo.getText() == null
                    || patientBuilding.getText() == null
                    || patientStreet.getText() == null
                    || patientBirthdate.getDate() == null
                    || patientCommunityCode.getText() == null
                    || patientCity.getText() == null
                    || patientState.getText() == null
                    || patientCountry.getText() == null
                    || patientPassword == null
                    || patientEmail == null) {
                JOptionPane.showMessageDialog(this, "Enter the details");
                return;
            }

            String birthDate;
            //Long phoneNumber = 99999999;
            House house;
            City city = new City();
            city.setCityName(patientCity.getText());
            Encounter encounter = new Encounter();
            VitalSigns vitalsign = new VitalSigns();
            vitalsign.setName("");
            encounter.setVitalSign(vitalsign);
            encounter.setDate(null);

            

            if (v.isValidName(patientName.getText())) {
                System.out.println("correct name");
            } else {
                patientName.setText("");
                System.out.println("name incorrect");
            }
            if (v.isValidEmail(patientEmail.getText())) {
                System.out.println("correct email");
            } else {
                patientEmail.setText("");
                System.out.println("email incorrect");
            }
            if (v.isValidPhoneNumber(patientNumber.getText())) {
                System.out.println("correct number");
            } else {
                patientNumber.setText("");
                System.out.println("number incorrect");
            }
            if (v.onlyDigits(patientAptNo.getText())) {
                System.out.println("correct aptno");
            } else {
                patientAptNo.setText("");
                System.out.println("aptno incorrect");
            }
            if (v.isValidString(patientBuilding.getText())) {
                System.out.println("correct building name");
            } else {
                patientBuilding.setText("");
                System.out.println("building name incorrect");
            }
            if (v.isValidString(patientStreet.getText())) {
                System.out.println("correct street name");
            } else {
                patientStreet.setText("");
                System.out.println("street name incorrect");
            }
            if (v.isValidString(patientState.getText())) {
                System.out.println("correct state name");
            } else {
                patientState.setText("");
                System.out.println("state name incorrect");
            }
            if (v.isValidString(patientCountry.getText())) {
                System.out.println("correct country name");
            } else {
                patientCountry.setText("");
                System.out.println("country name incorrect");
            }
            if(v.isValidCommunityCode(patientCommunityCode.getText())){
                System.out.println("correct community code");
            } else {
                patientCommunityCode.setText("");
                System.out.println("community code incorrect");
            }
            if(v.isValidString(patientCity.getText())){
                System.out.println("correct city");
            } else {
                patientCity.setText("");
                System.out.println("city incorrect");
            }

            SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
            birthDate = sdf.format(patientBirthdate.getDate());

            if (v.isValidName(patientName.getText())
                    && v.isValidEmail(patientEmail.getText())
                    && v.isValidPhoneNumber(patientNumber.getText())
                    && v.onlyDigits(patientAptNo.getText())
                    && v.isValidString(patientBuilding.getText())
                    && v.isValidString(patientStreet.getText())
                    && v.isValidString(patientState.getText())
                    && v.isValidString(patientCountry.getText())
                    && v.isValidCommunityCode(patientCommunityCode.getText())
                    && v.isValidString(patientCity.getText())) {
            house = new House(patientAptNo.getText(), patientBuilding.getText(), patientStreet.getText(), Integer.parseInt(patientCommunityCode.getText()), city, patientState.getText(), patientCountry.getText());

            Patient p = patientList.addNewPatient();

            p.setId(v.getRandomNumber());
            p.setPatientId(v.getRandomNumber());
            p.setName(patientName.getText());
            p.setGender(patientGender.getSelectedItem().toString());
            p.setPersonType("patient");
            p.setEmail(patientEmail.getText());
            p.setPassword(patientPassword.getText());
            p.setPhone_number(Long.parseLong(patientNumber.getText()));
            p.setBirthDate(birthDate);
            p.setHouse(house);
            community.setCommunityCode(v.getRandomNumber());
            community.setCity(city);
            community.setPassword(city.getCityName());
            communityDirectory.addData(community);
            JOptionPane.showMessageDialog(this, "Record Saved!");
            } else {
                JOptionPane.showMessageDialog(this, "Enter correct details");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //patientList.addNewPatient(p);
    }//GEN-LAST:event_addPatientButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField patientAptNo;
    private com.toedter.calendar.JDateChooser patientBirthdate;
    private javax.swing.JTextField patientBuilding;
    private javax.swing.JTextField patientCity;
    private javax.swing.JTextField patientCommunityCode;
    private javax.swing.JTextField patientCountry;
    private javax.swing.JTextField patientEmail;
    private javax.swing.JComboBox<String> patientGender;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField patientNumber;
    private javax.swing.JTextField patientPassword;
    private javax.swing.JComboBox<String> patientPersonType;
    private javax.swing.JTextField patientState;
    private javax.swing.JTextField patientStreet;
    // End of variables declaration//GEN-END:variables
}
