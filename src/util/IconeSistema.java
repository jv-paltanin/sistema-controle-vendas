package util;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author jvictorp
 */
public class IconeSistema {

    public void InserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/icone_sistema.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
