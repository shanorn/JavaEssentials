/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.melonsoft.gestorpassword;
/**
 *
 * @author carmen
 */

import com.melonsoft.gestorpassword.Password;
import java.util.Scanner;
import java.util.Random;

public class GestorPassword {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array: ");

        int tamanoArray = leer.nextInt();

        Password[] password = new Password[tamanoArray];
        boolean[] esFuerte = new boolean[tamanoArray];

        for (int i = 0; i < tamanoArray; i++) {
            System.out.print("Ingrese la longitud de la contraseña para el objeto " + (i + 1) + ": ");
            int longitud = leer.nextInt();
            password[i] = new Password(longitud);
            esFuerte[i] = password[i].esFuerte();

        }
        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Contraseña " + (i + 1) + ": " + password[i].getContrasena() + " " + esFuerte[i]);
        }

        leer.close();
    }

}
