/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kromp
 */
public class Frontend {
   private String html = "<div><p> Hello World </p></div>";
   File file = new File("C:\\Frontend\\Index.html");
    private FileWriter fWriter;
    private BufferedWriter bWriter;
    
    public Frontend (String html) {
        
        this.html = html;
        
    }

    public String getHtml() {
        return this.html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Frontend() throws IOException {
        this.fWriter = new FileWriter(file);
        this.bWriter = new BufferedWriter(fWriter);
        bWriter.write(html);
        bWriter.close();
    }
    
    public void code(){
        System.out.println(getHtml());
    }  
   
        
    

    
    
}
