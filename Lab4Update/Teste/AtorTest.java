import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtorTest {


    Ator ator = null;

    @BeforeEach
    void setUp() {
        ator = new Ator("Anthony Hopkins");
    }

    @Test
    void getFuncao() {
        assertEquals("Ator",ator.getFuncao());
    }

    @Test
    void getNome() {
        assertEquals("Anthony Hopkins",ator.getNome());

    }
}