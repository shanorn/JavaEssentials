/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ej03.animales;

/**
 *
 * @author zerox
 */
public abstract class Animal {
    private Sexo sexo; 

    public Animal() {
        this.sexo = Sexo.MACHO;
    }

    public Animal(Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Sexo: " + this.sexo;
    }
    
    public void duerme(){
        System.out.println("ZzZzzzZzZZz");
    }
    
    public void comer(){
        System.out.println("Comiendo...");
    }
    
}
