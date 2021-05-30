package br.com.alura.escola;

public class CPF {

    private String numero;

    public CPF(String numero) {
        String regexCpf = "^([0-9]{3}\\.?){3}-?[0-9]{2}$";

        if (numero == null || !numero.matches(regexCpf)) {
            throw new IllegalArgumentException("Cpf inválido");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
