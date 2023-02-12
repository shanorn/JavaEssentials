/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ej06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zerox
 */
public class Ej06 {

    private static boolean esPrimo(int numero){
        for (int i = 2; i < numero; i++){
            if (numero%i == 0) return false;
        }
        return true;
    }
    
    private static int[] listarPrimos(int n){
        // Array donde almacenaremos los primos
        int[] primos = new int[n];
        
        int posicion = 0;
        int numeroActual = 1;
        
        while(posicion < n){
            
            if (esPrimo(numeroActual)){
                primos[posicion] = numeroActual;
                posicion++;
            }
            numeroActual++;
        }
        return primos;
    } 
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Por favor, introduzca el numero de primos a mostrar: ");
        
        try {
            String linea = br.readLine();
            int n = Integer.parseInt(linea);
            
            int[] lista = listarPrimos(n);
            
            printLista(lista);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Ej06.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static void printLista(int[] lista) {
        for (int elemento : lista){
            System.out.println(elemento);
        }
    }
}
