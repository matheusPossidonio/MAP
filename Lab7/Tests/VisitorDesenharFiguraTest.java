import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorDesenharFiguraTest {
    VisitorIF desenhista = new VisitorDesenharFigura();
    Trapezio trapezio = new Trapezio(12, 15, 20, 15, 15);
    Triangulo triangulo = new Triangulo(10, 15, 20, 30, 20);
    Retangulo retangulo = new Retangulo(10,20);
    Circulo circulo = new Circulo(3);


    VisitorDesenharFiguraTest() throws Exception {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void visitaRetangulo() {
        assertEquals(0,desenhista.visitaRetangulo(retangulo));
    }

    @Test
    void visitaCirculo() {
        assertEquals(0,desenhista.visitaCirculo(circulo));
    }

    @Test
    void visitaTrapezio() {
        assertEquals(0,desenhista.visitaTrapezio(trapezio));
    }

    @Test
    void visitatriangulo() {
        assertEquals(0,desenhista.visitatriangulo(triangulo));

    }
}