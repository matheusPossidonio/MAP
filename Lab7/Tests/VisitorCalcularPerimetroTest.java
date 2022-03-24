import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorCalcularPerimetroTest {
    VisitorIF calculaPerimetro = new VisitorCalcularPerimetro();
    Circulo circulo = new Circulo(3);
    Trapezio trapezio = new Trapezio(12, 15, 20, 15, 15);
    Triangulo triangulo = new Triangulo(10, 15, 20, 30, 20);
    Retangulo retangulo = new Retangulo(10,20);

    VisitorCalcularPerimetroTest() throws Exception {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void visitaRetangulo() {
        assertEquals(60.0,calculaPerimetro.visitaRetangulo(retangulo));
    }

    @Test
    void visitaCirculo() {
        assertEquals(18.84,calculaPerimetro.visitaCirculo(circulo));
    }

    @Test
    void visitaTrapezio() {
        assertEquals(62.0,calculaPerimetro.visitaTrapezio(trapezio));
    }

    @Test
    void visitatriangulo() {
        assertEquals(70.0,calculaPerimetro.visitatriangulo(triangulo));
    }
}