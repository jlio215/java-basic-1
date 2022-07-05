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
public class Principal {
    public static void main (String [] args) {
        Estudiante estudiante = new Estudiante("Julian","Gonzalez",27,123,5);
        
        estudiante.mostrarDatos();
    }
}
