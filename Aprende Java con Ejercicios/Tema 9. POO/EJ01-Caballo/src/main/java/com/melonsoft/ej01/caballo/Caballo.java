/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ej01.caballo;

/**
 *
 * @author zerox
 */
public class Caballo {
    private String nombre;
    private int edad;
    private int energia; 

    public Caballo() {
        this.nombre = "";
        this.edad = 0;
        this.energia = 0;                
    }

    public Caballo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.energia = 0;
    }
    
    public void bautizar(String nombre){
        System.out.println("El caballo ahora se llama " + nombre);
        this.nombre = nombre;
    }
    
    public void envejecer(){
        this.edad++;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }
    
    public int alimentar(int comida){
        this.energia += comida;
        return this.energia;
    }
    
    public int correr(int recorrido){
        this.energia -= recorrido;
        return this.energia;
    }
    
    
    
    
    
}
