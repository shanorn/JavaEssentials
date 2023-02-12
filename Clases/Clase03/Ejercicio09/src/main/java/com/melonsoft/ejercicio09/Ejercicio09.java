/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio09;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio09 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int tam = 3;
        
        int[] vector1 = leerVector(tam);
        int[] vector2 = leerVector(tam);
        
        
        printVector(vector1);
        printVector(vector2);
        System.out.println("Producto Escalar: " + productoEscalar(vector1, vector2));
    }

    private static int productoEscalar(int[] vectorA, int[] vectorB){
        int resultado = 0;
        for(int i=0; i< vectorA.length; i++){
            
            resultado += vectorA[i]*vectorB[i];
        }
        
        return resultado;
    }
            
    
    private static void printVector(int[] vector){
        for(int i = 0; i<vector.length; i++){
            System.out.println("[" + i + "]: " + vector[i]);
        }
    }
    
    
    private static int[] leerVector(int tam) {
        int[] vector = new int[tam];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<vector.length; i++){ 
            System.out.println("Introduzca el elemento de la posicion [" + i + "]:");
            vector[i] = sc.nextInt();
        }
        
        return vector;
    }
}
