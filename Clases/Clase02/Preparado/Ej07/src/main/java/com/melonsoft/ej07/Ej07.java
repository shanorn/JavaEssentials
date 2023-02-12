/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ej07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zerox
 */
public class Ej07 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Introduzca el numero a descomponer: ");
            
            String linea = br.readLine();
            int numero = Integer.parseInt(linea);
            
            int[] factores = factoresPrimos(numero); 
            
            System.out.print(numero + " = ");
            for (int i = 0; i < factores.length; i++){
                System.out.print(factores[i]);
                if (i != factores.length - 1) System.out.print(" * ");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Ej07.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private static int[] factoresPrimos(int n){
        int factor = 2;
        // 64 = 2 * 32 -> 2 * 2 * 16 -> 2 * 2 * 2 * 8 -> 2 * 2 * 2 * 2 * 4 -> 2 * 2 * 2 * 2 * 2
        // 25 = 5 * 5 
        // 30 = 2 * 15 -> 2 * 3 * 5
        // 36 = 2 * 12 -> 2 * 2 * 2 * 6 -> 2 * 2 * 2 * 2 * 3
        // 777 = 3 * 259 -> 3 * 7 * 37 
        
        int numFactores = 0;
        int num = n;
        while (num != 1) {
            while(num % factor == 0){
                num = num / factor;
                numFactores++;
            }
            factor++;
        }
        
        int[] factores = new int[numFactores];
        int posicion = 0;
        factor = 2;
        num = n; 
        while (num != 1) {
            while (num % factor == 0){
                num = num / factor;
                factores[posicion] = factor;
                posicion++;
            }
            factor++;
        }
        
        return factores;

    }
}
