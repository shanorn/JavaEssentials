/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.libro;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Libro {

    public static void main(String[] args) {
        // Declaracion de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Incluir datos del libro:");
        System.out.println("------------------------");
        
        System.out.println("Proporciona el titulo: ");
        var titulo = sc.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = sc.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
        
    }
}
