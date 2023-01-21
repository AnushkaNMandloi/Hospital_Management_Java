/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import smallClasses.Encounter;
import smallClasses.Hospital;
import java.util.ArrayList;
import smallClasses.Doctor;

/**
 *
 * @author anush
 */
public class EncounterHistory {
    ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory(){
        encounterHistory = new ArrayList<Encounter>();
    }
    
    public void addData(Encounter encounter){
        encounterHistory.add(encounter);
    }
    
    public ArrayList<Encounter> getData(){
        return encounterHistory;
    }
    
    public Encounter addNewEncounter() {
        System.out.println("Entered ADD NEW DOCTOR");
        Encounter e = new Encounter();
        encounterHistory.add(e);
        return e;
    }
    
    public void deleteEncounter(int num) {
        encounterHistory.remove(num);
    }
    
    public int getLength(){
        return encounterHistory.size();
    }
}
