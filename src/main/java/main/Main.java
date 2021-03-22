
        
package main;

import student.Student;
import course.Course;
import computer.Computer;



public class Main {

    
    public static void main(String[] args) {
      
        Student student1 = new Student();
        
        student1.setFirstName("Bella");
        student1.setLastName("Cowan");
        student1.setYearOfBirth(2004);
        student1.getCourse().setName("QA");
        student1.getCourse().setNumberOfClasses(120);
        student1.getComputer().setProcessTact(2.4);
        student1.getComputer().setMemory(500);
        student1.getComputer().setHardDrive(240);
        student1.info();
       
        
        
        
                  
  
    
    }
    
}   
