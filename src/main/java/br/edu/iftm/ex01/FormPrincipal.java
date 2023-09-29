/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.iftm.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IFTM
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    
    GerenciaPessoa gerpes = new GerenciaPessoa();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FormPrincipal() {
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

        grpSexo = new javax.swing.ButtonGroup();
        jlaTitulo = new javax.swing.JLabel();
        jlaNome = new javax.swing.JLabel();
        jtfTextoNome = new javax.swing.JTextField();
        jlaSexo = new javax.swing.JLabel();
        jrbMasc = new javax.swing.JRadioButton();
        jrbFem = new javax.swing.JRadioButton();
        jlaDataNasc = new javax.swing.JLabel();
        jlaCep = new javax.swing.JLabel();
        jtfTextoCep = new javax.swing.JTextField();
        jlaUniFed = new javax.swing.JLabel();
        jcbUniFeds = new javax.swing.JComboBox<>();
        jlaGostos = new javax.swing.JLabel();
        jcbMusica = new javax.swing.JCheckBox();
        jcbFilmes = new javax.swing.JCheckBox();
        jcbBaladas = new javax.swing.JCheckBox();
        jcbBeber = new javax.swing.JCheckBox();
        jlaResumo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaResumo = new javax.swing.JTextArea();
        jlaLista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPessoas = new javax.swing.JTable();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        dpDataNasc = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlaTitulo.setText("Agenda de Pessoas e Endereços");
        jlaTitulo.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jlaTitulo.setForeground(new java.awt.Color(75, 0, 200));

        jlaNome.setText("Nome: ");
        jlaNome.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaNome.setForeground(new java.awt.Color(75, 0, 200));

        jlaSexo.setText("Sexo: ");
        jlaSexo.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaSexo.setForeground(new java.awt.Color(75, 0, 200));

        grpSexo.add(jrbMasc);
        jrbMasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbMasc.setText("Masculino");

        grpSexo.add(jrbFem);
        jrbFem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbFem.setText("Feminino");

        jlaDataNasc.setText("Data de nascimento: ");
        jlaDataNasc.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaDataNasc.setForeground(new java.awt.Color(75, 0, 200));

        jlaCep.setText("CEP: ");
        jlaCep.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaCep.setForeground(new java.awt.Color(75, 0, 200));

        jtfTextoCep.setToolTipText("Digite como: (\"00000-000\")");

        jlaUniFed.setText("Unidade da Federação: ");
        jlaUniFed.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaUniFed.setForeground(new java.awt.Color(75, 0, 200));

        jcbUniFeds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "São Paulo (SP)", "Santa Catarina (SC)", "Sergipe (SE)", "Tocantins (TO)" }));
        jcbUniFeds.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jlaGostos.setText("Gostos: ");
        jlaGostos.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaGostos.setForeground(new java.awt.Color(75, 0, 200));

        jcbMusica.setText("Música");

        jcbFilmes.setText("Filmes");

        jcbBaladas.setText("Baladas");

        jcbBeber.setText("Beber");

        jlaResumo.setText("Resumo: ");
        jlaResumo.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaResumo.setForeground(new java.awt.Color(75, 0, 200));

        jtaResumo.setColumns(20);
        jtaResumo.setRows(5);
        jScrollPane1.setViewportView(jtaResumo);

        jlaLista.setText("Lista de pessoas cadastradas: ");
        jlaLista.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jlaLista.setForeground(new java.awt.Color(75, 0, 200));

        jtPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sexo", "Data de nasc.", "CEP", "Unidade fed.", "Gostos", "Resumo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtPessoas);

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jbCadastrar.setForeground(new java.awt.Color(75, 0, 200));
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jbExcluir.setForeground(new java.awt.Color(75, 0, 200));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlaDataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlaGostos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlaUniFed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbUniFeds, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbBaladas)
                                        .addComponent(jcbMusica))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbBeber)
                                        .addComponent(jcbFilmes)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlaSexo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbMasc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                    .addComponent(jrbFem))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlaNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfTextoNome))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlaCep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfTextoCep))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlaLista)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(jlaResumo)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlaTitulo)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaTitulo)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbMasc)
                            .addComponent(jrbFem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(dpDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaCep, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jtfTextoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaUniFed)
                            .addComponent(jcbUniFeds, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jlaGostos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbMusica)
                            .addComponent(jcbFilmes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbBeber)
                            .addComponent(jcbBaladas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlaResumo)
                            .addComponent(jlaNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlaLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Pessoa p = new Pessoa();
        
        p.setNome(jtfTextoNome.getText());
        if(jrbMasc.isSelected())
            p.setSexo("Masculino");
        else
            p.setSexo("Feminino");
        p.setDataNasc(dpDataNasc);
        p.setCep(jtfTextoCep.getText());
        p.setUniFed(jcbUniFeds.getItemAt(jcbUniFeds.getSelectedIndex())); 
        
        if(jcbFilmes.isSelected())
            p.setGostos(jcbFilmes.toString());
        else if(!jcbFilmes.isSelected())
            p.removerGosto(jcbFilmes.toString());
        else if(jcbMusica.isSelected())
            p.setGostos(jcbMusica.toString());
        else if(!jcbMusica.isSelected())
            p.removerGosto(jcbMusica.toString());
        else if(jcbBeber.isSelected())
            p.setGostos(jcbBeber.toString());
        else if(!jcbBeber.isSelected())
            p.removerGosto(jcbBeber.toString());
        else if(jcbBaladas.isSelected())
            p.setGostos(jcbBaladas.toString());
        else
            p.removerGosto(jcbBaladas.toString());
        
        p.setResumo(jtaResumo.getText());
        
        gerpes.cadastrar(p);
        jtPessoas.setModel(modelo);
        Object[] dados = {p.getNome(), p.getSexo(), p.getDataNasc(), p.getCep(), p.getUniFed(), p.getGostos(), p.getResumo()};
        modelo.addRow(dados);
        JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        gerpes.excluir(jtPessoas.getSelectedRow());
    }//GEN-LAST:event_jbExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker dpDataNasc;
    private javax.swing.ButtonGroup grpSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JCheckBox jcbBaladas;
    private javax.swing.JCheckBox jcbBeber;
    private javax.swing.JCheckBox jcbFilmes;
    private javax.swing.JCheckBox jcbMusica;
    private javax.swing.JComboBox<String> jcbUniFeds;
    private javax.swing.JLabel jlaCep;
    private javax.swing.JLabel jlaDataNasc;
    private javax.swing.JLabel jlaGostos;
    private javax.swing.JLabel jlaLista;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaResumo;
    private javax.swing.JLabel jlaSexo;
    private javax.swing.JLabel jlaTitulo;
    private javax.swing.JLabel jlaUniFed;
    private javax.swing.JRadioButton jrbFem;
    private javax.swing.JRadioButton jrbMasc;
    private javax.swing.JTable jtPessoas;
    private javax.swing.JTextArea jtaResumo;
    private javax.swing.JTextField jtfTextoCep;
    private javax.swing.JTextField jtfTextoNome;
    // End of variables declaration//GEN-END:variables
}
