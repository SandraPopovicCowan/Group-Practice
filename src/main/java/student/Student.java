
package student;
import course.Course;
import computer.Computer;



public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public String getCourse() {
        return course;
    }
    
    public String getComputer() {
        return computer;
    }
    
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
    
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth( int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 1990;
        this.computer = computer ;
        this.course = course;
        
    }
    
    public Student( String firstName, String lastName, int yearOfBirth, Course course, Computer computer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.computer = computer;
        this.course = course;
    }
    
    public void info() {
        System.out.println("First name: " + getFirstname());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Course name: " + getCourse());
        System.out.println("Course number of classes: " + getComputer());
        System.out.println("Process tact: " + getComputer() + "GHz");
        System.out.println("Memory: " + getComputer() + "GB");
        System.out.println("Hard drive: " +getComputer() + "GB");
    
        System.out.println("");
    }
    
    
}
