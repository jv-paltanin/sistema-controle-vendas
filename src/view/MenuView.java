package view;

import controller.MenuController;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import util.IconeSistema;

/**
 *
 * @author jvictorp
 */
public class MenuView extends javax.swing.JFrame {

    private MenuController controller = new MenuController(MenuView.this);

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        IconeSistema icone = new IconeSistema();
        icone.InserirIcone(this);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        controller.horaData();
        controller.carregarUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btClientes = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btFuncionarios = new javax.swing.JButton();
        btProdutos = new javax.swing.JButton();
        btEstoque = new javax.swing.JButton();
        btVendas = new javax.swing.JButton();
        btCompras = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fundo.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbHora = new javax.swing.JLabel();
        lbNomeFuncionario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuFornecedor = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuEntradaEstoque = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuProdutosFalta = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuEfetuarVendas = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        menuEfetuarCompras = new javax.swing.JMenuItem();
        menuContas = new javax.swing.JMenu();
        menuContasReceber = new javax.swing.JMenuItem();
        menuContasPagar = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuLogoutEscape = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema Comercial de Vendas");
        setResizable(false);
        getContentPane().setLayout(null);

        btClientes.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer.png"))); // NOI18N
        btClientes.setText("Clientes");
        btClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btClientes.setMaximumSize(new java.awt.Dimension(130, 40));
        btClientes.setMinimumSize(new java.awt.Dimension(130, 40));
        btClientes.setPreferredSize(new java.awt.Dimension(130, 40));
        btClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btClientes);
        btClientes.setBounds(15, 30, 150, 100);

        btFornecedor.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/providers.png"))); // NOI18N
        btFornecedor.setText("Fornecedores");
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setMaximumSize(new java.awt.Dimension(130, 40));
        btFornecedor.setMinimumSize(new java.awt.Dimension(130, 40));
        btFornecedor.setPreferredSize(new java.awt.Dimension(130, 40));
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(btFornecedor);
        btFornecedor.setBounds(185, 30, 150, 100);

        btFuncionarios.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/workers.png"))); // NOI18N
        btFuncionarios.setText("Funcionários");
        btFuncionarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFuncionarios.setMaximumSize(new java.awt.Dimension(130, 40));
        btFuncionarios.setMinimumSize(new java.awt.Dimension(130, 40));
        btFuncionarios.setPreferredSize(new java.awt.Dimension(130, 40));
        btFuncionarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(btFuncionarios);
        btFuncionarios.setBounds(355, 30, 150, 100);

        btProdutos.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/products.png"))); // NOI18N
        btProdutos.setText("Produtos");
        btProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProdutos.setMaximumSize(new java.awt.Dimension(130, 40));
        btProdutos.setMinimumSize(new java.awt.Dimension(130, 40));
        btProdutos.setPreferredSize(new java.awt.Dimension(130, 40));
        btProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btProdutos);
        btProdutos.setBounds(525, 30, 150, 100);

        btEstoque.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        btEstoque.setText("Estoque");
        btEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEstoque.setMaximumSize(new java.awt.Dimension(130, 40));
        btEstoque.setMinimumSize(new java.awt.Dimension(130, 40));
        btEstoque.setPreferredSize(new java.awt.Dimension(130, 40));
        btEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btEstoque);
        btEstoque.setBounds(695, 30, 150, 100);

        btVendas.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        btVendas.setText("Vendas");
        btVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVendas.setMaximumSize(new java.awt.Dimension(130, 40));
        btVendas.setMinimumSize(new java.awt.Dimension(130, 40));
        btVendas.setPreferredSize(new java.awt.Dimension(130, 40));
        btVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendasActionPerformed(evt);
            }
        });
        getContentPane().add(btVendas);
        btVendas.setBounds(865, 30, 150, 100);

        btCompras.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras.png"))); // NOI18N
        btCompras.setText("Compras");
        btCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompras.setMaximumSize(new java.awt.Dimension(130, 40));
        btCompras.setMinimumSize(new java.awt.Dimension(130, 40));
        btCompras.setPreferredSize(new java.awt.Dimension(130, 40));
        btCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprasActionPerformed(evt);
            }
        });
        getContentPane().add(btCompras);
        btCompras.setBounds(1035, 30, 150, 100);

        btSair.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shutdown.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMaximumSize(new java.awt.Dimension(130, 40));
        btSair.setMinimumSize(new java.awt.Dimension(130, 40));
        btSair.setPreferredSize(new java.awt.Dimension(130, 40));
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(1205, 30, 150, 100);

        jPanel1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        lbUsuario.setText("Usuário:");

        lbData.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N
        lbData.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lbDataInputMethodTextChanged(evt);
            }
        });

        jSeparator2.setBackground(java.awt.Color.black);
        jSeparator2.setForeground(java.awt.Color.black);
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbHora.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hora.png"))); // NOI18N

        lbNomeFuncionario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 545, Short.MAX_VALUE)
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHora)
                .addGap(396, 396, 396))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(lbData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbUsuario))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(672, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1500, 730);

        menuCadastro.setText("Cadastro");

        menuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuCliente.setText("Clientes");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        menuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuFornecedor.setText("Fornecedores");
        menuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFornecedor);

        menuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuProdutos.setText("Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuProdutos);

        menuFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuFuncionarios.setText("Funcionários");
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionarios);

        jMenuBar1.add(menuCadastro);

        menuEstoque.setText("Estoque");

        jMenu1.setText("Controle de Estoque");

        menuEntradaEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        menuEntradaEstoque.setText("Entrada de Estoque");
        menuEntradaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntradaEstoqueActionPerformed(evt);
            }
        });
        jMenu1.add(menuEntradaEstoque);

        menuEstoque.add(jMenu1);

        jMenu2.setText("Relatórios");

        menuProdutosFalta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menuProdutosFalta.setText("Produtos em Falta");
        menuProdutosFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosFaltaActionPerformed(evt);
            }
        });
        jMenu2.add(menuProdutosFalta);

        menuEstoque.add(jMenu2);

        jMenuBar1.add(menuEstoque);

        menuVendas.setText("Vendas");

        menuEfetuarVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menuEfetuarVendas.setText("Efetuar Vendas");
        menuEfetuarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEfetuarVendasActionPerformed(evt);
            }
        });
        menuVendas.add(menuEfetuarVendas);

        jMenuBar1.add(menuVendas);

        menuCompras.setText("Compras");

        menuEfetuarCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        menuEfetuarCompras.setText("Efetuar Compras");
        menuEfetuarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEfetuarComprasActionPerformed(evt);
            }
        });
        menuCompras.add(menuEfetuarCompras);

        jMenuBar1.add(menuCompras);

        menuContas.setText("Contas");

        menuContasReceber.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        menuContasReceber.setText("Contas a Receber");
        menuContasReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuContasReceberActionPerformed(evt);
            }
        });
        menuContas.add(menuContasReceber);

        menuContasPagar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        menuContasPagar.setText("Contas a Pagar");
        menuContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuContasPagarActionPerformed(evt);
            }
        });
        menuContas.add(menuContasPagar);

        jMenuBar1.add(menuContas);

        menuSistema.setText("Sistema");

        menuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuSistema.add(menuSobre);
        menuSistema.add(jSeparator1);

        menuLogoutEscape.setText("Logout Escape");
        menuLogoutEscape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutEscapeActionPerformed(evt);
            }
        });
        menuSistema.add(menuLogoutEscape);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuSistema.add(menuSair);

        jMenuBar1.add(menuSistema);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendasActionPerformed
        controller.bloquearMenu();
        new VendaView().setVisible(true);
    }//GEN-LAST:event_btVendasActionPerformed

    private void btFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorActionPerformed
        controller.bloquearMenu();
        new FornecedorView().setVisible(true);
    }//GEN-LAST:event_btFornecedorActionPerformed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
        controller.bloquearMenu();
        new FuncionarioView().setVisible(true);
    }//GEN-LAST:event_btFuncionariosActionPerformed

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosActionPerformed
        controller.bloquearMenu();
        new ProdutoView().setVisible(true);
    }//GEN-LAST:event_btProdutosActionPerformed

    private void btEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueActionPerformed
        controller.bloquearMenu();
        new EstoqueView().setVisible(true);
    }//GEN-LAST:event_btEstoqueActionPerformed

    private void btComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprasActionPerformed
        controller.bloquearMenu();
        new CompraView().setVisible(true);
    }//GEN-LAST:event_btComprasActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        controller.sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        controller.bloquearMenu();
        new ClienteView().setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        controller.bloquearMenu();
        new FuncionarioView().setVisible(true);
    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void menuProdutosFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosFaltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuProdutosFaltaActionPerformed

    private void menuEfetuarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEfetuarVendasActionPerformed
        controller.bloquearMenu();
        new VendaView().setVisible(true);
    }//GEN-LAST:event_menuEfetuarVendasActionPerformed

    private void menuContasReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuContasReceberActionPerformed
        controller.bloquearMenu();
        new ContasReceberView().setVisible(true);
    }//GEN-LAST:event_menuContasReceberActionPerformed

    private void menuLogoutEscapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutEscapeActionPerformed
        controller.sairLogout();
    }//GEN-LAST:event_menuLogoutEscapeActionPerformed

    private void menuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedorActionPerformed
        controller.bloquearMenu();
        new FornecedorView().setVisible(true);
    }//GEN-LAST:event_menuFornecedorActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
        controller.bloquearMenu();
        new ProdutoView().setVisible(true);
    }//GEN-LAST:event_menuProdutosActionPerformed

    private void menuEntradaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntradaEstoqueActionPerformed
        controller.bloquearMenu();
        new EstoqueView().setVisible(true);
    }//GEN-LAST:event_menuEntradaEstoqueActionPerformed

    private void menuEfetuarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEfetuarComprasActionPerformed
        controller.bloquearMenu();
        new CompraView().setVisible(true);
    }//GEN-LAST:event_menuEfetuarComprasActionPerformed

    private void menuContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuContasPagarActionPerformed
        controller.bloquearMenu();
        new ContasPagarView().setVisible(true);
    }//GEN-LAST:event_menuContasPagarActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        controller.sair();
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        new SobreView().setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        controller.bloquearMenu();
        new ClienteView().setVisible(true);
    }//GEN-LAST:event_btClientesActionPerformed

    private void lbDataInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lbDataInputMethodTextChanged
    }//GEN-LAST:event_lbDataInputMethodTextChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btCompras;
    private javax.swing.JButton btEstoque;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btFuncionarios;
    private javax.swing.JButton btProdutos;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVendas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbNomeFuncionario;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenu menuContas;
    private javax.swing.JMenuItem menuContasPagar;
    private javax.swing.JMenuItem menuContasReceber;
    private javax.swing.JMenuItem menuEfetuarCompras;
    private javax.swing.JMenuItem menuEfetuarVendas;
    private javax.swing.JMenuItem menuEntradaEstoque;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenuItem menuFornecedor;
    private javax.swing.JMenuItem menuFuncionarios;
    private javax.swing.JMenuItem menuLogoutEscape;
    private javax.swing.JMenuItem menuProdutos;
    private javax.swing.JMenuItem menuProdutosFalta;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenu menuVendas;
    // End of variables declaration//GEN-END:variables

    public JLabel getLbUsuario() {
        return lbUsuario;
    }

    public void setLbUsuario(JLabel lbUsuario) {
        this.lbUsuario = lbUsuario;
    }

    public JLabel getLbData() {
        return lbData;
    }

    public void setLbData(JLabel lbData) {
        this.lbData = lbData;
    }

    public JLabel getLbHora() {
        return lbHora;
    }

    public void setLbHora(JLabel lbHora) {
        this.lbHora = lbHora;
    }

    public JMenu getMenuCadastro() {
        return menuCadastro;
    }

    public void setMenuCadastro(JMenu menuCadastro) {
        this.menuCadastro = menuCadastro;
    }

    public JMenu getMenuCompras() {
        return menuCompras;
    }

    public void setMenuCompras(JMenu menuCompras) {
        this.menuCompras = menuCompras;
    }

    public JMenu getMenuContas() {
        return menuContas;
    }

    public void setMenuContas(JMenu menuContas) {
        this.menuContas = menuContas;
    }

    public JMenu getMenuEstoque() {
        return menuEstoque;
    }

    public void setMenuEstoque(JMenu menuEstoque) {
        this.menuEstoque = menuEstoque;
    }

    public JMenu getMenuSistema() {
        return menuSistema;
    }

    public void setMenuSistema(JMenu menuSistema) {
        this.menuSistema = menuSistema;
    }

    public JMenu getMenuVendas() {
        return menuVendas;
    }

    public void setMenuVendas(JMenu menuVendas) {
        this.menuVendas = menuVendas;
    }

    public JButton getBtClientes() {
        return btClientes;
    }

    public void setBtClientes(JButton btClientes) {
        this.btClientes = btClientes;
    }

    public JButton getBtCompras() {
        return btCompras;
    }

    public void setBtCompras(JButton btCompras) {
        this.btCompras = btCompras;
    }

    public JButton getBtEstoque() {
        return btEstoque;
    }

    public void setBtEstoque(JButton btEstoque) {
        this.btEstoque = btEstoque;
    }

    public JButton getBtFornecedor() {
        return btFornecedor;
    }

    public void setBtFornecedor(JButton btFornecedor) {
        this.btFornecedor = btFornecedor;
    }

    public JButton getBtFuncionarios() {
        return btFuncionarios;
    }

    public void setBtFuncionarios(JButton btFuncionarios) {
        this.btFuncionarios = btFuncionarios;
    }

    public JButton getBtProdutos() {
        return btProdutos;
    }

    public void setBtProdutos(JButton btProdutos) {
        this.btProdutos = btProdutos;
    }

    public JButton getBtSair() {
        return btSair;
    }

    public void setBtSair(JButton btSair) {
        this.btSair = btSair;
    }

    public JButton getBtVendas() {
        return btVendas;
    }

    public void setBtVendas(JButton btVendas) {
        this.btVendas = btVendas;
    }

    public JLabel getLbNomeFuncionario() {
        return lbNomeFuncionario;
    }

    public void setLbNomeFuncionario(JLabel lbNomeFuncionario) {
        this.lbNomeFuncionario = lbNomeFuncionario;
    }

}
