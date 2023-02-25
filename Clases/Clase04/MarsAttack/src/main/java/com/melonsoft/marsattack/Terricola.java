/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.marsattack;

import java.util.Arrays;

/**
 *
 * @author zerox
 */
public class Terricola extends Guerrero {

    private static int totalTerricolas = 0;

    private static int[] disparosHechos = new int[Guerrero.MAX_BLANCO+1];

    public Terricola(String soy) {
        super(soy);
        Terricola.totalTerricolas++;
        Arrays.fill(disparosHechos, 0);
    }
    
    @Override
    public boolean recibeDisparo(int disparo) {
        boolean seMuere = super.recibeDisparo(disparo);
        if (seMuere) {
            Terricola.totalTerricolas--;
        }
        return seMuere;
    }

    @Override
    public int dispara() {
        int disparo;
        if (super.vivo) {
            do {
                disparo = ((int) (Math.random() * (MAX_BLANCO+1)));
                //Nosotros disparamos modo más inteligente
            }

            while(disparosHechos[disparo]>=Marciano.DISPAROS_QUE_AGUANTA);
            disparosHechos[disparo]++;
            System.out.println(this.soy + " dispara n " + disparo +"; van "
            + disparosHechos[disparo] + " disparos de este numero");
            return disparo;
        } else {
            return Integer.MIN_VALUE;
        }
    }
    
    public static int getTotal() {
        return Terricola.totalTerricolas;
    }

}
