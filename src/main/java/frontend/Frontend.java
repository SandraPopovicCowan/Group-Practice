/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import student.Student;


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
    
    private Student student;
    private FileWriter fWriter;
    private BufferedWriter bWriter;
    
    
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
        this.html = "Hello World";
        this.fWriter = new FileWriter(file);
        this.bWriter = new BufferedWriter(fWriter);
        bWriter.write(html);
        bWriter.close();
    }
    
    public void code() throws IOException{
        this.fWriter = new FileWriter(file);
        this.bWriter = new BufferedWriter(fWriter);
        bWriter.write(html);
        bWriter.close();
        
    }  
   
        
    

    
    
}
