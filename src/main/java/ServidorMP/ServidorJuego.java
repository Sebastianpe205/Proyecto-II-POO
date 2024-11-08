/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServidorMP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author sebas
 */
public abstract class ServidorJuego {
    ServerSocket servidor;
    Socket socketJugador;
    DataOutputStream salida;
    DataInputStream entrada;
    ObjectInputStream objReader;
    
    public ServidorJuego(){
        iniciar();
    }
    
    void iniciar(){
        // Inicia el servidor del juego.
        System.out.println("Servidor iniciado");
    }
    
}
