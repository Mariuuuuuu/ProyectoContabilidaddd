/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;


/**
 *
 * 
 * @author CRISTAL ORTEGA
 */
public class Login extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

   
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
         txtContrasenaUser.setEchoChar('•');
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelIngresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIngresarUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtContrasenaUser = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        MostrarContraseña = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 170, 940, -1));

        PanelIngresar.setBackground(new java.awt.Color(255, 255, 255));
        PanelIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        PanelIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Iniciar sesión");
        PanelIngresar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ingrese su nombre de usuario");
        PanelIngresar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtIngresarUser.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtIngresarUser.setName("txtIngresarUser"); // NOI18N
        txtIngresarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarUserActionPerformed(evt);
            }
        });
        PanelIngresar.add(txtIngresarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 192, -1));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Ingrese su contraseña");
        PanelIngresar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        txtContrasenaUser.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtContrasenaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaUserActionPerformed(evt);
            }
        });
        PanelIngresar.add(txtContrasenaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 192, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 153));
        btnIngresar.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setName("btnIngresar"); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        PanelIngresar.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 100, 40));

        MostrarContraseña.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        MostrarContraseña.setText("Mostrar contraseña");
        MostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraseñaActionPerformed(evt);
            }
        });
        PanelIngresar.add(MostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        getContentPane().add(PanelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContraseñaActionPerformed
        if (MostrarContraseña.isSelected()) {
            txtContrasenaUser.setEchoChar((char) 0); // Muestra la contraseña
        } else {
            txtContrasenaUser.setEchoChar('•'); // Oculta la contraseña (puedes usar '*')
        }
    }//GEN-LAST:event_MostrarContraseñaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String usuario = txtIngresarUser.getText().trim(); //e trim para lo de los espacios vacios
        String contrasena = String.valueOf(txtContrasenaUser.getPassword()).trim();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return;
        }

        File archivo = new File("usuarios.txt");

        try {

            if (!archivo.exists()) {
                archivo.createNewFile();
                FileWriter escribir = new FileWriter(archivo);
                escribir.write("Cristal;1501;0;Cristal;Ortega;cristalortega@gmail.com\n");
                escribir.close();
            }

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";"); // Asi leo los datos por linea y encuentro los 3 que necesito

                if (datos.length >= 3) {

                    String user = datos[0]; //usuario
                    String pass = datos[1]; //contrasena
                    String tipo = datos[2];  // el nivel

                    if (usuario.equals(user) && contrasena.equals(pass)) {

                        encontrado = true;

                        JOptionPane.showMessageDialog(this, "Bienvenido/a " + user);

                        MenuPrincipal menu = new MenuPrincipal(tipo); //para guardar el nivel de usuario y asi abrir el menu
                        menu.setVisible(true);

                        this.dispose();
                        break;
                    }
                }
            }

            br.close();

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContrasenaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaUserActionPerformed

    private void txtIngresarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarUserActionPerformed
       txtContrasenaUser.requestFocus();
    }//GEN-LAST:event_txtIngresarUserActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox MostrarContraseña;
    private javax.swing.JPanel PanelIngresar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasenaUser;
    private javax.swing.JTextField txtIngresarUser;
    // End of variables declaration//GEN-END:variables
}
