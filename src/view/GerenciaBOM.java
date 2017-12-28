/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author Usuário
 */
public class GerenciaBOM extends javax.swing.JFrame {
    
    DefaultListModel dlm = new DefaultListModel();
    List<Produto> list;

    /**
     * Creates new form GerenciaBOM
     */
    public GerenciaBOM() {
        initComponents();
        
        lblErroNomeProd.setVisible(false);
        atualizarProdutos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listProdutos = new javax.swing.JList<>();
        btAtualizaProduto = new javax.swing.JButton();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btAddProduto = new javax.swing.JButton();
        lblErroNomeProd = new javax.swing.JLabel();
        btEditarProd = new javax.swing.JButton();
        btExcluirProd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMateriais = new javax.swing.JTable();
        btAtualizaMaterial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        listProdutos.setModel(dlm);
        listProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listProdutos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listProdutosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listProdutos);

        btAtualizaProduto.setText("Atualizar Produtos");
        btAtualizaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAtualizaProdutoMouseClicked(evt);
            }
        });

        txtNomeProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomeProdutoCaretUpdate(evt);
            }
        });

        jLabel1.setText("Nome:");

        btAddProduto.setText("Adicionar");
        btAddProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddProdutoMouseClicked(evt);
            }
        });

        lblErroNomeProd.setForeground(new java.awt.Color(255, 0, 0));
        lblErroNomeProd.setText("* Nome obrigatório");

        btEditarProd.setText("Editar");
        btEditarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarProdMouseClicked(evt);
            }
        });

        btExcluirProd.setText("Excluir");
        btExcluirProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirProdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btAddProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btEditarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btExcluirProd))
            .addComponent(txtNomeProduto)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblErroNomeProd)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAtualizaProduto))
            .addComponent(jScrollPane1)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAddProduto, btEditarProd, btExcluirProd});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btAtualizaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroNomeProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddProduto)
                    .addComponent(btEditarProd)
                    .addComponent(btExcluirProd))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAddProduto, btEditarProd, btExcluirProd});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Materiais"));

        tableMateriais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(tableMateriais);

        btAtualizaMaterial.setText("Atualizar Materiais");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAtualizaMaterial))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btAtualizaMaterial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizaProdutoMouseClicked
        atualizarProdutos();
    }//GEN-LAST:event_btAtualizaProdutoMouseClicked

    private void txtNomeProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomeProdutoCaretUpdate
        lblErroNomeProd.setVisible(false);
    }//GEN-LAST:event_txtNomeProdutoCaretUpdate

    private void btAddProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddProdutoMouseClicked
        // TODO add your handling code here:
        String nome = txtNomeProduto.getText();
        if(nome.trim().equals("")){
            lblErroNomeProd.setVisible(true);
        }else{
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
        
            p.setNome(nome);
            dao.create(p);
            atualizarProdutos();
        }
    }//GEN-LAST:event_btAddProdutoMouseClicked

    private void listProdutosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listProdutosValueChanged
        txtNomeProduto.setText(listProdutos.getSelectedValue());
    }//GEN-LAST:event_listProdutosValueChanged

    private void btEditarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarProdMouseClicked
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        int index = listProdutos.getSelectedIndex();
        p.setId(list.get(index).getId());
        p.setNome(txtNomeProduto.getText());
        
        dao.update(p);
        atualizarProdutos();
    }//GEN-LAST:event_btEditarProdMouseClicked

    private void btExcluirProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirProdMouseClicked
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        int index = listProdutos.getSelectedIndex();
        p.setId(list.get(index).getId());
        
        dao.delete(p);
        atualizarProdutos();
    }//GEN-LAST:event_btExcluirProdMouseClicked

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
            java.util.logging.Logger.getLogger(GerenciaBOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaBOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaBOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaBOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciaBOM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddProduto;
    private javax.swing.JButton btAtualizaMaterial;
    private javax.swing.JButton btAtualizaProduto;
    private javax.swing.JButton btEditarProd;
    private javax.swing.JButton btExcluirProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblErroNomeProd;
    private javax.swing.JList<String> listProdutos;
    private javax.swing.JTable tableMateriais;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables

    private void atualizarProdutos() {
        ProdutoDAO dao = new ProdutoDAO();
        list = dao.read();
        
        dlm = (DefaultListModel) listProdutos.getModel();
        
        dlm.clear();
        for (int i = 0; i < list.size(); i++) {
            dlm.add(i, list.get(i).getNome());
        }
    }
}
