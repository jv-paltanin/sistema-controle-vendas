package controller;

import dao.ContatoDAO;
import javax.swing.JOptionPane;
import model.Contato;
import util.Mensagem;

/**
 * Classe responsável por armazenar os métodos de manutenção da base de dados
 *
 * @author João Victor
 * @since 01/04/2021
 * @version 1.0
 */
public class ContatoController {

    /*
     * método para incluir ou alterar um objeto no banco de dados
     */
    public void salvar(Contato contato) {
        try {
            new ContatoDAO().salvar(contato);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Mensagem.contato_erro, Mensagem.cadastro_contato, 0);
        }
    }

    /*
     * método para excluir um objeto no banco de dados
     */
    public void excluir(Contato contato) {
        try {
            new ContatoDAO().excluir(contato);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, Mensagem.contato_erro_excluir, Mensagem.cadastro_contato, 0);
        }
    }
}
