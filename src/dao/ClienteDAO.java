package dao;

import java.util.ArrayList;
import model.Cliente;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import util.HibernateUtil;

/**
 * Classe para armazenar os metodos para acesso ao banco de dados
 *
 * @author João Victor
 * @since 24/03/2021
 * @version 1.0
 */
public class ClienteDAO extends GenericDAO {

    /*
     metodo para consultar os clientes gravados na tabela
     */
    public ArrayList<Cliente> buscarTodos() throws Exception {
        //lista auxiliar para retornar no metodo 
        ArrayList<Cliente> retorno = new ArrayList<>();
        //classe auxiliar para armazenar a sessao com o banco de dados
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        //classe auxiliar para consultar o banco de dados
        Criteria criteria = sessao.createCriteria(Cliente.class);
        //adicionando a ordenação da pesquisa 
        criteria.addOrder(Order.asc("idCliente"));
        //valorizando o objeto de retorno do metodo com os registros da tabela
        retorno = (ArrayList<Cliente>) criteria.list();
        //encerrando a conexao com o banco de dados 
        sessao.close();
        //retirnando a lista preenchida
        return retorno;
    }
}
