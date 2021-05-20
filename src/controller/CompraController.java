package controller;

import java.util.ArrayList;
import model.Compra;
import view.CompraView;

/**
 *
 * @author João Victor
 */
public class CompraController {

    // atributo para manipular a tela de cadastro
    private CompraView tela;

    // lista de compras para preencher tabela, alterar e excluir
    private ArrayList<Compra> listaCompra;

    // flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    // construtor vazio
    public CompraController() {
    }

    // construtor para valorizar o objeto de tela
    public CompraController(CompraView tela) {
        this.tela = tela;
    }

    /*
     * Método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        // desabilitando os textFields
        this.tela.getBtIniciaCompra().setEnabled(false);
        this.tela.getCbxFuncionario().setEnabled(false);
        this.tela.getCbxFornecedor().setEnabled(false);
        this.tela.getCbxProduto().setEnabled(false);
        this.tela.getTfQuantidade().setEnabled(false);
        this.tela.getBtSalvarProduto().setEnabled(false);
        this.tela.getBtExcluirProduto().setEnabled(false);
        this.tela.getCbxFormaPagamento().setEnabled(false);
        this.tela.getBtIncluirFormaPagamento().setEnabled(false);
        this.tela.getBtExcluirFormaPagamento().setEnabled(false);

        // desabilistando os botões
        this.tela.getBtCancelar().setEnabled(false);
    }// fim do método bloqueioInicial

}
