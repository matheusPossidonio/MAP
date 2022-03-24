import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorMaximizarFiguraTest {
    VisitorIF maximizador = new VisitorMaximizarFigura();
    Trapezio trapezio = new Trapezio(12, 15, 20, 15, 15);
    Triangulo triangulo = new Triangulo(10, 15, 20, 30, 20);
    Retangulo retangulo = new Retangulo(10,20);
    Circulo circulo = new Circulo(3);

    VisitorMaximizarFiguraTest() throws Exception {
    }

    @Test
    void visitaRetangulo() {
        assertEquals(0.0,maximizador.visitaRetangulo(retangulo));
    }

    @Test
    void visitaCirculo() {
        assertEquals(0.0,maximizador.visitaCirculo(circulo));
    }

    @Test
    void visitaTrapezio() {
        assertEquals(0.0,maximizador.visitaTrapezio(trapezio));
    }

    @Test
    void visitatriangulo() {
        assertEquals(0.0,maximizador.visitatriangulo(triangulo));
    }
}