import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorCalcularAreaTest {
    VisitorIF calculaArea = new VisitorCalcularArea();


    Circulo circulo = new Circulo(3);
    Trapezio trapezio = new Trapezio(12, 15, 20, 15, 15);
    Triangulo triangulo = new Triangulo(10, 15, 20, 30, 20);
    Retangulo retangulo = new Retangulo(10,20);

    VisitorCalcularAreaTest() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception {

    }

    @Test
    void visitaRetangulo() {

        assertEquals(200.0,calculaArea.visitaRetangulo(retangulo));
    }

    @Test
    void visitaCirculo() {
        assertEquals(18.84,calculaArea.visitaCirculo(circulo));
    }

    @Test
    void visitaTrapezio() {
        assertEquals(240.0,calculaArea.visitaTrapezio(trapezio));
    }

    @Test
    void visitatriangulo() {
        assertEquals(75.0,calculaArea.visitatriangulo(triangulo));
    }
}