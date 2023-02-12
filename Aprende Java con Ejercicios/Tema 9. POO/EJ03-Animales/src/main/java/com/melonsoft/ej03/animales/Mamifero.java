/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ej03.animales;

/**
 *
 * @author zerox
 */
public abstract class Mamifero extends Animal {
    
    private Alimentacion alimentacion;

    public Mamifero() {
        super();
        alimentacion = Alimentacion.CARNIVORO;
    }

    public Mamifero(Alimentacion alimentacion) {
        super();
        this.alimentacion = alimentacion;
    }

    public Mamifero(Alimentacion alimentacion, Sexo sexo) {
        super(sexo);
        this.alimentacion = alimentacion;
    }
    
    public void amamantar(){
        System.out.println("Amamantando...");
    }

    @Override
    public void comer() {
        if (alimentacion != Alimentacion.HERBIVORO){
            System.out.println("Comiendo Carne!");
        } else {
            System.out.println("Comiendo lechugas...");
        }
    }
    
    public void descansar(){
        System.out.println("Descansando...");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Alimentacion: " + alimentacion; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
}
