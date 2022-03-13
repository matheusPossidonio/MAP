import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {


    @org.junit.jupiter.api.Test
    void getInstance() {
        Circulo circulo1 = Circulo.getInstance( 9.0);
        assertEquals(9.0,circulo1.getRaio());

    }

    @org.junit.jupiter.api.Test
    void calcularArea() {
        Circulo circulo2 = Circulo.getInstance( 8.0);
        assertEquals(200.96,circulo2.calcularArea());

    }
}