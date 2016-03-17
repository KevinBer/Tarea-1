/**
 * Universidad de Costa Rica
 * Programación II, I CICLO 2016
 * Tarea #1
 * Proposito: Clase crontoladora de los estudiantes
 * @author:  Kevin Bermúdez Alvarado (B30957)
 * @version: v.1		
 * @since: 13/03/2016
 */
package Controlador;

import Modelo.Almacenamiento;
import Vista.ManipulaEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class ControladorManipulaEstudiante implements ActionListener{

    public final static int CARNET=1;
    public final static int NOMBRE=2;
    public final static int CORREO=3;
    public final static int AGREGAR=4;
    public final static int BUSCAR=5;
    public final static int EDITAR=6;
    public final static int ELIMINAR=7;
    private Almacenamiento almacenamiento;
    
    private ManipulaEstudiantes manipulaEstudiantes;

    public ControladorManipulaEstudiante(ManipulaEstudiantes ManipulaEstudiantes) {
        this.manipulaEstudiantes = ManipulaEstudiantes;
        almacenamiento= new Almacenamiento();
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e){
        int codigo= this.manipulaEstudiantes.getCodigoPorFuente(e.getSource());
         
        switch(codigo){
            case AGREGAR:
                if(manipulaEstudiantes.getTxtField()==false){
                    if(almacenamiento.buscarEstudiante(manipulaEstudiantes.getCarnet())==null){
                        almacenamiento.agregarEstudiante(manipulaEstudiantes.getEstudiante());
                        JOptionPane.showMessageDialog(null, "Guardado con exito");
                }else{
                    JOptionPane.showMessageDialog(null, "Ya existe un estudiante con este carnet");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los datos");
                }
            break;
                   
            case ELIMINAR:
                if(almacenamiento.buscarEstudiante(manipulaEstudiantes.getCarnet())!=null)
            {
                almacenamiento.eliminarEstudiante(manipulaEstudiantes.getCarnet());
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No existe un estudiante con este carnet");
            }
            break;
            
            case BUSCAR:
                if(almacenamiento.buscarEstudiante(manipulaEstudiantes.getCarnet())!=null){
                    manipulaEstudiantes.setEstudiante(almacenamiento.buscarEstudiante(manipulaEstudiantes.getCarnet()).getNombre(), almacenamiento.buscarEstudiante(manipulaEstudiantes.getCarnet()).getCarnet(), almacenamiento.buscarEstudiante(manipulaEstudiantes.getCarnet()).getCorreo());
                
                }else{
                    JOptionPane.showMessageDialog(null, "No existe un estudiante con este carnet");
                }
            break;
                
            case EDITAR:
                if(almacenamiento.buscarEstudiante(manipulaEstudiantes.getCarnet())!=null){
                    almacenamiento.modificarEstudiante(manipulaEstudiantes.getCarnet(), manipulaEstudiantes.getNombre(), manipulaEstudiantes.getCorreo()); 
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                
                }else{
                    JOptionPane.showMessageDialog(null, "No existe un estudiante con este carnet");
                }
            break;
        }
    }
}