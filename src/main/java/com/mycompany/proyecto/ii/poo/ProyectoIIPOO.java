/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.ii.poo;

import java.awt.Color;

/**
 *
 * @author sebas
 */
public class ProyectoIIPOO {
    // Proyecto II de Programacion Orientada a Objetos.
    // Sebastian Padilla Escalante y Alejandro Monge Arguedas.

    public static void main(String[] args) {
        System.out.println("Programa iniciado"); // Se imprime en consola la indicacion de que arranca el programa.
        
//        ReproductorMusica musicaPrincipal = new ReproductorMusica();
//        musicaPrincipal.reproducirMusica("src/main/resources/Musica/musicaTituloMP7.WAV", 1);
        
        // Manager de pantallas.
        PantallasManager p_manager = new PantallasManager();
        p_manager.mostrarMenuPrincipal();
        
//        // Se crea la pantalla del menu principal.
//        MenuPrincipal menu = new MenuPrincipal();
//        //menu.setBackground(Color.white);
//        menu.setVisible(true); // Su resolucion/dimension es de 1280x720p
        int x = (int) (Math.random() * 101); // Ejemplo de como elegir un numero al azar entre 0 y 100.
        System.out.println("Prueba de numero random (0-100): " + x);
        
    }
}
