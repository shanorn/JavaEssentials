/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ej03.animales;

/**
 *
 * @author zerox
 */
public class EJ03Animales {

    public static void main(String[] args) {
        
        
        Gato miGato = new Gato("egipcio", Alimentacion.OMNIVORO, Sexo.HEMBRA);
        
        System.out.println(miGato);
        
        miGato.araña();
        miGato.ronronea();
        miGato.maulla();
        miGato.comer();
        miGato.descansar();
        miGato.duerme();
    }
}
