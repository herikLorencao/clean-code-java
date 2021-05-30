package br.com.alura.escola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CPFTest {

    @Test
    public void deveriaInvalidarCPF() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF("123423"));
    }

    @Test
    public void deveriaValidarCPF() {
        assertDoesNotThrow(() -> new CPF("598.599.570-45"));
    }
}
