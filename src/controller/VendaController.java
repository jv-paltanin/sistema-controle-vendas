package controller;

import java.util.ArrayList;
import model.Venda;
import view.VendaView;

/**
 *
 * @author João Victor
 */
public class VendaController {

    // atributo para manipular a tela de cadastro
    private VendaView tela;

    // lista de vendas para preencher tabela, alterar e excluir
    private ArrayList<Venda> listaVenda;

    // flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    // construtor vazio
    public VendaController() {
    }

    // construtor para valorizar o objeto de tela
    public VendaController(VendaView tela) {
        this.tela = tela;
    }

    /*
     * Método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        // desabilitando os textFields
        this.tela.getBtIniciaVenda().setEnabled(false);
        this.tela.getCbxCliente().setEnabled(false);
        this.tela.getCbxFuncionario().setEnabled(false);
        this.tela.getCbxProduto().setEnabled(false);
        this.tela.getTfQuantidade().setEnabled(false);
        this.tela.getTfDescontoProdutos().setEditable(false);
        this.tela.getCbxFormaPagamento().setEnabled(false);
        this.tela.getTfDescontoPagamento().setEditable(false);
        this.tela.getBtIncluir().setEnabled(false);
        this.tela.getBtExcluir().setEnabled(false);

        // desabilistando os botões
        this.tela.getBtSalvar().setEnabled(false);
        this.tela.getBtExcluirProduto().setEnabled(false);
        this.tela.getBtCancelar().setEnabled(false);
    }// fim do método bloqueioInicial

}
