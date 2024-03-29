/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dao.UsuarioDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.CanaisDTO;

/**
 *
 * @author debor
 */
public class Tela8_user extends javax.swing.JFrame {

    /**
     * Creates new form Tela8_user
     */
    private CanaisDTO canais;

    public Tela8_user(CanaisDTO canais) {
        initComponents();
        CarregarCampos(canais);
        
        this.canais = canais;

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CarTipo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CarUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CarSenha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CarCanal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CarID = new javax.swing.JTextField();
        CarToken = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CarNome = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(530, 530));
        setPreferredSize(new java.awt.Dimension(1600, 800));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 18, 69));
        jLabel5.setText("Usuário");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        CarTipo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(CarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 340, 230, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 18, 69));
        jLabel7.setText("Senha");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, -1, -1));

        CarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        CarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(CarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 239, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 18, 75));
        jLabel2.setText("Configuração");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jButton2.setBackground(new java.awt.Color(45, 18, 75));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/220 × 116.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 650, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("de Canal");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 18, 69));
        jLabel4.setText("Tipo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, -1));

        CarSenha.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(CarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 540, 230, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(68, 18, 69));
        jLabel6.setText("Token");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, -1));

        CarCanal.setBackground(new java.awt.Color(204, 204, 204));
        CarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarCanalActionPerformed(evt);
            }
        });
        jPanel2.add(CarCanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 239, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 18, 69));
        jLabel8.setText("Canal");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        CarID.setEditable(false);
        CarID.setBackground(new java.awt.Color(204, 204, 204));
        CarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarIDActionPerformed(evt);
            }
        });
        jPanel2.add(CarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 80, 40));

        CarToken.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(CarToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 440, 230, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 18, 69));
        jLabel9.setText("ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(68, 18, 69));
        jLabel10.setText("Nome");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        CarNome.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(CarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarCanalActionPerformed

    private void CarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AlterarCanal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Tela7_user objListausergui = new Tela7_user();
     objListausergui.setVisible(true);  //abri a pagina se o login for correto
                
     dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Tela8_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela8_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela8_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela8_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
     private void CarregarCampos(CanaisDTO canais) {
        int     id; 
        String   canal, tipo, nome, usuario, senha, token;

        id = canais.getId();
        nome = canais.getNome();
        canal = canais.getCanal();
        tipo = canais.getTipo();
        usuario = canais.getUsuario();
        senha = canais.getSenha();
        token = canais.getToken();
            
        
        CarID.setText(Integer.toString(id));
        CarNome.setText(nome);
        CarCanal.setText(canal);
        CarTipo.setText(tipo);
        CarUsuario.setText(usuario);
        CarSenha.setText(senha);
        CarToken.setText(token);

       
    }
     
     private void AlterarCanal(){
     int id_canal;
     String nome_canal, canal_canal, tipo_canal, usuario_canal, senha_canal, token_canal;
     
     id_canal = Integer.parseInt(CarID.getText());
     nome_canal = CarNome.getText();
     canal_canal = CarCanal.getText();
     tipo_canal = CarTipo.getText();
     usuario_canal = CarUsuario.getText();
     senha_canal = CarSenha.getText();
     token_canal = CarToken.getText();
     
     CanaisDTO objcanaisdto = new CanaisDTO();
     objcanaisdto.setId(id_canal);
     objcanaisdto.setNome(nome_canal);
     objcanaisdto.setCanal(canal_canal);
     objcanaisdto.setTipo(tipo_canal);
     objcanaisdto.setUsuario(usuario_canal);
     objcanaisdto.setSenha(senha_canal);
     objcanaisdto.setToken(token_canal);
 
     
     UsuarioDAO objusuariodao = new UsuarioDAO();
     objusuariodao.alterarCadastro(objcanaisdto);
             
     
     JOptionPane.showMessageDialog(null, "Alteração feita!");
     dispose();
        
        
     Tela7_user objListausergui = new Tela7_user();
     objListausergui.setVisible(true);  //abri a pagina se o login for correto
                
     dispose();
     
     
 }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarCanal;
    private javax.swing.JTextField CarID;
    private javax.swing.JTextField CarNome;
    private javax.swing.JTextField CarSenha;
    private javax.swing.JTextField CarTipo;
    private javax.swing.JTextField CarToken;
    private javax.swing.JTextField CarUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
