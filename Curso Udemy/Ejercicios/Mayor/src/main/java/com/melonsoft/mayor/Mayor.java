/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.mayor;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Mayor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Porporciona el numero1: ");
        int numero1 = s.nextInt();
        
        System.out.println("Porporciona el numero2: ");
        int numero2 = s.nextInt();
        
        System.out.println("El numero mayor es:");
        int mayor = (numero1 > numero2)?numero1:numero2;
        System.out.println(mayor);
    }
}
