package controller;

import dao.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;
import model.Produto;
import util.Mensagem;
import util.Util;
import util.Valida;
import view.ProdutoView;

/**
 *
 * @author João Victor
 */
public class ProdutoController {

    // atributo para manipular a tela de cadastro
    private ProdutoView tela;

    // lista de produtos para preencher tabela, alterar e excluir
    private ArrayList<Produto> listaProdutos;
    // lista de forncedores para preencher tabela, alterar e excluir
    private ArrayList<Fornecedor> listaFornecedores;
    // flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    // objeto produto e fornecedor
    private Produto produto;
    private Fornecedor fornecedor;

    // construtor vazio
    public ProdutoController() {
    }

    // construtor para valorizar o objeto de tela
    public ProdutoController(ProdutoView tela) {
        this.tela = tela;
    }

    /*
     * Método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        // desabilitando os textFields
        this.tela.getTfDescricao().setEnabled(false);
        this.tela.getCbxFornecedor().setEnabled(false);
        this.tela.getTfValorCusto().setEnabled(false);
        this.tela.getTfValorVenda().setEnabled(false);
        // desabilistando os botões
        this.tela.getBtSalvar().setEnabled(false);
        this.tela.getBtCancelar().setEnabled(false);
    }// fim do método bloqueioInicial

    /*
     * método para liberar a tela
     */
    public void botaoNovo() {
        // desabilitando os botões de CRUD
        this.tela.getBtNovo().setEnabled(false);
        this.tela.getBtAlterar().setEnabled(false);
        this.tela.getBtExcluir().setEnabled(false);
        this.tela.getBtSair().setEnabled(false);
        // habilitando os textFields
        this.tela.getTfDescricao().setEnabled(true);
        this.tela.getCbxFornecedor().setEnabled(true);
        this.tela.getTfValorCusto().setEnabled(true);
        this.tela.getTfValorVenda().setEnabled(true);
        // habilitando os botões
        this.tela.getBtSalvar().setEnabled(true);
        this.tela.getBtCancelar().setEnabled(true);
    }

    public void botaoCancelar() {
        // desabilitando os botões de CRUD
        this.tela.getBtNovo().setEnabled(true);
        this.tela.getBtAlterar().setEnabled(true);
        this.tela.getBtExcluir().setEnabled(true);
        this.tela.getBtSair().setEnabled(true);
        // método para bloquear os campos da tela
        bloqueioInicial();
        limparTela();
    }

    public void limparTela() {
        // limpando os textFields
        this.tela.getTfDescricao().setText(null);
        this.tela.getCbxFornecedor().setSelectedIndex(0);
        this.tela.getTfValorCusto().setText(null);
        this.tela.getTfValorVenda().setText(null);;
    }

    /*
     * método para caregar a combo de fornecedores
     */
    public void carregarComboFornecedores() {
        listaFornecedores = new FornecedorController().buscarTodos();
        this.tela.getCbxFornecedor().addItem("- Selecione um Fornecedor -");
        for (Fornecedor fornecedor : listaFornecedores) {
            this.tela.getCbxFornecedor().addItem(fornecedor.getPessoaJuridicaIdPessoaJuridica().getRazaoSocial());
        }
    }

    /*
     * método que controla a ação do botão Salvar
     */
    public void botaoSalvar() {
        if (validaDados()) {
            if (alterar) {
                tela.getTfDescricao().getText();
                tela.getCbxFornecedor().addItem(produto.getFornecedorIdFornecedor().getPessoaJuridicaIdPessoaJuridica().getRazaoSocial());
                tela.getTfValorCusto().getText();
                tela.getTfValorVenda().getText();

            } else {
                produto = new Produto();
            }

            produto.setDescricao(this.tela.getTfDescricao().getText());
            produto.setFornecedorIdFornecedor(listaFornecedores.get(this.tela.getCbxFornecedor().getSelectedIndex() - 1));
            produto.setValorCusto(Util.getDouble(this.tela.getTfValorCusto().getText()));
            produto.setValorVenda(Util.getDouble(this.tela.getTfValorVenda().getText()));

            try {
                new ProdutoDAO().salvar(produto);
                JOptionPane.showMessageDialog(tela, Mensagem.produto_salvo, Mensagem.cadastro_produto, 1);
                botaoCancelar();
                carregarTabela();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(tela, Mensagem.produto_erro, Mensagem.cadastro_produto, 0);
            }
        }
    }

