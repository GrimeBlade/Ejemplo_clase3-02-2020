/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Animal_paquete.Gato;
import Animal_paquete.Perro;

/**
 *
 * @author sala6
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro Pitbull = new Perro ("Guffy");
        Gato Persa = new Gato ("Misifu");
        
        Persa.tipoAnimal();
        Pitbull.tipoAnimal();
    }
    
}
