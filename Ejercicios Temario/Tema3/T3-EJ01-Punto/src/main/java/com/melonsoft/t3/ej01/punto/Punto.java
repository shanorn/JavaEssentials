/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.t3.ej01.punto;

/**
 *
 * @author zerox
 */
public class Punto {
    private int x;
    private int y;
    private int z;

    public Punto() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Punto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
    
    
}
