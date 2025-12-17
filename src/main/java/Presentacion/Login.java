/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Utilidades.Sesion;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelIngresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIngresarUser = new javax.swing.JTextField();
        txtContrasenaUser = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        MostrarContraseña = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("sistema de confianza");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, 80));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Inicia sesión en tu ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 870, 660));

        PanelIngresar.setBackground(new java.awt.Color(255, 255, 255));
        PanelIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        txtContrasenaUser.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        txtContrasenaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaUserActionPerformed(evt);
            }
        });
        PanelIngresar.add(txtContrasenaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 192, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 153));
        btnIngresar.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setName("btnIngresar"); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        PanelIngresar.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 100, 40));

        MostrarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        MostrarContraseña.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        MostrarContraseña.setText("Mostrar contraseña");
        MostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraseñaActionPerformed(evt);
            }
        });
        PanelIngresar.add(MostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingrese su contraseña");
        PanelIngresar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        getContentPane().add(PanelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -20, 340, 700));

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
             Sesion.tipoUsuario = tipo;

           MenuPrincipal menu = new MenuPrincipal();
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasenaUser;
    private javax.swing.JTextField txtIngresarUser;
    // End of variables declaration//GEN-END:variables
}
