/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import logicaNegocio.Poblacion;
import logicaNegocio.Raton;
import logicaNegocio.Sexo;

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
    
    private void setFichero(String nombreFichero){
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
                        + raton.getCromosoma2() + "\n");
            }
            
            bw.close();
        } catch (IOException ex){
            System.out.println("No se ha podido leer el fichero " + ex.getMessage());
        }     
        
        
    }
    
    public void guardarPoblacionComo(Poblacion poblacion, String nombreFichero){        
        setFichero(nombreFichero);
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
                        + raton.getCromosoma2() + "\n");
            }
            
            bw.close();
        } catch (IOException ex){
            System.out.println("No se ha podido leer el fichero " + ex.getMessage());
        }     
        
        
    }
    
    public Poblacion leerPoblacion(){
        Poblacion carga = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String nombrePoblacion = br.readLine();
            nombrePoblacion = nombrePoblacion.substring("Nombre: ".length());
            String nombreResponsable = br.readLine();
            nombreResponsable = nombreResponsable.substring("Responsable: ".length());
            String lecturaDias = br.readLine();
            lecturaDias = lecturaDias.substring("Numero de dias en instalacion: ".length());
            int numeroDiasInstalacion = Integer.parseInt(lecturaDias);
            
            carga = new Poblacion(nombrePoblacion, nombreResponsable, numeroDiasInstalacion);
            String linea;
            while ((linea = br.readLine()) != null ){
                String[] partes = linea.split(",");
                String referencia = partes[0];
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = sdf.parse(partes[1]);
                Sexo sexo = partes[2].equals("MACHO")?Sexo.MACHO:Sexo.HEMBRA;
                int peso = Integer.parseInt(partes[3]);
                float temperatura = Float.parseFloat(partes[4]);
                String textoLibre = partes[5];
                boolean cromosoma1 = partes[6].substring("Cromosoma X - Mutacion: ".length()).equals("Normal")?false:true;
                boolean cromosoma2 = partes[7].substring("Cromosoma X - Mutacion: ".length()).equals("Normal")?false:true;
                
                carga.anadirRaton(referencia, fecha, sexo, peso, temperatura, textoLibre, cromosoma1, cromosoma2);
            }
            
            br.close();
        } catch (IOException ex) {
            System.out.println("Error al cargar el fichero: " + ex.getMessage());
        } catch (ParseException ex){
            System.out.println("Error al convertir la fecha: " + ex.getMessage());
        }
        
        return carga;
        
        
    }
}
