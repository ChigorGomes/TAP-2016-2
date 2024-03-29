/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicamedica.telas;

import br.com.clinicamedica.classes.DAO.UsuarioDAO;
import br.com.clinicamedica.classes.Usuario;
import javax.swing.JOptionPane;

/**
 * Tela Login Usuário
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class TelaLoginUsuario extends javax.swing.JFrame {

    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario user = new Usuario();

    /**
     * Creates new form TelaLoginAdministrador
     */
    public TelaLoginUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldSenhaAdministrador = new javax.swing.JPasswordField();
        jButtonLogarAtendente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        jLabel3.setMaximumSize(new java.awt.Dimension(63, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(63, 17));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 50, 146, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 140, 160, 18);

        jTextFieldLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldLogin);
        jTextFieldLogin.setBounds(310, 160, 150, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Senha");
        jLabel2.setMaximumSize(new java.awt.Dimension(36, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(36, 14));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 200, 136, 14);

        jPasswordFieldSenhaAdministrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldSenhaAdministrador.setToolTipText("Tamanho máximo senha (20)");
        getContentPane().add(jPasswordFieldSenhaAdministrador);
        jPasswordFieldSenhaAdministrador.setBounds(310, 220, 150, 30);

        jButtonLogarAtendente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogarAtendente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogarAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/login.jpg"))); // NOI18N
        jButtonLogarAtendente.setToolTipText("Entrar");
        jButtonLogarAtendente.setBorder(null);
        jButtonLogarAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarAtendenteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogarAtendente);
        jButtonLogarAtendente.setBounds(340, 260, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/Capturar.JPG"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 10, 250, 110);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/icon_expert.png"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.setToolTipText("Médico");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 80, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/icone-atendente.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setToolTipText("Atendente");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 80, 50, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/Apps-preferences-desktop-cryptography-icon.png"))); // NOI18N
        jLabel8.setText("jLabel1");
        jLabel8.setToolTipText("Administrador");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 70, 50, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/fondo-azul,-lineas-206492.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-130, -20, 930, 720);

        setSize(new java.awt.Dimension(551, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogarAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarAtendenteActionPerformed
        int flag = 0;
        try {
            if (jTextFieldLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o usuário!");
                jTextFieldLogin.requestFocus();
                flag = 1;
            } else if (new String(jPasswordFieldSenhaAdministrador.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a senha!");
                jPasswordFieldSenhaAdministrador.requestFocus();
                flag++;
            }
            if (flag == 0) {
                user.setUsuario(jTextFieldLogin.getText());
                user.setSenha(new String(jPasswordFieldSenhaAdministrador.getPassword()));
                boolean acesso = usuarioDAO.acessar(user);
                if (acesso == true) {
                    new TelaPrincipal(jTextFieldLogin.getText()).setVisible(true);
                    dispose();
                } else {
                    jTextFieldLogin.setText("");
                    jTextFieldLogin.requestFocus();
                    jPasswordFieldSenhaAdministrador.setText("");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonLogarAtendenteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogarAtendente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordFieldSenhaAdministrador;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
