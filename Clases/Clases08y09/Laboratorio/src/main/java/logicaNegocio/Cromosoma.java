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

    public Cromosoma(TipoCromosoma tipo, boolean mutacionGen) {
        this.tipo = tipo;
        
        if (tipo == TipoCromosoma.X){
            if (mutacionGen){
                mutacion = "Esteril";
            }else{
                mutacion = "Normal";
            }
        }
        if (tipo == TipoCromosoma.Y){
            if (mutacionGen){
                mutacion = "Poligamia";
            }else{
                mutacion = "Normal";
            }
        }
        
    }

    public void setMutacion(boolean mutado){
        if (tipo == TipoCromosoma.X){
            if (mutado){
                mutacion = "Esteril";
            }else{
                mutacion = "Normal";
            }
        }
        if (tipo == TipoCromosoma.Y){
            if (mutado){
                mutacion = "Poligamia";
            }else{
                mutacion = "Normal";
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
