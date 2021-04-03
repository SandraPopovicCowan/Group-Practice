
package student;
import course.Course;
import computer.Computer;
import frontend.Frontend;


public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    private Frontend frontend;
    
    
    
    public Course getCourse() {
        return this.course;
    }
    
    public Computer getComputer() {
        return this.computer;
    }
    
    public Frontend getFrontend(){
        return this.frontend;
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
        this.yearOfBirth = 1990;//da li neparametrizovani konstruktor moze biti prazan, dakle da li su prva cetiri reda nephodna?
        this.computer = new Computer();
        this.course = new Course();
        
    }
    
    public Student( String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.computer = new Computer();
        this.course = new Course();//zasto ne radi kada se samo stavi u parametrizovani konstruktor?
        //ja sam probala da radim samo sa parametrizovanim, ali nije radilo. Mora da bude u ovog gore neparametrizovanom.
       
    }
    
    public void info() {
        System.out.println("First name: " + getFirstname());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Course name: " + course.getName());//neki su radili sa this.course.getName , a ja nisam. Zasto oboma radi?
        System.out.println("Course number of classes: " + course.getNumberOfClasses());
        System.out.println("Process tact: " + computer.getProcessTact() + " GHz ");
        System.out.println("Memory: " + computer.getMemory() + " GB ");
        System.out.println("Hard drive: " + computer.getHardDrive() + " GB ");
        System.out.println("");
    }
    
    public void infoData(){
    
        
    }
    
    
    
    
}
