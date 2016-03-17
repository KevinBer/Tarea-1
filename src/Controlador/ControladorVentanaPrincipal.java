/**
 * Universidad de Costa Rica
 * Programación II, I CICLO 2016
 * Tarea #1
 * Proposito: Clase controladora de la ventana principal
 * @author:  Kevin Bermúdez Alvarado (B30957)
 * @version: v.1		
 * @since: 13/03/2016
 */
package Controlador;

/**
 *
 * @author estudiante
 */
import Vista.ManipulaEstudiantes;
import com.sun.org.apache.xerces.internal.util.DOMUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVentanaPrincipal implements ActionListener{
    
    private ManipulaEstudiantes manipulaEstudiantes;

    public ControladorVentanaPrincipal(){
        this.manipulaEstudiantes = new ManipulaEstudiantes();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Manipular Estudiantes")){
            manipulaEstudiantes.setVisible(true);
        }
                    
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
        
    }
    
}
