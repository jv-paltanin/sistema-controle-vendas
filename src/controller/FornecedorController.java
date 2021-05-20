package controller;

import dao.FornecedorDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import model.Contato;
import model.Endereco;
import model.Estado;
import model.Fornecedor;
import model.PessoaJuridica;
import util.Mensagem;
import util.Util;
import util.Valida;
import view.FornecedorView;

/**
 *
 * @author João Victor
 */
public class FornecedorController {

    // atributo para manipular a tela de cadastro
    private FornecedorView tela;
    private ArrayList<Estado> listaEstados;
    private ArrayList<Cidade> listaCidades;

    // lista de forncedores para preencher tabela, alterar e excluir
    private ArrayList<Fornecedor> listaFornecedores;

    // objeto Fornecedor para incluir ou alterar
    private Fornecedor fornecedor;

    private PessoaJuridica pessoa;
    private Endereco endereco;
    private Contato contato;

    //flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    // construtor vazio
    public FornecedorController() {
    }

    // construtor para valorizar o objeto de tela
    public FornecedorController(FornecedorView tela) {
        this.tela = tela;
    }

    /*
     * Método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        // desabilitando os textFields
        this.tela.getTfCnpj().setEnabled(false);
        this.tela.getTfRazaoSocial().setEnabled(false);
        this.tela.getTfInscricaoEstadual().setEnabled(false);
        this.tela.getTfDataFundacao().setEnabled(false);
        this.tela.getTfEndereco().setEnabled(false);
        this.tela.getTfNumero().setEnabled(false);
        this.tela.getTfComplemento().setEnabled(false);
        this.tela.getTfBairro().setEnabled(false);
        this.tela.getTfCep().setEnabled(false);
        this.tela.getCbxEstados().setEnabled(false);
        this.tela.getCbxCidades().setEnabled(false);
        this.tela.getTfEmail().setEnabled(false);
        this.tela.getTfCelular().setEnabled(false);
        this.tela.getTfContato().setEnabled(false);
        this.tela.getTfTelefone().setEnabled(false);
        // desabilistando os botões
        this.tela.getBtSalvar().setEnabled(false);
        this.tela.getBtCancelar().setEnabled(false);
    }// fim do método bloqueioInicial

    /*
     * método para liberar a tela
     */
    public void botaoNovo() {
        tela.getAbasFornecedor().setSelectedIndex(0);
        alterar = false;
        // desabilitando os botões de CRUD
        this.tela.getBtNovo().setEnabled(false);
        this.tela.getBtAlterar().setEnabled(false);
        this.tela.getBtExcluir().setEnabled(false);
        this.tela.getBtSair().setEnabled(false);

        this.tela.getTfCnpj().setEnabled(true);
        this.tela.getTfRazaoSocial().setEnabled(true);
        this.tela.getTfInscricaoEstadual().setEnabled(true);
        this.tela.getTfDataFundacao().setEnabled(true);
        this.tela.getTfEndereco().setEnabled(true);
        this.tela.getTfNumero().setEnabled(true);
        this.tela.getTfComplemento().setEnabled(true);
        this.tela.getTfBairro().setEnabled(true);
        this.tela.getTfCep().setEnabled(true);
        this.tela.getCbxEstados().setEnabled(true);
        this.tela.getCbxCidades().setEnabled(true);
        this.tela.getTfEmail().setEnabled(true);
        this.tela.getTfCelular().setEnabled(true);
        this.tela.getTfContato().setEnabled(true);
        this.tela.getTfTelefone().setEnabled(true);
        // habilitando os botões
        this.tela.getBtSalvar().setEnabled(true);
        this.tela.getBtCancelar().setEnabled(true);

    }

    /*
     * método que controla a ação do botão alterar
     */
    public void botaoAlterar() {
        alterar = true;
        if (this.tela.getTabela().getSelectedRow() < 0) {
            tela.getAbasFornecedor().setSelectedIndex(1);
            JOptionPane.showMessageDialog(tela, Mensagem.selecione_fornecedor, Mensagem.cadastro_fornecedor, 0);
        } else {
            tela.getAbasFornecedor().setSelectedIndex(0);
            fornecedor = listaFornecedores.get(tela.getTabela().getSelectedRow());
            bloqueioAlterar();
            carregarTela();
        }
    }

