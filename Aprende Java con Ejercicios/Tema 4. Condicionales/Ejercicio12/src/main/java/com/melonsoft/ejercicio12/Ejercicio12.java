/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio12;

import java.util.Scanner;

/**
 * Realiza un minicuestionario con 5 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará 2 puntos. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 * @author zerox
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Bienvenido al cuestionario! ");
        System.out.println("1. ¿Dónde puedo almacenar un número?");
        System.out.println("  a. Variable");
        System.out.println("  b. Clase");
        System.out.println("  c. Mochila");
        
        String lectura = s.nextLine();
        
        if ("a".equals(lectura)) contador++;
        
        System.out.println("2. Indica una palabra reservada de condicional");
        System.out.println("  a. while");
        System.out.println("  b. String");
        System.out.println("  c. switch");
        
        lectura = s.nextLine();
        
        if ("c".equals(lectura)) contador++;
        
        System.out.println("3. El diagrama UML se usa en BBDD");
        System.out.println("  Si");
        System.out.println("  No");
        
        lectura = s.nextLine();
        
        if ("No".equals(lectura)) contador++;
        
        System.out.println("4. Indique algún elemento de una clase");
        System.out.println("  a. Parametro");
        System.out.println("  b. Atributo");
        
        lectura = s.nextLine();
        
        if ("b".equals(lectura)) contador++;
        
        System.out.println("5. ¿Quieres aprobar?");
        System.out.println("  Si");
        System.out.println("  No");
        
        lectura = s.nextLine();
        
        if ("Si".equals(lectura)) contador++;
        
        System.out.println("La nota del cuestionario es: " + contador * 2);
    }
}
