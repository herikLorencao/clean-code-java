package br.com.alura.escola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    public void deveriaInvalidarEmail() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
    }

    @Test
    public void deveriaPermitirEmail() {
        assertDoesNotThrow(() -> new Email("heriksantoslorencao@gmail.com"));
    }

}
