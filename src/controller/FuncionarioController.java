package controller;

import dao.FuncionarioDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import model.Contato;
import model.Endereco;
import model.Estado;
import model.Funcionario;
import model.PessoaFisica;
import util.Mensagem;
import util.Util;
import util.Valida;
import view.FuncionarioView;

/**
 *
 * @author João Victor
 */
public class FuncionarioController {

    // atributo para manipular a tela de cadastro
    private FuncionarioView tela;
    private ArrayList<Estado> listaEstados;
    private ArrayList<Cidade> listaCidades;

    // lista de funcionários para preencher tabela, alterar e excluir
    private ArrayList<Funcionario> listaFuncionarios;

    // objeto Funcionario para incluir ou alterar
    private Funcionario funcionario;

    private PessoaFisica pessoa;
    private Endereco endereco;
    private Contato contato;

    // flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    // construtor vazio
    public FuncionarioController() {
    }

    // construtor para valorizar o objeto de tela
    public FuncionarioController(FuncionarioView tela) {
        this.tela = tela;
    }

    /*
     * Método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        // desabilitando os textFields
        this.tela.getTfCpf().setEnabled(false);
        this.tela.getTfRg().setEnabled(false);
        this.tela.getTfNome().setEnabled(false);
        this.tela.getTfDataNascimento().setEnabled(false);
        this.tela.getTfEndereco().setEnabled(false);
        this.tela.getTfNumero().setEnabled(false);
        this.tela.getTfComplemento().setEnabled(false);
        this.tela.getTfBairro().setEnabled(false);
        this.tela.getTfCep().setEnabled(false);
        this.tela.getCbxEstados().setEnabled(false);
        this.tela.getCbxCidades().setEnabled(false);
        this.tela.getTfEmail().setEnabled(false);
        this.tela.getTfCelular().setEnabled(false);
        this.tela.getTfTelefone().setEnabled(false);
        this.tela.getTfLogin().setEnabled(false);
        this.tela.getTfSenha().setEnabled(false);
        this.tela.getCheckMostraSenha().setEnabled(false);
        this.tela.getTfSenha().setEchoChar('*');

        // desabilistando os botões
        this.tela.getBtSalvar().setEnabled(false);
        this.tela.getBtCancelar().setEnabled(false);
    }// fim do método bloqueioInicial

    /*
     * método que controla a ação do botão alterar
     */
    public void botaoAlterar() {
        alterar = true;
        if (this.tela.getTabela().getSelectedRow() < 0) {
            tela.getAbasFuncionario().setSelectedIndex(2);
            JOptionPane.showMessageDialog(tela, Mensagem.selecione_fornecedor, Mensagem.cadastro_fornecedor, 0);
        } else {
            tela.getAbasFuncionario().setSelectedIndex(0);
            funcionario = listaFuncionarios.get(tela.getTabela().getSelectedRow());
            bloqueioAlterar();
            carregarTela();
        }
    }

