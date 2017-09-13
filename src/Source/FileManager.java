/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author noemailgmail
 */
public class FileManager {

    public FileManager() {
        File file = new File("data");
        if (!file.exists()) {
            file.mkdir();
        }
    }

    public void saveList(DS200List list, String listName) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/data/" + listName + ".cray");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();
        //System.out.println("Saved list to /data/" + list + ".cray");
    }

    public DS200List getList(String listName) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("data/" + listName + ".cray");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DS200List readList = (DS200List) ois.readObject();
        ois.close();
        fis.close();
        return readList;
    }
}