/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zerox
 */
public class Ejercicio09 {

    private static int[] leerVector(int size) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int[] vector = new int[size];
        int numLeido;
        
        for(int i = 0; i<size; i++){
            System.out.println("Introduzca el elemento " + i + ": ");
            numLeido = Integer.parseInt(br.readLine());
            vector[i] = numLeido;
        }
        
        return vector;
    }
    
    private static int productoEscalar(int[] vectorA, int[] vectorB){
        if (vectorA.length != vectorB.length) return 0;
        int escalar = 0;
        
        for(int i = 0; i < vectorA.length; i++){
            escalar += vectorA[i] * vectorB[i];
        }
        
        return escalar;
    }
    
    public static void main(String[] args) throws IOException {
        int tam = 3;
        int[] vector1 = leerVector(tam);
        int[] vector2 = leerVector(tam);
        
        int producto = productoEscalar(vector1, vector2);
        
        System.out.println("El producto escalar es: " + producto);
    }
}
