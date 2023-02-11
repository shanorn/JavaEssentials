/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.sumapares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zerox
 */
public class SumaPares {

    private static int[] obtenerPares(String linea){
        int totalPares = 0;
        for(char letra: linea.toCharArray()){
            int numero = Integer.parseInt(String.valueOf(letra));
            if (numero % 2 == 0) totalPares++;
        }
        
        int[] listaPares = new int[totalPares];
        int posicion = 0;
        
        for(char letra: linea.toCharArray()){
            int numero = Integer.parseInt(String.valueOf(letra));
            if (numero % 2 == 0){
                listaPares[posicion] = numero;
                posicion++;
            }
        }
        return listaPares;
    } 
    
    private static void mostrarListaNumeros(int[] numeros){        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
    
    private static int sumarListaNumeros(int[] numeros){        
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total; 
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca un número para ver los pares y su suma: ");
        String linea = br.readLine();
        
        int[] numerosPares = obtenerPares(linea);
        
        System.out.println("Numeros Pares: ");
        mostrarListaNumeros(numerosPares);
        System.out.println("");
        System.out.println("El total es " + sumarListaNumeros(numerosPares));
        
    }
}