    /*
     * método para carregar a tela com dados do Fornecedor
     */
    private void carregarTela() {
        tela.getTfCpf().setText(funcionario.getPessoaFisicaIdPessoaFisica().getCpf());
        tela.getTfRg().setText(funcionario.getPessoaFisicaIdPessoaFisica().getRg());
        tela.getTfNome().setText(funcionario.getPessoaFisicaIdPessoaFisica().getNome());
        tela.getTfDataNascimento().setText(funcionario.getPessoaFisicaIdPessoaFisica().getDataNascimento());
        tela.getTfEndereco().setText(funcionario.getEnderecoIdEndereco().getNome());
        tela.getTfNumero().setText(funcionario.getEnderecoIdEndereco().getNumero() + "");
        tela.getTfComplemento().setText(funcionario.getEnderecoIdEndereco().getComplemento());
        tela.getTfBairro().setText(funcionario.getEnderecoIdEndereco().getBairro());
        tela.getCbxEstados().setSelectedItem(funcionario.getEnderecoIdEndereco().getCidadeIdCidade().getEstadoIdEstado().getNome());
        tela.getCbxCidades().setSelectedItem(funcionario.getEnderecoIdEndereco().getCidadeIdCidade().getNome());
        tela.getTfCep().setText(funcionario.getEnderecoIdEndereco().getCep());
        tela.getTfTelefone().setText(funcionario.getContatoIdContato().getTelefone());
        tela.getTfCelular().setText(funcionario.getContatoIdContato().getCelular());
        tela.getTfEmail().setText(funcionario.getContatoIdContato().getEmail());

        tela.getTfLogin().setText(funcionario.getLogin());
        tela.getTfSenha().setText(funcionario.getSenha());
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

        this.tela.getTfNome().setEnabled(true);
        this.tela.getTfEndereco().setEnabled(true);
        this.tela.getTfNumero().setEnabled(true);
        this.tela.getTfComplemento().setEnabled(true);
        this.tela.getTfBairro().setEnabled(true);
        this.tela.getTfCep().setEnabled(true);
        this.tela.getCbxEstados().setEnabled(true);
        this.tela.getCbxCidades().setEnabled(true);
        this.tela.getTfEmail().setEnabled(true);
        this.tela.getTfCelular().setEnabled(true);
        this.tela.getTfTelefone().setEnabled(true);

        this.tela.getTfLogin().setEnabled(true);
        this.tela.getTfSenha().setEnabled(true);
        this.tela.getCheckMostraSenha().setEnabled(true);
    }

    /*
     * método para liberar a tela
     */
    public void botaoNovo() {
        tela.getAbasFuncionario().setSelectedIndex(0);
        // desabilitando os botões de CRUD
        this.tela.getBtNovo().setEnabled(false);
        this.tela.getBtAlterar().setEnabled(false);
        this.tela.getBtExcluir().setEnabled(false);
        this.tela.getBtSair().setEnabled(false);
        // habilitando os botões de CRUD
        this.tela.getTfCpf().setEnabled(true);
        this.tela.getTfRg().setEnabled(true);
        this.tela.getTfNome().setEnabled(true);
        this.tela.getTfDataNascimento().setEnabled(true);
        this.tela.getTfEndereco().setEnabled(true);
        this.tela.getTfNumero().setEnabled(true);
        this.tela.getTfComplemento().setEnabled(true);
        this.tela.getTfBairro().setEnabled(true);
        this.tela.getTfCep().setEnabled(true);
        this.tela.getCbxEstados().setEnabled(true);
        this.tela.getCbxCidades().setEnabled(true);
        this.tela.getTfEmail().setEnabled(true);
        this.tela.getTfCelular().setEnabled(true);
        this.tela.getTfTelefone().setEnabled(true);
        this.tela.getTfLogin().setEnabled(true);
        this.tela.getTfSenha().setEnabled(true);
        this.tela.getCheckMostraSenha().setEnabled(true);
        // habilitando os botões
        this.tela.getBtSalvar().setEnabled(true);
        this.tela.getBtCancelar().setEnabled(true);
    }

