/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.t3.ej02.fecha;

/**
 *
 * @author zerox
 */
public class T3EJ02Fecha {

    public static void main(String[] args) {
        Fecha fecha = new Fecha(20, 10, 2018);
        
        System.out.println(fecha.toString());
        
        fecha.setAño(2019);
        
        System.out.println(fecha.toString());
    }
}
