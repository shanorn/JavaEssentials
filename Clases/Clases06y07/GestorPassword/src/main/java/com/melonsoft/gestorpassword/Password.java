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
        private int longitud;
        private String contrasena;

        // Constructor por defecto
        public Password() {
            this.longitud = 8;
            this.contrasena = "password";
        }
        
        // Constructor de tamañano longitud
        public Password(int longitud) {
            this.longitud = longitud;
            this.contrasena = "";

            String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,;.:-_!·$%&/()=";

            Random random = new Random();

            for (int i = 0; i < this.longitud; i++) {
                char c = alphabet.charAt(random.nextInt(alphabet.length()));
                this.contrasena += c;

            }

        }

        // Métodos.
        public boolean esFuerte() {
            int mayusculas = 0;
            int minusculas = 0;
            int numeros = 0;

            for (char caracter : contrasena.toCharArray()) {
                if (Character.isUpperCase(caracter)) {
                    mayusculas++;
                } else if (Character.isLowerCase(caracter)) {
                    minusculas++;
                } else if (Character.isDigit(caracter)) {
                    numeros++;
                }
            }

            return mayusculas > 2 && minusculas > 1 && numeros > 5;
        }

        public int getLongitud() {
            return longitud;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setLongitud(int longitud) {
            this.longitud = longitud;
        }

    }
