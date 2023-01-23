/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones_ejercicio1;
//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona
/**
 *
 * @author jorge
 */
public class Perro {
    private String nombrePerro;
    private String raza;
    private Integer edadPerro;
    private String tamaño;

    public Perro() {
    }

    public Perro(String nombrePerro, String raza, Integer edadPerro, String tamaño) {
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.edadPerro = edadPerro;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombrePerro=" + nombrePerro + ", raza=" + raza + ", edadPerro=" + edadPerro + ", tama\u00f1o=" + tamaño + '}';
    }
    

    
    
    
}
