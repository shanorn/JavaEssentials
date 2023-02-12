/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ej01.caballo;

/**
 *
 * @author zerox
 */
public class EJ01Caballo {

    public static void main(String[] args) {
        Caballo caballoPi = new Caballo("Pi", 33);
        
        caballoPi.alimentar(5);
        caballoPi.correr(3);
        
        System.out.println("El caballo se llama: " + caballoPi.getNombre());
        caballoPi.bautizar("Pizarro");
        
        System.out.println("El caballo se llama: " + caballoPi.getNombre());
        System.out.println("Tiene " + caballoPi.getEdad() + " años");
        System.out.println("Energia: " + caballoPi.getEnergia());
    }
}
