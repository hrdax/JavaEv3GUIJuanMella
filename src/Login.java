//importación de librerías utilizadas
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {

   
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_login = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel_usuario = new javax.swing.JLabel();
        jLabel_Contraseña = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jPasswordField_contraseña = new javax.swing.JPasswordField();
        jButton_iniciarsesion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_opcionesapagado = new javax.swing.JMenu();
        jMenuItem_apagar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane_login.setBackground(new java.awt.Color(51, 153, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel_usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_usuario.setText("Usuario");

        jLabel_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Contraseña.setText("Contraseña");

        jButton_iniciarsesion.setText("IniciarSesión");
        jButton_iniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_iniciarsesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_iniciarsesionMouseExited(evt);
            }
        });
        jButton_iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Contraseña)
                            .addComponent(jLabel_usuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton_iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_usuario)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Contraseña)
                    .addComponent(jPasswordField_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jButton_iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jDesktopPane_login.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane_loginLayout = new javax.swing.GroupLayout(jDesktopPane_login);
        jDesktopPane_login.setLayout(jDesktopPane_loginLayout);
        jDesktopPane_loginLayout.setHorizontalGroup(
            jDesktopPane_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane_loginLayout.setVerticalGroup(
            jDesktopPane_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu_opcionesapagado.setText("Opciones");

        jMenuItem_apagar.setText("Cerrar/Apagar");
        jMenuItem_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_apagarActionPerformed(evt);
            }
        });
        jMenu_opcionesapagado.add(jMenuItem_apagar);

        jMenuBar1.add(jMenu_opcionesapagado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_login)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_login)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Interacción con el boton al pasar el mouse encima para que cambie de color
    private void jButton_iniciarsesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_iniciarsesionMouseExited
        jButton_iniciarsesion.setForeground(Color.white);
        jButton_iniciarsesion.setBackground(Color.green);
    }//GEN-LAST:event_jButton_iniciarsesionMouseExited
    //Interacción con el boton al pasar el mouse encima para que cambie de color
    private void jButton_iniciarsesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_iniciarsesionMouseEntered
        jButton_iniciarsesion.setForeground(Color.gray);
        jButton_iniciarsesion.setBackground(Color.black);
    }//GEN-LAST:event_jButton_iniciarsesionMouseEntered
    //Interacción con el botón que realiza el proceso de inicio de sesión
    private void jButton_iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iniciarsesionActionPerformed
       String usuario = jTextField_usuario.getText();
       String contrasena = jPasswordField_contraseña.getText();
       //JOptionPane.showMessageDialog(null, usuario + contrasena);
       if (usuario.equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese un usuario");
        }
        if (contrasena.equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese una contraseña");
        }else if(usuario.equals("admin") && contrasena.equals("4321")){
            JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
            MenuPrincipal ventana = new MenuPrincipal();
            ventana.show();
            this.hide();
        }else{
            JOptionPane.showMessageDialog(null, "Acceso Incorrecto");
            jPasswordField_contraseña.setText("");
            
            
        }
       
    }//GEN-LAST:event_jButton_iniciarsesionActionPerformed
//menu item que apaga el programa
    private void jMenuItem_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_apagarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_apagarActionPerformed
/*Fuente que me ayudo a saber como apagar/cerrar una aplicación en netbeans mediante código
https://lineadecodigo.com/java/finalizar-un-programa-java/ */

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_iniciarsesion;
    private javax.swing.JDesktopPane jDesktopPane_login;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_apagar;
    private javax.swing.JMenu jMenu_opcionesapagado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_contraseña;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
