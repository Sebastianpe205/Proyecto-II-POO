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
    int indAux = 1; // Indice auxiliar para colocar las casillas en el arreglo.

    public Tablero() {
        casillas[0] = new CasillaInicial(); // Se establecen las casillas iniciales y finales.
        casillas[27] = new CasillaFinal();
        generarTablero();
    }
    
    // Metodo para generar un numero al azar entre los indices 1 y 26 del tablero.
    // Los indices 0 y 27 siempre estan establecidos como casilla inicial y casilla final.
    int generarIndice(){
        int indiceFinal = 1;
        
        while (true){
            indiceFinal = (int) (Math.random() * 101); // Numero al azar entre 1 y 100.
            if (indiceFinal >= 1 && indiceFinal <= 26){
                return indiceFinal;
            }else{
                continue;
            }
        }
    }
    
    void generarTablero(){
        // Genera el tablero con casillas al azar.
        // Ruta a iconos: src/main/resources/Imagenes/icono...
        
        // Coloca la casilla de carcel.
        while (true){
            indAux = generarIndice();
            if (this.casillas[indAux] == null){
                this.casillas[indAux] = new Carcel();
                break;
            }else{
                continue;
            }
        }
        
        // Coloca las casillas de tubo.
        for (int i = 0; i < 3; i++){
            while (true){
                indAux = generarIndice();
                if (this.casillas[indAux] == null){
                    this.casillas[indAux] = new Tubo();
                    break;
                }else{
                    continue;
                }
            }
        }
        
        // Coloca la casilla de estrella.
        while (true){
            indAux = generarIndice();
            if (this.casillas[indAux] == null){
                this.casillas[indAux] = new Estrella();
                break;
            }else{
                continue;
            }
        }
        
        // Coloca la casilla de flor de fuego.
        while (true){
            indAux = generarIndice();
            if (this.casillas[indAux] == null){
                this.casillas[indAux] = new FlorDeFuego();
                break;
            }else{
                continue;
            }
        }
        
        // Coloca la casilla de flor de hielo.
        while (true){
            indAux = generarIndice();
            if (this.casillas[indAux] == null){
                this.casillas[indAux] = new FlorDeHielo();
                break;
            }else{
                continue;
            }
        }
        
        // Coloca la casilla de cola Tanooki.
        while (true){
            indAux = generarIndice();
            if (this.casillas[indAux] == null){
                this.casillas[indAux] = new Cola();
                break;
            }else{
                continue;
            }
        }
        
        // Coloca el resto de casillas normales.
        for (int i = 0; i < 28; i++){
            // indAux = generarIndice();
            if (this.casillas[i] == null){
                this.casillas[i] = new CasillaNormal();
            }else{
                continue;
            }
        }
    }
    
    // Getter del arreglo del tablero.
    
    Casilla[] getTablero(){
        // Retorna el arreglo de casillas
        System.out.println("Casillas: " + casillas);
        return this.casillas;
    }
    
    void imprimirTablero(){
        for (int i = 0; i < 28; i++){
            System.out.println("Casilla: " + casillas[i]);
        }
    }
    
    
}
