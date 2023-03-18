/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author zerox
 */
public class Raton {
    private String referencia;
    private Date fechaNacimiento;
    private Sexo sexo;
    private int peso;
    private float temperatura;
    private String textoLibre;
    private Cromosoma cromosoma1;
    private Cromosoma cromosoma2;

    public Raton() {
        this.referencia = "0000";
        this.fechaNacimiento = new Date();
        this.sexo = Sexo.HEMBRA;
        this.peso = 0;
        this.temperatura = 0.0F;
        this.textoLibre = "";
        
        generarCromosomas();
               
    }

    public Raton(String referencia, Date fechaNacimiento, Sexo sexo, int peso, float temperatura, String textoLibre) {
        this.referencia = referencia;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.temperatura = temperatura;
        this.textoLibre = textoLibre;
        generarCromosomas();
    }
    
    
    private void generarCromosomas(){
        if (this.sexo != null){
            if (this.sexo == Sexo.MACHO){
                this.cromosoma1 = new Cromosoma(TipoCromosoma.X);
                this.cromosoma2 = new Cromosoma(TipoCromosoma.Y);
            } else {
                this.cromosoma1 = new Cromosoma(TipoCromosoma.X);
                this.cromosoma2 = new Cromosoma(TipoCromosoma.X);
            }
        } else {
            //Excepción
        }
    }
    
    public boolean esEsteril(){
        if ((this.sexo == Sexo.MACHO && this.cromosoma1.getMutacion().equals("Esteril")) ||
            (this.sexo == Sexo.HEMBRA && this.cromosoma1.getMutacion().equals("Esteril") && this.cromosoma2.getMutacion().equals("Esteril"))){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean esPoligamo(){
        if (this.sexo == Sexo.MACHO && cromosoma2.getMutacion().equals("Poligamia")){
            return true;
        }else{
            return false;
        }
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setTextoLibre(String textoLibre) {
        this.textoLibre = textoLibre;
    }

    @Override
    public String toString() {
        String cadena = "REF: " + this.referencia + "\n" +
                "Fecha Nacimiento: " + this.fechaNacimiento + "\n" +
                "Sexo: " + (this.sexo == Sexo.MACHO?"Macho":"Hembra") + "\n" +
                "Peso: " + this.peso + "\n" +
                "Temperatura: " + this.temperatura + "\n" +
                "Texto: \n" + this.textoLibre + "\n" +
                "Cromosoma 1: " + cromosoma1 + "\n" + 
                "Cromosoma 2: " + cromosoma2;
                
        return cadena;
    }

    public String getReferencia() {
        return referencia;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public String getTextoLibre() {
        return textoLibre;
    }

    public Cromosoma getCromosoma1() {
        return cromosoma1;
    }

    public Cromosoma getCromosoma2() {
        return cromosoma2;
    }
    
    
}