    /*
     * método que controla a ação do botão Excluir
     */
    public void botaoExcluir() {
        // verificando se o usuário selecionou algum registro
        if (tela.getTabela().getSelectedRow() < 0) {
            tela.getAbasFuncionario().setSelectedIndex(2);
            // exibindo a mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.selecione_funcionario, Mensagem.excluir_funcionario, 0);
        } else {
            // verificando a exclusão do funcionario
            int opcao = JOptionPane.showConfirmDialog(null, Mensagem.deseja_excluir_funcionario, Mensagem.excluir_funcionario, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                // inicializando o objeto Fornecedor com o aluno da tabela
                funcionario = listaFuncionarios.get(tela.getTabela().getSelectedRow());
                // excluindo registro
                new FuncionarioDAO().excluir(funcionario);

                new ContatoController().excluir(funcionario.getContatoIdContato());
                new EnderecoController().excluir(funcionario.getEnderecoIdEndereco());
                new PessoaFisicaController().excluir(funcionario.getPessoaFisicaIdPessoaFisica());

                JOptionPane.showMessageDialog(null, Mensagem.excluir_funcionario_ok, Mensagem.cadastro_funcionario, 1);
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
                pessoa = funcionario.getPessoaFisicaIdPessoaFisica();
                endereco = funcionario.getEnderecoIdEndereco();
                contato = funcionario.getContatoIdContato();
            } else {
                funcionario = new Funcionario();
                pessoa = new PessoaFisica();
                endereco = new Endereco();
                contato = new Contato();
            }
            pessoa = getPessoaFisica();
            endereco = getEndereco();
            contato = getContato();

            new PessoaFisicaController().salvar(pessoa);
            new EnderecoController().salvar(endereco);
            new ContatoController().salvar(contato);

            funcionario.setLogin(this.tela.getTfLogin().getText());
            String senha = String.valueOf(this.tela.getTfSenha().getPassword());
            funcionario.setSenha(senha);
            funcionario.setPessoaFisicaIdPessoaFisica(pessoa);
            funcionario.setEnderecoIdEndereco(endereco);
            funcionario.setContatoIdContato(contato);

            try {
                new FuncionarioDAO().salvar(funcionario);
                JOptionPane.showMessageDialog(tela, Mensagem.funcionario_salvo, Mensagem.cadastro_funcionario, 1);
                botaoCancelar();
                carregarTabela();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(tela, Mensagem.funcionario_erro, Mensagem.cadastro_funcionario, 0);
            }

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
        this.tela.getTfCpf().setValue(null);
        this.tela.getTfRg().setValue(null);
        this.tela.getTfNome().setText(null);
        this.tela.getTfDataNascimento().setValue(null);
        this.tela.getTfEndereco().setText(null);
        this.tela.getTfNumero().setText(null);
        this.tela.getTfComplemento().setText(null);
        this.tela.getTfBairro().setText(null);
        this.tela.getTfCep().setValue(null);
        this.tela.getCbxEstados().setSelectedIndex(0);
        this.tela.getCbxCidades().setSelectedIndex(0);
        this.tela.getTfEmail().setText(null);
        this.tela.getTfCelular().setValue(null);
        this.tela.getTfTelefone().setValue(null);
        this.tela.getTfLogin().setText(null);
        this.tela.getTfSenha().setText(null);
        this.tela.getCheckMostraSenha().setSelected(false);
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
    }

    public void mostrarSenha() {
        if (this.tela.getCheckMostraSenha().isSelected()) {
            this.tela.getTfSenha().setEchoChar((char) 0);
        } else {
            this.tela.getTfSenha().setEchoChar('*');
        }
    }

    /*
     * método para validar dados
     */
    private boolean validaDados() {

        // validando o CPF
        if (Valida.isCpfVazio(this.tela.getTfCpf().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cpfVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfCpf().grabFocus();
            return false;
        } else if (Valida.isCpfInvalido(this.tela.getTfCpf().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cpfInvalido, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfCpf().grabFocus();
            return false;
        }

        // validando o RG
        if (Valida.isRgVazio(this.tela.getTfRg().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.rgVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfRg().grabFocus();
            return false;
        }

        // validando o nome
        if (Valida.isEmptyOrNull(this.tela.getTfNome().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfNome().grabFocus();
            return false;
        }

        // validando a Data de Nascimento
        if (Valida.isDataVazia(this.tela.getTfDataNascimento().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.dataNascimentoVazia, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfDataNascimento().grabFocus();
            return false;
        } else if (Valida.isDataInvalida(this.tela.getTfDataNascimento().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.dataNascimentoInvalida, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfDataNascimento().grabFocus();
            return false;
        } else if (Util.getDataAtual() < Util.getDataInformada(this.tela.getTfDataNascimento().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.dataNascimentoInvalida, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfDataNascimento().grabFocus();
            return false;
        }

        // validando o endereço
        if (Valida.isEmptyOrNull(this.tela.getTfEndereco().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.enderecoVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfEndereco().grabFocus();
            return false;
        }

        // validando o número
        if (!Valida.isInteger(this.tela.getTfNumero().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.numeroVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfNumero().grabFocus();
            return false;
        }

        // validando o bairro
        if (Valida.isEmptyOrNull(this.tela.getTfBairro().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.bairroVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfBairro().grabFocus();
            return false;
        }

        // validando o estado
        if (Valida.isComboInvalida(this.tela.getCbxEstados().getSelectedIndex())) {
            JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getCbxEstados().grabFocus();
            return false;
        }

        // validando a cidade
        if (Valida.isComboInvalida(this.tela.getCbxCidades().getSelectedIndex())) {
            JOptionPane.showMessageDialog(null, Mensagem.cidadeVazia, Mensagem.cadastro_funcionario, 0);
            this.tela.getCbxCidades().grabFocus();
            return false;
        }

        // validando o cep
        if (Valida.isCepVazio(this.tela.getTfCep().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.cepVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfCep().grabFocus();
            return false;
        }

        // validando o celular
        if (Valida.isCelularVazio(this.tela.getTfCelular().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.celularVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfCelular().grabFocus();
            return false;
        }

        // validando o email
        if (Valida.isEmptyOrNull(this.tela.getTfEmail().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.emailVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfEmail().grabFocus();
            return false;
        } else if (!Valida.validaEmail(this.tela.getTfEmail().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.emailInvalido, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfEmail().grabFocus();
            return false;
        }

        // validando o login
        if (Valida.isEmptyOrNull(this.tela.getTfLogin().getText())) {
            JOptionPane.showMessageDialog(null, Mensagem.loginVazio, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfLogin().grabFocus();
            return false;
        }

        // validando a senha
        String senha = String.valueOf(this.tela.getTfSenha().getPassword());
        if (Valida.isEmptyOrNull(senha)) {
            JOptionPane.showMessageDialog(null, Mensagem.senhaVazia, Mensagem.cadastro_funcionario, 0);
            this.tela.getTfSenha().grabFocus();
            return false;
        }

        return true;
    }

    /*
     * método para retornar um novo objeto
     */
    private PessoaFisica getPessoaFisica() {
        pessoa.setCpf(this.tela.getTfCpf().getText());
        pessoa.setRg(this.tela.getTfRg().getText());
        pessoa.setNome(this.tela.getTfNome().getText());
        pessoa.setDataNascimento(this.tela.getTfDataNascimento().getText());

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
    public ArrayList<Funcionario> buscarTodos() {
        try {
            // acessando a classe DAO  e efetuando a consulta
            return listaFuncionarios = new FuncionarioDAO().buscarTodos();

        } catch (Exception e) {
            e.printStackTrace();
            // mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.consultar_n_ok_funcionario, Mensagem.consulta_funcionario, 0);
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
        for (Funcionario funcionario : listaFuncionarios) {
            modelo.addRow(new String[]{funcionario.getPessoaFisicaIdPessoaFisica().getNome(), funcionario.getEnderecoIdEndereco().getCidadeIdCidade().getNome(), funcionario.getContatoIdContato().getTelefone(), funcionario.getContatoIdContato().getCelular()});
        }
    }// fim do método carregarTabela

    public ArrayList<Funcionario> buscarPorLogin(String login) {
        try {
            return new FuncionarioDAO().buscarPorLogin(login);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(tela, Mensagem.consultar_n_ok_funcionario, Mensagem.consulta_funcionario, 0);
        }
        return null;
    }

}// fim da classe
