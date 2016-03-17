/**
 * Universidad de Costa Rica
 * Programación II, I CICLO 2016
 * Tarea #1
 * Proposito: Clase que crea un estudiante
 * @author:  Kevin Bermúdez Alvarado (B30957)
 * @version: v.1		
 * @since: 13/03/2016
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Estudiante {
    private String nombre;
    private String carnet;
    private String correo;

    public Estudiante(String nombre, String carnet, String correo) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.correo = correo;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
        
}
