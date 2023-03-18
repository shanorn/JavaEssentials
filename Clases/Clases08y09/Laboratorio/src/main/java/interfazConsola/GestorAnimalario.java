/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazConsola;

import almacenamiento.PoblacionFile;
import java.awt.BorderLayout;
import java.io.File;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import logicaNegocio.Poblacion;
import logicaNegocio.Sexo;

/**
 *
 * @author zerox
 */
public class GestorAnimalario {
    private Poblacion poblacionActual;
    private PoblacionFile fichero;
    
    public GestorAnimalario(){
        poblacionActual = null;
        fichero = null;
    }
    
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 10){
            printMenuPrincipal();
            opcion = Integer.parseInt(sc.nextLine());
            
            switch (opcion) {
                case 1:
                    
                    System.out.println("Por favor introduzca el nombre del fichero: ");
                    String nombre = sc.nextLine();
                    fichero = new PoblacionFile(nombre);
                    try {
                        this.poblacionActual = fichero.leerPoblacion();
                    } catch (Exception ex){
                        System.out.println("No existe el fichero: " + ex.getMessage());
                    }    
                        
                    break;
                case 2:
                    crearNuevaPoblacion();
                    break;    
                case 3:
                    leerYAnadirRaton(); 
                    break;
                case 4: 
                    this.poblacionActual.listarReferencias();
                    break;
                case 5: 
                    
                    System.out.println("Por favor introduzca la referencia: ");
                    String referencia = sc.nextLine();
                    this.poblacionActual.eliminarRaton(referencia);
                    
                    
                    break;
                case 6:
                    System.out.println("Introduzca la referencia del raton a modificar: ");
                    referencia = sc.nextLine();
                    System.out.println("Introduzca la fecha de nacimiento (dd/mm/aaaa): ");
                    String fechaString = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha;
                    try {
                        fecha = sdf.parse(fechaString);
                    
                    
                        System.out.println("Introduzca el sexo macho(m)/hembra(h)");
                        char s = sc.nextLine().charAt(0);
                        Sexo sexo = s == 'h'?Sexo.HEMBRA:Sexo.MACHO;
                        System.out.println("Introduzca el peso (g)");
                        int peso = Integer.parseInt(sc.nextLine());
                        System.out.println("Introduzca la temperatura");
                        float temperatura = Float.parseFloat(sc.nextLine());
                        System.out.println("Introduzca el texto");
                        String texto = sc.nextLine();
                        System.out.println("¿Tiene mutación en el gen 1 (X)?");
                        char mut1 = sc.nextLine().charAt(0);
                        boolean m1 = mut1 == 's'?true:false;
                        boolean m2;
                        if (sexo == Sexo.MACHO){
                            System.out.println("¿Tiene mutación en el gen 2 (Y)?");
                            char mut2 = sc.nextLine().charAt(0);
                            m2 = mut2 == 's'?true:false;
                        } else {
                            System.out.println("¿Tiene mutación en el gen 2 (X)?");
                            char mut2 = sc.nextLine().charAt(0);
                            m2 = mut2 == 's'?true:false;
                        }
                        this.poblacionActual.modificarRaton(referencia, fecha, sexo, peso, temperatura, texto, m1,m2);
                    } catch (ParseException ex) {
                        Logger.getLogger(GestorAnimalario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NullPointerException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Por favor introduzca la referencia: ");
                    referencia = sc.nextLine();
                    this.poblacionActual.mostrarDetalleRaton(referencia);
                    break;
                case 8:
                    if (fichero != null){
                        fichero.guardarPoblacion(poblacionActual);
                    } else {
                        System.out.println("Por favor introduzca el nombre del fichero: ");
                        String nombreGuardar = sc.nextLine();
                        fichero = new PoblacionFile(nombreGuardar);
                        fichero.guardarPoblacionComo(poblacionActual, nombreGuardar);
                    }
                    break;
                case 9:
                    System.out.println("Por favor introduzca el nombre del fichero: ");
                    String nombreGuardar = sc.nextLine();
                    fichero.guardarPoblacionComo(poblacionActual, nombreGuardar);
                    break;
            }
        }
    }
    
    
    private void printMenuPrincipal(){
        System.out.println("Seleccione una opción: ");
        System.out.println("-----------------------");
        System.out.println("1. Abrir población en formato CSV.");
        System.out.println("2. Crear una nueva población de ratones.");
        System.out.println("3. Añadir un nuevo raton a la población existente.");
        System.out.println("4. Listar los códigos de los ratones de la poblacion");
        System.out.println("5. Eliminar una raton de la población indicando su código");
        System.out.println("6. Modificar los datos de un raton dado su código");
        System.out.println("7. Ver información detallada de un raton dado su código");
        System.out.println("8. Guardar");
        System.out.println("9. Guardar cómo");
        System.out.println("10. Salir");
    }

    private void leerYAnadirRaton() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduzca la referencia del nuevo ratón: ");
            String referencia = sc.nextLine();
            System.out.println("Introduzca la fecha de nacimiento (dd/mm/aaaa): ");
            String fechaString = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha;
            fecha = sdf.parse(fechaString);
            System.out.println("Introduzca el sexo macho(m)/hembra(h)");
            char s = sc.nextLine().charAt(0);
            Sexo sexo = s == 'h'?Sexo.HEMBRA:Sexo.MACHO;
            System.out.println("Introduzca el peso (g)");
            int peso = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca la temperatura");
            float temperatura = Float.parseFloat(sc.nextLine());
            System.out.println("Introduzca el texto");
            String texto = sc.nextLine();
            System.out.println("¿Tiene mutación en el gen 1 (X)?");
            char mut1 = sc.nextLine().charAt(0);
            boolean m1 = mut1 == 's'?true:false;
            boolean m2;
            if (sexo == Sexo.MACHO){
                System.out.println("¿Tiene mutación en el gen 2 (Y)?");
                char mut2 = sc.nextLine().charAt(0);
                m2 = mut2 == 's'?true:false;
            } else {
                System.out.println("¿Tiene mutación en el gen 2 (X)?");
                char mut2 = sc.nextLine().charAt(0);
                m2 = mut2 == 's'?true:false;
            }
            poblacionActual.anadirRaton(referencia, fecha, sexo, peso, temperatura, texto, m1, m2);
        } catch (ParseException ex) {
            Logger.getLogger(GestorAnimalario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearNuevaPoblacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la población:");
        String nombrePoblacion = sc.nextLine();
        System.out.println("Introduzca el nombre del responsable:");
        String nombreResponsable = sc.nextLine();

        System.out.println("Introduzca el numero de días que lleva en la instalación:");
        int numeroDias = Integer.parseInt(sc.nextLine());
        // Si ya había una poblacion cargada se perderá
        try {
            this.poblacionActual = new Poblacion(nombrePoblacion, nombreResponsable, numeroDias);
            System.out.println("Se ha creado correctamente la población");
        } catch (IllegalArgumentException ex){
            System.out.println("No se ha creado la poblacion. " + ex.getMessage());
        }
    }
    
    
}
