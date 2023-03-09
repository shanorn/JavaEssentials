/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio05;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Introduzca edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Introduzca sexo hombre (h), mujer (m):");
        char letra = sc.nextLine().charAt(0);
        
        Sexo sexo = Sexo.INDEFINIDO;
        
        if (letra == 'h'){
            sexo = Sexo.HOMBRE;
        } else if (letra == 'm'){
            sexo = Sexo.MUJER;
        }
        
        System.out.println("Introduzca peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        
        System.out.println("Introduzca altura: ");
        double altura = Double.parseDouble(sc.nextLine());
        
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        
        persona2.setPeso(75);
        persona2.setAltura(160);
        
        persona3.setNombre("Pepe");
        persona3.setEdad(25);
        persona3.setSexo(Sexo.INDEFINIDO);
        persona3.setPeso(80);
        persona3.setAltura(198);
        
        if (persona1.valorarPesoCorporal() == -1){
            System.out.println("Está demasiado delgado.");
        } else if (persona1.valorarPesoCorporal() == 1){
            System.out.println("No comas tanto.");
        } else {
            System.out.println("Estás en tu peso ideal");
        }
        
        if (persona2.valorarPesoCorporal() == -1){
            System.out.println("Está demasiado delgado.");
        } else if (persona2.valorarPesoCorporal() == 1){
            System.out.println("No comas tanto.");
        } else {
            System.out.println("Estás en tu peso ideal");
        }
        
        if (persona3.valorarPesoCorporal() == -1){
            System.out.println("Está demasiado delgado.");
        } else if (persona3.valorarPesoCorporal() == 1){
            System.out.println("No comas tanto.");
        } else {
            System.out.println("Estás en tu peso ideal");
        }
        
        if(persona1.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        
        if(persona2.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        
        String resultado = persona3.esMayorDeEdad() ? "Es mayor de edad" : "No es mayor de edad";
        System.out.println(resultado);
        
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
