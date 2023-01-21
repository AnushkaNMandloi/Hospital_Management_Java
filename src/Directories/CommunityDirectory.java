/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import java.util.ArrayList;
import smallClasses.Community;
import smallClasses.Doctor;

/**
 *
 * @author anush
 */
public class CommunityDirectory {
    ArrayList<Community> communityData;
    
    public CommunityDirectory(){
        communityData = new ArrayList<Community>();
    }
    
//    public DoctorDirectory(int personId, String name, String address, String city, String state, String email, String personType, String password, long phone_number, Date BirthDate, int doctorId, String doctorType){
//        Doctor doc = new Doctor(personId, name, address, city, state, email, personType, password, phone_number, BirthDate, doctorId, doctorType);
//        doctorData = new ArrayList<Doctor>();
//    }
    
    public void addData(Community c){
        communityData.add(c);
    }
    
    public ArrayList<Community> getData(){
        return communityData;
    }

    public Community addNewCommunity() {
        System.out.println("Entered ADD NEW DOCTOR");
        Community c = new Community();
        communityData.add(c);
        return c;
    }
    
    public void deleteCommunity(int num) {
        communityData.remove(num);
    }
    
    public int getLength(){
        return communityData.size();
    }
}
