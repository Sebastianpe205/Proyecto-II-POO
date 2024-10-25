/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ii.poo;

/**
 *
 * @author sebas
 */
public class PantallasManager {
    // Maneja la apertura y el cierre de las pantallas del juego.
    // Tambien les agrega musica de fondo.
    MenuPrincipal p_principal = new MenuPrincipal();
    ReproductorMusica musicaPrincipal = new ReproductorMusica();
    
    // Constructor.
    public PantallasManager() {
        
    }
    
    // Metodos de pantallas.
    
    void mostrarMenuPrincipal(){
        // Muestra el menu principal.
        this.p_principal.setVisible(true);
        this.musicaPrincipal.reproducirMusica("src/main/resources/Musica/musicaTituloMP7.WAV", 1);
    }
    
    void cerrarMenuPrincipal(){
        // Cierra el menu principal.
        this.p_principal.dispose();
    }
    
}
