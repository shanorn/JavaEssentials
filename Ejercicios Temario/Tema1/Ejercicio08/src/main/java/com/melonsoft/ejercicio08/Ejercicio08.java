/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zerox
 */
public class Ejercicio08 {

    
    private static int[] leerNumeros(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String linea;
        
        List numeros = new ArrayList();
        int numero = 0;
        do{
            System.out.println("Introduzca un numero (introduzca 0 para finalizar): ");
            
            try {
                linea = br.readLine();
                numero = Integer.parseInt(linea);

                if (numero != 0) numeros.add(numero);
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio08.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while (numero != 0);
        
        
        Object[] array = numeros.toArray();
        int[] arrayInt = new int[array.length];
        
        for (int i = 0; i < array.length; i++){
            arrayInt[i] = (int) array[i];
        }
        
        
        return arrayInt;
    }
    
    private static void printNumeros(int[] numeros){
        for (int elemento: numeros){
            System.out.println(elemento);
        }
    }
    
    private static int promedio(int[] listaNumeros){
        int total = 0; 
        for (int elemento : listaNumeros) {
            total += elemento;            
        }
        
        return (total / listaNumeros.length);
    }
    
    private static int minimo(int[] numerosLeidos) {
        int minimo = Integer.MAX_VALUE;
        
        for(int element : numerosLeidos){
            if (element < minimo) minimo = element;
        }
        
        return minimo;
    }
    
    private static int maximo(int[] numerosLeidos) {
        int maximo = Integer.MIN_VALUE;
        
        for(int element : numerosLeidos){
            if (element > maximo) maximo = element;
        }
        
        return maximo;
    }
    
    public static void main(String[] args) {
        int[] numerosLeidos = leerNumeros();
        
        printNumeros(numerosLeidos);
        
        System.out.println("Promedio: " + promedio(numerosLeidos));
        
        System.out.println("Minimo: " + minimo(numerosLeidos));
        
        System.out.println("Minimo: " + maximo(numerosLeidos));
    }

    
}
