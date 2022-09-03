/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author DevCamilo
 */
public class Student extends Person {
    
    private String carrera;
    private int semester;
    private int credits;
    private final int TOTALCREDIT = 100;

    
   

    public Student(String name, String surname, int code,String carrera, int semester, int credits) {
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.carrera = carrera;
        this.semester = semester;
        this.credits = credits;
    }
    
    
    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
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

    
    public void habilitarProyecto(){
    
    int porcentaje = (100 * credits)/ TOTALCREDIT;
    
    if(porcentaje >= 90)
            System.out.println("Estudiante " + name + " " + surname + " puede presentar el proyecto de grado.");
        
    }
    
    
    
    
}
