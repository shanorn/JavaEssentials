/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.melonsoft.conversiontipos;

/**
 *
 * @author zerox
 */
public class ConversionTipos {

    public static void main(String[] args) {
        // Convertir tipo String a un tipo int
        String edad = "20";
        int numEdad = Integer.parseInt(edad);
        System.out.println("numEdad: " + (numEdad + 1));

        // Convertir tipo String a tipo double
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI: " + valorPI);

        // Convertir tipo int a tipo String
        String edadTexto = String.valueOf(10);
        System.out.println("edadTexto: " + edadTexto);

        // Obtener char de una cadena
        String cadena = "hola";
        char caracter = cadena.charAt(0);
        System.out.println("caracter: " + caracter);
        caracter = "hola".charAt(1);
        System.out.println("caracter: " + caracter);

    }
}
