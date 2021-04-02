
        
package main;

import student.Student;
import course.Course;
import computer.Computer;
import frontend.Frontend;
import java.io.IOException;



public class Main {

    
    public static void main(String[] args) throws IOException {
        
        
        Student student1 = new Student();
        Frontend frontend1 = new Frontend();
        
        student1.setFirstName("Bella");  
        student1.setLastName("Cowan");
        student1.setYearOfBirth(2004);
        student1.getCourse().setName("QA");
        student1.getCourse().setNumberOfClasses(120);
        student1.getComputer().setProcessTact(2.4);////ovo nisam znala da moze get pa set u ustom pozivu.
        student1.getComputer().setMemory(500);
        student1.getComputer().setHardDrive(240);
        student1.info();
        //dodatak za generator html-a
        frontend1.code();
        
        
    }
    
}   
