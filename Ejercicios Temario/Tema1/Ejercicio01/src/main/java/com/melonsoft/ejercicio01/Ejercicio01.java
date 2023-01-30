/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio01;

/**
 *
 * @author zerox
 */
public class Ejercicio01 {
    public static int calculaSegundos(byte annos, byte meses, short dias){
        return (int) ((annos * 365 + meses * 30 + dias) * 24 * 60 * 60);  
    }
    
    public static void main(String[] args) {
        
        short diasAnno = 365;
        byte horasDia = 24;
        byte minHora = 60;
        byte segMin = 60;
        
        
        System.out.println("Días: " + diasAnno + " Horas: " + horasDia + " Minutos: " + minHora + " Segundos: " + segMin);
        
        int segundos = calculaSegundos((byte) 1, (byte) 0 , (short) 0);
        
        System.out.println("Un año tiene: " + segundos + " segundos.");
    }
}
