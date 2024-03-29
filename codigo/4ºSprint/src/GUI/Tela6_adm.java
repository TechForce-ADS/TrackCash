/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dao.UsuarioDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CanaisDTO;

/**
 *
 * @author Aluno
 */
public class Tela6_adm extends javax.swing.JFrame {

     UsuarioDAO DAO;
     
    public Tela6_adm() {
        initComponents();
        ListarValoresCanais();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        
        try {
            DAO = new UsuarioDAO();
        } catch (Exception e) {
        }
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rosa = new javax.swing.JPanel();
        roxo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        amarel = new javax.swing.JPanel();
        azul = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCanais = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pesquisa = new javax.swing.JTextField();
        txtArea = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(530, 530));
        setPreferredSize(new java.awt.Dimension(1600, 800));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        rosa.setBackground(new java.awt.Color(255, 255, 255));
        rosa.setLayout(new java.awt.BorderLayout());

        roxo.setBackground(new java.awt.Color(255, 255, 255));
        roxo.setMinimumSize(new java.awt.Dimension(0, 0));
        roxo.setPreferredSize(new java.awt.Dimension(500, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/220 × 116.png"))); // NOI18N

        javax.swing.GroupLayout roxoLayout = new javax.swing.GroupLayout(roxo);
        roxo.setLayout(roxoLayout);
        roxoLayout.setHorizontalGroup(
            roxoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roxoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3232, Short.MAX_VALUE))
        );
        roxoLayout.setVerticalGroup(
            roxoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roxoLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rosa.add(roxo, java.awt.BorderLayout.PAGE_START);

        amarel.setBackground(new java.awt.Color(255, 255, 255));
        amarel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        azul.setBackground(new java.awt.Color(255, 255, 255));

        tabelaCanais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, "", null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CANAL", "TIPO CANAL", "USUARIO", "SENHA", "TOKEN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCanais);
        if (tabelaCanais.getColumnModel().getColumnCount() > 0) {
            tabelaCanais.getColumnModel().getColumn(0).setResizable(false);
            tabelaCanais.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        javax.swing.GroupLayout azulLayout = new javax.swing.GroupLayout(azul);
        azul.setLayout(azulLayout);
        azulLayout.setHorizontalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azulLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        azulLayout.setVerticalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        amarel.add(azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 1400, 320));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 18, 69));
        jLabel2.setText("Visualizar");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 62, 0));
        jLabel3.setText("Canais");

        jButton6.setBackground(new java.awt.Color(255, 62, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Canais");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 929, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(495, 495, 495))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        amarel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 1940, 120));

        jButton7.setBackground(new java.awt.Color(255, 62, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        amarel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 140, 40));

        jButton2.setBackground(new java.awt.Color(255, 62, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        amarel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 590, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 18, 69));
        jLabel4.setText("Pesquise um canal");
        amarel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, 40));

        pesquisa.setBackground(new java.awt.Color(204, 204, 204));
        pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pesquisaMouseExited(evt);
            }
        });
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });
        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaKeyReleased(evt);
            }
        });
        amarel.add(pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 360, 40));

        txtArea.setBackground(new java.awt.Color(204, 204, 204));
        txtArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "canal", "nome", "tipo" }));
        txtArea.setToolTipText("");
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });
        amarel.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 180, 40));

        rosa.add(amarel, java.awt.BorderLayout.CENTER);

        getContentPane().add(rosa);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyReleased
        String texto, area;

        texto = pesquisa.getText();
        area = txtArea.getSelectedItem().toString();
        
        System.out.println(area);
        System.out.println(texto);
        
        try {
            Vector cabecalho = new Vector();
            cabecalho.add("ID");
            cabecalho.add("NOME");
            cabecalho.add("CANAL");
            cabecalho.add("TIPO CANAL");
            cabecalho.add("USUARIO");
            cabecalho.add("SENHA");
            cabecalho.add("TOKEN");
            
            

            if (!pesquisa.getText().equals("")) {
                DefaultTableModel nv = new DefaultTableModel(DAO.pesquisar(texto,area) ,cabecalho);
                tabelaCanais.setModel(nv);
            } else {
                DefaultTableModel nv = new DefaultTableModel(new Vector(), cabecalho);
                tabelaCanais.setModel(nv);

            }
            if (pesquisa.getText().equals("")) {
                ListarValoresCanais();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_pesquisaKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Tela12_adm tela3 = new Tela12_adm();
        tela3.setVisible(true); //abri a pagina se o login for correto

        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void pesquisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaMouseExited
    
    }//GEN-LAST:event_pesquisaMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AlterarCanal();
        ListarValoresCanais();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Tela4_adm tela3 = new Tela4_adm();
        tela3.setVisible(true); //abri a pagina se o login for correto

        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    
 private void AlterarCanal(){
     int id_canal;
     
     int setar = tabelaCanais.getSelectedRow();
    
     id_canal = (int)(tabelaCanais.getModel().getValueAt(setar, 0));

     
     CanaisDTO objcanaisdto = new CanaisDTO();
     objcanaisdto.setId(id_canal);
     
     UsuarioDAO objusuariodao = new UsuarioDAO();
     objusuariodao.excluirCadastros(objcanaisdto);


 }
 
     private void ListarValoresCanais() {
        try {
            UsuarioDAO objcanaisDAO = new UsuarioDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaCanais.getModel();
            model.setNumRows(0);

            ArrayList<CanaisDTO> lista = objcanaisDAO.listarCanais();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getCanal(),
                    lista.get(num).getTipo(),
                    lista.get(num).getUsuario(),
                    lista.get(num).getSenha(),
                    lista.get(num).getToken(),
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ListarValoresView" + erro);

        }

    }
     
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
            java.util.logging.Logger.getLogger(Tela6_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela6_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela6_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela6_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela6_adm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel amarel;
    private javax.swing.JPanel azul;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JPanel rosa;
    private javax.swing.JPanel roxo;
    private javax.swing.JTable tabelaCanais;
    private javax.swing.JComboBox<String> txtArea;
    // End of variables declaration//GEN-END:variables
}
