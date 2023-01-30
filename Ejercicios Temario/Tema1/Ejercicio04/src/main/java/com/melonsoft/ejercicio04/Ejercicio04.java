/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zerox
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        
        int numeroLeido = 0; 
        String lineaLeida;
        while (numeroLeido >= 0){
            try {
                System.out.println("Introduzca un numero: ");
                lineaLeida = consola.readLine();
                numeroLeido = Integer.parseInt(lineaLeida);
                if (numeroLeido > maximo && numeroLeido > 0) maximo = numeroLeido;
                if (numeroLeido < minimo && numeroLeido > 0) minimo = numeroLeido;
            } catch (IOException ex){
                System.out.println("Error en la lectura: " + ex);
            }
            
        } 
        System.out.println("Máximo: " + maximo + " Minimo: " + minimo);
        
    }
}
