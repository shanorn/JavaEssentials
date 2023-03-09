/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ej03.corregir;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ej03Corregir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de números racionales");
        System.out.println("==================================");
        
        Nracional numero1;
        Nracional numero2;
        
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Introducir el primer número racional");
            System.out.println("2. Introducir el segundo número racional");
            System.out.println("3. Sumar los dos números racionales");
            System.out.println("4. Multiplicar los dos números racionales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            System.out.println("");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el numerador: ");
                    int numerador1 = scanner.nextInt();
                    System.out.print("Introduzca el denominador: ");
                    int denominador1 = scanner.nextInt();
                    numero1 = new Nracional (numerador1, denominador1);
                    System.out.println("Número1: "+numero1.toString());
                    break;
                case 2:
                    System.out.print("Introduzca el numerador: ");
                    int numerador2 = scanner.nextInt();
                    System.out.print("Introduzca el denominador: ");
                    int denominador2 = scanner.nextInt();
                    numero2 = new Nracional (numerador2, denominador2);
                    System.out.println("Número2: "+numero2.toString());
                    break;
                case 3:
                    System.out.print("Introduzca el numerador (num1): ");
                    numerador1 = scanner.nextInt();
                    System.out.print("Introduzca el denominador (num1): ");
                    denominador1 = scanner.nextInt();
                    System.out.print("Introduzca el numerador (num2): ");
                    numerador2 = scanner.nextInt();
                    System.out.print("Introduzca el denominador (num2): ");
                    denominador2 = scanner.nextInt();
                    
                    
                    Nracional num1 = new Nracional(numerador1, denominador1);
                    Nracional num2 = new Nracional(numerador2, denominador2);
                    // Opcion ddevolver racional
                    Nracional resultado1 = num1.sumaYDevuelve(num2);
                    
                    // Opcion Void
                    num1.suma(num2);
                    Nracional resultadoSuma = new Nracional (num1);
                    
                    System.out.println("El resultado de la suma es: " + resultado1.toString());
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;
                case 4:
                    
                    System.out.print("Introduzca el numerador (num1): ");
                    numerador1 = scanner.nextInt();
                    System.out.print("Introduzca el denominador (num1): ");
                    denominador1 = scanner.nextInt();
                    System.out.print("Introduzca el numerador (num2): ");
                    numerador2 = scanner.nextInt();
                    System.out.print("Introduzca el denominador (num2): ");
                    denominador2 = scanner.nextInt();
                    
                    
                    num1 = new Nracional(numerador1, denominador1);
                    num2 = new Nracional(numerador2, denominador2);
                    
                    num1.multiplicacion(num2);
                    //Nracional resultadoMultiplicacion = new Nracional (num1);
                    
                    System.out.println("El resultado de la multiplicacion es: " + num1);
                    
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println("");
        }
        scanner.close();
    }
}
