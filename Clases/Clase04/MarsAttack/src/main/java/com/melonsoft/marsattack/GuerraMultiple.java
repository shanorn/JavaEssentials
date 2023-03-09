/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.marsattack;

/**
 *
 * @author zerox
 */
public class GuerraMultiple {
    private Nave[] navesTerricolas;
    private Nave[] navesMarcianas;
    
    private int numTerricolasPorNave;
    private int numMarcianosPorNave;
    
    private int numNavesTerricolas;
    private int numNavesMarcianas;
    
    public GuerraMultiple(int numeroNavesTerricolas, int numeroTerricolasPorNave, int numeroNavesMarcianas, int numeroMarcianosPorNave){
        this.navesTerricolas = new Nave[numeroNavesTerricolas];
        
        for (int i = 0; i < this.navesTerricolas.length; i++){
            this.navesTerricolas[i] = new Nave("Terricolas", numeroTerricolasPorNave);
        }
        
        this.navesMarcianas = new Nave[numeroNavesMarcianas];
        
        for (int j = 0; j < this.navesMarcianas.length; j++){
            this.navesMarcianas[j] = new Nave("Marcianos", numeroMarcianosPorNave);
        }
        
        this.numTerricolasPorNave = numeroTerricolasPorNave;
        this.numMarcianosPorNave = numeroMarcianosPorNave;
        
        this.numNavesTerricolas = numeroNavesTerricolas;
        this.numNavesMarcianas = numeroNavesMarcianas;
    }
    
    public void empiezaGuerra() {
        do {
            /*
            for (int i = 0; i < this.navesTerricolas.length; i++) {
                for (int j = 0; j < this.navesMarcianas.length; j++){
                    int tamanoMaxNave = this.navesMarcianas[j].cuantosQuedan() > this.navesTerricolas[i].cuantosQuedan() ?
                            this.navesMarcianas[j].cuantosQuedan() : this.navesTerricolas[i].cuantosQuedan();
                    
                    for (int k = 0; k < tamanoMaxNave && quedanVivosEnAmbasNaves(this.navesTerricolas[i], this.navesMarcianas[j]) ; k++) {
                        if (k < this.navesTerricolas[i].cuantosQuedan()) {
                            this.navesMarcianas[j].recibeDisparo(this.navesTerricolas[i].generaDisparo(k));
                        }
                        if (k < this.navesMarcianas[j].cuantosQuedan()) {
                            this.navesTerricolas[i].recibeDisparo(this.navesMarcianas[j].generaDisparo(k));
                        }
                    }
                    
                }
            }*/
            
            int tamanoMaxTripulaciones = navesTerricolas[0].cuantosQuedan() > navesMarcianas[0].cuantosQuedan() ?
                navesTerricolas[0].cuantosQuedan() : navesMarcianas[0].cuantosQuedan();
            
            System.out.println(tamanoMaxTripulaciones);
            
            for(int i = 0; i < this.numNavesTerricolas && quedanVivosEnAmbosBandos(); i++){
                for (int j = 0; j < this.numNavesMarcianas && quedanVivosEnAmbosBandos(); j++){
                    
                    for (int k = 0; k < this.numTerricolasPorNave && quedanVivosEnAmbosBandos(); k++){
                        for (int l = 0; l < this.numMarcianosPorNave && quedanVivosEnAmbosBandos(); l++){
                            
                            this.navesMarcianas[j].recibeDisparo(this.navesTerricolas[i].generaDisparo(k));
                            
                        
                            this.navesTerricolas[i].recibeDisparo(this.navesMarcianas[j].generaDisparo(l));
                        
                        }
                    }
                }
            }
            
            System.out.println("Ronda Terminada");
            System.out.println("--------------------------------");
            System.out.println("Quedas: " + Terricola.getTotal() + " terricolas");
            System.out.println("Quedas: " + Marciano.getTotal() + " marcianos");
            
                        
        } while (quedanVivosEnAmbosBandos());
        
        if (navesTerricolas[0].cuantosQuedan() > 0) {
            System.out.println("GANARON LOS TERRICOLAS!!!!!");
        } else if (navesMarcianas[0].cuantosQuedan() > 0) {
            System.out.println("GANARON LOS MARCIANOS");
        }
        
    }

    private boolean quedanVivosEnAmbosBandos() {
        return navesTerricolas[0].cuantosQuedan() > 0 && navesMarcianas[0].cuantosQuedan() > 0;
        
    }


}
