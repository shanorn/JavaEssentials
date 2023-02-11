/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.melonsoft.tiporprimitivos;

/**
 *
 * @author zerox
 */
public class TiporPrimitivos {

    public static void main(String[] args) {
        // Tipos primitivos enteros: byte, short, int, long

        byte numeroByte = (byte) 129;
        System.out.println("numeroByte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort: " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = (long) 9223372036854775808F;
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        // Tipos primitivos de tipo flotante
        float numeroFloat = (float) 3.4028236E38D;
        System.out.println("numeroFloat: " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble: " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);

        // Tipo char
        char miCaracter = 'a';
        System.out.println("miCaracter: " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar: " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal: " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo: " + varCharSimbolo);

        // Pruebas inferencia
        var varChar2 = '\u0021';
        System.out.println("varChar2: " + varChar2);

        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2: " + varCharDecimal2);

        var varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo: " + varCharSimbolo2);

        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo: " + variableEnteraSimbolo);

        // Tipo boolean
        boolean varBoolean = false;

        System.out.println("varBoolean: " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 12;
        //var esAdulto = edad >= 18;
        
        if (edad >= 18) {
            System.out.println("Ya eres legalmente un adulto");
        } else {
            System.out.println("Todavia te faltan " + (18 - edad) + " años para ser mayor de edad");
        }
        
    }
}
