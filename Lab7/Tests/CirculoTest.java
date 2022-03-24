import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    VisitorIF calculaArea = new VisitorCalcularArea();
    Circulo circulo = new Circulo(3);

    CirculoTest() throws Exception {
    }


    @Test
    void circuloExpetion(){
        Assertions.assertThrows(Exception.class, () -> {
            Circulo circulo = new Circulo(-3);

        });

    }

    @Test
    void getRaio() {
        assertEquals(3,circulo.getRaio());
    }
}