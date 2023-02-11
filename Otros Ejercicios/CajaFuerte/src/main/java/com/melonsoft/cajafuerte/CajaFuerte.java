/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.cajafuerte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kratos
 * @version 1.0
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class CajaFuerte {
    
    private static String generaCombinacion(){
        String combinacion = new String();
        
        for(int i = 0; i<4; i++){
            combinacion += (byte) Math.floor(Math.random()*10);
        }
        
        return combinacion;
    }
    
    public static void main(String[] args) throws IOException {
        String combinacionCajaFuerte = generaCombinacion();
        byte oportunidades = 4;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Trampa: " + combinacionCajaFuerte);
        System.out.println("Introduzca una combinación de 4 dígitos: ");
        
        
        while (oportunidades != 0){
            String lectura = br.readLine();
            if (lectura.equals(combinacionCajaFuerte)){
                System.out.println("Enhorabuna has acertado la combinación.");
            }else{
                oportunidades--;
                System.out.println("Vuelve a intentarlo, te quedan " + oportunidades + " oportunidades.");
            }
        }
        
        
        
    }
}
