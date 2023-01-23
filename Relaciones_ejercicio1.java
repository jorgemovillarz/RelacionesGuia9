/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Relaciones_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro pr1 = new Perro("chiquito", "pitbull", 1, "grande");
        Perro pr2 = new Perro("filomena", "chanda", 10, "peque");
        Persona p1 = new Persona("Jorge", "Movilla", 28,"123456", pr1);
        Persona p2 = new Persona("Migue", "Ortegon", 17, "654321", pr2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
