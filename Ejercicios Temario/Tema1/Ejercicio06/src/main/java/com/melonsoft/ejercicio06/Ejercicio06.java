/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zerox
 */
public class Ejercicio06 {

    /**
     *
     * @param num
     * @return
     */
    public static boolean esPrimo(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     *
     * @param n
     * @return
     */
    public static int[] arrayPrimos(int n){
        int[] array = new int[n];
        
        int posicion = 0;
        int numeroActual = 1;
        
        while (posicion < n){
            if (esPrimo(numeroActual)){
                array[posicion] = numeroActual;
                posicion++;
            }
            numeroActual++;
        }
        
        return array;
    }
    
    /**
     *
     * @param array
     */
    public static void printArray(int[] array){
        for (int element: array){
            System.out.println(element);
        }
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca el numero de primos a mostrar: ");
        String linea;
        
        int n;
        
        try {
            linea = br.readLine();
            n = Integer.parseInt(linea);
            
            int[] primos = arrayPrimos(n);
            
            printArray(primos);
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio06.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
