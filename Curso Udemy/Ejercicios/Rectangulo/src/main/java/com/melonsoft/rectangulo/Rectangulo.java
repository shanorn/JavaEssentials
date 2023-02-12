/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.rectangulo;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Rectangulo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Porporciona el alto: ");
        int alto = s.nextInt();
        
        System.out.println("Porporciona el ancho: ");
        int ancho = s.nextInt();
        
        System.out.println("Area: " + alto * ancho);
        System.out.println("Perimetro: " + (alto + ancho) * 2);
    }
}
