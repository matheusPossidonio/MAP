import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    void calcularArea() {
        Quadrado quadrado = new Quadrado(9);
        assertEquals(81,quadrado.calcularArea());
    }
}