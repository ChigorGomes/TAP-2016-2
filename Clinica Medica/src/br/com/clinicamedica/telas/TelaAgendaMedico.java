/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicamedica.telas;

import br.com.clinicamedica.classes.Consulta;
import br.com.clinicamedica.classes.DAO.ConsultaDAO;
import br.com.clinicamedica.classes.DAO.MedicoDAO;
import br.com.clinicamedica.classes.Medico;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * Tela Agenda médica 
 *
 * @author Cícero Higor &lt; chgs@icomp.ufam.edu.br&gt;
 * @version 1.12, 04/01/2017
 */
public class TelaAgendaMedico extends javax.swing.JFrame {

    /**
     * Creates new form TelaAgendaMedico
     */
    MedicoDAO medicoDAO = new MedicoDAO();
    Medico medico = new Medico();
    String codAgendamento;
    ConsultaDAO consultaDAO = new ConsultaDAO();

    Consulta con = new Consulta();
    String dtHoje;
    String status;
    Vector<Medico> listaNome = null;

    public TelaAgendaMedico() {
        initComponents();

        Calendar data = Calendar.getInstance();
        java.util.Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.format(d);

        dtHoje = dateFormat.format(d);
        status = "Em atendimento";

        listaNome = medicoDAO.mostraTodosPersonal();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(listaNome);

        jComboBoxMedico.setModel(modeloCombo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonSeleciona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(135, 206, 235));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Médicos :");

        jComboBoxMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMedicoItemStateChanged(evt);
            }
        });

        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePaciente);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Pacientes:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/confirmar.png"))); // NOI18N
        jButton1.setToolTipText("Atender");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/busca.png"))); // NOI18N
        jButtonBuscar.setToolTipText("Buscar Médico");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldId.setEditable(false);
        jTextFieldId.setBackground(new java.awt.Color(135, 206, 235));
        jTextFieldId.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jTextFieldId.setForeground(new java.awt.Color(135, 206, 235));
        jTextFieldId.setAutoscrolls(false);
        jTextFieldId.setCaretColor(new java.awt.Color(135, 206, 235));
        jTextFieldId.setDisabledTextColor(new java.awt.Color(135, 206, 235));
        jTextFieldId.setEnabled(false);
        jTextFieldId.setSelectedTextColor(new java.awt.Color(135, 206, 235));
        jTextFieldId.setSelectionColor(new java.awt.Color(135, 206, 235));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agenda Médico");

        jButtonSeleciona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSeleciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinicamedica/imagens/Seleciona.png"))); // NOI18N
        jButtonSeleciona.setToolTipText("Selecionar");
        jButtonSeleciona.setEnabled(false);
        jButtonSeleciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jButtonSeleciona))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeleciona))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 420);

        setSize(new java.awt.Dimension(626, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:

        if (jComboBoxMedico.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "informe o médico");
            jButton1.setEnabled(false);
            dispose();
            new TelaAgendaMedico().setVisible(true);

        } else {
            int codigo = consultaDAO.buscaMe(jTextFieldId.getText());

            Vector<Consulta> listaNomes = consultaDAO.consu(dtHoje, status, codigo);
            Vector conjuntoLinhas = new Vector();

            for (Consulta con : listaNomes) {
                Vector linha = new Vector();
                linha.add(con.getIdConsulta());
                linha.add(con.getNomeMed());
                linha.add(con.getNomePac());
                linha.add(con.getDataConsulta());
                linha.add(con.getHorario());
                linha.add(con.getStatus());

                conjuntoLinhas.add(linha);

            }
            Vector conjuntoColunas = new Vector();
            conjuntoColunas.add("ID");
            conjuntoColunas.add("NOME MEDICO");
            conjuntoColunas.add("NOME PACIENTE");
            conjuntoColunas.add("DATA CONSULTA");
            conjuntoColunas.add("HORARIO");
            conjuntoColunas.add("STATUS");

            DefaultTableModel tabela = new DefaultTableModel(conjuntoLinhas, conjuntoColunas);

            jTablePaciente.setModel(tabela);

            jTablePaciente.getColumnModel().getColumn(0).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(4).setResizable(false);

            jTablePaciente.getTableHeader().setReorderingAllowed(false);
            jTablePaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jButton1.setEnabled(false);
            jButtonSeleciona.setEnabled(true);
        }


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jComboBoxMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMedicoItemStateChanged
        String nome = "" + jComboBoxMedico.getModel().getSelectedItem();
        medicoDAO.acessaTabela(medico, nome);

        // jTextFieldId.setText(medico.getEspecialidade());
        jTextFieldId.setText((medico.getNome()));

    }//GEN-LAST:event_jComboBoxMedicoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTablePaciente.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione o paciente");
        } else {

            TelaFormularioProntuario tela = new TelaFormularioProntuario(codAgendamento);
            tela.setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMouseClicked

    }//GEN-LAST:event_jTablePacienteMouseClicked

    private void jButtonSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionaActionPerformed
        // TODO add your handling code here:
        if (jTablePaciente.getSelectedRow() >= 0) {
            codAgendamento = "" + jTablePaciente.getValueAt(jTablePaciente.getSelectedRow(), 0);
            consultaDAO.acessaTabela(con, Integer.parseInt(codAgendamento));
            jButton1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o paciente!");
        }

    }//GEN-LAST:event_jButtonSelecionaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgendaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgendaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSeleciona;
    private javax.swing.JComboBox<String> jComboBoxMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
