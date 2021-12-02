
/**
 *  Descripción de un estudiante
 * 
 * @author - Roberto Murga
 * @version Version2
 */
public class Estudiante
{
    private String nombre;
    private int nota;
     

    /**
     * Constructor  
     */
    public Estudiante(String queNombre, int queNota)    {
        nombre = queNombre;
        nota = queNota;
         
    }

    /**
     * 
     */
    public String getNombre() {
        return nombre;
         
    }
    
    
     /**
     * 
     */
    public int getNota() {
        return nota;
         
    }
    
    /**
     * 
     */
    public void printEstudiante() {
        System.out.println("Nombre: " + nombre +
                "\nNota: " + nota);

    }

}
