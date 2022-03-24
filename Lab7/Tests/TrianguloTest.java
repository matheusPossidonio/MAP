import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {
    VisitorIF calculaArea = new VisitorCalcularArea();
    Triangulo triangulo = new Triangulo(10, 15, 20, 30, 20);

    TrianguloTest() throws Exception {
    }

    @Test
    void trianguloExpetion(){
        Assertions.assertThrows(Exception.class, () -> {
            Triangulo triangulo = new Triangulo(10, -15, 20, 30, 20);

        });
    }

    @Test
    void getBase() {
        assertEquals(10,triangulo.getBase());
    }

    @Test
    void getAltura() {
        assertEquals(15,triangulo.getAltura());
    }
}