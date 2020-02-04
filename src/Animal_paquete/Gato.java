/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal_paquete;

/**
 *
 * @author sala6
 */
public class Gato extends Animal {

   
  public Gato(String nombre){
       super.setNombre(nombre);
   }

    @Override
    public String tipoAnimal() {
        return "Este Gato se llama " + super.getNombre();
    }
}
