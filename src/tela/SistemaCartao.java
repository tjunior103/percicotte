/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import entidade.Cartao;
import javax.swing.JOptionPane;
import regra_negocio.CartaoNegocio;

/**
 *
 * @author Silvio
 */
public class SistemaCartao extends javax.swing.JFrame {

    private Cartao cartao;

    public SistemaCartao() {
        initComponents();
    }

    public SistemaCartao(Cartao cartao) {
        initComponents();
        this.cartao = cartao;
        logado.setVisible(false);
        System.out.println("Senha " + cartao.getSenha());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        varLogin = new javax.swing.JTextField();
        varSenha = new javax.swing.JPasswordField();
        btLogar = new javax.swing.JButton();
        logado = new javax.swing.JPanel();
        btComprar = new javax.swing.JButton();
        btFatura = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Cartão");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Sistema Cartão");

        lbSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSenha.setText("Senha:");

        lbLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLogin.setText("Login:");

        btLogar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLogar.setText("Logar");
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        logado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btComprar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btComprar.setText("Comprar");
        btComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprarActionPerformed(evt);
            }
        });

        btFatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btFatura.setText("Fatura");
        btFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFaturaActionPerformed(evt);
            }
        });

        btPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPagar.setText("Pagar");
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logadoLayout = new javax.swing.GroupLayout(logado);
        logado.setLayout(logadoLayout);
        logadoLayout.setHorizontalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logadoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        logadoLayout.setVerticalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logadoLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprar)
                    .addComponent(btFatura)
                    .addComponent(btPagar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(varLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLogar)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(lbSenha)
                    .addComponent(varLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLogar))
                .addGap(18, 18, 18)
                .addComponent(logado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        String login = varLogin.getText().trim();
        String senha = String.valueOf(varSenha.getPassword()).trim();
        if (login.equals("55") && senha.equals(cartao.getSenha())) {
            logado.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha Incorreto!");
        }
    }//GEN-LAST:event_btLogarActionPerformed

    private void btComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprarActionPerformed
        double valorCompra = Double.parseDouble(JOptionPane.
                showInputDialog("Digite o valor da compra!!"));
        CartaoNegocio cn = null;
        String msg = cn.fazerComprar(valorCompra, cartao);
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btComprarActionPerformed

    private void btFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFaturaActionPerformed

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        double valorMinimo = cartao.getSaldo() * 0.1;
        double valorPagamento = Double.parseDouble(JOptionPane.
                showInputDialog("Valor Fatura: " + cartao.getSaldo() + "\nPagamento Mínimo "
                        + valorMinimo + "\nDigite o valor da compra!!"));
        CartaoNegocio cn = null;
        String msg = cn.fazerPagamento(valorPagamento, cartao);
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btPagarActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComprar;
    private javax.swing.JButton btFatura;
    private javax.swing.JButton btLogar;
    private javax.swing.JButton btPagar;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel logado;
    private javax.swing.JTextField varLogin;
    private javax.swing.JPasswordField varSenha;
    // End of variables declaration//GEN-END:variables
}
