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
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author noemailgmail
 */
public class Logger {

    private String logName;

    public Logger() throws IOException {
        //Create logname
        logName = "logs/" + new SimpleDateFormat("MM_dd_yyyy").format(new Date()) + ".txt";
        //Create dir if doesn't exist
        File dir = new File("logs");
        if (!dir.exists()) {
            dir.mkdir();
        }
    }

    public void log(String message) throws IOException {
        FileWriter fw = new FileWriter(this.getLogName(), true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(message);
        pw.close();
        bw.close();
        fw.close();
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

}
