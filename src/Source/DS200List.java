/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author noemailgmail
 */
public class DS200List implements Serializable {

    private static final long serialVersionUID = 1L;
    private String listName;
    private String demName;
    private String repName;
    private Date date;
    private ArrayList<DS200> list;

    public DS200List(String listName, String demName, String repName) {
        this.listName = listName;
        this.demName = demName;
        this.repName = repName;
        this.date = new Date();
        this.list = new ArrayList<DS200>();
    }    
    
    public DS200List(String listName, String demName, String repName, 
            Date date, ArrayList<DS200> list) {
        this.listName = listName;
        this.demName = demName;
        this.repName = repName;
        this.date = date;
        this.list = list;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDemName() {
        return demName;
    }

    public void setDemName(String demName) {
        this.demName = demName;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<DS200> getList() {
        return list;
    }

    public void setList(ArrayList<DS200> list) {
        this.list = list;
    }
    
    public void addMachine(DS200 machine){
        this.list.add(machine);
    }
    
    public void removeMachine(DS200 machine){
        this.list.remove(machine);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.listName);
        hash = 29 * hash + Objects.hashCode(this.demName);
        hash = 29 * hash + Objects.hashCode(this.repName);
        hash = 29 * hash + Objects.hashCode(this.date);
        hash = 29 * hash + Objects.hashCode(this.list);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DS200List other = (DS200List) obj;
        if (!Objects.equals(this.listName, other.getListName())) {
            return false;
        }
        if (!Objects.equals(this.demName, other.getDemName())) {
            return false;
        }
        if (!Objects.equals(this.repName, other.getRepName())) {
            return false;
        }
        if (!Objects.equals(this.date, other.getDate())) {
            return false;
        }
        if (!Objects.equals(this.list, other.getList())) {
            return false;
        }
        else{
        return true;
            
        }
    }

    @Override
    public String toString() {
        return "DS200List{" + "listName=" + listName + ", demName=" + demName + ", repName=" + repName + ", date=" + date + ", list=" + list + '}';
    }
    
    
    public String printDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(this.date);
    }
    
}
