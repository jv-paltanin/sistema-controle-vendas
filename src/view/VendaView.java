package view;

import controller.MenuController;
import controller.VendaController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import util.IconeSistema;

/**
 *
 * @author jvictorp
 */
public class VendaView extends javax.swing.JFrame {

    private VendaController controller = new VendaController(VendaView.this);

    /**
     * Creates new form VendaView
     */
    public VendaView() {
        initComponents();
        IconeSistema icone = new IconeSistema();
        icone.InserirIcone(this);
        setLocationRelativeTo(null);
        controller.bloqueioInicial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInformacoesClienteFuncionario = new javax.swing.JPanel();
        lbCliente = new javax.swing.JLabel();
        lbFuncionario = new javax.swing.JLabel();
        btIniciaVenda = new javax.swing.JButton();
        cbxCliente = new javax.swing.JComboBox();
        cbxFuncionario = new javax.swing.JComboBox();
        painelProdutos = new javax.swing.JPanel();
        lbDescricao = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        cbxProduto = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        btExcluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lbDescontoProdutos = new javax.swing.JLabel();
        tfDescontoProdutos = new javax.swing.JTextField();
        tfQuantidade = new javax.swing.JSpinner();
        painelInformaçõesPagamento1 = new javax.swing.JPanel();
        lbFormaPagamento1 = new javax.swing.JLabel();
        cbxFormaPagamento = new javax.swing.JComboBox();
        btIncluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbDescontoPagamento = new javax.swing.JLabel();
        tfDescontoPagamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle de Vendas");
        setResizable(false);

        painelInformacoesClienteFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Funcionário/Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbCliente.setText("Cliente:");

        lbFuncionario.setText("Funcionário:");

        btIniciaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comprar.png"))); // NOI18N
        btIniciaVenda.setText("INICIAR VENDA");
        btIniciaVenda.setMaximumSize(new java.awt.Dimension(300, 40));
        btIniciaVenda.setMinimumSize(new java.awt.Dimension(300, 40));
        btIniciaVenda.setPreferredSize(new java.awt.Dimension(300, 40));

        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Cliente -" }));
        cbxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteActionPerformed(evt);
            }
        });

        cbxFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Funcionário -" }));
        cbxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInformacoesClienteFuncionarioLayout = new javax.swing.GroupLayout(painelInformacoesClienteFuncionario);
        painelInformacoesClienteFuncionario.setLayout(painelInformacoesClienteFuncionarioLayout);
        painelInformacoesClienteFuncionarioLayout.setHorizontalGroup(
            painelInformacoesClienteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesClienteFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformacoesClienteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCliente)
                    .addComponent(lbFuncionario))
                .addGap(36, 36, 36)
                .addGroup(painelInformacoesClienteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btIniciaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelInformacoesClienteFuncionarioLayout.setVerticalGroup(
            painelInformacoesClienteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesClienteFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformacoesClienteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInformacoesClienteFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelInformacoesClienteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCliente)
                            .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelInformacoesClienteFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFuncionario)
                            .addComponent(cbxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btIniciaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbDescricao.setText("Descrição:");

        lbQuantidade.setText("Quantidade:");

        cbxProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Produto -" }));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setMaximumSize(new java.awt.Dimension(300, 40));
        btSalvar.setMinimumSize(new java.awt.Dimension(300, 40));
        btSalvar.setPreferredSize(new java.awt.Dimension(300, 40));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btExcluirProduto.setText("EXCLUIR");
        btExcluirProduto.setMaximumSize(new java.awt.Dimension(300, 40));
        btExcluirProduto.setMinimumSize(new java.awt.Dimension(300, 40));
        btExcluirProduto.setPreferredSize(new java.awt.Dimension(300, 40));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Quantidade", "Valor unitário", "Desconto", "Valor total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setMinimumSize(new java.awt.Dimension(60, 0));
        tabela.setPreferredSize(new java.awt.Dimension(300, 0));
        jScrollPane1.setViewportView(tabela);

        lbDescontoProdutos.setText("Desconto:");

        javax.swing.GroupLayout painelProdutosLayout = new javax.swing.GroupLayout(painelProdutos);
        painelProdutos.setLayout(painelProdutosLayout);
        painelProdutosLayout.setHorizontalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutosLayout.createSequentialGroup()
                        .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbQuantidade)
                            .addComponent(lbDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelProdutosLayout.createSequentialGroup()
                                .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                .addComponent(lbDescontoProdutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDescontoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutosLayout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescricao)
                            .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQuantidade)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDescontoProdutos)
                            .addComponent(tfDescontoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelInformaçõesPagamento1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formas de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbFormaPagamento1.setText("Forma de Pagamento:");

        cbxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione Forma de Pagamento -" }));
        cbxFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFormaPagamentoActionPerformed(evt);
            }
        });

        btIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/include.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exclude.png"))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Forma de Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

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

        lbDescontoPagamento.setText("Desconto:");

        javax.swing.GroupLayout painelInformaçõesPagamento1Layout = new javax.swing.GroupLayout(painelInformaçõesPagamento1);
        painelInformaçõesPagamento1.setLayout(painelInformaçõesPagamento1Layout);
        painelInformaçõesPagamento1Layout.setHorizontalGroup(
            painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                        .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                                .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFormaPagamento1)
                                    .addComponent(lbDescontoPagamento))
                                .addGap(18, 18, 18)
                                .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxFormaPagamento, 0, 412, Short.MAX_VALUE)
                                    .addComponent(tfDescontoPagamento)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btIncluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelInformaçõesPagamento1Layout.setVerticalGroup(
            painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                        .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                                .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbFormaPagamento1)
                                    .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDescontoPagamento)
                                    .addComponent(tfDescontoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelInformaçõesPagamento1Layout.createSequentialGroup()
                                .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelInformaçõesPagamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelInformacoesClienteFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelInformaçõesPagamento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelInformacoesClienteFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInformaçõesPagamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClienteActionPerformed

    private void cbxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFuncionarioActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        MenuController.desBloquearMenu();
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        new ConfirmaVendaPrazoView().setVisible(true);
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void cbxFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFormaPagamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExcluirProduto;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btIniciaVenda;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbxCliente;
    private javax.swing.JComboBox cbxFormaPagamento;
    private javax.swing.JComboBox cbxFuncionario;
    private javax.swing.JComboBox cbxProduto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbDescontoPagamento;
    private javax.swing.JLabel lbDescontoProdutos;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFormaPagamento1;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JPanel painelInformacoesClienteFuncionario;
    private javax.swing.JPanel painelInformaçõesPagamento1;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfDescontoPagamento;
    private javax.swing.JTextField tfDescontoProdutos;
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

    public JButton getBtExcluir() {
        return btExcluir;
    }

    public void setBtExcluir(JButton btExcluir) {
        this.btExcluir = btExcluir;
    }

    public JButton getBtExcluirProduto() {
        return btExcluirProduto;
    }

    public void setBtExcluirProduto(JButton btExcluirProduto) {
        this.btExcluirProduto = btExcluirProduto;
    }

    public JButton getBtIncluir() {
        return btIncluir;
    }

    public void setBtIncluir(JButton btIncluir) {
        this.btIncluir = btIncluir;
    }

    public JButton getBtIniciaVenda() {
        return btIniciaVenda;
    }

    public void setBtIniciaVenda(JButton btIniciaVenda) {
        this.btIniciaVenda = btIniciaVenda;
    }

    public JButton getBtSair() {
        return btSair;
    }

    public void setBtSair(JButton btSair) {
        this.btSair = btSair;
    }

    public JButton getBtSalvar() {
        return btSalvar;
    }

    public void setBtSalvar(JButton btSalvar) {
        this.btSalvar = btSalvar;
    }

    public JComboBox getCbxCliente() {
        return cbxCliente;
    }

    public void setCbxCliente(JComboBox cbxCliente) {
        this.cbxCliente = cbxCliente;
    }

    public JComboBox getCbxFormaPagamento() {
        return cbxFormaPagamento;
    }

    public void setCbxFormaPagamento(JComboBox cbxFormaPagamento) {
        this.cbxFormaPagamento = cbxFormaPagamento;
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

    public JTextField getTfDescontoPagamento() {
        return tfDescontoPagamento;
    }

    public void setTfDescontoPagamento(JTextField tfDescontoPagamento) {
        this.tfDescontoPagamento = tfDescontoPagamento;
    }

    public JTextField getTfDescontoProdutos() {
        return tfDescontoProdutos;
    }

    public void setTfDescontoProdutos(JTextField tfDescontoProdutos) {
        this.tfDescontoProdutos = tfDescontoProdutos;
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public void setjTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }

    public JSpinner getTfQuantidade() {
        return tfQuantidade;
    }

    public void setTfQuantidade(JSpinner tfQuantidade) {
        this.tfQuantidade = tfQuantidade;
    }

}
