package br.com.alura.escola;

public class FabricaAluno {

    private Aluno aluno;

    public FabricaAluno comNomeCPFEmail(String nome, String cpf, String email) throws Exception {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaAluno comTelefone(String ddd, String telefone) throws Exception {
        this.aluno.adicionarTelefone(ddd, telefone);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
