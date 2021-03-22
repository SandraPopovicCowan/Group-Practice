
        
package main;

import student.Student;
import course.Course;
import computer.Computer;



public class Main {

    
    public static void main(String[] args) {
      
        Student ime = new Student();
        
        
        ime.setFirstName("Bella");
        ime.setLastName("Cowan");
        ime.setYearOfBirth(2004);
       
        
        
        Course naziv = new Course();
       
        naziv.setName("QA");
        naziv.setNumberOfClasses(120);
  
        Computer tip = new Computer();
       
        tip.setProcessTact(2.8);
        tip.setMemory(8.0);
        tip.setHardDrive(250);
        
        System.out.println("First Name: " + ime.getFirstname());
        System.out.println("Last name: " + ime.getLastName());
        System.out.println("Year of birth: " + ime.getYearOfBirth());
        System.out.println("Course name: " + naziv.getName());
        System.out.println("Course number of classes: " +naziv.getNumberOfClasses());
        System.out.println("Process tact: " + tip.getProcessTact());
        System.out.println("Memory: " + tip.getMemory());
        System.out.println("Hard drive: " + tip.getHardDrive());
        
                  
  
    
    }
    
}   
