/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

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
        if (numeroDiasInstalacion < 0 || numeroDiasInstalacion > 270) throw new IllegalArgumentException("El valor debe estar entre [0, 270].");
        this.numeroDiasInstalacion = numeroDiasInstalacion;
        this.ratones = new ArrayList<Raton>();
    }
    
    public void anadirRaton(String referencia, Date fechaNacimiento, Sexo sexo, int peso, float temperatura, String textoLibre, boolean mutacionGen1, boolean mutacionGen2){
        Raton nuevoRaton = new Raton(referencia, fechaNacimiento, sexo, peso, temperatura, textoLibre, mutacionGen1, mutacionGen2);
        this.ratones.add(nuevoRaton);
    }
    
    public void listarReferencias(){
        for (Raton raton : ratones) {
            System.out.println(raton.getReferencia());
        }
    }

    public ArrayList<Raton> getRatones() {
        return ratones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public int getNumeroDiasInstalacion() {
        return numeroDiasInstalacion;
    }
    
    public void modificarRaton(String referencia, Date fechaNacimiento, Sexo sexo, int peso, float temperatura, String textoLibre, boolean mutacionGen1, boolean mutacionGen2){
        Raton modificar = null;
        for (Raton raton : ratones) {
            if (raton.getReferencia().equals(referencia )){
                modificar = raton;
            }
        }
        if (modificar != null){
            modificar.setFechaNacimiento(fechaNacimiento);
            modificar.setSexo(sexo);
            modificar.setPeso(peso);
            modificar.setTemperatura(temperatura);
            modificar.setTextoLibre(textoLibre);
            modificar.setCromosoma1(mutacionGen1);
            modificar.setCromosoma2(mutacionGen2);
        } else {
            throw new NullPointerException("No se ha encontrado ningun ratón con la referencia " + referencia);
        }
        
    }
    
    public void mostrarDetallesRatones(){
        for (Raton raton : ratones) {
            System.out.println(raton);
        }
    }

    public void mostrarDetalleRaton(String referencia) {
        for (Raton raton : ratones) {
            if (raton.getReferencia().equals(referencia)){
                System.out.println(raton);
            }
        }
    }
    
    public Raton eliminarRaton(String referencia){
        for (Raton raton : ratones) {
            if (raton.getReferencia().equals(referencia)){
                ratones.remove(raton);
                return raton;
            }
        }
        return null;
    }
}
