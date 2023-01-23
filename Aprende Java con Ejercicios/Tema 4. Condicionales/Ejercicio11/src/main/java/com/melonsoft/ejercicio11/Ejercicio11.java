/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio11;

import java.util.Scanner;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 * @author zerox
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca la hora y minutos separados por un espacio: ");
        
        int hora = s.nextInt();
        int minutos = s.nextInt();
        int segundos;
        
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) { 
            System.err.println("Hora o minutos no validos");
        } else { 
            int minutosRestantes = 60 - minutos;
            int horasRestantes = 23 - hora;
            
            segundos = minutosRestantes * 60 + horasRestantes * 60 * 60;
            System.out.println("Son las " + hora + ":" + minutos + " - Faltan " + segundos + " s para la 00:00");
        }
    }
}
