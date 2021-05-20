package util;

/**
 * Classe responsável por armazenar os atributos de pessoa física e jurídica
 *
 * @author João victor
 * @since 07/04/2021
 * @version 1.0
 */
public enum Pessoa {

    FISICO("F", "Pessoa Física"),
    JURIDICO("J", "Pessoa Jurídica");

    private String tipo;
    private String descricao;

    Pessoa(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;

    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

}
