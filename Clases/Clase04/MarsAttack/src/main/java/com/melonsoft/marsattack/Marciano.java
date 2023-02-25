/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.marsattack;

/**
 *
 * @author zerox
 */
public class Marciano extends Guerrero {
    private static int totalMarcianosVivos = 0;
    private int disparosRecibidos = 0;
    
    public static final int DISPAROS_QUE_AGUANTA = 3;
    
    public Marciano(String soy) {
        super(soy);
        Marciano.totalMarcianosVivos++;
    }
    
    @Override
    public boolean recibeDisparo(int disparo) {
        boolean seMuere = false;
        if (this.vivo && blancoAAdivinar == disparo) {
            this.disparosRecibidos++;
            //Los marcianos aguantan varios disparos
            if (disparosRecibidos == DISPAROS_QUE_AGUANTA) {
                Marciano.totalMarcianosVivos--;
                super.recibeDisparo(disparo);
                seMuere = true;
            }
        }
        
        return seMuere;
    }
    
    public static int getTotal() {
        return Marciano.totalMarcianosVivos;
    }
}
