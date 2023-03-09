/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.marsattack;

/**
 *
 * @author zerox
 */

public class MarsAttack {
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        /*
        Guerra guerra = new Guerra(30, 10);
        guerra.empiezaGuerra();
        */
        
        GuerraMultiple laMuertePela = new GuerraMultiple(8, 5,3, 5);
        laMuertePela.empiezaGuerra();
    }
}
