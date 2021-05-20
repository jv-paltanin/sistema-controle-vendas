package controller;

import javax.swing.SwingUtilities;
import view.LoginView;
import view.ProgressBarView;

/**
 * Classe para controlar os métodos do ProgressBarView
 * 
 * @author João Victor
 * @since 04/04/2021
 */
public class ProgressBarController {

    ProgressBarView tela;

    public ProgressBarController() {
    }

    public ProgressBarController(ProgressBarView tela) {
        this.tela = tela;
    }

    public void exibirProgressBar() {
        this.tela.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            final int currentValue = i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        tela.getjProgressBar1().setValue(currentValue);
                    }
                });
                if (i == 100) {
                    new LoginView().setVisible(true);
                    this.tela.dispose();
                }
                java.lang.Thread.sleep(25);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
