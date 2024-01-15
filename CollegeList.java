package com.mycompany.collegelist;
import java.util.Scanner;
public class CollegeList {

   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        char choice = sc.next().charAt(0);
        
        Person person;
        
        if(choice == 'E' || choice == 'e'){
            Employee employee = new Employee();
            person = employee;
            
        System.out.println("Type employee's name, contact number, salary,  and department.");
        System.out.println("Please Enter after every input.");
            
            System.out.print("");
            String name = sc.next();
            employee.setName(name);
            
            System.out.print("");
            String contactNum = sc.next();
            employee.setcontactNum(contactNum);
           
            System.out.print("");
            double salary = sc.nextDouble();
            employee.setSalary(salary);

            System.out.print("");
            String department = sc.next();
            employee.setDepartment(department);
            
            System.out.println("---------------------------------------------");
            
            System.out.println( "Name: " + employee.getName());
            System.out.println( "Contact Number: " + employee.getContactNum());
            System.out.println( "Salary: " + employee.getSalary());
            System.out.println( "Department: " + employee.getDepartment());
            
        } else if (choice == 'F' || choice == 'f'){
            Faculty faculty = new Faculty();
            person = faculty;
            
            System.out.println("Is the faculty member regular/tenured? (Y/N):");
            char statusChoice = sc.next().charAt(0);
            boolean status = (statusChoice == 'Y' || statusChoice == 'y');
            faculty.setStatus(status);
            System.out.println("Type employee's name, contact number, salary,  department, and S.");
            System.out.println("Please Enter after every input.");
            
            System.out.print("");
            String name = sc.next();
            faculty.setName(name);
            
            System.out.print("");
            String contactNum = sc.next();
            faculty.setcontactNum(contactNum);
           
            System.out.print("");
            double salary = sc.nextDouble();
            faculty.setSalary(salary);

            System.out.print("");
            String department = sc.next();
            faculty.setDepartment(department);
            
            System.out.println("---------------------------------------------");
       
            System.out.println( "Name: " + faculty.getName());
            System.out.println( "Contact Number: " + faculty.getContactNum());
            System.out.println( "Salary: " + faculty.getSalary());
            System.out.println( "Department: " + faculty.getDepartment());
            System.out.println("Status: " + (faculty.isRegular() ? "Regular" : "Not Regular"));
            
        } else if (choice == 'S' || choice == 's'){
            Student student = new Student();
            person = student;
            
            
            System.out.println("Type student name, contact number, program, and year level");
            System.out.println("Please Enter after every input.");
            
            System.out.print("");
            String name = sc.next();
            student.setName(name);
            
            System.out.print("");
            String contactNum = sc.next();
            student.setcontactNum(contactNum);
            
            System.out.print("");
            String program = sc.next();
            student.setProgram(program);
            
            System.out.print("");
            int yrLevel = sc.nextInt();
            student.setYrLevel(yrLevel);
            
            System.out.println("---------------------------------------------");
           
            System.out.println( "Name: " + student.getName());
            System.out.println( "Contact Number: " + student.getContactNum());
            System.out.println( "Program: " + student.getProgram());
            System.out.println( "Year Level: " + student.getYrLevel());
     
        } else {
            System.out.println( "Invalid Input");
        }
        
        
        
    }
}
