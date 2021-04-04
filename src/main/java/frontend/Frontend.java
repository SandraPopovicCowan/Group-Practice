/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import student.Student;
import course.Course;
import computer.Computer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kromp
 */
public class Frontend {
    private String html ;
    File file = new File("C:\\Users\\kromp\\OneDrive\\Documents\\NetBeansProjects\\Group-Practice\\FrontEnd\\Index.html");
    
    
    private FileWriter fWriter;
    private BufferedWriter bWriter;
    private Student student;
    private Course course;
    private Computer computer;
    //Attribues to improve fronend.
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    private String name;
    private int numberOfClasses;
    private String codeName;

    public Frontend(Student student, Course course, Computer computer, String firstName, String lastName, int yearOfBirth, String operatingSystem, double processTact, double memory, int hardDrive, String name, int numberOfClasses, String codeName) {
        this.student = student;
        this.course = course;
        this.computer = computer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getProcessTact() {
        return this.processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return this.memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return this.hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getCodeName() {
        return this.codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
    
        
    

    
    
    

    public Course getCourse() {
        return this.course;
    }
    
    public Computer getComputer() {
        return this.computer;
    }
    public Student getStudent(){
        return this.student;
    }

    
    
    
    
    

    public String getHtml() {
        return this.html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Frontend() throws IOException {
       this.html = "Hello  World";
        this.fWriter = new FileWriter(file);
        this.bWriter = new BufferedWriter(fWriter);
        bWriter.write(html);
        bWriter.close();
    }
    
    public void code() throws IOException{
        
         this.html = "<head>\n" +
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
"                    <h3><b>First name: </b>" + getFirstName() + "</h3>\n" +
"                    <h3><b>Last name: </b>" + getLastName() + "</h3>\n" +
"		     <h3><b>Year of birth: </b>" + getYearOfBirth() + "</h3>\n" +
"		     <h3><b>Course Name: </b>" + getName() + "</h3>\n" +
"                    <h3><b>Number of Classes:</b>" + getNumberOfClasses() + "</h3>\n" +
"                    <h3><b>Proccess Tact: </b>" + getProcessTact() + "</h3>\n" +
"                    <h3><b>Memory: </b>" + getMemory() + "</h3>\n" +
"                    <h3><b>Hard Disk Drive: </b>" + getHardDrive() + "</h3>\n" +
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
"</html>";
        
        this.fWriter = new FileWriter(file);
        this.bWriter = new BufferedWriter(fWriter);
        bWriter.write(html);
        bWriter.close();
        
    }  
   
        
    

    
    
}
