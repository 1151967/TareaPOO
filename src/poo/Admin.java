/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author DevCamilo
 */
public class Admin extends Person {
    
   private int entryYear;
   private double salary;
   
   
   Scanner sc = new Scanner(System.in);

    public Admin(String name, String surname,int code, int entryYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.entryYear = entryYear;
        this.salary = salary;
        
    }

   

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
      
    public void showAntiguity(){
    
        int fullTime;
        fullTime = 2022 - entryYear;
        
        System.out.println("La antiguedad de " + name + " " + surname + " en la parte administrativa es: "  + fullTime + " años.");
       
    }

    public void actualizarSalario(){
    
        System.out.println("Ingrese el salario nuevo para el administrador " + name + " " + surname + " :" );
        double newSalary = sc.nextDouble();
        
       setSalary(newSalary) ;
        
        System.out.println("El salario de " + name + " " + surname + " es de : " + salary);
    }
    
    
}
