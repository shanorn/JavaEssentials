/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazConsola;

import almacenamiento.PoblacionFile;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DateFormatter;
import logicaNegocio.Poblacion;
import logicaNegocio.Sexo;

/**
 *
 * @author zerox
 */
public class GestorAnimalario {
    Poblacion poblacionActual;
    PoblacionFile fichero;
    
    public GestorAnimalario(){
        poblacionActual = null;
        fichero = new PoblacionFile("Prueba.csv");
    }
    
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 10){
            printMenuPrincipal();
            opcion = Integer.parseInt(sc.nextLine());
            
            switch (opcion) {
                case 1:
                    System.out.println("Not implemented yet.");
                    break;
                case 2:
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
                    break;    
                case 3:
                    
                    try {
                        System.out.println("Introduzca la referencia del nuevo ratón: ");
                        String referencia = sc.nextLine();
                        System.out.println("Introduzca la fecha de nacimiento (dd/mm/aaaa): ");
                        String fechaString = sc.nextLine();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha;
                        fecha = sdf.parse(fechaString);
                        System.out.println("Introduzca el sexo m/h");
                        char s = sc.nextLine().charAt(0);
                        Sexo sexo = s == 'h'?Sexo.HEMBRA:Sexo.MACHO;
                        System.out.println("Introduzca el peso (g)");
                        int peso = Integer.parseInt(sc.nextLine());
                        System.out.println("Introduzca la temperatura");
                        float temperatura = Float.parseFloat(fechaString);
                        System.out.println("Introduzca el texto");
                        String texto = sc.nextLine();
                        poblacionActual.anadirRaton(referencia, fecha, sexo, peso, temperatura, texto);
                    } catch (ParseException ex) {
                        Logger.getLogger(GestorAnimalario.class.getName()).log(Level.SEVERE, null, ex);
                    } 

                    break;


                case 8:
                    fichero.guardarPoblacion(poblacionActual);
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
    
    
}
