/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.factoriales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zerox
 */
public class Factoriales {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca un número para ver la lista de factoriales: ");
        String linea = br.readLine();
        int numero = Integer.parseInt(linea);
        
        for (int i=1; i<=numero; i++){
            System.out.println(i + "! = " + factorial(i));
        }
        
    }

    private static int factorial(int numero) {
        // Solución bucles
        /*
        int resultado = 1;
        for(int i = numero; i > 0; i--){
            resultado *= i;
        }
        return resultado;
        */
        
        /* Solución recursiva
        if (numero == 1) return 1; 
        return numero * factorial(numero - 1);
        */
        
        // Solución recursiva más ternaria
        return (numero == 1)?1:numero*factorial(numero - 1);
    }
}
