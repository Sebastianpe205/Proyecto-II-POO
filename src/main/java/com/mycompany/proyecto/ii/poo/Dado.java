/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ii.poo;

/**
 *
 * @author sebas
 */
public class Dado {
    /* El jugador lanza 2 dados de 6 caras. Puede dar un entero entre 1 y 5 o una cara de castigo.
    en caso de caer en la cara de castigo en un dado, se pierde un turno y se omite el resultado del otro. Si ambos caen en cara de castigo,
    se pierden dos turnos.
    */
    private int resultado;
    
    // Constructor.
    public Dado() {
    }
    
    void lanzarDados(){
        // Retorna el resultado del dado, con la cantidad de espacios que el jugador debe moverse.
        int x = (int) (Math.random() * 101);
    }
    
    
}
