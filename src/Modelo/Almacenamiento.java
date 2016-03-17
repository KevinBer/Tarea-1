/**
 * Universidad de Costa Rica
 * Programación II, I CICLO 2016
 * Tarea #1
 * Proposito: Clase creadora de los metodos de almacenamiento
 * @author:  Kevin Bermúdez Alvarado (B30957)
 * @version: v.1		
 * @since: 13/03/2016
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author kevin bermudez
 */
public class Almacenamiento{
    
    private ArrayList <Estudiante> arrayEstudiante;

    public Almacenamiento(){
        arrayEstudiante= new ArrayList<>();
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        arrayEstudiante.add(estudiante);
    }
    
    public void eliminarEstudiante(String carnet){
        Estudiante estudianteNull= null;
            
            for(int i=0; i<arrayEstudiante.size(); i++){
                if(arrayEstudiante.get(i).getCarnet().equalsIgnoreCase(carnet)){
                    estudianteNull= arrayEstudiante.get(i);
                    arrayEstudiante.remove(estudianteNull);
                }    
                    
            }
    }
    
    public Estudiante buscarEstudiante(String carnet){
        int posicion=-1;
        
        for(int i=0; i<arrayEstudiante.size(); i++){
            if(arrayEstudiante.get(i).getCarnet().equalsIgnoreCase(carnet)){
                posicion= i;
            }
        }
        if(posicion<0){
            return null;
        }
        else
            return arrayEstudiante.get(posicion);
    }
           
    public void modificarEstudiante(String carnet, String nombre, String correo){
        for(int i=0; i<arrayEstudiante.size(); i++){
            if(arrayEstudiante.get(i).getCarnet().equalsIgnoreCase(carnet)){
                arrayEstudiante.get(i).setNombre(nombre);
                arrayEstudiante.get(i).setCorreo(correo);
            }
        } 
    }
    
}