    /*
     * método para validar dados
     */
    private boolean validaDados() {

        // validando a descrição
        if (Valida.isEmptyOrNull(this.tela.getTfDescricao().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.descricaoVazio, Mensagem.cadastro_produto, 0);
            this.tela.getTfDescricao().grabFocus();
            return false;
        }

        // validando a combo de fornecedor
        if (Valida.isComboInvalida(this.tela.getCbxFornecedor().getSelectedIndex())) {
            JOptionPane.showMessageDialog(null, Mensagem.fornecedorVazio, Mensagem.cadastro_produto, 0);
            this.tela.getCbxFornecedor().grabFocus();
            return false;
        }

        // validando o valor de custo
        if (!Valida.isDouble(this.tela.getTfValorCusto().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.valorCustoVazio, Mensagem.cadastro_produto, 0);
            this.tela.getTfValorCusto().grabFocus();
            return false;
        }

        // validando o valor de venda
        if (!Valida.isDouble(this.tela.getTfValorVenda().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.valorVendaVazio, Mensagem.cadastro_produto, 0);
            this.tela.getTfValorVenda().grabFocus();
            return false;
        }

        return true;
    }

    /*
     * método para acessar a classe DAO e consultar os registros na tabela
     */
    public ArrayList<Produto> buscarTodos() {
        try {
            // acessando a classe DAO  e efetuando a consulta
            return listaProdutos = new ProdutoDAO().buscarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            // mensagem de erro
            JOptionPane.showMessageDialog(tela, Mensagem.consultar_n_ok_produto, Mensagem.consulta_produto, 0);
        }
        return null;
    }// fim do método buscarTodos

    /*
     * método para carregar a tabela de Fornecedores cadastrados
     */
    public void carregarTabela() {
        buscarTodos();
        // capturando o modelo da tabela atual
        DefaultTableModel modelo = (DefaultTableModel) tela.getTabela().getModel();
        // inicializando as linhas da tabela
        modelo.setRowCount(0);
        // laço de repetição para preencher as linhas da tabela
        for (Produto produto : listaProdutos) {
            modelo.addRow(new String[]{produto.getDescricao(), produto.getFornecedorIdFornecedor().getPessoaJuridicaIdPessoaJuridica().getRazaoSocial(), produto.getValorCusto() + "", produto.getValorVenda() + ""});
        }
    }// fim do método carregarTabela

    /*
     * método que controla a ação do botão alterar
     */
    public void botaoAlterar() {
        alterar = true;
        if (this.tela.getTabela().getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(tela, Mensagem.selecione_produto, Mensagem.cadastro_produto, 0);
        } else {
            produto = listaProdutos.get(tela.getTabela().getSelectedRow());
            bloqueioAlterar();
            carregarTela();
        }
    }

    /*
     * método para carregar a tela com dados do Fornecedor
     */
    private void carregarTela() {
        tela.getTfDescricao().setText(produto.getDescricao());
        tela.getTfValorCusto().setText(produto.getValorCusto() + "");
        tela.getTfValorVenda().setText(produto.getValorVenda() + "");
        tela.getCbxFornecedor().setSelectedItem(produto.getFornecedorIdFornecedor().getPessoaJuridicaIdPessoaJuridica().getRazaoSocial());
    }

    /*
     * método para bloquear os campos ação do alterar
     */
    private void bloqueioAlterar() {
        this.tela.getBtNovo().setEnabled(false);
        this.tela.getBtAlterar().setEnabled(false);
        this.tela.getBtExcluir().setEnabled(false);
        this.tela.getBtSair().setEnabled(false);
        this.tela.getBtSalvar().setEnabled(true);
        this.tela.getBtCancelar().setEnabled(true);

        this.tela.getTfDescricao().setEnabled(true);
        this.tela.getTfValorCusto().setEnabled(true);
        this.tela.getTfValorVenda().setEnabled(true);
        this.tela.getCbxFornecedor().setEnabled(true);
    }

    /*
     * método que controla a ação do botão Excluir
     */
    public void botaoExcluir() {
        // verificando se o usuário selecionou algum registro
        if (tela.getTabela().getSelectedRow() < 0) {
            // exibindo a mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.selecione_produto, Mensagem.excluir_produto, 0);
        } else {
            // verificando a exclusão do produto
            int opcao = JOptionPane.showConfirmDialog(null, Mensagem.deseja_excluir_produto, Mensagem.excluir_produto, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                // inicializando o objeto Fornecedor com o aluno da tabela
                produto = listaProdutos.get(tela.getTabela().getSelectedRow());
                // excluindo registro
                new ProdutoDAO().excluir(produto);

                JOptionPane.showMessageDialog(null, Mensagem.excluir_produto_ok, Mensagem.cadastro_produto, 1);
                // carregando a tabela
                carregarTabela();
            }
        }
    }
}// fim da classe
