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
public class Teacher extends Person {
    
    private String profession;
    private double salario;
    private double height;
     private double weight;
     
     Scanner sc = new Scanner(System.in);

    public Teacher(String name, String surname, int code,String profession, double salario, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.profession = profession;
        this.salario = salario;
        this.height = height;
        this.weight = weight;
    }



    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getSalario() {
        return salario;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
     
    public void showIMC(){
      double imc = (weight)/ (height * height);
      
      if(imc < 18.5)
          System.out.println(name + " " + surname + " tiene un peso inferior al normal. ");
       else if (imc > 18.5 && imc < 24.9 )
            System.out.println(name + " " + surname + " tiene un peso normal. ");
        else if  (imc > 25 && imc < 29.9)
            System.out.println(name + " " + surname +  " tiene un peso superior al normal. ");
        else if (imc > 30)
            System.out.println(name + " " + surname +  " posee obesidad. ");
      
    
          
    }
    
    public void actualizarSalario(){
    
       System.out.println("Ingrese el salario nuevo para el profesor/a " + name + " " + surname + " :" );
        double newSalary = sc.nextDouble();
        
       setSalario(newSalary) ;
        
        System.out.println("El salario de " + name + " " + surname + " es de : " + salario);

    }
    
     
}
