/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercici08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercici08 {

    private static int[] leerNumeros() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numero; 
        int[] listaNumeros = new int[100];
        int posicion = 0;
        
        do{
           String linea = br.readLine();
           numero = Integer.parseInt(linea);
           if (numero != 0){
               listaNumeros[posicion] = numero;
               posicion++;
           }
        }while (numero != 0);
        
        // Es por culpa de tener arrays estaticos
        int[] listaNumerosLimpia = new int[posicion];
        
        for(int i = 0; i<listaNumerosLimpia.length; i++) {
            listaNumerosLimpia[i] = listaNumeros[i];
        }
        
        return listaNumerosLimpia;
    }
    
    public static double media(int[] listaNumeros){
        int total = 0;
        
        for(int numero: listaNumeros){
            total += numero;
        }
        
        return (double) total/listaNumeros.length;
    }
    
    public static int maximo(int[] listaNumeros){
        int maximo = Integer.MIN_VALUE;
        
        for(int numero: listaNumeros){
            if (numero > maximo) maximo = numero;
        }
        
        return maximo;
    }
    
    public static int minimo(int[] listaNumeros){
        int minimo = Integer.MAX_VALUE;
        
        for(int numero: listaNumeros){
            if (numero < minimo) minimo = numero;
        }
        
        return minimo;
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("Por favor introduzca la lista de números (0 para terminar): ");
        int[] numeros = leerNumeros();
        
        System.out.println("longitud: " + numeros.length);
        for(int i = 0; i<numeros.length; i++){
            System.out.println(i + ": " + numeros[i]);
        }
        
        double resultado = media(numeros);
        
        System.out.println("Media: " + resultado);
        
        int minimo = minimo(numeros);
        int maximo = maximo(numeros);
        
        System.out.println("Minimo: " + minimo);
        System.out.println("Maximo: " + maximo);
        
        
        
    }
}