    /*
     * método para carregar a tela com dados do Fornecedor
     */
    private void carregarTela() {
        tela.getTfCnpj().setText(fornecedor.getPessoaJuridicaIdPessoaJuridica().getCnpj());
        tela.getTfInscricaoEstadual().setText(fornecedor.getPessoaJuridicaIdPessoaJuridica().getInscricaoEstadual());
        tela.getTfRazaoSocial().setText(fornecedor.getPessoaJuridicaIdPessoaJuridica().getRazaoSocial());
        tela.getTfDataFundacao().setText(fornecedor.getPessoaJuridicaIdPessoaJuridica().getDataFundacao());
        tela.getTfEndereco().setText(fornecedor.getEnderecoIdEndereco().getNome());
        tela.getTfNumero().setText(fornecedor.getEnderecoIdEndereco().getNumero() + "");
        tela.getTfComplemento().setText(fornecedor.getEnderecoIdEndereco().getComplemento());
        tela.getTfBairro().setText(fornecedor.getEnderecoIdEndereco().getBairro());
        tela.getCbxEstados().setSelectedItem(fornecedor.getEnderecoIdEndereco().getCidadeIdCidade().getEstadoIdEstado().getNome());
        tela.getCbxCidades().setSelectedItem(fornecedor.getEnderecoIdEndereco().getCidadeIdCidade().getNome());
        tela.getTfCep().setText(fornecedor.getEnderecoIdEndereco().getCep());
        tela.getTfTelefone().setText(fornecedor.getContatoIdContato().getTelefone());
        tela.getTfCelular().setText(fornecedor.getContatoIdContato().getCelular());
        tela.getTfEmail().setText(fornecedor.getContatoIdContato().getEmail());
        tela.getTfContato().setText(fornecedor.getContato());

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

        this.tela.getTfRazaoSocial().setEnabled(true);
        this.tela.getTfEndereco().setEnabled(true);
        this.tela.getTfNumero().setEnabled(true);
        this.tela.getTfComplemento().setEnabled(true);
        this.tela.getTfBairro().setEnabled(true);
        this.tela.getTfCep().setEnabled(true);
        this.tela.getCbxEstados().setEnabled(true);
        this.tela.getCbxCidades().setEnabled(true);
        this.tela.getTfEmail().setEnabled(true);
        this.tela.getTfCelular().setEnabled(true);
        this.tela.getTfContato().setEnabled(true);
        this.tela.getTfTelefone().setEnabled(true);
    }

    /*
     * método que controla a ação do botão Excluir
     */
    public void botaoExcluir() {
        // verificando se o usuário selecionou algum registro
        if (tela.getTabela().getSelectedRow() < 0) {
            tela.getAbasFornecedor().setSelectedIndex(1);
            // exibindo a mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.selecione_fornecedor, Mensagem.excluir_fornecedor, 0);
        } else {
            // verificando a exclusão do fornecedor
            int opcao = JOptionPane.showConfirmDialog(null, Mensagem.deseja_excluir_fornecedor, Mensagem.excluir_fornecedor, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                fornecedor = listaFornecedores.get(tela.getTabela().getSelectedRow());
                // excluindo registro
                new FornecedorDAO().excluir(fornecedor);

                new ContatoController().excluir(fornecedor.getContatoIdContato());
                new EnderecoController().excluir(fornecedor.getEnderecoIdEndereco());
                new PessoaJuridicaController().excluir(fornecedor.getPessoaJuridicaIdPessoaJuridica());

                JOptionPane.showMessageDialog(null, Mensagem.excluir_fornecedor_ok, Mensagem.cadastro_fornecedor, 1);
                // carregando a tabela
                carregarTabela();
            }
        }
    }

