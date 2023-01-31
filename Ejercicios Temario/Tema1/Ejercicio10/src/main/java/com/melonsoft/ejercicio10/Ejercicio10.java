/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zerox
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int[][] matriz = rellenaMatriz();
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }

    private static int[][] rellenaMatriz() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Introduzca el tamaño de la matriz: ");
            int tam = Integer.parseInt(br.readLine());
            
            int[][] matriz = new int[tam][tam];
        
            Random random = new Random();
            
            for (int i = 0; i<tam; i++){
                for(int j = 0; j<tam; j++){
                    matriz[i][j] = random.nextInt(10);
                    matriz[j][i] = matriz[i][j];
                }
            }
            
            return matriz;
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
