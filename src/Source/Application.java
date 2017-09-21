/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import UI.MainScreen;
import UI.Splash;
import com.bulenkov.darcula.DarculaLaf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chris
 */
public class Application {

    public static MainScreen application;

    @SuppressWarnings("unchecked")
    public static void updateList() {
        File[] files = new File("data").listFiles();
        ArrayList<String> fileNames = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                fileNames.add(file.getName());
            }
        }
        DefaultListModel dlm = new DefaultListModel();
        for (int j = 0; j < fileNames.size(); j++) {
            dlm.addElement(fileNames.get(j));
        }
        application.jList1.setModel(dlm);
    }

    public static void printConsole(String message) {
        String temp = application.jTextPane1.getText();
        temp += "\n" + message;
        application.jTextPane1.setText(temp);
    }

    public static void log(String message, Logger logger) throws IOException {
        String temp = "[" + new SimpleDateFormat("hh:mm:ssa").format(new Date()) + "]: " + message;
        logger.log(temp);
        printConsole(temp);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws UnsupportedLookAndFeelException, FileNotFoundException, IOException, ClassNotFoundException, InterruptedException {
        //Set Look and Feel
        UIManager.setLookAndFeel(new DarculaLaf());
        application = new MainScreen();
        Logger logger = new Logger();

        //Start Splash Screen
        Splash splash = new Splash();
        java.awt.EventQueue.invokeLater(() -> {
            splash.setVisible(true);
        });
        Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
        splash.dispose();

        //Start Main Screen
        java.awt.EventQueue.invokeLater(() -> {
            application.setVisible(true);
        });

        File[] files = new File("data").listFiles();
        ArrayList<String> fileNames = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                fileNames.add(file.getName());
            }
        }
        DefaultListModel dlm = new DefaultListModel();
        for (int j = 0; j < fileNames.size(); j++) {
            dlm.addElement(fileNames.get(j));
        }
        application.jList1.setModel(dlm);

        DS200 a = new DS200("221001", "green", "red", "IS05512", "bin666", "lid555", "door333", "left222", "right1121");
        DS200List list = new DS200List("Test", "John", "Jim");
        for (int i = 0; i < 1085; i++) {
            list.addMachine(a);
        }
        log("List Created!", logger);

        //File Output
        File dir = new File("data");
        dir.mkdir();
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/data/list.cray");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();
        log("List Saved!", logger);

        FileInputStream fis = new FileInputStream("data/list.cray");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DS200List readList = (DS200List) ois.readObject();
        ois.close();
        fis.close();
        DefaultTableModel dtm = new DefaultTableModel(new String[]{
            "Index", "T / AD / ED", "Green Seal", "Red Seal", "Machine Number", "Bin Seal", "Lid Seal", "Door Seal", "Left Seal", "Right Seal"
        }, readList.getList().size());
        for (int i = 0; i < readList.getList().size(); i++) {
            dtm.setValueAt(i, i, 0);
            dtm.setValueAt(readList.getList().get(i).gettAdEd(), i, 1);
            dtm.setValueAt(readList.getList().get(i).getGreenSeal(), i, 2);
            dtm.setValueAt(readList.getList().get(i).getRedSeal(), i, 3);
            dtm.setValueAt(readList.getList().get(i).getMachineNumber(), i, 4);
            dtm.setValueAt(readList.getList().get(i).getBinSeal(), i, 5);
            dtm.setValueAt(readList.getList().get(i).getLidSeal(), i, 6);
            dtm.setValueAt(readList.getList().get(i).getDoorSeal(), i, 7);
            dtm.setValueAt(readList.getList().get(i).getLeftSeal(), i, 8);
            dtm.setValueAt(readList.getList().get(i).getRightSeal(), i, 9);
        }
        application.jTable1.setModel(dtm);

        log("Done loading " + String.format("%,d", readList.getList().size()) + " records", logger);
    }
}
