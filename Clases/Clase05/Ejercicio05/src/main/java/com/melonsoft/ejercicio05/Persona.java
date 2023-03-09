/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ejercicio05;

import java.util.Random;

/**
 *
 * @author zerox
 */
public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private double peso;
    private double altura;
    
    
    
    // Constructor por defecto (No tiene parámetros)
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = Sexo.MUJER;
        this.peso = 0;
        this.altura = 0;
        generaDNI();
    }
    

    // Constructor con nombre, edad y sexo, el resto por defecto
    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        generaDNI();
    }
    //Constructor con todos los atributos como parámetro, menos el DNI.
    
    public Persona(String nombre,int edad, Sexo sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        generaDNI();
        
    }
            
    //getters.
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getDNI(){
        return DNI;
    }
    
    public Sexo getSexo(){
        return sexo;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double getAltura(){
        return altura;
    }
    
    //setters.
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    
    public void setSexo(Sexo sexo){
        this.sexo=sexo;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    //Métodos.
    
    //1.
    public double calcularIMC(){
        double alturaMetros=altura/100; //Pasamos de cm a metros.
        return peso/(alturaMetros*alturaMetros);
        //return peso/(Math.pow(alturaMetros, 2));
    }
    
    
    //2.
    public int valorarPesoCorporal(){
        double imc = calcularIMC();
        
        if (imc > 25){
            return 1;
        } else if (imc < 18){
            return -1;
        } else {
            return 0; 
        }
    }
    
    //3.
    public boolean esMayorDeEdad(){ //Si es mayor de edad este método devolverá true, sino false.
        return edad >=18;
    }
    
    //4.
    public String toString(){
        return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", dni='" + DNI + '\'' +
            ", sexo=" + sexo +
            ", peso=" + peso +
            ", altura=" + altura +
            '}';
    }
    
    private void generaDNI(){
        Random random = new Random();
        
        this.DNI = "";
        
        for(int i = 0; i < 8; i++){
            int digito = random.nextInt(10);
            this.DNI += digito;
        }
    }
}
