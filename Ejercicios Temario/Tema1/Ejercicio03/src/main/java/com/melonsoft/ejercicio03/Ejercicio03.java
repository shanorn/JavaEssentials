/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio03;

/**
 *
 * @author zerox
 */
public class Ejercicio03 {

    public static int[] multiplos(int begin, int end){
        int totalMultiplos = (end - begin)/5;
        if (end - begin >= 5) totalMultiplos++;
        int[] aux = new int[totalMultiplos];
        
        int pos = 0;
        for (int i = begin; i<=end; i++){
            if (i % 5 == 0){
                aux[pos] = i;
                pos++;
            }
        }
        
        return aux;
    }
    
    public static int suma(int[] lista){
        int suma = 0;
        for (int elemento: lista){
            suma += elemento;
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        int recuentoMultiplos = 0;
        int sumaMultiplos = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " es multiplo de 5. ");
                recuentoMultiplos++;
                sumaMultiplos += i;
            }
        }
        System.out.println(recuentoMultiplos + " : " + sumaMultiplos);
        
        // Prueba funcion multiplos
        int begin = 43;
        int end = 85;
        int[] prueba = multiplos(begin, end);
        
        for (int elmento: prueba) {
            System.out.println(elmento);
        }
        
        System.out.println("Total listado [" + begin + "-" + end + "]: " + suma(prueba));
        
    }
}
