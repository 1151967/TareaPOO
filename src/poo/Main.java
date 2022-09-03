/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;
/**
 *
 * @author DevCamilo
 */
public class Main {
    public static void main(String[] args) {
        
        Admin administrador = new Admin("Brian", "Tracy" , 284904 ,2020,3.550);
         Student estudiante = new Student("Camilo", "Gomez", 1151967, "Ingenieria de Sistemas", 5 , 95);
        Teacher profesor = new Teacher("Claudia", "Gomez", 1151453, "Contadora",2.450,1.60, 55);
        
        
       // Requerimientos funcionales.
       
       //1
       profesor.showIMC();
       //2
       estudiante.habilitarProyecto();
       //3
       administrador.showAntiguity();
       //4
       profesor.actualizarSalario();
       administrador.actualizarSalario();
   
       
    }
    
}
