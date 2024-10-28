package com.mycompany.proyecto.ii.poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author sebas
 */
public class ReproductorMusica {
    private Clip tema;
    
    public void reproducirMusica(String ubicacion, int codigo){
        try {
            File archivoMusica = new File(ubicacion);
            if (archivoMusica.exists()){
                System.out.println("Existe archivo de musica");
                AudioInputStream streamAudio = AudioSystem.getAudioInputStream(archivoMusica);
                tema = AudioSystem.getClip();
                tema.open(streamAudio);
                
                // Si el codigo es 0, se reproduce en bucle. Si es 1, solo se reproduce una vez.
                switch (codigo){
                    case 0:
                        tema.loop(Clip.LOOP_CONTINUOUSLY);
                        tema.start();
                        break;
                    case 1:
                        tema.start();
                        break;
                    default:
                        tema.start(); // Si no es ninguno de los codigos anteriores, simplemente se reproduce una vez.
                        // Se implementa asi para poder agregar mas codigos, de ser necesario.
                }
            } else {
                ;
                System.out.println("No existe archivo de musica");
            }
        } catch (Exception e) {
            ; // No hace nada, solo no se reproduce la musica. El ';' vacio es equivalente al 'pass' en Python.
            System.out.println("Error: " + e.toString()); // Da detalles del error de reproduccion.
        }
    }
    
    public void detenerMusica(){
        if (tema != null && tema.isRunning())
            tema.stop();
    }
    
}
