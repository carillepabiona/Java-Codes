
package com.mycompany.collegelist;


public class Faculty extends Employee{
    private boolean status;
    
    public void setStatus(boolean s) {
        status = s;
    }

    public boolean isRegular() {
        return status;
    }
}
