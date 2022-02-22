import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositorTest {
    Compositor compositor = null;

    @BeforeEach
    void setUp() {
        compositor = new Compositor("Hans Zimmer");
    }



    @Test
    void getFuncao() {
        assertEquals("compositor",compositor.getFuncao());
    }



    @Test
    void getNome() {
        assertEquals("Hans Zimmer",compositor.getNome());
    }
}