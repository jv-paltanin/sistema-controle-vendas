package controller;

import dao.ClienteDAO;
import java.util.ArrayList;
import model.Cliente;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.Cidade;
import model.Contato;
import model.Endereco;
import model.Estado;
import model.PessoaFisica;
import model.PessoaJuridica;
import util.Mascara;
import util.Mensagem;
import util.Pessoa;
import util.Util;
import util.Valida;
import view.ClienteView;

/**
 *
 * @author João Victor
 */
public class ClienteController {

    // atributo para manipular a tela de cadastro
    private ClienteView tela;

    // lista de clientes para preencher tabela, alterar e excluir
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Estado> listaEstados;
    private ArrayList<Cidade> listaCidades;

    // objeto Cliente para incluir ou alterar
    private Cliente cliente;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private Endereco endereco;
    private Contato contato;
    //flag para controlar a opção de incluir ou alterar
    private boolean alterar = false;

    // construtor vazio
    public ClienteController() {
    }

    // construtor para valorizar o objeto de tela
    public ClienteController(ClienteView tela) {
        this.tela = tela;
    }

    /*
     * Método para bloqueio inicial dos objetos
     */
    public void bloqueioInicial() {
        // desabilitando os textFields
        this.tela.getBtFisica().setEnabled(false);
        this.tela.getBtJuridica().setEnabled(false);
        this.tela.getTfNome().setEnabled(false);
        this.tela.getFtfCpfOuCnpj().setEnabled(false);
        this.tela.getFtfRgOuIe().setEnabled(false);
        this.tela.getFtfDataNascimentoOuDataFundacao().setEnabled(false);
        this.tela.getTfEndereco().setEnabled(false);
        this.tela.getTfNumero().setEnabled(false);
        this.tela.getTfComplemento().setEnabled(false);
        this.tela.getTfBairro().setEnabled(false);
        this.tela.getTfCep().setEnabled(false);
        this.tela.getCbxEstados().setEnabled(false);
        this.tela.getCbxCidades().setEnabled(false);
        this.tela.getTfEmail().setEnabled(false);
        this.tela.getTfCelular().setEnabled(false);
        this.tela.getTfCelular().setEnabled(false);
        this.tela.getTfTelefone().setEnabled(false);
        // desabilistando os botões
        this.tela.getBtSalvar().setEnabled(false);
        this.tela.getBtCancelar().setEnabled(false);
    }// fim do método bloqueioInicial 

    /*
     * método para liberar a tela
     */
    public void botaoNovo() {
        this.tela.getAbasCliente().setSelectedIndex(0);
        // desabilitando os botões de CRUD
        this.tela.getBtNovo().setEnabled(false);
        this.tela.getBtAlterar().setEnabled(false);
        this.tela.getBtExcluir().setEnabled(false);
        this.tela.getBtSair().setEnabled(false);
        // habilitando os textFields
        this.tela.getBtFisica().setEnabled(true);
        this.tela.getBtJuridica().setEnabled(true);
        this.tela.getTfNome().setEnabled(true);
        this.tela.getFtfCpfOuCnpj().setEnabled(true);
        this.tela.getFtfRgOuIe().setEnabled(true);
        this.tela.getFtfDataNascimentoOuDataFundacao().setEnabled(true);
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
        // habilitando os botões
        this.tela.getBtSalvar().setEnabled(true);
        this.tela.getBtCancelar().setEnabled(true);
        // agilizando o processo de cadastro
        this.tela.getBtFisica().setSelected(true);
        this.tela.getTfNome().grabFocus();
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
        this.tela.getGrpTipoPessoa().clearSelection();
        this.tela.getTfNome().setText(null);
        this.tela.getFtfCpfOuCnpj().setValue(null);
        this.tela.getFtfRgOuIe().setValue(null);
        this.tela.getFtfDataNascimentoOuDataFundacao().setValue(null);
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
    }

