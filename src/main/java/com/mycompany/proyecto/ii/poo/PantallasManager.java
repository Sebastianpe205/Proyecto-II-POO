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
    MenuOpciones p_Opciones = new MenuOpciones(this);
    PantallaSeleccionPersonaje p_SeleccionPersonaje = new PantallaSeleccionPersonaje(this);
    PantallaTableroGrandCanal p_Tablero;
    ReproductorMusica reproductorMusica = new ReproductorMusica();
    SocketManager socketManager;
    String tableroSeleccionado;
    
    // Constructor.
    public PantallasManager() {
        // Utiliza los valores preestablecidos.
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
    
    // Menu de opciones.
    
    void mostrarMenuOpciones(){
        // Muestra el menu de opciones.
        this.p_Opciones.setVisible(true);
        this.reproductorMusica.reproducirMusica("src/main/resources/Musica/musicaControlRoom.WAV", 0);
    }
    
    void cerrarMenuOpciones(){
        // Cierra el menu de opciones.
        this.p_Opciones.setVisible(false);
        this.reproductorMusica.detenerMusica();
    }
    
    // Carga de cuadros de dialogo en el menu de Opciones.
    
    void verMemoriaUsada(){
        // Muestra la memoria usada en un cuadro de dialogo (KB y MB)
        System.out.println("RAM utilizada (KB): " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);
        System.out.println("RAM utilizada (MB): " + (double) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024) / 1024);
        
        double usoMemoriaKB = (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024; // Memoria usada en KB.
        double usoMemoriaMB = usoMemoriaKB / 1024; // Memoria usada en MB.
        
        if (usoMemoriaMB >= 1000){ // Si la memoria usada es mas de 1 GB, imprime tambien esa medida.
            double usoMemoriaGB = usoMemoriaMB / 1024;
            System.out.println("RAM utilizada (GB): " + usoMemoriaGB);
            int respuesta = JOptionPane.showConfirmDialog(p_Opciones, "Memoria utilizada (KB): " + usoMemoriaKB + "\nMemoria utilizada (MB): " + usoMemoriaMB + "\nMemoria utilizada (GB): " + usoMemoriaGB, "Uso de Memoria", JOptionPane.OK_OPTION);
        } else {
            int respuesta = JOptionPane.showConfirmDialog(p_Opciones, "Memoria utilizada (KB): " + usoMemoriaKB + "\nMemoria utilizada (MB): " + usoMemoriaMB, "Uso de Memoria", JOptionPane.OK_OPTION);
        }
    }
    
    void limpiarMemoria(){ // No sirve, no implementar.
        // Llama al Garbage Collector de Java.
        int respuesta = JOptionPane.showConfirmDialog(p_Opciones, "Limpiar la memoria RAM?", "Limpiar Memoria", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION){
            Runtime.getRuntime().gc();
            respuesta = JOptionPane.showConfirmDialog(p_Opciones, "Se ha limpiado la memoria.", "Limpiar Memoria", JOptionPane.OK_OPTION);
        }
    }
    
    void mostrarTutorial(){
        // Muestra los controles e instrucciones generales del juego.
        int respuesta = JOptionPane.showConfirmDialog(p_Opciones, """
                                                                  Tutorial
                                                                  
                                                                  
                                                                  -Es posible jugar contra los CPUs en los modos de un solo jugador.
                                                                  
                                                                  -Para jugar en modos multijugador, deben conectarse al servidor con
                                                                  una partida activa.
                                                                  
                                                                  -Todos los minujuegos y tableros se juegan utilizando unicamente el mouse.""", "Creditos", JOptionPane.OK_OPTION);
    }
    
    void mostrarCreditos(){
        // Muestra los creditos del juego.
        int respuesta = JOptionPane.showConfirmDialog(p_Opciones, """
                                                                  Mario Poorty
                                                                  
                                                                  Desarrollado por:
                                                                  -Sebastián de Jesús Padilla Escalante
                                                                  -Alejandro Monge Arguedas
                                                                  
                                                                  Profesor:
                                                                  -Diego Mora Rojas
                                                                  
                                                                  Imágenes y sonidos:
                                                                  -Basados en productos de la saga Mario Party.
                                                                  -Nintendo
                                                                  
                                                                  Proyecto II de Programación Orientada a Objetos
                                                                  II Semestre, 2024
                                                                  Instituto Tecnológico de Costa Rica""", "Creditos", JOptionPane.OK_OPTION);
    }
    
    // Menu de seleccion de personaje.
    
    void mostrarMenuSeleccionPersonaje(){
        // Muestra el menu de seleccion de personaje.
        this.p_SeleccionPersonaje.setVisible(true);
        this.reproductorMusica.reproducirMusica("src/main/resources/Musica/musicaSeleccionPersonaje.WAV", 0);
    }
    
    void cerrarMenuSeleccionPersonaje(){
        // Cierra el menu de seleccion de personaje.
        this.p_SeleccionPersonaje.dispose();
        this.reproductorMusica.detenerMusica();
    }
    
    // Manejo de seleccion del personaje.
    
    boolean confirmacionPersonaje(String nombre){
        // Da un cuadro de dialogo confirmando la seleccion del personaje
        String nombrePersonaje;
        int respuesta1 = JOptionPane.showConfirmDialog(p_Opciones, "Usar a " + nombre + "?", "Confirmar Personaje", JOptionPane.YES_NO_OPTION);
        
        if (respuesta1 == JOptionPane.YES_OPTION){
            // Conecta con el socket...
            
            
            
            // Temporal.
            return true;
            
        } else {
            return false;
        }
        
        // Verificar mediante sockets si alguien mas en el servidor ha elegido al personaje...
    }
    
    // Carga de pantallas de tableros.
    
    void cargarGrandCanal(){
        // Da la opcion de buscar una partida en el tablero Grand Canal.
        
        // Abre un cuadro de dialogo para confirmar la busqueda de una nueva partida.
        int respuesta1 = JOptionPane.showConfirmDialog(p_SeleccionTablero, "Buscar una partida activa en Grand Canal?", "Nueva Partida", JOptionPane.YES_NO_OPTION); // Retorna un entero.
        Tablero tablero = new Tablero();
        tablero.imprimirTablero();
        
        if (respuesta1 == JOptionPane.YES_OPTION){
            System.out.println("Buscando partida activa en Grand Canal...");
            cerrarMenuSeleccionTableros();
            mostrarMenuSeleccionPersonaje();
            p_Tablero = new PantallaTableroGrandCanal(this);
        }
    }
    
    void cargarNeonHeights(){
        // Da la opcion de buscar una partida en el tablero Neon Heights.
        
        // Abre un cuadro de dialogo para confirmar la busqueda de una nueva partida.
        int respuesta1 = JOptionPane.showConfirmDialog(p_SeleccionTablero, "Buscar una partida activa en Neon Heights?", "Nueva Partida", JOptionPane.YES_NO_OPTION); // Retorna un entero.
        
        if (respuesta1 == JOptionPane.YES_OPTION){
            System.out.println("Buscando partida activa en Neon Heights...");
            cerrarMenuSeleccionTableros();
            mostrarMenuSeleccionPersonaje();
        }
    }
    
    void jugarGrandCanal(){
        PantallaTableroGrandCanal gc = new PantallaTableroGrandCanal(this);
        this.p_SeleccionPersonaje.dispose();
        this.reproductorMusica.detenerMusica();
        gc.setVisible(true);
        this.reproductorMusica.reproducirMusica("src/main/resources/Musica/SailTheCanalsMP7.WAV", 0);
        
    }
    
    void jugarNeonHeights(){
        //
    }
    
    String getTableroSeleccionado(){
        return this.tableroSeleccionado;
    }
    
}
