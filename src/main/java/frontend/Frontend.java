/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import student.Student;
import course.Course;
import computer.Computer;
import price.Price;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kromp
 */
public class Frontend {
    private String css;
    private String html ;
    File file = new File("Frontend/Index.html");
    File file2 = new File("Frontend/main.css");
    
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
    
    private int priceOfCourse;

    public Frontend(Student student, Course course, Computer computer, String firstName, String lastName, int yearOfBirth, String operatingSystem, double processTact, double memory, int hardDrive, String name, int numberOfClasses, String codeName, int priceOfCourse) {
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
        this.priceOfCourse = priceOfCourse;
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

    public int getPriceOfCourse() {
        return this.priceOfCourse;
    }

    public void setPriceOfCourse(int priceOfCourse) {
        this.priceOfCourse = priceOfCourse;
    }
    

    public String getHtml() {
        return this.html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Frontend() throws IOException {
        this.html = "Hello  World";
        this.css = "Hi";
        this.fWriter = new FileWriter(file);
        this.bWriter = new BufferedWriter(fWriter);
        bWriter.write(html);
        bWriter.close();
    }
    
    public void code() throws IOException{
        
         this.html = 
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
            "                  <img src=\"http://mardzius.byethost4.com/Img/Logo%20White%20Transaprent%2072ppi-02.png\" alt=\"logo\">\n" +
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
            "                    <h3><b>Operating System: </b>" + getOperatingSystem()+ "</h3>\n" +
            "                    <h3><b>Price of Course: </b>" + getPriceOfCourse() + " EUR." + "</h3>\n" +
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
        
        this.css = 
            " *{\n" +
            "  box-sizing: border-box;\n" +
            "    \n" +
            "  }\n" +
            " html{\n" +
            "  box-sizing: border-box;\n" +
            " }\n" +
            "  body{\n" +
            "      margin: 0;\n" +
            "      background-color:rgba(12, 12, 12, 0.9);\n" +
            "      min-height: 100vh;\n" +
            "  }\n" +
            "\n" +
            "  header{\n" +
            "    background-repeat: no-repeat;\n" +
            "    background-position: center;\n" +
            "    flex-shrink: 0;\n" +
            "  }\n" +
            "\n" +
            "  aside{\n" +
            "    font-size: 22px;\n" +
            "  }\n" +
            "\n" +
            "  h3{\n" +
            "    font-size: 18px;\n" +
            "  }\n" +
            "\n" +
            "  footer{\n" +
            "    font-size: 22px;\n" +
            "    margin-top: auto;\n" +
            "    background-color: rgb(0, 107, 48);\n" +
            "    text-align: center;\n" +
            "    position: fixed;\n" +
            "    left:0px;\n" +
            "    bottom:0px;\n" +
            "    height:30px;\n" +
            "    width:100%;\n" +
            "  }\n" +
            "\n" +
            "  nav{\n" +
            "    text-decoration: none;\n" +
            "    text-align: center;\n" +
            "    font-size: 22px;\n" +
            "    background-color: rgb(0, 107, 48);\n" +
            "    \n" +
            "  }\n" +
            "\n" +
            "  nav a{\n" +
            "      text-decoration: none;\n" +
            "      color: wheat;\n" +
            "      padding: 20px; \n" +
            "  }\n" +
            "\n" +
            "  main{\n" +
            "    /* max-width: 50%; */\n" +
            "    align-items: center;\n" +
            "    margin: 0 auto;\n" +
            "    \n" +
            "  }\n" +
            "\n" +
            "  section{\n" +
            "    font-size: 22px;\n" +
            "    flex: 1;\n" +
            "    background-image: url(\"https://testiranje.rs/wp-content/uploads/2020/11/QA_Smiley_By_Mrg.png\");\n" +
            "    background-position: center;\n" +
            "    background-size: 700px 400px;\n" +
            "    margin: 30px 25%;\n" +
            "  }\n" +
            "\n" +
            "  /*Klase*/\n" +
            "  .flex-container{\n" +
            "      background-color: transparent;\n" +
            "      color: wheat;\n" +
            "      display: flex;\n" +
            "      flex-wrap: wrap;\n" +
            "      flex-direction: column;\n" +
            "      justify-content: center;\n" +
            "      align-items: center;\n" +
            "  }\n" +
            "  .logo{\n" +
            "    width: 100px;\n" +
            "    height: 100px;\n" +
            "    background-color: transparent;\n" +
            "    margin: 10px;\n" +
            "  }\n" +
            "  img{\n" +
            "    max-width: 100%;\n" +
            "    max-height: 100%;\n" +
            "    display: block;\n" +
            "  }\n" +
            "  .bgimage{\n" +
            "    background-image: url(\"https://testiranje.rs/wp-content/uploads/2020/11/QA_Smiley_By_Mrg.png\");\n" +
            "    background-position: center;\n" +
            "    background-size: cover;\n" +
            "    min-height: 100vh;\n" +
            "    color: wheat;\n" +
            "    font-size: 30px;\n" +
            "    text-align: center;\n" +
            "  }\n" +
            "  .white-filter{\n" +
            "    background-color: rgba(168, 164, 164, 0.2);\n" + 
            "    min-width: 100%\n" +
            "  }\n" +
            "  @media screen and (max-device-width: 380px) {\n" +
            "    nav {\n" +
            "      font-size: 15px;\n" +
            "      height: 20px;\n" +
            "       \n" +
            "    }\n" +
            "    nav a{\n" +
            "      text-decoration: none;\n" +
            "      color: wheat;\n" +
            "      padding: 2px; \n" +
            "    }\n" +
            "  section{\n" +
            "    font-size: 15px;\n" +
            "    margin: 30px 5%;\n" +
            "    }\n" +
            "  .bgimage{\n" +
            "    background-size: cover;\n" +
            "    min-width: 100vw;\n" +
            "    }\n" +
            "  .logo{\n" +
            "    width: 50px;\n" +
            "    height: 50px;\n" +
            "    background-color: transparent;\n" +
            "    margin: 10px;\n" +
            "    }\n" +
            "  }\n" +
            "  \n" +
            "  ";
        this.fWriter = new FileWriter(file2);
        this.bWriter = new BufferedWriter(fWriter);
        bWriter.write(css);
        bWriter.close();
    }  
   
        
    

    
    
}
