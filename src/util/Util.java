package util;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Classe para armazenar métodos auxiliares
 *
 * @author João Victor
 * @since 01/04/2021
 * @version 1.0
 */
public class Util {

    public static int getDataAtual() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String[] arrayDataAtual;
        arrayDataAtual = dateFormat.format(date).split("/");
        int data = Integer.parseInt(arrayDataAtual[0] + arrayDataAtual[1] + arrayDataAtual[2]);
        return data;
    }

    public static int getDataInformada(String args) {
        String[] arrayDataAtual;
        arrayDataAtual = args.split("/");
        int data = Integer.parseInt(arrayDataAtual[2] + arrayDataAtual[1] + arrayDataAtual[0]);
        return data;
    }

    /*
     * método para retornar um valor inteiro
     */
    public static Integer getInteger(String args) {
        return Integer.parseInt(args);
    }

    /*
     * método para retornar um valor double
     */
    public static Double getDouble(String args) {
        return Double.parseDouble(args);
    }
}
