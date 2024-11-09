/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ii.poo;

/**
 *
 * @author sebas
 */
public abstract class Casilla {
    String ubicacionIcono;

    public Casilla() {
    }
    
//    abstract void carcelInhabilitarTurnos(int turnos); // Inhabilita al jugador de tirar los dados por una cantidad especifica de turnos.
//    abstract void tuboTransportar(); // Transporta al jugador al siguiente tubo.
//    abstract void estrellaRelanzarDado(); // Permite volver a lanzar los dados inmediatamente.
//    abstract void florDeFuegoReiniciarJugador(Jugador jugador); // Hace que un jugador de la eleccion del usuario vuelva a iniciar el tablero.
//    abstract void florDeHieloCongelarJugador(Jugador jugador); // Quien cae en esta casilla pierde dos turnos.
//    abstract void colaSaltar(); // Permite avanzar o retroceder por 3 casillas.
    
    abstract void accionCasilla(Jugador jugador); // Se le hace override dependiendo de la funcion de cada casilla a un jugador especifico.
    // Puede ser al que cae en la casilla (this) o a otro jugador (referencia a onjeto Jugador).
    
    abstract String getUbicacionIcono(); // Retorna el string con la ubicacion del icono correspondiente a la casilla.
    
    
    
}
