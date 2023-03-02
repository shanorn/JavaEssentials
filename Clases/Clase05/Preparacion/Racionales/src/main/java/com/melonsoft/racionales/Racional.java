/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.racionales;

/**
 *
 * @author zerox
 */
public class Racional {
    private int numerador;
    private int denominador;
    
    Racional(){
        this.numerador = 0;
        this.denominador = 1;
    }
    
    Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador; 
    }
    
    Racional(Racional numero){
        this.numerador = numero.numerador;
        this.denominador = numero.denominador;
    }
    
    Racional suma(Racional sumando){
        // Calculamos el valor del numerador y denominador de la suma
        int sumNumerador = this.numerador * sumando.denominador + this.denominador * sumando.numerador;
        int sumDenominador = this.denominador * sumando.denominador;
        
        // Creamos un nuevo racional
        Racional resultado = new Racional(sumNumerador, sumDenominador);
        
        // Simplificamos despues de sumar
        resultado.simplifica();
        
        return resultado;
    }

    Racional resta(Racional sustraendo){
        int restaNumerador = this.numerador * sustraendo.denominador + this.denominador * sustraendo.numerador * -1;
        int restaDenominador = this.denominador * sustraendo.denominador;
        
        Racional resultado = new Racional(restaNumerador, restaDenominador);
        
        resultado.simplifica();
        
        return resultado;
    }
    
    Racional multiplica(Racional multiplicando) {
        int mulNumerador = this.numerador * multiplicando.numerador;
        int mulDenominador = this.denominador * multiplicando.denominador;
        
        Racional resultado = new Racional(mulNumerador, mulDenominador);
        
        resultado.simplifica();
        
        return resultado;
    }
    
    Racional divide(Racional multiplicando) {
        int divNumerador = this.numerador * multiplicando.denominador;
        int divDenominador = this.denominador * multiplicando.numerador;
        
        Racional resultado = new Racional(divNumerador, divDenominador);
        
        resultado.simplifica();
        
        return resultado;
    }
    
    public void simplifica() {
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
    }
    
    private static int mcd(int a, int b){
        if (b == 0) 
            return a;
        else
            return mcd(b, a % b);
    }
    
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    
    
    
}
