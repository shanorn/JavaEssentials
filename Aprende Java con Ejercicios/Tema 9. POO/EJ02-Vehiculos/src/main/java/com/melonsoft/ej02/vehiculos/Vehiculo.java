/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.ej02.vehiculos;

/**
 *
 * @author zerox
 */
public abstract class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    
    private int kilometrosRecorridos;

    public Vehiculo() {
        this.kilometrosRecorridos = 0;
        this.vehiculosCreados++;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    
    public void anda(int kilometros){
        this.kilometrosRecorridos += kilometros;
        this.kilometrosTotales += kilometros;
    }
    
}
