/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio10;

import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 * @author zerox
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca el mes de nacimiento [1 - 12]: ");
        int mes = s.nextInt();
        int dia;
        if (mes < 1 || mes > 12) {
            System.err.println("No ha introducido un numero valido de mes.");
        } else {
            System.out.println("Introduzca el día de nacimiento: ");
            dia = s.nextInt();
            
            if ((mes == 2 && dia >= 1 && dia <= 28) ||
               ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31) ||
               ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30))
            {
                String numeros = ""; 
                if (mes < 10){
                    numeros = numeros + "0" + mes;
                } else {
                    numeros = numeros + mes;
                }
                if (dia < 10){
                    numeros = numeros + "0" + dia;
                } else {
                    numeros = numeros + dia;
                }
                
                int valorNumeros = Integer.parseInt(numeros);
                
                if (valorNumeros <= 119 || valorNumeros >= 2212) System.out.println(dia +"/" + mes + " -> " + "Capricornio");
                else if (valorNumeros <= 218) System.out.println(dia +"/" + mes + " -> " + "Acuario");
                else if (valorNumeros <= 320) System.out.println(dia +"/" + mes + " -> " + "Piscis");
                else if (valorNumeros <= 419) System.out.println(dia +"/" + mes + " -> " + "Aries");
                else if (valorNumeros <= 520) System.out.println(dia +"/" + mes + " -> " + "Tauro");
                else if (valorNumeros <= 620) System.out.println(dia +"/" + mes + " -> " + "Géminis");
                else if (valorNumeros <= 722) System.out.println(dia +"/" + mes + " -> " + "Cáncer");
                else if (valorNumeros <= 822) System.out.println(dia +"/" + mes + " -> " + "Leo");
                else if (valorNumeros <= 922) System.out.println(dia +"/" + mes + " -> " + "Virgo");
                else if (valorNumeros <= 1022) System.out.println(dia +"/" + mes + " -> " + "Libra");
                else if (valorNumeros <= 1121) System.out.println(dia +"/" + mes + " -> " + "Escorpio");
                else if (valorNumeros <= 1221) System.out.println(dia +"/" + mes + " -> " + "Sagitario");
     
            } else {
                System.err.println("No ha introducido un numero valido de dia.");
            }
        }
        
        
    }
}