    /*
     * método que controla a ação do botão Salvar
     */
    public void botaoSalvar() {

        if (validaDados()) {
            if (alterar) {
                pessoa = fornecedor.getPessoaJuridicaIdPessoaJuridica();
                endereco = fornecedor.getEnderecoIdEndereco();
                contato = fornecedor.getContatoIdContato();
            } else {
                fornecedor = new Fornecedor();
                pessoa = new PessoaJuridica();
                endereco = new Endereco();
                contato = new Contato();
            }
            pessoa = getPessoaJuridica();
            endereco = getEndereco();
            contato = getContato();

            new PessoaJuridicaController().salvar(pessoa);
            new EnderecoController().salvar(endereco);
            new ContatoController().salvar(contato);

            fornecedor.setContato(this.tela.getTfContato().getText());
            fornecedor.setPessoaJuridicaIdPessoaJuridica(pessoa);
            fornecedor.setEnderecoIdEndereco(endereco);
            fornecedor.setContatoIdContato(contato);

            try {
                new FornecedorDAO().salvar(fornecedor);
                JOptionPane.showMessageDialog(tela, Mensagem.fornecedor_salvo, Mensagem.cadastro_fornecedor, 1);
                botaoCancelar();
                carregarTabela();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(tela, Mensagem.fornecedor_erro, Mensagem.cadastro_fornecedor, 0);
            }

            //carregando tabela
            carregarTabela();
        }
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
        this.tela.getTfCnpj().setValue(null);
        this.tela.getTfRazaoSocial().setText(null);
        this.tela.getTfInscricaoEstadual().setValue(null);
        this.tela.getTfDataFundacao().setValue(null);
        this.tela.getTfEndereco().setText(null);
        this.tela.getTfNumero().setText(null);
        this.tela.getTfComplemento().setText(null);
        this.tela.getTfBairro().setText(null);
        this.tela.getTfCep().setValue(null);
        this.tela.getCbxEstados().setSelectedIndex(0);
        this.tela.getCbxCidades().setSelectedIndex(0);
        this.tela.getTfEmail().setText(null);
        this.tela.getTfCelular().setValue(null);
        this.tela.getTfContato().setText(null);
        this.tela.getTfTelefone().setValue(null);
    }

    /*
     * método para caregar a combo de estados
     */
    public void carregarComboEstados() {
        listaEstados = new EstadoController().buscarTodos();
        this.tela.getCbxEstados().addItem("- Selecione Estado -");
        for (Estado estado : listaEstados) {
            this.tela.getCbxEstados().addItem(estado.getNome());
        }
    }

    public void carregarComboCidades() {
        int indice = this.tela.getCbxEstados().getSelectedIndex() - 1;
        if (indice >= 0) {
            try {
                listaCidades = new CidadeController().buscarPorEstado(listaEstados.get(indice));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar cidade");
                Logger
                        .getLogger(FornecedorController.class
                                .getName()).log(Level.SEVERE, null, e);
            }
            this.tela.getCbxCidades().removeAllItems();
            this.tela.getCbxCidades().addItem("- Selecione Cidade -");
            for (Cidade cidade : listaCidades) {
                this.tela.getCbxCidades().addItem(cidade.getNome());

            }
        }
    }// fim do método carregarComboCidades

