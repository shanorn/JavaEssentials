/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio04;

import java.nio.charset.Charset;

/**
 *
 * @author zerox
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        
        System.out.println("Horario:"); 
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "8:15", "BBDD", "P. ETC", "OGE", "MTP II", "MTP I");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "9:15", "BBDD", "P. ETC", "OGE", "MTP II", "MTP I");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-54s|\n","10:15", "                      Recreo");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "10:45", "MTP I", "P. MTP I", "BBDD", "P. MTP II", "SSOO");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "11:45", "SSOO", "P. MTP I", "BBDD", "P. MTP II", "OGE");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "12:45", "SSOO", "P. MTP I", "SSOO", "", "OGE");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
        System.out.printf("|%10s|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "13:45", "ETC", "", "SSOO", "", "BBDD");
        System.out.println("+----------+----------+----------+----------+----------+----------+");
    }
}
