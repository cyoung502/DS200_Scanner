/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author noemailgmail
 */
public class Logger {
    
    private String logName;

    public Logger() throws IOException {
        //TODO: get date as MMDDYYYY;
        logName = "";
        
        File dir = new File("logs");
        if(!dir.exists()){
            dir.mkdir();
        }
        
        File log = new File("logs/" + logName + ".txt");
        if(!log.exists()){
            log.createNewFile();
        }
    }
    
    
    
    public void log(String message) throws IOException{
        FileWriter fw = new FileWriter(needFileHere);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(message);
        bw.close();
        fw.close();
    }
    
}
