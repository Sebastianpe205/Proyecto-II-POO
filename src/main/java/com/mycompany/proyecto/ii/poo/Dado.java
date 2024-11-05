/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.ii.poo;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Dado {
    /* El jugador lanza 2 dados de 6 caras. Puede dar un entero entre 1 y 5 o una cara de castigo.
    en caso de caer en la cara de castigo en un dado, se pierde un turno y se omite el resultado del otro. Si ambos caen en cara de castigo,
    se pierden dos turnos.
    */

    private int resultado;
    private int espaciosParaMoverse;
    private ArrayList<Integer> historialResultados = new ArrayList<Integer>();
    
    // Constructores

    public Dado() {
    }

    public Dado(int resultado, int espaciosParaMoverse) {
        this.resultado = resultado;
        this.espaciosParaMoverse = espaciosParaMoverse;
    }
    
    // Generacion del resultado y espacios para moverse.
    
    int generarResultado(){
        // Genera el resultado del dado (entero entre 1 y 6).
        while (true){
            resultado = (int) (Math.random() * 101); // Ejemplo de como elegir un numero al azar entre 0 y 100.
            if (resultado > 6 || resultado < 1) {
                continue;
            } else {
                historialResultados.add(resultado);
                return resultado;
            }
        }
    }
    
    int lanzarDado(){
        // Indica cuantos espacios en el tablero se deben mover, en base al resultado.
        // Segun indica el proyecto, un resultado 6 indicaria moverse 0 espacios.
        
        int espacios_aux = generarResultado(); // Se llama al metodo generarResultado().
        
        switch (espacios_aux){
            case 6:
                espaciosParaMoverse = 0;
                break;
            default:
                espaciosParaMoverse = espacios_aux;
                break;
        }
        
        return espaciosParaMoverse;
                
    }
    
    int lanzarMultiplesDados(int veces){
        // Recibe un entero que indica cuantos dados se deben lanzar.
        // Retorna entero con la suma de los resultados de los dados.
        int resultado_aux = 0; // Ayudara a validar los resultados de la cara de castigo del dado.
        int resultadoFinal = 0; // Resultado final de la suma de los dados.
        
        for (int i = 0; i < veces; i++){
            resultado_aux = generarResultado();
            if (resultado_aux == 6){
                return 0;
            } else {
                resultadoFinal += generarResultado();
            }
        }
        return resultadoFinal; // Retorna el resultado final al salir del ciclo.
    }
    
    // Getter para el historial de resultados.
    
    ArrayList<Integer> getHistorialResultados(){
        // Retorna el ArrayList del historial de resultados.
        return this.historialResultados;
    }
    
    void limpiarHistorialDado(){
        // Limpia el ArrayList que contiene el historial de resultados del dado.
    }
    
    
}
