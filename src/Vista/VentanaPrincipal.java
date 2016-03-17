/**
 * Universidad de Costa Rica
 * Programación II, I CICLO 2016
 * Tarea #1
 * Proposito: Clase creadora de la ventana principal
 * @author:  Kevin Bermúdez Alvarado (B30957)
 * @version: v.1		
 * @since: 13/03/2016
 */
package Vista;

import Controlador.ControladorVentanaPrincipal;

/**
 *
 * @author estudiante
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorVentanaPrincipal controladorVentanaPrincipal;
    
    public VentanaPrincipal(){
        initComponents();
        this.controladorVentanaPrincipal= new ControladorVentanaPrincipal();
        this.jItemSalir.addActionListener(controladorVentanaPrincipal);
        this.jItemManipularEstudiante.addActionListener(controladorVentanaPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jItemSalir = new javax.swing.JMenuItem();
        jMenuEstudiantes = new javax.swing.JMenu();
        jItemManipularEstudiante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        lblFondo.setText("jLabel1");

        jMenuArchivo.setText("Archivo");

        jItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jItemSalir.setText("Salir");
        jMenuArchivo.add(jItemSalir);

        menuPrincipal.add(jMenuArchivo);

        jMenuEstudiantes.setText("Estudiantes");

        jItemManipularEstudiante.setText("Manipular Estudiantes");
        jMenuEstudiantes.add(jItemManipularEstudiante);

        menuPrincipal.add(jMenuEstudiantes);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jItemManipularEstudiante;
    private javax.swing.JMenuItem jItemSalir;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuEstudiantes;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
