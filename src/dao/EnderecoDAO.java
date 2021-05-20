package dao;

import java.util.ArrayList;
import model.Endereco;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import util.HibernateUtil;

/**
 * Classe responsável por armazenar os métodos para acesso ao banco de dados
 *
 * @author João Victor
 * @since 17/03/2021
 * @version 1.0
 */
public class EnderecoDAO extends GenericDAO {

    /*
     * método para consultar os endereco gravados na tabela
     */
    public ArrayList<Endereco> buscarTodos() throws Exception {
        ArrayList<Endereco> retorno = new ArrayList<>();
        // classe auxiliar para armazenar a sessão com o banco de dados
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        // classe auxiliar para consultar o banco de dados
        Criteria criteria = sessao.createCriteria(Endereco.class);
        // adicionando a ordenação na pesquisa
        criteria.addOrder(Order.asc("idEndereco"));
        // valorizando o objeto de retorno do método com os registros da tabela
        retorno = (ArrayList<Endereco>) criteria.list();
        // encerrando a conexão com o banco de dados
        sessao.close();
        // retornando a lista preenchida
        return retorno;
    }// fim do método buscarTodos

}
