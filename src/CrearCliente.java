import java.awt.Color;

import javax.swing.JOptionPane;

public class CrearCliente extends javax.swing.JInternalFrame {

    
    public CrearCliente() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_crearcliente = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel_nombrecliente = new javax.swing.JLabel();
        jTextField_crearusuariocliente = new javax.swing.JTextField();
        jLabel_contraseñacliente = new javax.swing.JLabel();
        jPasswordField_crearcontraseñacliente = new javax.swing.JPasswordField();
        button_crearcliente = new java.awt.Button();

        setTitle("SVS 1.0 Crear Cliente");

        jDesktopPane_crearcliente.setBackground(new java.awt.Color(255, 153, 153));
        jDesktopPane_crearcliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Cliente"));

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));

        jLabel_nombrecliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_nombrecliente.setText("Nombre(Usuario)");

        jLabel_contraseñacliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_contraseñacliente.setText("Contraseña");

        button_crearcliente.setLabel("Crear Nuevo Cliente");
        button_crearcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_crearclienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_crearclienteMouseExited(evt);
            }
        });
        button_crearcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_crearclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_crearcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_contraseñacliente)
                    .addComponent(jLabel_nombrecliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_crearusuariocliente)
                    .addComponent(jPasswordField_crearcontraseñacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_crearusuariocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPasswordField_crearcontraseñacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_nombrecliente)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel_contraseñacliente)))
                .addGap(79, 79, 79)
                .addComponent(button_crearcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jDesktopPane_crearcliente.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane_crearclienteLayout = new javax.swing.GroupLayout(jDesktopPane_crearcliente);
        jDesktopPane_crearcliente.setLayout(jDesktopPane_crearclienteLayout);
        jDesktopPane_crearclienteLayout.setHorizontalGroup(
            jDesktopPane_crearclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane_crearclienteLayout.setVerticalGroup(
            jDesktopPane_crearclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane_crearcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_crearcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Interacción con el botón que realiza la creación del cliente
    private void button_crearclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_crearclienteActionPerformed

        String usuarioC = jTextField_crearusuariocliente.getText();
        String contrasenaC = jPasswordField_crearcontraseñacliente.getText();
        
        Cliente clientenuevo = new Cliente(usuarioC, contrasenaC);
        
        JOptionPane.showMessageDialog(null, "El Cliente: " + clientenuevo.usuarioC + "\ny su contraseña: " + clientenuevo.contrasenaC + "\nHa sido agregado al sistema");
        jTextField_crearusuariocliente.setText("");
        jPasswordField_crearcontraseñacliente.setText("");
        
    }//GEN-LAST:event_button_crearclienteActionPerformed
//Interacción con el boton al pasar el mouse encima para que cambie de color
    private void button_crearclienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_crearclienteMouseEntered
        button_crearcliente.setForeground(Color.white);
        button_crearcliente.setBackground(Color.magenta);
    }//GEN-LAST:event_button_crearclienteMouseEntered
//Interacción con el boton al pasar el mouse encima para que cambie de color
    private void button_crearclienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_crearclienteMouseExited
        button_crearcliente.setForeground(Color.black);
        button_crearcliente.setBackground(Color.cyan);
    }//GEN-LAST:event_button_crearclienteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_crearcliente;
    private javax.swing.JDesktopPane jDesktopPane_crearcliente;
    private javax.swing.JLabel jLabel_contraseñacliente;
    private javax.swing.JLabel jLabel_nombrecliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_crearcontraseñacliente;
    private javax.swing.JTextField jTextField_crearusuariocliente;
    // End of variables declaration//GEN-END:variables
}
