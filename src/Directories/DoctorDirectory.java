/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import smallClasses.Doctor;
import java.util.ArrayList;
import java.util.Date;
import smallClasses.Patient;

/**
 *
 * @author anush
 */
public class DoctorDirectory {
    
    ArrayList<Doctor> doctorData;
    
    public DoctorDirectory(){
        doctorData = new ArrayList<Doctor>();
    }
    
//    public DoctorDirectory(int personId, String name, String address, String city, String state, String email, String personType, String password, long phone_number, Date BirthDate, int doctorId, String doctorType){
//        Doctor doc = new Doctor(personId, name, address, city, state, email, personType, password, phone_number, BirthDate, doctorId, doctorType);
//        doctorData = new ArrayList<Doctor>();
//    }
    
    public void addData(Doctor doc){
        doctorData.add(doc);
    }
    
    public ArrayList<Doctor> getData(){
        return doctorData;
    }

    public Doctor addNewDoctor() {
        System.out.println("Entered ADD NEW DOCTOR");
        Doctor d = new Doctor();
        doctorData.add(d);
        return d;
    }
    
    public void deleteDoctor(int num) {
        doctorData.remove(num);
    }
    
    public int getLength(){
        return doctorData.size();
    }
}
