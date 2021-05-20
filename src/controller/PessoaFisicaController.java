package controller;

import dao.PessoaFisicaDAO;
import javax.swing.JOptionPane;
import model.PessoaFisica;
import util.Mensagem;

/**
 * Classe responsável por armazenar os métodos de manutenção da base de dados
 *
 * @author João Victor
 * @since 04/04/2021
 * @version 1.0
 */
public class PessoaFisicaController {
    /*
     * método para incluir ou alterar um objeto no banco de dados
     */

    public void salvar(PessoaFisica pessoa) {
        try {
            new PessoaFisicaDAO().salvar(pessoa);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Mensagem.pessoa_fisica_erro, Mensagem.cadastro_pessoa_fisica, 0);
        }
    }
    
    /*
     * método para excluir um objeto no banco de dados
     */
    public void excluir(PessoaFisica pessoa) {
        try {
            new PessoaFisicaDAO().excluir(pessoa);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, Mensagem.pessoa_fisica_erro_excluir, Mensagem.cadastro_pessoa_fisica, 0);
        }
    }
}
