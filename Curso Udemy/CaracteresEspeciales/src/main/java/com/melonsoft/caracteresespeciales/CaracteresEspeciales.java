/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.melonsoft.caracteresespeciales;

/**
 *
 * @author zerox
 */
public class CaracteresEspeciales {

    public static void main(String[] args) {
        var nombre = "Kratos";
        
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Nueva linea: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre +"\'");
        System.out.println("Comilla doble: \"" + nombre +"\"");
    }
}
