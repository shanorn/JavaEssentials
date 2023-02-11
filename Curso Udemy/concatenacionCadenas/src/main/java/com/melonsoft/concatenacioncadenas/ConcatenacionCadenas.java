/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.melonsoft.concatenacioncadenas;

/**
 *
 * @author zerox
 */
public class ConcatenacionCadenas {

    public static void main(String[] args) {
        var usuario = "Cristian";
        var titulo = "Ingeniero";

        var union = titulo + " - " + usuario;
        System.out.println(union);
        
        var i = 3;
        var j = 4; 
        
        System.out.println(i + j); // suma
        System.out.println(i + j + usuario); // suma y concatenacion
        System.out.println(usuario + i + j); // concatenacion
        System.out.println(usuario + (i + j)); // concatenacion y suma
    }
}
