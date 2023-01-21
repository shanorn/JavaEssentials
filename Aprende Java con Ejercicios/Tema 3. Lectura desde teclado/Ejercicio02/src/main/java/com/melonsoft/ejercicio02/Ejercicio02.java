/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        System.out.println("¿Qué desea convertir?");
        System.out.println("1. Pesetas a Euros");
        System.out.println("2. Euros a pesetas");
        int opcion = 0; 
        Scanner s = new Scanner(System.in);
        while (opcion != 1 && opcion != 2){
            opcion = s.nextInt();
        }
        
        System.out.println("Por favor introduzca el valor a convertir: ");
        double valor = s.nextDouble();
        double eurosPorPeseta = 0.006010121043837823;
        double pesetasPorEuro = 166.386;
        
        if (opcion == 1){
            System.out.println(valor + " pesetas son " + valor * eurosPorPeseta + " Euros. ");
        } else {
            System.out.println(valor + " Euros son " + valor * pesetasPorEuro + " pesetas. ");
        }
        
        
        
    }
}
