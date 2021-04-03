
        
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
        
        frontend1.setHtml((
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Naslovna</title>\n" +
"    <link rel=\"stylesheet\" href=\"main.css\">\n" +
"    <script src=\"JS/myScript.js\"></script>\n" +
"</head>\n" +
"<body>\n" +
"    <!--header-->\n" +
"    <header>\n" +
"       <div class=\"flex-container\">\n" +
"           <div class=\"centar\">\n" +
"               <div class=\"logo\">\n" +
"                  <img src=\"Img/Logo White Transaprent 72ppi-02.png\" alt=\"logo\">\n" +
"               </div>\n" +
"            </div>\n" +
"       </div>\n" +
"      \n" +
"    </header>\n" +
"    <nav>\n" +
"        \n" +
"            <a href=\"#\">Početna</a>\n" +
"            <a href=\"https://github.com/SandraPopovicCowan/Group-Practice\" target=\"_blank\">Github</a>\n" +
"            <a href=\"#\">Discord</a>\n" +
"            <a href=\"#\">Hobi</a>\n" +
"            <a href=\"#\">Progress</a>\n" +
"        \n" +
"    </nav>\n" +
"    <main>\n" +
"        <section>\n" +
"            <div class=\"flex-container\"> \n" +
"                <div class=\"white-filter\">\n" +
"                    <h3><b>First name: </b>" + student1.getFirstname() + "</h3>\n" +
"                    <h3><b>Last name: </b>" + student1.getLastName() + "</h3>\n" +
"		     <h3><b>Year of birth: </b>" + student1.getYearOfBirth() + "</h3>\n" +
"		     <h3><b>Course Name: </b>" + student1.getCourse().getName() + "</h3>\n" +
"                    <h3><b>Number of Classes:</b>" + student1.getCourse().getNumberOfClasses() + "</h3>\n" +
"                    <h3><b>Proccess Tact: </b>" + student1.getComputer().getProcessTact() + "</h3>\n" +
"                    <h3><b>Memory: </b>" + student1.getComputer().getMemory() + "</h3>\n" +
"                    <h3><b>Hard Disk Drive: </b>" + student1.getComputer().getHardDrive() + "</h3>\n" +
"                </div>\n" +
"            </div class=\"flex-container\">\n" +
"        </section>\n" +
"    </main>\n" +
"    <!--Footer-->\n" +
"    <footer>\n" +
"        <div>\n" +
"            Website by mRG - 2021\n" +
"        </div>\n" +
"    </footer>\n" +
"</body>\n" +
"</html>"));
        frontend1.code();
        
        
        
    }
    
}   
