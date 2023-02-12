/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ej03.animales;

/**
 *
 * @author zerox
 */
public class Gato extends Mamifero {

    private String raza;
    
    public Gato() {
        super();
        this.raza = "siames";
    }

    public Gato(String raza) {
        super();
        this.raza = raza;
    }

    public Gato(String raza, Alimentacion alimentacion) {
        super(alimentacion);
        this.raza = raza;
    }

    public Gato(String raza, Alimentacion alimentacion, Sexo sexo) {
        super(alimentacion, sexo);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Raza: " + this.raza; 
    }
    
    
    public void maulla(){
        System.out.println("Miauuuu");
    }
    
    public void araña(){
        System.out.println("shshschchschshsss");
    }
    
    public void ronronea(){
        System.out.println("RrrURruurURURrUR");
    }
    
    
    
}
