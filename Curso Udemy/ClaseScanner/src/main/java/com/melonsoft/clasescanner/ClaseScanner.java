/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.clasescanner;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class ClaseScanner {

    public static void main(String[] args) {
        
        System.out.println("Escribe tu nombre: ");
        Scanner sc = new Scanner(System.in);
        var usuario = sc.nextLine();
        System.out.println("Hola " + usuario + "!");
        System.out.println("Escribe el titulo: ");
        var titulo = sc.nextLine();
        System.out.println(usuario + " es un " + titulo);
    }
}
