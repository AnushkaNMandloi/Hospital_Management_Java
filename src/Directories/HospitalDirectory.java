/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import smallClasses.Hospital;
import smallClasses.Patient;
import java.util.ArrayList;
import smallClasses.Doctor;

/**
 *
 * @author anush
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory(){
        hospitalList = new ArrayList<Hospital>();
    }
    
    public void addData(Hospital hospital){
        hospitalList.add(hospital);
    }
    
    public ArrayList<Hospital> getData(){
        return hospitalList;
    }

    public Hospital addNewHospitald() {
        System.out.println("Entered ADD NEW DOCTOR");
        Hospital d = new Hospital();
        hospitalList.add(d);
        return d;
    }
    
    public void deleteHospital(int num) {
        hospitalList.remove(num);
    }
    
    public int getLength(){
        return hospitalList.size();
    }
}
