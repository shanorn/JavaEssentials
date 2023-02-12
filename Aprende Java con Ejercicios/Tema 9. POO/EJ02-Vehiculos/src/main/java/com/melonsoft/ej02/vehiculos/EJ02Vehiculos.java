/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ej02.vehiculos;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class EJ02Vehiculos {

    public static void menu (){
        System.out.println("VEHICULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz un caballito con la bicileta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Introduzca la opción");
    }
    
    public static void main(String[] args) {
        int opcion;
        
        Scanner s = new Scanner(System.in);
        
        Bicicleta miBici = new Bicicleta();
        Coche miCoche = new Coche();
        
        do{
            menu();
            opcion = s.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuantos kilometros has hecho con la bici: ");
                    miBici.anda(s.nextInt());
                    break;
                case 2:
                    miBici.hacerCaballito();
                    break;
                case 3:
                    System.out.println("Cuantos kilometros has hecho con el coche: ");
                    miCoche.anda(s.nextInt());
                    break;
                case 4:
                    miCoche.quemarRueda();
                    break;
                case 5:
                    System.out.println("Kilometros miBici: " + miBici.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("Kilometros miCoche: " + miCoche.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("Numero Vehiculos: " + Vehiculo.getVehiculosCreados());
                    System.out.println("Totales: " + Vehiculo.getKilometrosTotales());
                    break;
                
                default:
                    System.out.println("Debe introducir un valor entre 1 - 8.");
                    break;
            }
        }while (opcion != 8);
    }
}
