package view;

import controller.CompraController;
import controller.MenuController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import util.IconeSistema;

/**
 *
 * @author jvictorp
 */
public class CompraView extends javax.swing.JFrame {

    private CompraController controller = new CompraController(CompraView.this);

    public CompraView() {
        initComponents();
        IconeSistema icone = new IconeSistema();
        icone.InserirIcone(this);
        setLocationRelativeTo(null);
        controller.bloqueioInicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInformacoesFuncionarioFornecedor = new javax.swing.JPanel();
        lbFuncionario = new javax.swing.JLabel();
        lbFornecedor = new javax.swing.JLabel();
        btIniciaCompra = new javax.swing.JButton();
        cbxFuncionario = new javax.swing.JComboBox();
        cbxFornecedor = new javax.swing.JComboBox();
        painelDadosCompra = new javax.swing.JPanel();
        lbDescricao = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        cbxProduto = new javax.swing.JComboBox();
        btSalvarProduto = new javax.swing.JButton();
        btExcluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCompra = new javax.swing.JTable();
        tfQuantidade = new javax.swing.JSpinner();
        painelInformaçõesPagamento = new javax.swing.JPanel();
        lbFormaPagamento = new javax.swing.JLabel();
        cbxFormaPagamento = new javax.swing.JComboBox();
        btIncluirFormaPagamento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btExcluirFormaPagamento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFormaPagamento = new javax.swing.JTable();
        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Compra de produtos");
        setResizable(false);

        painelInformacoesFuncionarioFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Funcionário/Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbFuncionario.setText("Funcionário:");

        lbFornecedor.setText("Fornecedor:");

        btIniciaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comprar.png"))); // NOI18N
        btIniciaCompra.setText("INICIAR COMPRA");
        btIniciaCompra.setMaximumSize(new java.awt.Dimension(300, 40));
        btIniciaCompra.setMinimumSize(new java.awt.Dimension(300, 40));
        btIniciaCompra.setPreferredSize(new java.awt.Dimension(300, 40));

        cbxFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Funcionário -" }));
        cbxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFuncionarioActionPerformed(evt);
            }
        });

        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Fornecedor -" }));
        cbxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInformacoesFuncionarioFornecedorLayout = new javax.swing.GroupLayout(painelInformacoesFuncionarioFornecedor);
        painelInformacoesFuncionarioFornecedor.setLayout(painelInformacoesFuncionarioFornecedorLayout);
        painelInformacoesFuncionarioFornecedorLayout.setHorizontalGroup(
            painelInformacoesFuncionarioFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesFuncionarioFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformacoesFuncionarioFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFuncionario)
                    .addComponent(lbFornecedor))
                .addGap(36, 36, 36)
                .addGroup(painelInformacoesFuncionarioFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btIniciaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelInformacoesFuncionarioFornecedorLayout.setVerticalGroup(
            painelInformacoesFuncionarioFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesFuncionarioFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformacoesFuncionarioFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInformacoesFuncionarioFornecedorLayout.createSequentialGroup()
                        .addGroup(painelInformacoesFuncionarioFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFuncionario)
                            .addComponent(cbxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(painelInformacoesFuncionarioFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFornecedor)
                            .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btIniciaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbDescricao.setText("Descrição:");

        lbQuantidade.setText("Quantidade:");

        cbxProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Produto -" }));

        btSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btSalvarProduto.setText("SALVAR");
        btSalvarProduto.setMaximumSize(new java.awt.Dimension(300, 40));
        btSalvarProduto.setMinimumSize(new java.awt.Dimension(300, 40));
        btSalvarProduto.setPreferredSize(new java.awt.Dimension(300, 40));
        btSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProdutoActionPerformed(evt);
            }
        });

        btExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btExcluirProduto.setText("EXCLUIR");
        btExcluirProduto.setMaximumSize(new java.awt.Dimension(300, 40));
        btExcluirProduto.setMinimumSize(new java.awt.Dimension(300, 40));
        btExcluirProduto.setPreferredSize(new java.awt.Dimension(300, 40));

        tabelaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Quantidade", "Valor unitário", "Valor total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCompra);

        javax.swing.GroupLayout painelDadosCompraLayout = new javax.swing.GroupLayout(painelDadosCompra);
        painelDadosCompra.setLayout(painelDadosCompraLayout);
        painelDadosCompraLayout.setHorizontalGroup(
            painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDadosCompraLayout.createSequentialGroup()
                        .addGroup(painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosCompraLayout.createSequentialGroup()
                                .addComponent(lbQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(painelDadosCompraLayout.createSequentialGroup()
                                .addComponent(lbDescricao)
                                .addGap(20, 20, 20)))
                        .addGroup(painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDadosCompraLayout.setVerticalGroup(
            painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDadosCompraLayout.createSequentialGroup()
                        .addGroup(painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescricao)
                            .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQuantidade)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosCompraLayout.createSequentialGroup()
                        .addComponent(btSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelInformaçõesPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbFormaPagamento.setText("Forma de Pagamento:");

        cbxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Forma de Pagamento -" }));

        btIncluirFormaPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/include.png"))); // NOI18N
        btIncluirFormaPagamento.setMaximumSize(new java.awt.Dimension(75, 23));
        btIncluirFormaPagamento.setMinimumSize(new java.awt.Dimension(75, 23));
        btIncluirFormaPagamento.setPreferredSize(new java.awt.Dimension(75, 23));
        btIncluirFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirFormaPagamentoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btExcluirFormaPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exclude.png"))); // NOI18N
        btExcluirFormaPagamento.setMaximumSize(new java.awt.Dimension(75, 23));
        btExcluirFormaPagamento.setMinimumSize(new java.awt.Dimension(75, 23));
        btExcluirFormaPagamento.setPreferredSize(new java.awt.Dimension(75, 23));
        btExcluirFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFormaPagamentoActionPerformed(evt);
            }
        });

        tabelaFormaPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FORMA DE PAGAMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaFormaPagamento);

        btConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirm.png"))); // NOI18N
        btConfirmar.setText("CONFIRMAR");
        btConfirmar.setMaximumSize(new java.awt.Dimension(127, 39));
        btConfirmar.setMinimumSize(new java.awt.Dimension(127, 39));
        btConfirmar.setPreferredSize(new java.awt.Dimension(127, 39));
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.setMaximumSize(new java.awt.Dimension(127, 39));
        btCancelar.setMinimumSize(new java.awt.Dimension(127, 39));
        btCancelar.setPreferredSize(new java.awt.Dimension(127, 39));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        btSair.setText("SAIR");
        btSair.setMaximumSize(new java.awt.Dimension(127, 39));
        btSair.setMinimumSize(new java.awt.Dimension(127, 39));
        btSair.setPreferredSize(new java.awt.Dimension(127, 39));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInformaçõesPagamentoLayout = new javax.swing.GroupLayout(painelInformaçõesPagamento);
        painelInformaçõesPagamento.setLayout(painelInformaçõesPagamentoLayout);
        painelInformaçõesPagamentoLayout.setHorizontalGroup(
            painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformaçõesPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelInformaçõesPagamentoLayout.createSequentialGroup()
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelInformaçõesPagamentoLayout.createSequentialGroup()
                        .addGroup(painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelInformaçõesPagamentoLayout.createSequentialGroup()
                                .addComponent(lbFormaPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btIncluirFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(btExcluirFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelInformaçõesPagamentoLayout.setVerticalGroup(
            painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformaçõesPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelInformaçõesPagamentoLayout.createSequentialGroup()
                        .addGroup(painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInformaçõesPagamentoLayout.createSequentialGroup()
                                .addComponent(btIncluirFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcluirFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelInformaçõesPagamentoLayout.createSequentialGroup()
                                .addGroup(painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbFormaPagamento)
                                    .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelInformaçõesPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelInformacoesFuncionarioFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelInformaçõesPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelInformacoesFuncionarioFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInformaçõesPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFuncionarioActionPerformed

    private void cbxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFornecedorActionPerformed

    private void btSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarProdutoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        MenuController.desBloquearMenu();
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        new ConfirmaCompraPrazoView().setVisible(true);
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btIncluirFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btIncluirFormaPagamentoActionPerformed

    private void btExcluirFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirFormaPagamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluirFormaPagamento;
    private javax.swing.JButton btExcluirProduto;
    private javax.swing.JButton btIncluirFormaPagamento;
    private javax.swing.JButton btIniciaCompra;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvarProduto;
    private javax.swing.JComboBox cbxFormaPagamento;
    private javax.swing.JComboBox cbxFornecedor;
    private javax.swing.JComboBox cbxFuncionario;
    private javax.swing.JComboBox cbxProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFormaPagamento;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JPanel painelDadosCompra;
    private javax.swing.JPanel painelInformacoesFuncionarioFornecedor;
    private javax.swing.JPanel painelInformaçõesPagamento;
    private javax.swing.JTable tabelaCompra;
    private javax.swing.JTable tabelaFormaPagamento;
    private javax.swing.JSpinner tfQuantidade;
    // End of variables declaration//GEN-END:variables

    public JButton getBtCancelar() {
        return btCancelar;
    }

    public void setBtCancelar(JButton btCancelar) {
        this.btCancelar = btCancelar;
    }

    public JButton getBtConfirmar() {
        return btConfirmar;
    }

    public void setBtConfirmar(JButton btConfirmar) {
        this.btConfirmar = btConfirmar;
    }

    public JButton getBtExcluirFormaPagamento() {
        return btExcluirFormaPagamento;
    }

    public void setBtExcluirFormaPagamento(JButton btExcluirFormaPagamento) {
        this.btExcluirFormaPagamento = btExcluirFormaPagamento;
    }

    public JButton getBtExcluirProduto() {
        return btExcluirProduto;
    }

    public void setBtExcluirProduto(JButton btExcluirProduto) {
        this.btExcluirProduto = btExcluirProduto;
    }

    public JButton getBtIncluirFormaPagamento() {
        return btIncluirFormaPagamento;
    }

    public void setBtIncluirFormaPagamento(JButton btIncluirFormaPagamento) {
        this.btIncluirFormaPagamento = btIncluirFormaPagamento;
    }

    public JButton getBtIniciaCompra() {
        return btIniciaCompra;
    }

    public void setBtIniciaCompra(JButton btIniciaCompra) {
        this.btIniciaCompra = btIniciaCompra;
    }

    public JButton getBtSair() {
        return btSair;
    }

    public void setBtSair(JButton btSair) {
        this.btSair = btSair;
    }

    public JButton getBtSalvarProduto() {
        return btSalvarProduto;
    }

    public void setBtSalvarProduto(JButton btSalvarProduto) {
        this.btSalvarProduto = btSalvarProduto;
    }

    public JComboBox getCbxFormaPagamento() {
        return cbxFormaPagamento;
    }

    public void setCbxFormaPagamento(JComboBox cbxFormaPagamento) {
        this.cbxFormaPagamento = cbxFormaPagamento;
    }

    public JComboBox getCbxFornecedor() {
        return cbxFornecedor;
    }

    public void setCbxFornecedor(JComboBox cbxFornecedor) {
        this.cbxFornecedor = cbxFornecedor;
    }

    public JComboBox getCbxFuncionario() {
        return cbxFuncionario;
    }

    public void setCbxFuncionario(JComboBox cbxFuncionario) {
        this.cbxFuncionario = cbxFuncionario;
    }

    public JComboBox getCbxProduto() {
        return cbxProduto;
    }

    public void setCbxProduto(JComboBox cbxProduto) {
        this.cbxProduto = cbxProduto;
    }

    public JTable getTabelaCompra() {
        return tabelaCompra;
    }

    public void setTabelaCompra(JTable tabelaCompra) {
        this.tabelaCompra = tabelaCompra;
    }

    public JTable getTabelaFormaPagamento() {
        return tabelaFormaPagamento;
    }

    public void setTabelaFormaPagamento(JTable tabelaFormaPagamento) {
        this.tabelaFormaPagamento = tabelaFormaPagamento;
    }

    public JSpinner getTfQuantidade() {
        return tfQuantidade;
    }

    public void setTfQuantidade(JSpinner tfQuantidade) {
        this.tfQuantidade = tfQuantidade;
    }

}
