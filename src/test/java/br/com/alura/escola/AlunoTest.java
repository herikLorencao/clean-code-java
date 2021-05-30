package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    public void deveriaAdicionarTelefone() throws Exception {
        FabricaAluno fabricaAluno = new FabricaAluno();
        assertDoesNotThrow(() -> {
            fabricaAluno.comNomeCPFEmail("herik", "946.389.180-34", "mail@test.com")
                    .comTelefone("55", "999999999")
                    .criar();
        });
    }
}
