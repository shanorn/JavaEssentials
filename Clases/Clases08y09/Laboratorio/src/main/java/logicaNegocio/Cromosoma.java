/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.Random;

/**
 *
 * @author zerox
 */
public class Cromosoma {
    private TipoCromosoma tipo;
    private String mutacion;

    public Cromosoma(TipoCromosoma tipo) {
        this.tipo = tipo;
        Random rand = new Random();
        if (tipo == TipoCromosoma.X){
            if (rand.nextInt(2) == 0){
                mutacion = "Normal";
            }else{
                mutacion = "Esteril";
            }
        }
        if (tipo == TipoCromosoma.Y){
            if (rand.nextInt(2) == 0){
                mutacion = "Normal";
            }else{
                mutacion = "Poligamia";
            }
        }
        
    }

    public String getMutacion() {
        return mutacion;
    }

    @Override
    public String toString() {
        return "Cromosoma " + this.tipo + " - Mutacion: " + this.mutacion;
                
    }
    
    
}