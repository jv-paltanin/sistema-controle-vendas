package controller;

import javax.swing.UIManager;
import view.ProgressBarView;

/**
 * Classe principal para executar o programa
 *
 * @author João Victor
 * @since 23/03/2021
 */
public class Main {

    public static void main(String args[]) {
        //try {
        //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        //} catch (Exception e) {
        //}
        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception e) {

            e.printStackTrace();

        }
        new ProgressBarView();
    }
}
