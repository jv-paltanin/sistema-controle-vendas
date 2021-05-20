package controller;

import java.util.ArrayList;
import model.Estoque;
import view.EstoqueView;
import view.ProdutoView;

/**
 *
 * @author João Victor
 */
public class EstoqueController {

    // atributo para manipular a tela de cadastro
    private EstoqueView tela;

    // lista de estoques para preencher tabela, alterar e excluir
    private ArrayList<Estoque> listaEstoque;

    // flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    // construtor vazio
    public EstoqueController() {
    }

    // construtor para valorizar o objeto de tela
    public EstoqueController(EstoqueView tela) {
        this.tela = tela;
    }

    /*
     * Método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        // desabilitando os textFields
        this.tela.getCbxProduto_Fornecedor().setEnabled(false);
        this.tela.getTfQuantidadeEstoque().setEditable(false);
        this.tela.getTfQuantidadeMinima().setEditable(false);
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
        this.tela.getCbxProduto_Fornecedor().setEnabled(true);
        this.tela.getTfQuantidadeEstoque().setEditable(true);
        this.tela.getTfQuantidadeMinima().setEditable(true);
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
        this.tela.getTfQuantidadeEstoque().setText(null);
        this.tela.getTfQuantidadeMinima().setText(null);
        this.tela.getCbxProduto_Fornecedor().setSelectedIndex(0);
    }
}
