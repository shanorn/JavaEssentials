/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.tiendalibros;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class TiendaLibros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Proporciona el id: ");
        int id = sc.nextInt();
        
        System.out.println("Proporciona el precio: ");
        double precio = sc.nextDouble();
        
        System.out.println("Proporciona el envío gratuito: ");
        boolean envioGratuito = sc.nextBoolean();
        
        // Salida
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
