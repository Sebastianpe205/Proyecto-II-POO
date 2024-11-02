/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ii.poo;

import javax.swing.JOptionPane;

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
    MenuSeleccionMinijuego p_SeleccionMinijuego = new MenuSeleccionMinijuego(this);
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
    
    void cerrarMenuSeleccionMinijuegos(){
        // Cierra el menu de seleccion de minijuegos.
        this.p_SeleccionMinijuego.setVisible(false);
        this.reproductorMusica.detenerMusica();
    }
    
    // Carga de pantallas de tableros.
    
    void cargarGrandCanal(){
        // Da la opcion de buscar una partida en el tablero Grand Canal.
        
        // Abre un cuadro de dialogo para confirmar la busqueda de una nueva partida.
        int respuesta = JOptionPane.showConfirmDialog(p_SeleccionTablero, "Buscar una partida activa en Grand Canal?", "Nueva Partida", JOptionPane.YES_NO_OPTION); // Retorna un entero.
        
        if (respuesta == JOptionPane.YES_OPTION){
            System.out.println("Buscando partida activa en Grand Canal...");
        }
    }
    
    void cargarNeonHeights(){
        // Da la opcion de buscar una partida en el tablero Neon Heights.
        
        // Abre un cuadro de dialogo para confirmar la busqueda de una nueva partida.
        int respuesta = JOptionPane.showConfirmDialog(p_SeleccionTablero, "Buscar una partida activa en Neon Heights?", "Nueva Partida", JOptionPane.YES_NO_OPTION); // Retorna un entero.
        
        if (respuesta == JOptionPane.YES_OPTION){
            System.out.println("Buscando partida activa en Neon Heights...");
        }
    }
    
}
