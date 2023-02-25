/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.marsattack;

/**
 *
 * @author zerox
 */
public abstract class Guerrero extends SerVivo {
    protected int blancoAAdivinar;
    protected final String soy;
    
    public static final int MAX_BLANCO = 10;
    
    public Guerrero(String soy) {
        blancoAAdivinar = generaBlancoAAdivinar();
        this.soy = soy;
    }

    public int dispara() {
        if (this.vivo) {
            int disparo = ((int) (Math.random() * (MAX_BLANCO+1)));
            System.out.println(soy + " dispara n " + disparo);
            return disparo;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public boolean recibeDisparo(int disparo) {
        boolean seMuere = false;
        if (vivo && blancoAAdivinar == disparo) {
            this.vivo = false;
            seMuere = true;
            System.out.println(soy + " muerto por disparo n " + disparo);
        }
        
        return seMuere;
    }
    
    public int getBlancoAAdivinar() {
        return blancoAAdivinar;
    }
       
    private int generaBlancoAAdivinar() {
        return ((int) (Math.random() * (MAX_BLANCO+1)));
    }
}