    /*
     * método para validar dados
     */
    private boolean validaDados() {

        // validando o CNPJ
        if (Valida.isCnpjVazio(this.tela.getTfCnpj().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cnpjVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfCnpj().grabFocus();
            return false;
        } else if (Valida.isCnpjInvalido(this.tela.getTfCnpj().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cnpjInvalido, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfCnpj().grabFocus();
            return false;
        }

        // validando a Inscrição Estadual
        if (Valida.isInscricaoEstadualVazio(this.tela.getTfInscricaoEstadual().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.inscricaoEstadualVazia, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfInscricaoEstadual().grabFocus();
            return false;
        } else if (Valida.isInscricaoEstadualInvalida(this.tela.getTfInscricaoEstadual().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.inscricaoEstadualInvalida, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfInscricaoEstadual().grabFocus();
            return false;
        }

        // validando a razão social
        if (Valida.isEmptyOrNull(this.tela.getTfRazaoSocial().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.razaoSocialVazia, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfRazaoSocial().grabFocus();
            return false;
        }

        // validando a Data de Fundação
        if (Valida.isDataVazia(this.tela.getTfDataFundacao().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.dataFundacaoVazia, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfDataFundacao().grabFocus();
            return false;
        } else if (Valida.isDataInvalida(this.tela.getTfDataFundacao().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.dataFundacaoInvalida, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfDataFundacao().grabFocus();
            return false;
        } else if (Util.getDataAtual() < Util.getDataInformada(this.tela.getTfDataFundacao().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.dataFundacaoInvalida, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfDataFundacao().grabFocus();
            return false;
        }

        // validando o endereço
        if (Valida.isEmptyOrNull(this.tela.getTfEndereco().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.enderecoVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfEndereco().grabFocus();
            return false;
        }

        // validando o número
        if (!Valida.isInteger(this.tela.getTfNumero().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.numeroVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfNumero().grabFocus();
            return false;
        }

        // validando o bairro
        if (Valida.isEmptyOrNull(this.tela.getTfBairro().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.bairroVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfBairro().grabFocus();
            return false;
        }

        // validando o estado
        if (Valida.isComboInvalida(this.tela.getCbxEstados().getSelectedIndex())) {
            JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getCbxEstados().grabFocus();
            return false;
        }

        // validando a cidade
        if (Valida.isComboInvalida(this.tela.getCbxCidades().getSelectedIndex())) {
            JOptionPane.showMessageDialog(null, Mensagem.cidadeVazia, Mensagem.cadastro_fornecedor, 0);
            this.tela.getCbxCidades().grabFocus();
            return false;
        }

        // validando o cep
        if (Valida.isCepVazio(this.tela.getTfCep().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cepVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfCep().grabFocus();
            return false;
        }

        // validando o celular
        if (Valida.isCelularVazio(this.tela.getTfCelular().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.celularVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfCelular().grabFocus();
            return false;
        }

        // validando o email
        if (Valida.isEmptyOrNull(this.tela.getTfEmail().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.emailVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfEmail().grabFocus();
            return false;
        } else if (!Valida.validaEmail(this.tela.getTfEmail().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.emailInvalido, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfEmail().grabFocus();
            return false;
        }

        // validando o contato
        if (Valida.isEmptyOrNull(this.tela.getTfContato().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.contatoVazio, Mensagem.cadastro_fornecedor, 0);
            this.tela.getTfContato().grabFocus();
            return false;
        }

        return true;
    }

    /*
     * método para retornar um novo objeto
     */
    private PessoaJuridica getPessoaJuridica() {
        pessoa.setCnpj(this.tela.getTfCnpj().getText());
        pessoa.setInscricaoEstadual(this.tela.getTfInscricaoEstadual().getText());
        pessoa.setRazaoSocial(this.tela.getTfRazaoSocial().getText());
        pessoa.setDataFundacao(this.tela.getTfDataFundacao().getText());

        return pessoa;
    }

    /*
     * método para retornar um novo objeto
     */
    private Endereco getEndereco() {
        endereco.setNome(this.tela.getTfEndereco().getText());
        endereco.setNumero(Util.getInteger(this.tela.getTfNumero().getText()));
        endereco.setComplemento(this.tela.getTfComplemento().getText());
        endereco.setBairro(this.tela.getTfBairro().getText());
        endereco.setCep(this.tela.getTfCep().getText());
        endereco.setCidadeIdCidade(listaCidades.get(this.tela.getCbxCidades().getSelectedIndex() - 1));

        return endereco;
    }

    /*
     * método para retornar um novo objeto
     */
    private Contato getContato() {
        contato.setTelefone(this.tela.getTfTelefone().getText());
        contato.setCelular(this.tela.getTfCelular().getText());
        contato.setEmail(this.tela.getTfEmail().getText());
        return contato;
    }

    /*
     * método para acessar a classe DAO e consultar os registros na tabela
     */
    public ArrayList<Fornecedor> buscarTodos() {
        try {
            // acessando a classe DAO  e efetuando a consulta
            return listaFornecedores = new FornecedorDAO().buscarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            // mensagem de erro
            JOptionPane.showMessageDialog(tela, Mensagem.consultar_n_ok_fornecedor, Mensagem.consulta_fornecedor, 0);
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
        for (Fornecedor fornecedor : listaFornecedores) {
            modelo.addRow(new String[]{fornecedor.getPessoaJuridicaIdPessoaJuridica().getRazaoSocial(), fornecedor.getContatoIdContato().getTelefone(), fornecedor.getContato(), fornecedor.getEnderecoIdEndereco().getCidadeIdCidade().getNome()});
        }
    }// fim do método carregarTabela

}// fim da classe
