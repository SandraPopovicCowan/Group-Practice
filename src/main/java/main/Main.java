
        
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
        
        
        
        student1.setFirstName("Isak");  
        student1.setLastName("Cowan");
        student1.setYearOfBirth(2004);
        student1.getCourse().setName("QA");
        student1.getCourse().setNumberOfClasses(120);
        student1.getComputer().setProcessTact(2.4);////ovo nisam znala da moze get pa set u ustom pozivu.
        student1.getComputer().setMemory(500);
        student1.getComputer().setHardDrive(240);
        student1.info();
        //dodatak za generator html-a
        
        
        
        
        frontend1.setFirstName(student1.getFirstname());
        frontend1.setLastName(student1.getLastName());
        frontend1.setYearOfBirth(student1.getYearOfBirth());
        frontend1.setName(student1.getCourse().getName());
        frontend1.setNumberOfClasses(student1.getCourse().getNumberOfClasses());
        frontend1.setProcessTact(student1.getComputer().getProcessTact());
        frontend1.setMemory(student1.getComputer().getMemory());
        frontend1.setHardDrive(student1.getComputer().getHardDrive());
        
        frontend1.code();
        
        
        
    }
    
}   
