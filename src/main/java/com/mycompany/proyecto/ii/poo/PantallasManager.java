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
    MenuPrincipal p_principal = new MenuPrincipal(this);
    MenuSeleccionModo p_SeleccionModo = new MenuSeleccionModo(this);
    MenuSeleccionTablero p_SeleccionTablero = new MenuSeleccionTablero(this);
    MenuSeleccionMinijuego p_SeleccionMinijuego = new MenuSeleccionMinijuego();
    ReproductorMusica reproductorMusica = new ReproductorMusica();
    
    // Constructor.
    public PantallasManager() {
        
    }
    
    // Metodos de pantallas.
    
    // Menu principal.
    
    void mostrarMenuPrincipal(){
        // Muestra el menu principal.
        this.p_principal.setVisible(true);
        this.reproductorMusica.reproducirMusica("src/main/resources/Musica/musicaTituloMP7.WAV", 1);
    }
    
    void cerrarMenuPrincipal(){
        // Cierra el menu principal.
        this.p_principal.dispose();
        this.reproductorMusica.detenerMusica();
    }
    
    // Menu de seleccion de modos.
    
    void mostrarMenuSeleccionModo(){
        // Muestra el menu de seleccion de modos.
        this.p_SeleccionModo.setVisible(true);
        this.reproductorMusica.reproducirMusica("src/main/resources/Musica/musicaSeleccionModoMP7.WAV", 0);
    }
    
    void cerrerMenuSeleccionModo(){
        // Cierra el menu de seleccion de modos.
        this.p_SeleccionModo.dispose();
        this.reproductorMusica.detenerMusica();
    }
    
    // Menu de seleccion de tableros.
    
    void mostrarMenuSeleccionTablero(){
        // Muestra el menu de seleccion de tableros.
        this.p_SeleccionTablero.setVisible(true);
        this.reproductorMusica.reproducirMusica("src/main/resources/Musica/musicaSeleccionTablero.WAV", 0);
    }
    
    void cerrarMenuSeleccionTableros(){
        // Cierra el menu de seleccion de tableros.
        this.p_SeleccionTablero.setVisible(false);
        this.reproductorMusica.detenerMusica();
    }
    
    // Menu de seleccion de minijuegos.
    
    void mostrarMenuSeleccionMinijuegos(){
        // Muestra el menu de seleccion de minijuegos.
        this.p_SeleccionMinijuego.setVisible(true);
        this.reproductorMusica.reproducirMusica("src/main/resources/Musica/musicaSeleccionMinijuego.WAV", 0);
    }
    
}
