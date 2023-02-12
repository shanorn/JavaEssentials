    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.cuadradoscubos;

/**
 *
 * @author zerox
 */
public class CuadradosCubos {

    public static void main(String[] args) {
        // Se define Numero de elementos y los 3 arrays
        int numElementos = 20;
        int[] numero = new int[numElementos];
        int[] cuadrado = new int[numElementos];
        int[] cubo = new int[numElementos];
        
        // Rellenamos array numero con elementos random entre 0 y 100
        // Rellenamos cuadrado y cubo con los respectivos valores
        for(int i = 0; i < numElementos; i++){
            numero[i] = (int) Math.floor(Math.random()*101);
            cuadrado[i] = (int) Math.pow(numero[i], 2);
            cubo[i] = (int) Math.pow(numero[i], 3);
        }
        
        for (int i = 0; i < numElementos; i++) {
            System.out.printf("%6d %6d %6d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
