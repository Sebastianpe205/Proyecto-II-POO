/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ii.poo;

/**
 *
 * @author sebas
 */
public class CasillaNormal extends Casilla{
    
    public CasillaNormal() {
        this.ubicacionIcono = "src/main/resources/Imagenes/iconoCasilla.png";
    }

    @Override
    void accionCasilla(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Getter de la ubicacion del icono.
    
    @Override
    String getUbicacionIcono(){
        return this.ubicacionIcono;
    }

    
}