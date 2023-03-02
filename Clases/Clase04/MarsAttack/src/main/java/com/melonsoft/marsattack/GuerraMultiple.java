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
            /*
            int tamanoMaxTripulaciones = navesTerricolas[0].cuantosQuedan() > navesMarcianas[0].cuantosQuedan() ?
                navesTerricolas[0].cuantosQuedan() : navesMarcianas[0].cuantosQuedan();
            
            System.out.println(tamanoMaxTripulaciones);
            
            for (int i = 0; i < Terricola.getTotal() && quedanVivosEnAmbosBandos(); i++) {
                int auxTerricola = i % numTerricolasPorNave;
                int auxNaveTerricola = (i / numTerricolasPorNave);
                System.out.println("i: " + i + "\n");    
                for (int j = 0; j < Marciano.getTotal(); j++){
                    System.out.println("j: " + j + "\n");
                    int auxMarciano = j % numMarcianosPorNave;
                    int auxNaveMarciana = j / numMarcianosPorNave;

                    if (auxNaveMarciana < this.navesMarcianas.length && auxNaveTerricola < this.navesTerricolas.length && auxTerricola < numTerricolasPorNave) {
                        System.out.println("La nave " + auxNaveTerricola + " terricola ataca a " + auxNaveMarciana + " marciana con tripulante " + auxTerricola);
                        this.navesMarcianas[auxNaveMarciana].recibeDisparo(this.navesTerricolas[auxNaveTerricola].generaDisparo(auxTerricola));
                        
                    }
                    if (auxNaveMarciana < this.navesMarcianas.length && auxNaveTerricola < this.navesTerricolas.length && auxMarciano < numMarcianosPorNave) {
                        System.out.println("La nave " + auxNaveTerricola + " marciana ataca a " + auxNaveMarciana + " terricola con tripulante " + auxTerricola);
                        this.navesTerricolas[auxNaveTerricola].recibeDisparo(this.navesMarcianas[auxNaveMarciana].generaDisparo(auxMarciano));
                    }   
                }
                
            }*/
            
            
                        
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
