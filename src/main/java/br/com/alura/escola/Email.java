package br.com.alura.escola;

public class Email {

    private String endereco;

    public Email(String endereco) {
        String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

        if (endereco == null || !endereco.matches(emailRegex)) {
            throw new IllegalArgumentException("Email inválido");
        }

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
