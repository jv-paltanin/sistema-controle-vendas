package controller;

import javax.swing.JOptionPane;
import model.Funcionario;
import util.Mensagem;
import util.Valida;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author João Victor
 */
public class LoginController {

    // atributo para manipular a tela de cadastro
    private LoginView tela;
    public static String nomeFuncionario;
    
    public LoginController() {
        
    }
    
    public LoginController(LoginView loginView) {
        this.tela = loginView;
    }
    
    public void botaoConfirmar() {
        if (validarDados()) {
            efetuarLogin();
        }
    }
    
    public void botaoCancelar() {
        System.exit(0);
    }
    
    private boolean validarDados() {
        if (Valida.isEmptyOrNull(tela.getTfLogin().getText())) {
            JOptionPane.showMessageDialog(tela, Mensagem.loginVazio, Mensagem.entrar, 1);
            tela.getTfLogin().grabFocus();
            return false;
        }
        
        if (Valida.isEmptyOrNull(tela.getTfSenha().getText())) {
            JOptionPane.showMessageDialog(tela, Mensagem.senhaVazia, Mensagem.entrar, 1);
            tela.getTfSenha().grabFocus();
            return false;
        }
        
        return true;
    }
    
    private void efetuarLogin() {
        String login = tela.getTfLogin().getText();
        String senha = tela.getTfSenha().getText();
        
        boolean achouLogin = false;
        boolean achouSenha = false;
        
        for (Funcionario funcionario : new FuncionarioController().buscarPorLogin(login)) {
            achouLogin = true;
            if (funcionario.getSenha().equals(senha)) {
                nomeFuncionario = funcionario.getPessoaFisicaIdPessoaFisica().getNome();
                tela.dispose();
                new MenuView().setVisible(true);
                achouSenha = true;
                break;
            } else {
                achouSenha = false;
            }
        }
        
        if (achouLogin == false || achouSenha == false) {
            JOptionPane.showMessageDialog(tela, Mensagem.credencialInvalida, Mensagem.entrar, 1);
        }
    }
}
