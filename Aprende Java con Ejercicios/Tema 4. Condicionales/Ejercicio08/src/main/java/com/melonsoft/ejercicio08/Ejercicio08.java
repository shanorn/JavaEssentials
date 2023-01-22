/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio08;

import java.util.Scanner;

/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * @author zerox
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        double nota1, nota2, nota3;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca tres notas separadas por espacios: ");
        nota1 = s.nextDouble();
        nota2 = s.nextDouble();
        nota3 = s.nextDouble();
        
        double media = (nota1 + nota2 + nota3)/3;
        double redondeada = Math.round(media);
        
        System.out.println("La media es: " + media + " (" + redondeada + ")");
        
        
        if (redondeada < 5) System.out.println("Insuficiente");
        else if (redondeada == 5) System.out.println("Suficiente");
        else if (redondeada < 7) System.out.println("Bien");
        else if (redondeada < 9) System.out.println("Notable");
        else System.out.println("Sobresaliente");
    }
}
