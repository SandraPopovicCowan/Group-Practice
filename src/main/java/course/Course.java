/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;


public class Course {
    private String name;
    private int numberOfClasses;
    private String codeName;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String Name) {
        this.name = Name;
        
    }
    
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }
    
    public void setNumberOfClasses(int NumberOfClasses) {
        this.numberOfClasses = NumberOfClasses;
    }
    
    public String getCodeName() {
        return this.codeName;
    }
    
    public void setCodeName(String CodeName) {
        this.codeName = CodeName;
    }
    
    public Course() {
        this.name = "";
        this.codeName = "";
        this.numberOfClasses = 1;
    }
    
    public Course (String name, String codeName, int numberOfClasses){
        this.name = name;
        this.codeName = codeName;
        this.numberOfClasses = numberOfClasses;
   
    }
    
    
    
    
    
    
    
}
