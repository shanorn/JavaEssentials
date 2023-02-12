/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        int[][] matriz1 = leerMatriz();
        int[][] matriz2 = leerMatriz();
        
        int[][] resultado = multiplicarMatrices(matriz1, matriz2);
        
        System.out.println("Matriz 1: ");
        printMatriz(matriz1);
        System.out.println("Matriz 2: ");
        printMatriz(matriz2);
        System.out.println("Resultado multiplicacion: ");
        printMatriz(resultado);
    }

    private static void printMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
    
    private static int[][] leerMatriz() {
        Scanner sc = new Scanner(System.in);
        int numFilas, numColumnas;
        System.out.println("Introduzca el numero de filas: ");
        numFilas = sc.nextInt();
        System.out.println("Introduzca el numero de columnas: ");
        numColumnas = sc.nextInt();
        
        int[][] nuevaMatriz = new int[numFilas][numColumnas];
        
        // Leer datos
        for(int i = 0; i < numFilas; i++){
            for (int j = 0; j < numColumnas; j++){
                System.out.println("Introduzca el elemento [" + i + "]["+ j +"]:");
                nuevaMatriz[i][j] = sc.nextInt();
            }
        }
        
        return nuevaMatriz;
    }
    
    private static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB){
        int tamFilas = matrizA.length;
        int tamColum = matrizB[0].length;
        int[][] resultado = new int[tamFilas][tamColum];
        
        
        if (matrizA[0].length != matrizB.length){
            System.out.println("Esta multiplicación de matrices no se puede realizar");
        } else {
            for (int i = 0; i < matrizA.length; i++){
                for (int j = 0; j < matrizB[0].length; j++){
                    for (int k = 0; k < matrizA[0].length; k++){
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    } 
                }
            }
        }
        
        return resultado;
    }
    
}
