/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import smallClasses.Patient;
import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<>();
    }
    
    public void addData(ArrayList<Patient> patientList){
        this.patientList = patientList;
    }
    
    public ArrayList<Patient> getData(){
        return patientList;
    }
    
    public Patient addNewPatient(){
        System.out.println("Entered ADD NEW PATIENT");
        Patient p = new Patient();
        patientList.add(p);
        return p;
    }

    public void deletePatient(int num) {
        patientList.remove(num);
    }
    
    public int getLength(){
        return patientList.size();
    }
    
    public Patient getPatient(int index){
        return patientList.get(index);
    }
    
}

/*private ArrayList<Employee> history;
    
    public EmployeeHistory(){
        history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee(){
        Employee emp = new Employee();
        history.add(emp);
        return emp;
    }

    public void deleteEmployee(int num) {
        history.remove(num);
    }
    
    public int getLength(){
        return history.size();
    }*/
