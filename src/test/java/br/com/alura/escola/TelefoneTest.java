package br.com.alura.escola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTest {

    @Test
    public void deveriaInvalidarTelefone() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("22", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "9999999999"));
    }

    @Test
    public void deveriaValidarTelefone() {
        assertDoesNotThrow(() -> new Telefone("55", "999999999"));
    }
}
