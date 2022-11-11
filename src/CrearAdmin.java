import java.awt.Color;
import javax.swing.JOptionPane;
public class CrearAdmin extends javax.swing.JInternalFrame {

    
    public CrearAdmin() {
        initComponents();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_crearadmin = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_crearusuarioadmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField_crearcontraseñaadmin = new javax.swing.JPasswordField();
        button_crearadministrador = new java.awt.Button();

        setBorder(javax.swing.BorderFactory.createTitledBorder("SVS 1.0 Crear Administrador"));
        setTitle("SVS 1.0 Crear Administrador");

        jDesktopPane_crearadmin.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane_crearadmin.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear nuevo administrador"));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre(Usuario):");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        button_crearadministrador.setLabel("Crear Nuevo Administrador");
        button_crearadministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_crearadministradorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_crearadministradorMouseExited(evt);
            }
        });
        button_crearadministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_crearadministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_crearadministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_crearusuarioadmin)
                    .addComponent(jPasswordField_crearcontraseñaadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_crearusuarioadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField_crearcontraseñaadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(button_crearadministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jDesktopPane_crearadmin.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane_crearadminLayout = new javax.swing.GroupLayout(jDesktopPane_crearadmin);
        jDesktopPane_crearadmin.setLayout(jDesktopPane_crearadminLayout);
        jDesktopPane_crearadminLayout.setHorizontalGroup(
            jDesktopPane_crearadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane_crearadminLayout.setVerticalGroup(
            jDesktopPane_crearadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane_crearadminLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_crearadmin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_crearadmin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Interacción con el botón que realiza la creación del administrador
    private void button_crearadministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_crearadministradorActionPerformed
        
        
        String usuarioA = jTextField_crearusuarioadmin.getText();
        String contrasenaA = jPasswordField_crearcontraseñaadmin.getText();
        
        Admin adminnuevo = new Admin(usuarioA, contrasenaA);
        
        JOptionPane.showMessageDialog(null, "El Administrador: " + adminnuevo.getUsuarioA()+ "\ny su contraseña: " + adminnuevo.getContrasenaA() + "\nHa sido agregado al sistema");
        jTextField_crearusuarioadmin.setText("");
        jPasswordField_crearcontraseñaadmin.setText("");
        
        
    }//GEN-LAST:event_button_crearadministradorActionPerformed
//Interacción con el boton al pasar el mouse encima para que cambie de color
    private void button_crearadministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_crearadministradorMouseEntered
        button_crearadministrador.setForeground(Color.white);
        button_crearadministrador.setBackground(Color.magenta);
    }//GEN-LAST:event_button_crearadministradorMouseEntered
//Interacción con el boton al pasar el mouse encima para que cambie de color
    private void button_crearadministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_crearadministradorMouseExited
        button_crearadministrador.setForeground(Color.black);
        button_crearadministrador.setBackground(Color.cyan);
    }//GEN-LAST:event_button_crearadministradorMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_crearadministrador;
    private javax.swing.JDesktopPane jDesktopPane_crearadmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_crearcontraseñaadmin;
    private javax.swing.JTextField jTextField_crearusuarioadmin;
    // End of variables declaration//GEN-END:variables
}
