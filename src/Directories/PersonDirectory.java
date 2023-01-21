/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import smallClasses.Person;
import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class PersonDirectory {
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }
    
    public void addData(Person person){
        personList.add(person);
    }
    
    public ArrayList<Person> getData(){
        return personList;
    }
}