    public void mascaraCnpj() {

        try {
            this.tela.getFtfCpfOuCnpj().setValue(null);
            MaskFormatter cnpj = new MaskFormatter(Mascara.cnpjMascara);
            this.tela.getFtfCpfOuCnpj().setFormatterFactory(new DefaultFormatterFactory(cnpj));
            this.tela.getLbCpfOuCnpj().setText(Mensagem.cnpj);

        } catch (ParseException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mascaraCpf() {

        try {
            this.tela.getFtfCpfOuCnpj().setValue(null);
            MaskFormatter cpf = new MaskFormatter(Mascara.cpfMascara);
            this.tela.getFtfCpfOuCnpj().setFormatterFactory(new DefaultFormatterFactory(cpf));
            this.tela.getLbCpfOuCnpj().setText(Mensagem.cpf);

        } catch (ParseException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mascaraInscricaoEstadual() {

        try {
            this.tela.getFtfRgOuIe().setValue(null);
            MaskFormatter ie = new MaskFormatter(Mascara.ieMascara);
            this.tela.getFtfRgOuIe().setFormatterFactory(new DefaultFormatterFactory(ie));
            this.tela.getLbRgOuIe().setText(Mensagem.ie);

        } catch (ParseException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mascaraRg() {

        try {
            this.tela.getFtfRgOuIe().setValue(null);
            MaskFormatter rg = new MaskFormatter(Mascara.rgMascara);
            this.tela.getFtfRgOuIe().setFormatterFactory(new DefaultFormatterFactory(rg));
            this.tela.getLbRgOuIe().setText(Mensagem.rg);

        } catch (ParseException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mascaraDataNascimento() {

        try {
            this.tela.getFtfDataNascimentoOuDataFundacao().setValue(null);
            MaskFormatter data = new MaskFormatter(Mascara.dataMascara);
            this.tela.getFtfDataNascimentoOuDataFundacao().setFormatterFactory(new DefaultFormatterFactory(data));
            this.tela.getLbDataNascimentoOuDataFundacao().setText(Mensagem.dataNascimento);

        } catch (ParseException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mascaraDataFundacao() {

        try {
            this.tela.getFtfDataNascimentoOuDataFundacao().setValue(null);
            MaskFormatter data = new MaskFormatter(Mascara.dataMascara);
            this.tela.getFtfDataNascimentoOuDataFundacao().setFormatterFactory(new DefaultFormatterFactory(data));
            this.tela.getLbDataNascimentoOuDataFundacao().setText(Mensagem.dataFundacao);

        } catch (ParseException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mascaraNomeOuRazaoSocial() {
        this.tela.getTfNome().setText(null);
        if (this.tela.getBtFisica().isSelected()) {
            this.tela.getLbNome().setText(Mensagem.nomePessoaFisica);
        } else if (this.tela.getBtJuridica().isSelected()) {
            this.tela.getLbNome().setText(Mensagem.nomeRazaoSocial);
        }
        this.tela.getTfNome().grabFocus();
    }

    /*
     * método para controlar a ação do botão alterar
     */
    public void botaoAlterar() {
        alterar = true;
        if (tela.getTabela().getSelectedRow() < 0) {
            tela.getAbasCliente().setSelectedIndex(1);
            JOptionPane.showMessageDialog(tela, Mensagem.selecione_cliente, Mensagem.cadastro_cliente, 0);
        } else {
            cliente = listaClientes.get(tela.getTabela().getSelectedRow());
            tela.getAbasCliente().setSelectedIndex(0);
            bloqueioAlterar();
            carregarTela();
        }
    }

    /*
     * método para carregar os campos da tela
     */
    private void carregarTela() {
        mascaraNomeOuRazaoSocial();
        if (cliente.getTipoPessoa().equals("F")) {
            mascaraCpf();
            mascaraRg();
            mascaraDataNascimento();
            tela.getBtFisica().setSelected(true);
            this.tela.getTfNome().setText(cliente.getPessoaFisicaIdPessoaFisica().getNome());
            this.tela.getFtfDataNascimentoOuDataFundacao().setText(cliente.getPessoaFisicaIdPessoaFisica().getDataNascimento() + "");
            this.tela.getFtfRgOuIe().setText(cliente.getPessoaFisicaIdPessoaFisica().getRg());
            this.tela.getFtfCpfOuCnpj().setText(cliente.getPessoaFisicaIdPessoaFisica().getCpf());
        } else if (cliente.getTipoPessoa().equals("J")) {
            mascaraCnpj();
            mascaraInscricaoEstadual();
            mascaraDataFundacao();
            tela.getBtJuridica().setSelected(true);
            this.tela.getTfNome().setText(cliente.getPessoaJuridicaIdPessoaJuridica().getRazaoSocial());
            this.tela.getFtfDataNascimentoOuDataFundacao().setText(cliente.getPessoaJuridicaIdPessoaJuridica().getDataFundacao() + "");
            this.tela.getFtfRgOuIe().setText(cliente.getPessoaJuridicaIdPessoaJuridica().getInscricaoEstadual());
            this.tela.getFtfCpfOuCnpj().setText(cliente.getPessoaJuridicaIdPessoaJuridica().getCnpj());
        }

        this.tela.getTfEndereco().setText(cliente.getEnderecoIdEndereco().getNome());
        this.tela.getTfNumero().setText(cliente.getEnderecoIdEndereco().getNumero() + "");
        this.tela.getTfComplemento().setText(cliente.getEnderecoIdEndereco().getComplemento());
        this.tela.getTfBairro().setText(cliente.getEnderecoIdEndereco().getBairro());
        this.tela.getTfCep().setText(cliente.getEnderecoIdEndereco().getCep());
        this.tela.getCbxEstados().setSelectedItem(cliente.getEnderecoIdEndereco().getCidadeIdCidade().getEstadoIdEstado().getNome());
        this.tela.getCbxCidades().setSelectedItem(cliente.getEnderecoIdEndereco().getCidadeIdCidade().getNome());
        this.tela.getTfEmail().setText(cliente.getContatoIdContato().getEmail());
        this.tela.getTfCelular().setText(cliente.getContatoIdContato().getCelular());
        this.tela.getTfTelefone().setText(cliente.getContatoIdContato().getTelefone());

    }// fim do método carregarTela

    /*
     * método para bloquear os campos na ação do alterar 
     */
    public void bloqueioAlterar() {
        //bloqueando btões de opção
        tela.getBtNovo().setEnabled(false);
        tela.getBtAlterar().setEnabled(false);
        tela.getBtExcluir().setEnabled(false);
        tela.getBtSair().setEnabled(false);
        // habilitando os botões de controle
        tela.getBtSalvar().setEnabled(true);
        tela.getBtCancelar().setEnabled(true);

        tela.getTfNome().setEnabled(true);
        tela.getTfEndereco().setEnabled(true);
        tela.getTfNumero().setEnabled(true);
        tela.getTfComplemento().setEnabled(true);
        tela.getTfBairro().setEnabled(true);
        tela.getTfCep().setEnabled(true);
        tela.getCbxEstados().setEnabled(true);
        tela.getCbxCidades().setEnabled(true);
        tela.getTfEmail().setEnabled(true);
        tela.getTfCelular().setEnabled(true);
        tela.getTfTelefone().setEnabled(true);
    }// fim do método

    /*
     * método que controla a ação do botão Salvar
     */
    public void botaoSalvar() {

        if (validaDados()) {
            if (alterar) {
                if (cliente.getTipoPessoa().equals(Pessoa.FISICO.getTipo())) {
                    pessoaFisica = cliente.getPessoaFisicaIdPessoaFisica();
                } else {
                    pessoaJuridica = cliente.getPessoaJuridicaIdPessoaJuridica();
                }
                endereco = cliente.getEnderecoIdEndereco();
                contato = cliente.getContatoIdContato();
            } else {
                cliente = new Cliente();
                endereco = new Endereco();
                contato = new Contato();
                if (tela.getBtFisica().isSelected()) {
                    pessoaFisica = new PessoaFisica();
                } else {
                    pessoaJuridica = new PessoaJuridica();
                }
            }
            if (tela.getBtFisica().isSelected()) {
                pessoaFisica = getPessoaFisica();
            } else {
                pessoaJuridica = getPessoaJuridica();
            }

            endereco = getEndereco();
            contato = getContato();
            cliente = getCliente();

            if (tela.getBtFisica().isSelected()) {
                new PessoaFisicaController().salvar(pessoaFisica);
            } else {
                new PessoaJuridicaController().salvar(pessoaJuridica);
            }

            new EnderecoController().salvar(endereco);
            new ContatoController().salvar(contato);

            try {
                new ClienteDAO().salvar(cliente);
                JOptionPane.showMessageDialog(tela, Mensagem.cliente_salvo, Mensagem.cadastro_cliente, 1);
                botaoCancelar();
                carregarTabela();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(tela, Mensagem.cliente_erro, Mensagem.cadastro_cliente, 0);

            }

        }

    }

    /*
     * método que controla a ação do botão Excluir
     */
    public void botaoExcluir() {
        // verificando se o usuário selecionou algum registro
        if (tela.getTabela().getSelectedRow() < 0) {
            tela.getAbasCliente().setSelectedIndex(1);
            // exibindo a mensagem de erro
            JOptionPane.showMessageDialog(null, Mensagem.selecione_cliente, Mensagem.excluir_cliente, 0);
        } else {
            // verificando a exclusão do fornecedor
            int opcao = JOptionPane.showConfirmDialog(null, Mensagem.deseja_excluir_cliente, Mensagem.excluir_cliente, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                cliente = listaClientes.get(tela.getTabela().getSelectedRow());
                // excluindo registro
                new ClienteDAO().excluir(cliente);

                new ContatoController().excluir(cliente.getContatoIdContato());
                new EnderecoController().excluir(cliente.getEnderecoIdEndereco());
                new PessoaJuridicaController().excluir(cliente.getPessoaJuridicaIdPessoaJuridica());
                new PessoaFisicaController().excluir(cliente.getPessoaFisicaIdPessoaFisica());

                JOptionPane.showMessageDialog(null, Mensagem.excluir_cliente_ok, Mensagem.cadastro_cliente, 1);
                // carregando a tabela
                carregarTabela();
            }
        }
    }

    /*
     * método para retornar um objeto
     */
    private Cliente getCliente() {
        if (tela.getBtFisica().isSelected()) {
            cliente.setTipoPessoa(Pessoa.FISICO.getTipo());
            cliente.setPessoaFisicaIdPessoaFisica(pessoaFisica);
        } else {
            cliente.setTipoPessoa(Pessoa.JURIDICO.getTipo());
            cliente.setPessoaJuridicaIdPessoaJuridica(pessoaJuridica);
        }
        cliente.setEnderecoIdEndereco(endereco);
        cliente.setContatoIdContato(contato);
        return cliente;
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
                Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, e);
            }
            this.tela.getCbxCidades().removeAllItems();
            this.tela.getCbxCidades().addItem("- Selecione Cidade -");
            for (Cidade cidade : listaCidades) {
                this.tela.getCbxCidades().addItem(cidade.getNome());

            }
        }
    }// fim do método carregarComboCidades

    /*
     * método para validar dados de inclusão
     */
    private boolean validaDados() {

        if (!this.tela.getBtFisica().isSelected() && !this.tela.getBtJuridica().isSelected()) {
            JOptionPane.showMessageDialog(null, Mensagem.tipoPessoaNaoInformado, Mensagem.cadastro_cliente, 0);
            return false;
        } else {

            if (this.tela.getBtJuridica().isSelected()) {
                // validando a razão social
                if (Valida.isEmptyOrNull(this.tela.getTfNome().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.razaoSocialVazia, Mensagem.cadastro_cliente, 0);
                    this.tela.getTfNome().grabFocus();
                    return false;
                }

                // validando o CNPJ
                if (Valida.isCnpjVazio(this.tela.getFtfCpfOuCnpj().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.cnpjVazio, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfCpfOuCnpj().grabFocus();
                    return false;
                } else if (Valida.isCnpjInvalido(this.tela.getFtfCpfOuCnpj().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.cnpjInvalido, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfCpfOuCnpj().grabFocus();
                    return false;
                }

                // validando a Inscrição Estadual
                if (Valida.isInscricaoEstadualVazio(this.tela.getFtfRgOuIe().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.inscricaoEstadualVazia, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfRgOuIe().grabFocus();
                    return false;
                } else if (Valida.isInscricaoEstadualInvalida(this.tela.getFtfRgOuIe().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.inscricaoEstadualInvalida, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfRgOuIe().grabFocus();
                    return false;
                }

                // validando a Data de Fundação
                if (Valida.isDataVazia(this.tela.getFtfDataNascimentoOuDataFundacao().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.dataFundacaoVazia, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfDataNascimentoOuDataFundacao().grabFocus();
                    return false;
                } else if (Valida.isDataInvalida(this.tela.getFtfDataNascimentoOuDataFundacao().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.dataFundacaoInvalida, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfDataNascimentoOuDataFundacao().grabFocus();
                    return false;
                } else if (Util.getDataAtual() < Util.getDataInformada(this.tela.getFtfDataNascimentoOuDataFundacao().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.dataFundacaoInvalida, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfDataNascimentoOuDataFundacao().grabFocus();
                    return false;
                }
            } else if (this.tela.getBtFisica().isSelected()) {
                // validando o nome
                if (Valida.isEmptyOrNull(this.tela.getTfNome().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Mensagem.cadastro_cliente, 0);
                    this.tela.getTfNome().grabFocus();
                    return false;
                }

                // validando o CPF
                if (Valida.isCpfVazio(this.tela.getFtfCpfOuCnpj().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.cpfVazio, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfCpfOuCnpj().grabFocus();
                    return false;
                } else if (Valida.isCpfInvalido(this.tela.getFtfCpfOuCnpj().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.cpfInvalido, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfCpfOuCnpj().grabFocus();
                    return false;
                }

                // validando o RG
                if (Valida.isRgVazio(this.tela.getTfRg().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.rgVazio, Mensagem.cadastro_cliente, 0);
                    this.tela.getTfRg().grabFocus();
                    return false;
                }

                // validando a Data de Nascimento
                if (Valida.isDataVazia(this.tela.getFtfDataNascimentoOuDataFundacao().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.dataNascimentoVazia, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfDataNascimentoOuDataFundacao().grabFocus();
                    return false;
                } else if (Valida.isDataInvalida(this.tela.getFtfDataNascimentoOuDataFundacao().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.dataNascimentoInvalida, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfDataNascimentoOuDataFundacao().grabFocus();
                    return false;
                } else if (Util.getDataAtual() < Util.getDataInformada(this.tela.getFtfDataNascimentoOuDataFundacao().getText())) {
                    JOptionPane.showMessageDialog(null, Mensagem.dataNascimentoInvalida, Mensagem.cadastro_cliente, 0);
                    this.tela.getFtfDataNascimentoOuDataFundacao().grabFocus();
                    return false;
                }

            }

            // validando o endereço
            if (Valida.isEmptyOrNull(this.tela.getTfEndereco().getText())) {
                JOptionPane.showMessageDialog(null, Mensagem.enderecoVazio, Mensagem.cadastro_cliente, 0);
                this.tela.getTfEndereco().grabFocus();
                return false;
            }

            // validando o número
            if (!Valida.isInteger(this.tela.getTfNumero().getText())) {
                JOptionPane.showMessageDialog(null, Mensagem.numeroVazio, Mensagem.cadastro_cliente, 0);
                this.tela.getTfNumero().grabFocus();
                return false;
            }

            // validando o bairro
            if (Valida.isEmptyOrNull(this.tela.getTfBairro().getText())) {
                JOptionPane.showMessageDialog(null, Mensagem.bairroVazio, Mensagem.cadastro_cliente, 0);
                this.tela.getTfBairro().grabFocus();
                return false;
            }

            // validando o estado
            if (Valida.isComboInvalida(this.tela.getCbxEstados().getSelectedIndex())) {
                JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Mensagem.cadastro_cliente, 0);
                this.tela.getCbxEstados().grabFocus();
                return false;
            }

            // validando a cidade
            if (Valida.isComboInvalida(this.tela.getCbxCidades().getSelectedIndex())) {
                JOptionPane.showMessageDialog(null, Mensagem.cidadeVazia, Mensagem.cadastro_cliente, 0);
                this.tela.getCbxCidades().grabFocus();
                return false;
            }

            // validando o cep
            if (Valida.isCepVazio(this.tela.getTfCep().getText())) {
                JOptionPane.showMessageDialog(null, Mensagem.cepVazio, Mensagem.cadastro_cliente, 0);
                this.tela.getTfCep().grabFocus();
                return false;
            }

            // validando o celular
            if (Valida.isCelularVazio(this.tela.getTfCelular().getText())) {
                JOptionPane.showMessageDialog(null, Mensagem.celularVazio, Mensagem.cadastro_cliente, 0);
                this.tela.getTfCelular().grabFocus();
                return false;
            }

            // validando o email
            if (Valida.isEmptyOrNull(this.tela.getTfEmail().getText())) {
                JOptionPane.showMessageDialog(null, Mensagem.emailVazio, Mensagem.cadastro_cliente, 0);
                this.tela.getTfEmail().grabFocus();
                return false;
            } else if (!Valida.validaEmail(this.tela.getTfEmail().getText())) {
                JOptionPane.showMessageDialog(null, Mensagem.emailInvalido, Mensagem.cadastro_cliente, 0);
                this.tela.getTfEmail().grabFocus();
                return false;
            }

            return true;
        }
    }

    /*
     * método para retornar um novo objeto
     */
    private PessoaFisica getPessoaFisica() {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setCpf(tela.getFtfCpfOuCnpj().getText());
        pessoa.setRg(tela.getTfRg().getText());
        pessoa.setNome(tela.getTfNome().getText());
        pessoa.setDataNascimento(tela.getFtfDataNascimentoOuDataFundacao().getText());

        return pessoa;
    }

    /*
     * método para retornar um novo objeto
     */
    private PessoaJuridica getPessoaJuridica() {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setCnpj(tela.getFtfCpfOuCnpj().getText());
        pessoa.setInscricaoEstadual(tela.getFtfRgOuIe().getText());
        pessoa.setRazaoSocial(tela.getTfNome().getText());
        pessoa.setDataFundacao(tela.getFtfDataNascimentoOuDataFundacao().getText());

        return pessoa;
    }

    /*
     * método para retornar um novo objeto
     */
    private Endereco getEndereco() {
        Endereco endereco = new Endereco();
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
        Contato contato = new Contato();
        contato.setTelefone(this.tela.getTfTelefone().getText());
        contato.setCelular(this.tela.getTfCelular().getText());
        contato.setEmail(this.tela.getTfEmail().getText());
        return contato;
    }

    /*
     * método para acessar a classe DAO e consultar os registros na tabela
     */
    public ArrayList<Cliente> buscarTodos() {
        try {
            // acessando a classe DAO  e efetuando a consulta
            return listaClientes = new ClienteDAO().buscarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            // mensagem de erro
            JOptionPane.showMessageDialog(tela, Mensagem.consultar_n_ok_cliente, Mensagem.consulta_cliente, 0);
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
        for (Cliente cliente : listaClientes) {
            String nome = "";
            if (cliente.getTipoPessoa().equals(Pessoa.FISICO.getTipo())) {
                nome = cliente.getPessoaFisicaIdPessoaFisica().getNome();
            } else {
                nome = cliente.getPessoaJuridicaIdPessoaJuridica().getRazaoSocial();
            }
            modelo.addRow(new String[]{nome, cliente.getEnderecoIdEndereco().getCidadeIdCidade().getNome(), cliente.getContatoIdContato().getCelular(), cliente.getContatoIdContato().getEmail()});
        }
    }// fim do método carregarTabela

}
