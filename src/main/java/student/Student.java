/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
     public String getFirstname () {
         return this.firstName;
     }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public int getYearOfBirht() {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth( int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 1990;
        
    }
    
    public Student( String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println("");
    }
}
