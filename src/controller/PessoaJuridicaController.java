package controller;

import dao.PessoaJuridicaDAO;
import javax.swing.JOptionPane;
import model.PessoaJuridica;
import util.Mensagem;

/**
 * Classe responsável por armazenar os métodos de manutenção da base de dados
 *
 * @author João Victor
 * @since 01/04/2021
 * @version 1.0
 */
public class PessoaJuridicaController {

    /*
     * método para incluir ou alterar um objeto no banco de dados
     */
    public void salvar(PessoaJuridica pessoa) {
        try {
            new PessoaJuridicaDAO().salvar(pessoa);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Mensagem.pessoa_juridica_erro, Mensagem.cadastro_pessoa_juridica, 0);
        }
    }

    /*
     * método para excluir um objeto no banco de dados
     */
    public void excluir(PessoaJuridica pessoa) {
        try {
            new PessoaJuridicaDAO().excluir(pessoa);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, Mensagem.pessoa_juridica_erro_excluir, Mensagem.cadastro_pessoa_juridica, 0);
        }
    }
}
