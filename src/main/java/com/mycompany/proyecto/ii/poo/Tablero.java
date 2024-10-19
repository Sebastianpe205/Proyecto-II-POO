/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ii.poo;

/**
 *
 * @author sebas
 */
public class Tablero {
    Casilla[] casillas = new Casilla[28]; // Todas las casillas del tablero (28 en total)

    public Tablero() {
        casillas[0] = new CasillaInicial(); // Se establecen las casillas iniciales y finales.
        casillas[27] = new CasillaFinal();
    }
    
    
    
}
