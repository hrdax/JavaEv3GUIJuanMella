
public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_Menu = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_administrar = new javax.swing.JMenu();
        jMenuItem_admins = new javax.swing.JMenuItem();
        jMenuItem_clientes = new javax.swing.JMenuItem();
        jMenuItem_productos = new javax.swing.JMenuItem();
        jMenuItem_roles = new javax.swing.JMenuItem();
        jMenu_opciones = new javax.swing.JMenu();
        jMenuItem_cerrarsesion = new javax.swing.JMenuItem();
        jMenuItem_cerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane_Menu.setBackground(new java.awt.Color(0, 153, 51));

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jDesktopPane_Menu.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane_MenuLayout = new javax.swing.GroupLayout(jDesktopPane_Menu);
        jDesktopPane_Menu.setLayout(jDesktopPane_MenuLayout);
        jDesktopPane_MenuLayout.setHorizontalGroup(
            jDesktopPane_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane_MenuLayout.setVerticalGroup(
            jDesktopPane_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu_administrar.setText("Administración");

        jMenuItem_admins.setText("Gestión de administradores");
        jMenuItem_admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_adminsActionPerformed(evt);
            }
        });
        jMenu_administrar.add(jMenuItem_admins);

        jMenuItem_clientes.setText("Gestión de clientes");
        jMenuItem_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_clientesActionPerformed(evt);
            }
        });
        jMenu_administrar.add(jMenuItem_clientes);

        jMenuItem_productos.setText("Gestión de productos");
        jMenuItem_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_productosActionPerformed(evt);
            }
        });
        jMenu_administrar.add(jMenuItem_productos);

        jMenuItem_roles.setText("Gestión de perfiles");
        jMenuItem_roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_rolesActionPerformed(evt);
            }
        });
        jMenu_administrar.add(jMenuItem_roles);

        jMenuBar1.add(jMenu_administrar);

        jMenu_opciones.setText("Opciones");

        jMenuItem_cerrarsesion.setText("Cerrar sesión");
        jMenuItem_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrarsesionActionPerformed(evt);
            }
        });
        jMenu_opciones.add(jMenuItem_cerrarsesion);

        jMenuItem_cerrar.setText("Cerrar/Apagar");
        jMenuItem_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrarActionPerformed(evt);
            }
        });
        jMenu_opciones.add(jMenuItem_cerrar);

        jMenuBar1.add(jMenu_opciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_Menu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_Menu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrarsesionActionPerformed
        Login ventana = new Login();
        ventana.show();
        this.hide();
    }//GEN-LAST:event_jMenuItem_cerrarsesionActionPerformed

    private void jMenuItem_adminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_adminsActionPerformed
        CrearAdmin crear_admin = new CrearAdmin();
        jDesktopPane_Menu.add(crear_admin);
        crear_admin.setVisible(true);
        crear_admin.setClosable(true);
    }//GEN-LAST:event_jMenuItem_adminsActionPerformed

    private void jMenuItem_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_clientesActionPerformed
        CrearCliente crear_cliente = new CrearCliente();
        jDesktopPane_Menu.add(crear_cliente);
        crear_cliente.setVisible(true);
        crear_cliente.setClosable(true);
    }//GEN-LAST:event_jMenuItem_clientesActionPerformed

    private void jMenuItem_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_productosActionPerformed
       
        CrearProducto crear_producto = new CrearProducto();
        jDesktopPane_Menu.add(crear_producto);
        crear_producto.setVisible(true);
        crear_producto.setClosable(true);
        
        
        
    }//GEN-LAST:event_jMenuItem_productosActionPerformed

    private void jMenuItem_rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_rolesActionPerformed
        CrearPerfil crear_perfil = new CrearPerfil();
        jDesktopPane_Menu.add(crear_perfil);
        crear_perfil.setVisible(true);
        crear_perfil.setClosable(true);
    }//GEN-LAST:event_jMenuItem_rolesActionPerformed

    private void jMenuItem_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane_Menu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_admins;
    private javax.swing.JMenuItem jMenuItem_cerrar;
    private javax.swing.JMenuItem jMenuItem_cerrarsesion;
    private javax.swing.JMenuItem jMenuItem_clientes;
    private javax.swing.JMenuItem jMenuItem_productos;
    private javax.swing.JMenuItem jMenuItem_roles;
    private javax.swing.JMenu jMenu_administrar;
    private javax.swing.JMenu jMenu_opciones;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
