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
public abstract class Animal {
    private String nombre = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract String tipoAnimal();
    public Animal(String nombre){//Constructor
        this.nombre = nombre;
    }
}
