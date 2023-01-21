/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smallClasses;

import Directories.EncounterHistory;
import java.util.Date;

/**
 *
 * @author anush
 */
public class Patient extends Person{
//    public int personId, patientId;
//    public String name, gender, email, BirthDate, personType, password;
//    public long phone_number;
//    public House house;
    int patientId;
    public Encounter encounter;
    public EncounterHistory encounterHistory = new EncounterHistory();
    int doctorId;
    String doctorName;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public void addEnountertoHistory(Encounter encounter){
        this.encounterHistory.addData(encounter);
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
 
    
    
}
