/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ej03.corregir;

/**
 *
 * @author carmen
 */

import java.util.Scanner;

public class Nracional {
    //atributos
    protected int numerador, denominador;
    
    //Constructor.
    public Nracional(){
        this.numerador=0;
        this.denominador=1;
    }
    
    //Constructor copia
    public Nracional (Nracional otro) {
        this.numerador = otro.numerador;
        this.denominador = otro.denominador;
    }
    
    public Nracional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public int getNumerador(){
        return numerador;
    }
    public int getDenominador(){
        return denominador;
    }
    
    //Funcion suma.
    public void suma (Nracional otro){
        int nuevoDenominador = this.denominador * otro.denominador;
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        this.numerador = nuevoNumerador;
        this.denominador = nuevoDenominador;
        simplificar();
        
    }
    
    public Nracional sumaYDevuelve (Nracional otro){
        int nuevoDenominador = this.denominador * otro.denominador;
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        
        
        Nracional resultado = new Nracional(nuevoNumerador, nuevoDenominador);
        resultado.simplificar();
        
        return resultado;
    }
    
    //Función multiplicar.
    public void multiplicacion (Nracional otro){
        this.numerador = this.numerador* otro.numerador;
        this.denominador = this.denominador* otro.denominador;
        simplificar();
    }
    
    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
    private void simplificar() {
        int divisorComun = mcd(numerador, denominador);
        numerador /= divisorComun;
        denominador /= divisorComun;
        if (denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }
    }
    
    @Override
    public String toString(){
        return "("+this.numerador+"/"+this.denominador+")";
    }
    
     
}
