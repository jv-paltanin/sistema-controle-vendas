package util;

/**
 * Classe para armazenar as mensagens e rótulos do sistema
 *
 * @author João Victor
 * @since 01/04/2021
 * @version 1.0
 */
public class Mensagem {

    public static String fornecedor_salvo = "Fornecedor salvo com sucesso";
    public static String fornecedor_erro = "Erro ao salvar o Fornecedor!";
    public static String excluir_fornecedor_ok = "Fornecedor excluído com sucesso!";
    public static String excluir_fornecedor_n_ok = "Erro ao excluir Fornecedor!";
    public static String selecione_fornecedor = "Selecione um Fornecedor!";
    public static String deseja_excluir_fornecedor = "Deseja mesmo excluir este Fornecedor?";

    public static String funcionario_salvo = "Funcionário salvo com sucesso";
    public static String funcionario_erro = "Erro ao salvar o Funcionário!";
    public static String excluir_funcionario_ok = "Funcionário excluído com sucesso!";
    public static String excluir_funcionario_n_ok = "Erro ao excluir Funcionário!";
    public static String selecione_funcionario = "Selecione um Funcionário!";
    public static String deseja_excluir_funcionario = "Deseja mesmo excluir este Funcionário?";

    public static String cliente_salvo = "Cliente salvo com sucesso";
    public static String cliente_erro = "Erro ao salvar o Cliente!";
    public static String excluir_cliente_ok = "Cliente excluído com sucesso!";
    public static String excluir_cliente_n_ok = "Erro ao excluir Cliente!";
    public static String selecione_cliente = "Selecione um Cliente!";
    public static String deseja_excluir_cliente = "Deseja mesmo excluir este Cliente?";

    public static String produto_salvo = "Produto salvo com sucesso";
    public static String produto_erro = "Erro ao salvar o Produto!";
    public static String excluir_produto_ok = "Produto excluído com sucesso!";
    public static String excluir_produto_n_ok = "Erro ao excluir produto!";
    public static String selecione_produto = "Selecione um produto!";
    public static String deseja_excluir_produto = "Deseja mesmo excluir este Produto?";

    public static String tipoPessoaNaoInformado = "Informe se o cliente a ser cadastrado é Pessoa Física ou Jurídica";

    public static String pessoa_juridica_erro = "Erro ao salvar Pessoa Jurídica!";
    public static String pessoa_juridica_erro_excluir = "Erro ao excluir Pessoa Jurídica!";
    public static String pessoa_fisica_erro = "Erro ao salvar o Pessoa Física!";
    public static String pessoa_fisica_erro_excluir = "Erro ao excluir Pessoa Física!";
    public static String endereco_erro = "Erro ao salvar Endereço!";
    public static String endereco_erro_excluir = "Erro ao excluir Endereço!";
    public static String contato_erro = "Erro ao salvar Contato!";
    public static String contato_erro_excluir = "Erro ao excluir Contato!";

    public static String cadastro_fornecedor = "Cadastro de Fornecedor";
    public static String consulta_fornecedor = "Consulta de Fornecedor";
    public static String excluir_fornecedor = "Excluir Fornecedor";

    public static String cadastro_funcionario = "Cadastro de Funcionário";
    public static String consulta_funcionario = "Consulta de Funcionário";
    public static String excluir_funcionario = "Excluir Funcionário";

    public static String cadastro_cliente = "Cadastro de Cliente";
    public static String consulta_cliente = "Consulta de Cliente";
    public static String excluir_cliente = "Excluir Cliente";

    public static String cadastro_pessoa_juridica = "Cadastro de Pessoa Jurídica";
    public static String cadastro_pessoa_fisica = "Cadastro de Pessoa Física";
    public static String cadastro_endereco = "Cadastro de Endereço";
    public static String cadastro_contato = "Cadastro de Contato";

    public static String cadastro_produto = "Cadastro de Produto";
    public static String consulta_produto = "Consulta de Produto";
    public static String excluir_produto = "Excluir Produto";

    public static String cnpjVazio = "Informe o CNPJ, campo obrigatório!";
    public static String cnpjInvalido = "Informe um CNPJ válido!";

    public static String cpfVazio = "Informe o CPF, campo obrigatório!";
    public static String cpfInvalido = "Informe um CPF válido!";

    public static String inscricaoEstadualVazia = "Informe a Inscrição Estadual, campo obrigatório!";
    public static String inscricaoEstadualInvalida = "Informe uma Inscrição Estadual válida!";

    public static String rgVazio = "Informe o RG, campo obrigatório!";

    public static String fornecedorVazio = "Informe o fornecedor, campo obrigatório!";
    public static String valorCustoVazio = "Informe o valor de custo, campo obrigatório!";
    public static String valorVendaVazio = "Informe o valor de venda, campo obrigatório!";

    public static String descricaoVazio = "Informe a descrição, campo obrigatório!";

    public static String loginVazio = "Informe o Login, campo obrigatório!";
    public static String senhaVazia = "Informe a Senha, campo obrigatório!";

    public static String nomeVazio = "Informe o nome, campo obrigatório!";

    public static String razaoSocialVazia = "Informe a Razão Social, campo obrigatório!";
    public static String dataFundacaoVazia = "Informe a data de fundação, campo obrigatório!";
    public static String dataFundacaoInvalida = "Informe uma data válida!";

    public static String dataNascimentoVazia = "Informe a data de nascimento, campo obrigatório!";
    public static String dataNascimentoInvalida = "Informe uma data válida!";

    public static String enderecoVazio = "Informe o endereço, campo obrigatório!";
    public static String numeroVazio = "Informe o número, campo obrigatório!";
    public static String bairroVazio = "Informe o bairro, campo obrigatório!";
    public static String estadoVazio = "Informe o estado, campo obrigatório!";
    public static String cidadeVazia = "Informe a cidade, campo obrigatório!";
    public static String cepVazio = "Informe o CEP, campo obrigatório!";

    public static String emailVazio = "Informe o e-mail, campo obrigatório!";
    public static String emailInvalido = "Informe um e-mail válido!";

    public static String celularVazio = "Informe o celular, campo obrigatório!";
    public static String contatoVazio = "Informe o contato, campo obrigatório!";

    public static String ie = "IE:";
    public static String nomePessoaFisica = "Nome:";
    public static String nomeRazaoSocial = "Razão Social:";
    public static String rg = "RG:";
    public static String cpf = "CPF:";
    public static String cnpj = "CNPJ:";
    public static String dataNascimento = "Data de Nascimento:";
    public static String dataFundacao = "Data de Fundação:";

    public static String consultar_n_ok_fornecedor = "Erro ao consultar fornecedores";
    public static String consultar_n_ok_funcionario = "Erro ao consultar funcionários";
    public static String consultar_n_ok_produto = "Erro ao consultar produtos";
    public static String consultar_n_ok_cliente = "Erro ao consultar clientes";

    public static String credencialInvalida = "Credenciais inválidas!";
    public static String entrar = "Acesso do Sistema";
    public static String sair = "Deseja sair do sistema?";
}
