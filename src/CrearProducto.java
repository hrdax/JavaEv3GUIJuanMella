import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CrearProducto extends javax.swing.JInternalFrame {
//creación del ArrayList    
ArrayList<Producto> Apro = new ArrayList<Producto>();
    
    public CrearProducto() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_crearproducto = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel_producto = new javax.swing.JLabel();
        jLabel_tipoproducto = new javax.swing.JLabel();
        jTextField_creartipoproducto = new javax.swing.JTextField();
        jTextField_crearnombreproducto = new javax.swing.JTextField();
        button_crearproducto = new java.awt.Button();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setTitle("SVS 1.0 Crear Producto");

        jDesktopPane_crearproducto.setBackground(new java.awt.Color(153, 102, 0));
        jDesktopPane_crearproducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Producto"));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel_producto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_producto.setText("Nombre del producto");

        jLabel_tipoproducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_tipoproducto.setText("Tipo de Producto");

        button_crearproducto.setLabel("Crear Nuevo producto");
        button_crearproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_crearproductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_crearproductoMouseExited(evt);
            }
        });
        button_crearproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_crearproductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_crearproducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_tipoproducto)
                    .addComponent(jLabel_producto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_crearnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_creartipoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_producto)
                    .addComponent(jTextField_crearnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tipoproducto)
                    .addComponent(jTextField_creartipoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(button_crearproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jDesktopPane_crearproducto.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane_crearproductoLayout = new javax.swing.GroupLayout(jDesktopPane_crearproducto);
        jDesktopPane_crearproducto.setLayout(jDesktopPane_crearproductoLayout);
        jDesktopPane_crearproductoLayout.setHorizontalGroup(
            jDesktopPane_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane_crearproductoLayout.setVerticalGroup(
            jDesktopPane_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_crearproducto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_crearproducto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Interacción con el boton al pasar el mouse encima para que cambie de color
    private void button_crearproductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_crearproductoMouseEntered
        button_crearproducto.setForeground(Color.white);
        button_crearproducto.setBackground(Color.magenta);
    }//GEN-LAST:event_button_crearproductoMouseEntered
//Interacción con el boton al pasar el mouse encima para que cambie de color
    private void button_crearproductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_crearproductoMouseExited
        button_crearproducto.setForeground(Color.black);
        button_crearproducto.setBackground(Color.cyan);
    }//GEN-LAST:event_button_crearproductoMouseExited
//Interacción con el botón que realiza la creación del producto
    private void button_crearproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_crearproductoActionPerformed

       
        String nombreP = jTextField_crearnombreproducto.getText();
        String tipoP = jTextField_creartipoproducto.getText();
        
        
        Producto productonuevo = new Producto(nombreP, tipoP);
        
        Apro.add(productonuevo);
        JOptionPane.showMessageDialog(null, "El tamaño de la ArrayList es de: " + Apro.size());
        
    }//GEN-LAST:event_button_crearproductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_crearproducto;
    private javax.swing.JDesktopPane jDesktopPane_crearproducto;
    private javax.swing.JLabel jLabel_producto;
    private javax.swing.JLabel jLabel_tipoproducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_crearnombreproducto;
    private javax.swing.JTextField jTextField_creartipoproducto;
    // End of variables declaration//GEN-END:variables
}
