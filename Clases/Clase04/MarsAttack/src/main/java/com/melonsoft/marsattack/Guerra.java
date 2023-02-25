/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.marsattack;

/**
 *
 * @author zerox
 */
public class Guerra {
    private Nave naveTerricolas, naveMarcianos;
    private int numeroDeTerricolas, numeroDeMarcianos;

    public Guerra(int numeroDeTerricolas, int numeroDeMarcianos) {
        // I do not need this values about number of terricolas and marcianos...
        // Marciano and Terricola classes already do it!
        this.numeroDeTerricolas = numeroDeTerricolas;
        this.numeroDeMarcianos = numeroDeMarcianos;
        this.naveTerricolas = new Nave("Terricolas", numeroDeTerricolas);
        this.naveMarcianos = new Nave("Marcianos", numeroDeMarcianos);
    }
    
    public void empiezaGuerra() {
        do {
            // Different way of doing an if/else
            int tamanoMaxTripulaciones = numeroDeTerricolas > numeroDeMarcianos ?
                numeroDeTerricolas : numeroDeMarcianos;
            
            for (int i = 0; i < tamanoMaxTripulaciones && quedanVivosEnAmbasNaves(); i++) {
                if (i < numeroDeTerricolas) {
                    naveMarcianos.recibeDisparo(naveTerricolas.generaDisparo(i));
                }
                if (i < numeroDeMarcianos) {
                    naveTerricolas.recibeDisparo(naveMarcianos.generaDisparo(i));
                }   
            }
        } while (quedanVivosEnAmbasNaves());
        
        if (naveTerricolas.cuantosQuedan() > 0) {
            System.out.println("GANARON LOS TERRICOLAS!!!!!");
        } else if (naveMarcianos.cuantosQuedan() > 0) {
            System.out.println("GANARON LOS MARCIANOS");
        }
    }
    
    private boolean quedanVivosEnAmbasNaves() {
        return naveTerricolas.cuantosQuedan() > 0 && naveMarcianos.cuantosQuedan() > 0;
    }
    
}
