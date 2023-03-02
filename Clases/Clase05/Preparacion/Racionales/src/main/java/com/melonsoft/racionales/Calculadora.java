/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.racionales;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Calculadora {
    ArrayList<Racional> memoria;
    
    Calculadora(){
        memoria  = new ArrayList<Racional>();
    }
    
    public void iniciar(){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            menu();
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el numerador: ");
                    int num = sc.nextInt();
                    System.out.println("Introduzca el denominador: ");
                    int denom = sc.nextInt();
                    Racional nuevo = new Racional(num, denom);
                    memoria.add(nuevo);
                    System.out.println("Se ha añadiro en [" + memoria.lastIndexOf(nuevo) + "]: " + nuevo);
                    break;
                case 2:
                    System.out.println("Introduzca la posicion del primer sumando: ");
                    int posA = sc.nextInt();
                    System.out.println("Introduzca la posicion del segundo sumando: ");
                    int posB = sc.nextInt();
                    
                    Racional suma = memoria.get(posA).suma(memoria.get(posB));
                    
                    System.out.println("La suma vale " + suma);
                    memoria.add(suma);
                    System.out.println("Se ha añadiro en [" + memoria.lastIndexOf(suma) + "]: " + suma);
                    break;
                case 3:
                    System.out.println("Introduzca la posicion del minuendo: ");
                    posA = sc.nextInt();
                    System.out.println("Introduzca la posicion del sustraendo: ");
                    posB = sc.nextInt();
                    
                    Racional resta = memoria.get(posA).resta(memoria.get(posB));
                    
                    System.out.println("La resta vale " + resta);
                    memoria.add(resta);
                    System.out.println("Se ha añadiro en [" + memoria.lastIndexOf(resta) + "]: " + resta);
                    break;
                case 4:
                    System.out.println("Introduzca la posicion del primer multiplicando: ");
                    posA = sc.nextInt();
                    System.out.println("Introduzca la posicion del segundo multiplicando: ");
                    posB = sc.nextInt();
                    
                    Racional multiplica = memoria.get(posA).multiplica(memoria.get(posB));
                    
                    System.out.println("La multiplica vale " + multiplica);
                    memoria.add(multiplica);
                    System.out.println("Se ha añadiro en [" + memoria.lastIndexOf(multiplica) + "]: " + multiplica);
                    break;
                case 5:
                    System.out.println("Introduzca la posicion del dividendo: ");
                    posA = sc.nextInt();
                    System.out.println("Introduzca la posicion del divisor: ");
                    posB = sc.nextInt();
                    
                    Racional divide = memoria.get(posA).divide(memoria.get(posB));
                    
                    System.out.println("La divide vale " + divide);
                    memoria.add(divide);
                    System.out.println("Se ha añadiro en [" + memoria.lastIndexOf(divide) + "]: " + divide);
                    break;
                case 6:
                    System.out.println("Introduzca la posicion del elemento a simplificar: ");
                    posA = sc.nextInt();
                    
                    memoria.get(posA).simplifica();
                    
                    System.out.println("La simplifica vale " + memoria.get(posA));
                    
                    break;
                case 7:
                    printMemoria();
                    break;
                case 8:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                
                   
                default:
                    throw new AssertionError();
            }
        } while (opcion != 8);
        
    }
    
    private void menu(){
        System.out.println("Calculadora");
        System.out.println("-----------");
        System.out.println(" 1. Añadir");
        System.out.println(" 2. Sumar");
        System.out.println(" 3. Restar");
        System.out.println(" 4. Multiplicar");
        System.out.println(" 5. Dividir");
        System.out.println(" 6. Simplificar");
        System.out.println(" 7. Ver memoria");
        System.out.println(" 8. Salir");
    }

    private void printMemoria() {
        System.out.println("Memoria: ");
        System.out.println("--------");
        
        for (int i = 0; i < memoria.size(); i++){
            System.out.println("[" + i + "]: " + memoria.get(i));
        }
    }
}
