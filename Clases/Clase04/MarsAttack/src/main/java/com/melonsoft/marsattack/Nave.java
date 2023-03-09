/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.marsattack;

/**
 *
 * @author zerox
 */
public class Nave {
    private Guerrero[] tripulacion;
    private String somos;

    public Nave(String somos, int tripulantes) {
        this.somos = somos;
        this.tripulacion = new Guerrero[tripulantes];
        
        if (somos.equals("Terricolas")) {
            for (int i = 0; i < tripulantes; i++) {
                tripulacion[i] = new Terricola(somos);
            }
        } else if (somos.equals("Marcianos")){
            for (int i = 0; i < tripulantes; i++) {
                tripulacion[i] = new Marciano(somos);
            }
        } else {
            System.out.println("It should be a exception here... "
            + "but I do not know them yet :(");
        }
        
        System.out.println( "Creada nave de " + somos + " con " +
        cuantosQuedan() + " tripulantes");
    }
    
    public void recibeDisparo(int disparo) {
        for (int j = 0; j < tripulacion.length; j++) {
            // As you can notice, Nave does not care if the tripulante is Marciano
            // or terricola...
            tripulacion[j].recibeDisparo(disparo);
        }
    }
    
    public int generaDisparo(int tripulante) {
        return tripulacion[tripulante].dispara();
    }
    
    public int cuantosQuedan() {
        if (somos.equals("Terricolas")) {
            return Terricola.getTotal();
        } else if (somos.equals("Marcianos")){
            return Marciano.getTotal();
        }else{
            System.out.println("When we know exceptions, we will understand why"
            + "The code will never arrive here");
            // And still I need to return an Int due to the signature
            return Integer.MIN_VALUE;
        }
    }
    
    public Guerrero getTripulante(int posicion){
        return tripulacion[posicion];
    }
}
