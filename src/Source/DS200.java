/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author noemailgmail
 */
public class DS200 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String tAdEd;
    private String greenSeal;
    private String redSeal;
    private String machineNumber;
    private String binSeal;
    private String lidSeal;
    private String doorSeal;
    private String leftSeal;
    private String rightSeal;

    public DS200(String tAdEd, String greenSeal, String redSeal, 
            String machineNumber, String binSeal, String lidSeal, 
            String doorSeal, String leftSeal, String rightSeal) {
        this.tAdEd = tAdEd;
        this.greenSeal = greenSeal;
        this.redSeal = redSeal;
        this.machineNumber = machineNumber;
        this.binSeal = binSeal;
        this.lidSeal = lidSeal;
        this.doorSeal = doorSeal;
        this.leftSeal = leftSeal;
        this.rightSeal = rightSeal;
    }
    
        public DS200() {
        this.tAdEd = "";
        this.greenSeal = "";
        this.redSeal = "";
        this.machineNumber = "";
        this.binSeal = "";
        this.lidSeal = "";
        this.doorSeal = "";
        this.leftSeal = "";
        this.rightSeal = "";
    }

    public String gettAdEd() {
        return tAdEd;
    }

    public void settAdEd(String tAdEd) {
        this.tAdEd = tAdEd;
    }

    public String getGreenSeal() {
        return greenSeal;
    }

    public void setGreenSeal(String greenSeal) {
        this.greenSeal = greenSeal;
    }

    public String getRedSeal() {
        return redSeal;
    }

    public void setRedSeal(String redSeal) {
        this.redSeal = redSeal;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public String getBinSeal() {
        return binSeal;
    }

    public void setBinSeal(String binSeal) {
        this.binSeal = binSeal;
    }

    public String getLidSeal() {
        return lidSeal;
    }

    public void setLidSeal(String lidSeal) {
        this.lidSeal = lidSeal;
    }

    public String getDoorSeal() {
        return doorSeal;
    }

    public void setDoorSeal(String doorSeal) {
        this.doorSeal = doorSeal;
    }

    public String getLeftSeal() {
        return leftSeal;
    }

    public void setLeftSeal(String leftSeal) {
        this.leftSeal = leftSeal;
    }

    public String getRightSeal() {
        return rightSeal;
    }

    public void setRightSeal(String rightSeal) {
        this.rightSeal = rightSeal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.tAdEd);
        hash = 23 * hash + Objects.hashCode(this.greenSeal);
        hash = 23 * hash + Objects.hashCode(this.redSeal);
        hash = 23 * hash + Objects.hashCode(this.machineNumber);
        hash = 23 * hash + Objects.hashCode(this.binSeal);
        hash = 23 * hash + Objects.hashCode(this.lidSeal);
        hash = 23 * hash + Objects.hashCode(this.doorSeal);
        hash = 23 * hash + Objects.hashCode(this.leftSeal);
        hash = 23 * hash + Objects.hashCode(this.rightSeal);
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
        final DS200 other = (DS200) obj;
        if (!Objects.equals(this.tAdEd, other.gettAdEd())) {
            return false;
        }
        if (!Objects.equals(this.greenSeal, other.getGreenSeal())) {
            return false;
        }
        if (!Objects.equals(this.redSeal, other.getRedSeal())) {
            return false;
        }
        if (!Objects.equals(this.machineNumber, other.getMachineNumber())) {
            return false;
        }
        if (!Objects.equals(this.binSeal, other.getBinSeal())) {
            return false;
        }
        if (!Objects.equals(this.lidSeal, other.getLidSeal())) {
            return false;
        }
        if (!Objects.equals(this.doorSeal, other.getDoorSeal())) {
            return false;
        }
        if (!Objects.equals(this.leftSeal, other.getLeftSeal())) {
            return false;
        }
        if (!Objects.equals(this.rightSeal, other.getRightSeal())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DS200{" + "tAdEd=" + tAdEd + ", greenSeal=" + greenSeal + ", redSeal=" + redSeal + ", machineNumber=" + machineNumber + ", binSeal=" + binSeal + ", lidSeal=" + lidSeal + ", doorSeal=" + doorSeal + ", leftSeal=" + leftSeal + ", rightSeal=" + rightSeal + '}';
    }
        
    
}
