/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zerox
 */
public class Ejercicio05 {

    public static int[][] generaTablasMultiplicar(int n){
        int[][] tablas = new int[n + 1][10];
        
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= 9; j++){
                tablas[i][j] = i * j;
            }
        }
        
        return tablas;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nIntroduzca el numero de tablas a calcular: ");
        String linea = br.readLine();
        
        int n = Integer.parseInt(linea);
        
        int[][] multiplicaciones = generaTablasMultiplicar(n);
        
        // Imprimir tabla
        for (int i = 0; i <= n; i++){
            System.out.println("Tabla del " + i + ":");
            for(int j = 0; j <= 9; j++){
                System.out.println(i + " x " + j + " = " + multiplicaciones[i][j]);
            }
        }
    }
}
