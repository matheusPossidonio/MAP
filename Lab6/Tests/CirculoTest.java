import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {




    @org.junit.jupiter.api.Test
    void calcularArea() {
        Circulo circulo2 = Circulo.getInstance( 8.0);
        assertEquals(200.96,circulo2.calcularArea());

    }
}