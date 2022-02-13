/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanielsAssignment;

/**
 *
 * @author MUQADASA SHERANI
 */
public class Patient {
    private int id;
    private String fullname;
    private int age;
    private int numOfVisits = 1;
    private float visitsPerYear;
    
    //new patient record
    public Patient() { 
    }
    
    //a specific patient
    public Patient(int id, String fullname, int age) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        //numOfVisits++;
    }
    
    
    //calculates annual visits of the patients
    public float calcVisits(){
        this.visitsPerYear = (float)this.numOfVisits/(float) this.age;
        return visitsPerYear;
    }
    
    //increments numbers of visits
    public void increaseVisits(){
        this.numOfVisits++;
    }
    
    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public int getNumOfVisits() {
        return numOfVisits;
    }

    public float getVisitsPerYear() {
        this.visitsPerYear = calcVisits();
        return visitsPerYear;
    }
    
    //setters...
    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumOfVisits(int numOfVisits) {
        this.numOfVisits = numOfVisits;
    }

    public void setVisitsPerYear(float visitsPerYear) {
        this.visitsPerYear = visitsPerYear;
    }
    
    //toString...
    @Override
    public String toString() {
        return "Patient id=" + this.id + ", Name=" + this.fullname + ", visits Per Year=" + getVisitsPerYear();
    }
    
}
