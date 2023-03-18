/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenamiento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import logicaNegocio.Poblacion;
import logicaNegocio.Raton;

/**
 *
 * @author zerox
 */
public class PoblacionFile {
    private File fichero;
    private String nombre; 
    
    public PoblacionFile(String nombreFichero) {
        fichero = new File(System.getProperty("user.dir") + "\\" + nombreFichero);
        nombre = nombreFichero;
    }
    
    public void guardarPoblacion(Poblacion poblacion){
        
        
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));

            
            bw.write("Nombre: " + poblacion.getNombre() + "\n");
            bw.write("Responsable: " + poblacion.getResponsable() + "\n");
            bw.write("Numero de dias en instalacion: " + poblacion.getNumeroDiasInstalacion() + "\n");
            for (Raton raton: poblacion.getRatones()) {
                bw.write(raton.getReferencia() + ","
                        + raton.getFechaNacimiento() + ","
                        + raton.getSexo() + ","
                        + raton.getPeso() + ","
                        + raton.getTemperatura() + ","
                        + raton.getTextoLibre() + ","
                        + raton.getCromosoma1() + ","
                        + raton.getCromosoma2());
            }
            
            bw.close();
        } catch (IOException ex){
            System.out.println("No se ha podido leer el fichero " + ex.getMessage());
        }     
        
        
    }
    
    
}
