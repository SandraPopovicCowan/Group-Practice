
        
package main;

import student.Student;
import course.Course;
import computer.Computer;


/**
 *
 * @author macbookair
 */
public class Main {

    
    public static void main(String[] args) {
      
        Student ime = new Student();
        ime.info();
        
        ime.setFirstName("Bella");
        ime.setLastName("Cowan");
        ime.setYearOfBirth(2004);
        ime.info();
        
        Course naziv = new Course();
       
        naziv.setName("QA");
        naziv.setNumberOfClasses(120);
        
        System.out.println("Course name: " + naziv.getName());
        System.out.println("Course number of classes: " +naziv.getNumberOfClasses());
        
        Computer tip = new Computer();
       
        tip.setProcessTact(2.8);
        tip.setMemory(8.0);
        tip.setHardDrive(250);
        
        
        System.out.println("Process tact: " + tip.getProcessTact());
        System.out.println("Memory: " + tip.getMemory());
        System.out.println("Hard drive: " + tip.getHardDrive());
                  
  
    
    }
    
}   
