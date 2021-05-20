package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import util.Mensagem;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author João Victor
 */
public class MenuController {

    // atributo para manipular a tela de cadastro
    private static MenuView tela;

    // construtor vazio
    public MenuController() {
    }

    // construtor para valorizar o objeto de tela
    public MenuController(MenuView tela) {
        this.tela = tela;
    }

    /*
     * método para sair do sistema
     */
    public void sair() {
        int sair = JOptionPane.showConfirmDialog(null, Mensagem.sair, "ATENÇÃO!", JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    /*
     * método para sair e logar com outra conta
     */
    public void sairLogout() {

        int sair = JOptionPane.showConfirmDialog(null, Mensagem.sair, "ATENÇÃO!", JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.tela.dispose();
            new LoginView().setVisible(true);
        }
    }

    /*
     * método para pegar a hora e data e startar o relogio
     */
    public void horaData() {
        Thread relogio = new Thread(new hora());
        relogio.start();
    } // fim da class hora

    //class para habilitar hora de data na tela
    class hora implements Runnable {

        public void run() {
            while (true) {
                //pegando a data
                DateFormat data = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
                //formatando a hora
                SimpleDateFormat formata = new SimpleDateFormat("HH:mm:ss");
                //aplicando a data no labeldata
                tela.getLbData().setText(data.format(new Date()));
                //aplicando a hora na label hora
                tela.getLbHora().setText(formata.format(new Date()));

                try {
                    //realizando a busca a cada tempo
                    Thread.sleep(1000);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problema na atualização da data/hora");
                    ex.printStackTrace();
                }
            }
        }
    }

    /*
     * método para bloquear o menu principal
     */
    public void bloquearMenu() {
        tela.getMenuCadastro().setEnabled(false);
        tela.getMenuEstoque().setEnabled(false);
        tela.getMenuVendas().setEnabled(false);
        tela.getMenuCompras().setEnabled(false);
        tela.getMenuContas().setEnabled(false);
        tela.getMenuSistema().setEnabled(false);
        // bloqueando os botões
        tela.getBtClientes().setEnabled(false);
        tela.getBtFornecedor().setEnabled(false);
        tela.getBtFuncionarios().setEnabled(false);
        tela.getBtProdutos().setEnabled(false);
        tela.getBtEstoque().setEnabled(false);
        tela.getBtVendas().setEnabled(false);
        tela.getBtCompras().setEnabled(false);
        tela.getBtSair().setEnabled(false);
    }

    /*
     * método para desbloquear o menu principal
     */
    public static void desBloquearMenu() {
        tela.getMenuCadastro().setEnabled(true);
        tela.getMenuEstoque().setEnabled(true);
        tela.getMenuVendas().setEnabled(true);
        tela.getMenuCompras().setEnabled(true);
        tela.getMenuContas().setEnabled(true);
        tela.getMenuSistema().setEnabled(true);
        // bloqueando os botões
        tela.getBtClientes().setEnabled(true);
        tela.getBtFornecedor().setEnabled(true);
        tela.getBtFuncionarios().setEnabled(true);
        tela.getBtProdutos().setEnabled(true);
        tela.getBtEstoque().setEnabled(true);
        tela.getBtVendas().setEnabled(true);
        tela.getBtCompras().setEnabled(true);
        tela.getBtSair().setEnabled(true);
    }

    public void carregarUsuario() {
        tela.getLbNomeFuncionario().setText(LoginController.nomeFuncionario);
    }

}// fim da classe
