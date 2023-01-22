/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        System.out.println("Introduzca el numero de Mb: ");
        Scanner s = new Scanner(System.in);
        double valorMb = s.nextDouble();
        System.out.println(valorMb + " Mb -> " + valorMb * 1024 + " Kb -> " + valorMb * 1024 * 1024 + " b ");
        
        System.out.println("Introduzca el numero de Kb: ");
        double valorKb = s.nextDouble();
        System.out.println(valorKb / 1024 + " Mb -> " + valorKb + " Kb -> " + valorKb * 1024 + " b ");
    }
}
