/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.melonsoft.operadores;

/**
 *
 * @author zerox
 */
public class Operadores {

    public static void main(String[] args) {
        // + - * /
        int a = 3, b = 2;

        var resultado = a + b;
        System.out.println("resultado +: " + resultado);

        resultado = a - b;
        System.out.println("resultado -: " + resultado);

        resultado = a * b;
        System.out.println("resultado *: " + resultado);

        resultado = a / b;
        System.out.println("resultado /: " + resultado);

        var resultado2 = 3F / b;
        System.out.println("resultado /: " + resultado2);

        resultado = a % b;
        System.out.println("resultado %: " + resultado);

        // Numero par
        if (b % 2 == 0) {
            System.out.println("Es número par");
        } else {
            System.out.println("Es número impar");
        }

        // Operadores de asignación
        int c = a + 5 - b;

        System.out.println("c = " + c);

        a += 1; // a = a + 1
        System.out.println("a = " + a);

        a += 3; // a = a + 3
        System.out.println("a = " + a);

        a -= 2; // a = a - 2
        System.out.println("a = " + a);

        a *= 3;
        System.out.println("a = " + a);

        a /= 2;
        System.out.println("a = " + a);

        a %= 3;
        System.out.println("a = " + a);

        // Operadores Unarios
        System.out.println("-----------");
        a = 3;
        b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean boleano = true;
        var d = !boleano;
        System.out.println("boleano = " + boleano);
        System.out.println("d = " + d);

        // incremento 
        // 1.pre
        var e = 3;
        var f = ++e; // Primero se incrementa y luego se utiliza su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // 2.post
        var g = 5;
        var h = g++; // Primero se utiliza el valor de la variable y luego se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // decremento
        // 1.pre
        var i = 2;
        var j = --i; // Primero se incrementa y luego se utiliza su valor
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        // 2.post
        var k = 4;
        var l = k--; // Primero se utiliza el valor de la variable y luego se incrementa
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        // Operadores de asignacion y relacionales
        a = 3;
        b = 2;

        var x = (a == b);
        System.out.println("x = " + x);

        x = a != b;
        System.out.println("x = " + x);

        String cadena1 = "Hola";
        String cadena2 = "Adios";

        var comparacion = cadena1.equals(cadena2);
        System.out.println("comparacion = " + comparacion);
        comparacion = cadena1.equals("Hola");
        System.out.println("comparacion = " + comparacion);

        // Operadores Relacionales
        var z = a > b;
        System.out.println("z = " + z);

        z = a >= b;
        System.out.println("z = " + z);

        z = a < b;
        System.out.println("z = " + z);

        z = a <= b;
        System.out.println("z = " + z);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 10;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        
        // Operadores condicionales
        a = -1;
        
        var valorMinimo = 0;
        var valorMaximo = 10; 
        
        var resultado3 = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado3 = " + resultado3);
        
        if (resultado3){
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = false;
        var diaDescanso = true;
        
        if (vacaciones || diaDescanso){
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre está ocupado");
        }
        
        // Operador ternario
        var resultado4 = (3 > 2) ? "verdadero": "falso";
        System.out.println("resultado4 = " + resultado4);
        
        var numero = 5;
        
        resultado4 = (numero % 2 == 0 )? "Es par": "Es impar";
        System.out.println("resultado4 = " + resultado4);
        
        
        // Precedencia de operadores
        var x2 = 5;
        var y = 10;
        var z2 = ++x2 + y--;
        System.out.println("x = " + x2);
        System.out.println("y = " + y);
        System.out.println("z = " + z2);
        
        var resultado5 = 4 + 5 * 6 / 3;
        System.out.println("resultado5: " + resultado5);
        resultado5 = (4 + 5) * 6 / 3;
        System.out.println("resultado5: " + resultado5);
        
    }
}
