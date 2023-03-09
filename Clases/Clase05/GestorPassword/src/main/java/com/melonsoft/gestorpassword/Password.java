/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.gestorpassword;

import java.util.Random;

/**
 *
 * @author zerox
 */
public class Password {
    int longitud;
    String password;

    public Password() {
        this.longitud = 8;
        this.password = "password";
    }

    public Password(int longitud) {
        this.longitud = longitud;
        
        this.password = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,;.:-_!·$%&/()=";
        
        Random random = new Random();
        
        for (int i = 0; i < this.longitud; i++) {
            char c = alphabet.charAt(random.nextInt(alphabet.length()));
            this.password += c ;
        }
        
        
    }
    
    public void mostrarPassword(){
        System.out.println(this.longitud + ": " + this.password);
    }
    
    
    
}
