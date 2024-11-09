/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical8.q2;

/**
 *
 * @author marya
 */
public class Initials {
    private String fName;
    private String lName;
    private char firstI;
    private char secondI;
    
    public Initials(char firstI, char secondI) {
        this.firstI = firstI;
        this.secondI = secondI;
    }
    
    public boolean compare(String fName, String lName) {
        if (firstI == fName.charAt(0) && secondI == lName.charAt(0)) {
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    public char getFirstI() {
        return firstI;
    }

    public char getSecondI() {
        return secondI;
    }

    public char getfNameI(String fName) {
        return fName.charAt(0);
    }

    public char getlNameI(String lName) {
        return lName.charAt(0);
    }
    
    
}
