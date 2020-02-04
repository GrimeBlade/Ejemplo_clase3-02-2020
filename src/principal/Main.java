/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import Animal_paquete.Animal;
import Animal_paquete.Gato;
import Animal_paquete.Perro;

/**
 *
 * @author GrimeBlade
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal Pitbull = new Perro("Gufy");
        Animal Persa = new Gato("Misifu");
        System.out.println(Persa.tipoAnimal());
        System.out.println(Pitbull.tipoAnimal());
    }
    
}
