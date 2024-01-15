package com.mycompany.collegelist;


public class Student extends Person {
    private String program;
    private int yearLevel;
    
    public void setProgram (String program){
        this.program = program;
    }
    
    public String getProgram(){
        return program;
    }
    
    public void setYrLevel (int yearLevel){
        this.yearLevel = yearLevel;
    }
    
    public int getYrLevel(){
        return yearLevel;
    }
    
}
