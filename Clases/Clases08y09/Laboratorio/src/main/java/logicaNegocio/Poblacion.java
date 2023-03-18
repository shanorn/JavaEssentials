/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author zerox
 */
public class Poblacion {
    private String nombre;
    private String responsable;
    private int numeroDiasInstalacion;
    private ArrayList<Raton> ratones;

    public Poblacion(String nombre, String responsable, int numeroDiasInstalacion) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.numeroDiasInstalacion = numeroDiasInstalacion;
        this.ratones = new ArrayList<Raton>();
    }
    
    public void anadirRaton(String referencia, LocalDate fechaNacimiento, Sexo sexo, int peso, float temperatura, String textoLibre){
        Raton nuevoRaton = new Raton(referencia, fechaNacimiento, sexo, peso, temperatura, textoLibre);
        this.ratones.add(nuevoRaton);
    }
    
    public void listarReferencias(){
        for (Raton raton : ratones) {
            System.out.println(raton.getReferencia());
        }
    }
    
    // Si hay referencias iguales, borraría todos los ratones con esa referencia
    public void eliminarRaton(String referencia){
        for (Raton raton : ratones){
            if (raton.getReferencia().equals(referencia)){
                this.ratones.remove(raton);
            }
        }
    }
    
    public void modificarRaton(String referencia){
        
    }
}
