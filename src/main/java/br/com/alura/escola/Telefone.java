package br.com.alura.escola;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || ddd.length() != 2) {
            throw new IllegalArgumentException("DDD do telefone inválido");
        }

        if (numero == null || numero.length() != 9) {
            throw new IllegalArgumentException("Número do telefone inválido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
