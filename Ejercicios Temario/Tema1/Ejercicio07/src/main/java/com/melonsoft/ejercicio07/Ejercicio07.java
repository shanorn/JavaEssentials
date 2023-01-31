/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zerox
 */
public class Ejercicio07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca el numero entero a descomponer: ");
        String linea;
        
        int n;
        
        linea = br.readLine();
        n = Integer.parseInt(linea);
        
        int[] factores = factoresPrimos(n);
        
        System.out.print(n + " = ");
        for(int i = 0; i < factores.length; i++){
            
            System.out.print(factores[i]);
            if (i < (factores.length - 1)) System.out.print(" * ");
        }
        System.out.print("\n");
    }

    private static int[] factoresPrimos(int n) {
        int factor = 2;
        int numFactores = 0;
        int num = n;
        // Primero recorremos para saber cuantos factores tendremos y,
        // así podremos reservar memoria.
        while (num != 1){
            while(num % factor == 0){ 
                numFactores++;
                num = num / factor;
            }
            factor++;
        }
        
        // Sabiendo el total reservamos memoria y volvemos a hacer el mismo 
        // bucle almacenando los factores
        int[] array = new int[numFactores];
        int posicion = 0;
        
        num = n;
        factor = 2;
        
        while (num != 1){
            while(num % factor == 0){
                array[posicion++] = factor;
                num = num / factor;
            }
            factor++;
        }
        
        return array;
    }
}
