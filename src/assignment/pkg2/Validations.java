/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

import Directories.EncounterHistory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import smallClasses.Community;
import smallClasses.Encounter;

/**
 *
 * @author anush
 */
public class Validations {

    //    public int personId, patientId;
//    public String name, gender, email, BirthDate, personType, password;
//    public long phone_number;
//    public House house;
//    int patientId;
//    public Encounter encounter;
//    public EncounterHistory encounterHistory;
    public boolean isValidName(String name) {
        if (ifStringContainsDigits(name)) {
            return false;
        } else {
            String regex = "^[a-zA-Z\\s]+$";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        }
    }

    public boolean ifStringContainsDigits(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        if (sb.length() != 0) {
            return true;
        }
        return false;
    }

    public boolean isValidEmail(String email) {
        String regex = "[a-zA-Z0-9/.]+@+[a-z]+.com$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidPhoneNumber(String phone) {
        String regex = "^[2-9]{1}[0-9]{9}";         
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean AptNo(String Aptno) {
        String regex = "[0-9]{1,5}";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(Aptno);
        return matcher.matches();
    }

    public boolean CommunityCode(Community commcode) {
        String regex = "[0-9]{5,6}";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(String.valueOf(commcode.getCommunityCode()));
        return matcher.matches();
    }

    public boolean isValidString(String str) {
        String regex = "[a-zA-Z]{1,}";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean onlyDigits(String str) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    
    public boolean isValidCommunityCode(String str){
        String regex = "^[0-9]{4,6}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    
    public int getRandomNumber(){
        int rNum = 0;
        int max = 1000000;
        int min = 10000;
        int range = max - min + 1;
        rNum = (int) (Math.random() * range) + min;
        return rNum;
    }
}
