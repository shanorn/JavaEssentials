/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.racionales;

/**
 *
 * @author zerox
 */
public class Racionales {

    public static void main(String[] args) {
        //testRacional();
        Calculadora calculadora = new Calculadora();
        
        calculadora.iniciar();
    }
    
    private static void testRacional(){
        Racional num1 = new Racional(6,5);
        Racional num2 = new Racional(7,2);
        
        Racional suma = num1.suma(num2);
        Racional resta = num1.resta(num2);
        Racional multiplicacion = num1.multiplica(num2);
        Racional division = num1.divide(num2);
                
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
    }
     
}
