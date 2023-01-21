/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio05;

/**
 *
 * @author zerox
 */
public class Ejercicio05 {
    
    // NOT WORKING ON WINDOWS 
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_RESET = "\u001B[0m";
    
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
