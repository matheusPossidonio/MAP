import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoteristaTest {

    Roterista rt = null;

    @BeforeEach
    void setUp() {
        rt = new Roterista("Guillermo del Toro");
    }

    @Test
    void getFuncao() {
        assertEquals("Roteirista",rt.getFuncao());
    }



    @Test
    void getNome() {

        assertEquals("Guillermo del Toro",rt.getNome());
    }
}