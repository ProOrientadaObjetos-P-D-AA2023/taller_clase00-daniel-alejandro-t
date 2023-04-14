/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearjugador;

/**
 *
 * @author daniel
 */
class Jugador {    
    int cedula;
    String nombre;
    String apellido;
    int edad;

    Jugador(int cedula, String nombre, String apellido, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void caminar(){
        System.out.println("Caminando...");
    }
    
    public void correr(){
        System.out.println("Corriendo...");
    }
    
    
    public void viajar(){
        System.out.println("Viajar...");
    }
}