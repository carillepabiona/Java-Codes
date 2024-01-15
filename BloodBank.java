package com.mycompany.bloodbank;

import java.util.Scanner;
public class BloodBank {
  
    private String bloodType ;
    private String rhFactor ;
    
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    
     public void setrhFactor(String rhFactor){
        this.rhFactor = rhFactor;
    }
     
     public String getbloodType(){
         return bloodType;
     }
    
     public String getrhFactor(){
         return rhFactor;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter blood type of the patient: ");
        String bType = sc.nextLine();
        
        System.out.print("Enter Rhesus factor (+ or -): ");
        String rh = sc.nextLine();
 
        System.out.print(bType + rh + " is your Blood Type");
     
    }
 }
