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
public class Persona {
    private String nombrePersona;
    private String apellido;
    private Integer edad;
    private String dni;
    private Perro perro;

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }

    public Persona(String nombrePersona, String apellido, Integer edad, String dni, Perro perro) {
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

   
}
