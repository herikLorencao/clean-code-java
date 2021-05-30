package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    public void deveriaAdicionarTelefone() {
        Aluno aluno = new Aluno();
        assertDoesNotThrow(() -> aluno.adicionarTelefone("55", "999999999"));
    }
}
