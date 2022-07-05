/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.poo.pkg1;

/**
 *
 * @author jlio
 */
public class Estudiante extends persona {
    private int CodigoDeEstudiante;
    private float NotaFinal;
    
    //Constructor
    public Estudiante(String nombre, String apellido, int edad,int CodigoDeEsstudiante, int NotaFinal) {
        super(nombre, apellido, edad);
        this.CodigoDeEstudiante = CodigoDeEsstudiante;
        this.NotaFinal = NotaFinal;
    }
    
    public void mostrarDatos (){
        System.out.println("Nombre: "+getNombre()+
            " Apellido: "+ getApellido()+
            " Edad: "+ getEdad()+
            " Codigo Estudiante: "+CodigoDeEstudiante+
            " Nota Final: "+NotaFinal);
        
    }
}
