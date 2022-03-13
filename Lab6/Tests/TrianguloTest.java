import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void getIstanceIsosceles() throws Exception {
        Triangulo triangulo = Triangulo.getIstanceIsosceles(10,10,10);
        assertEquals(30.0,triangulo.calcularAreaIsosceles());
    }

    @Test
    void calcularAreaIsosceles() throws Exception {
        Triangulo triangulo = Triangulo.getIstanceIsosceles(10,10,10);
        assertEquals(30.0,triangulo.calcularAreaIsosceles());
    }

    @Test
    void TrianguloExpetion() throws Exception{

        Assertions.assertThrows(Exception.class, () -> {
            Triangulo triangulo = Triangulo.getIstanceIsosceles(-4,14,10);


        });



    }

    @Test
    void calcularAreaRetangulo() throws Exception {
        Triangulo teste3 = Triangulo.getIstanceRetangulo(17, 20, 25);
        assertEquals(62.0,teste3.calcularAreaRetangulo());
    }

    @Test
    void calcularAreaEquilatero() throws Exception {
        Triangulo testeEquilatero = Triangulo.getIstanceEquilatero(15, 20, 25);
        assertEquals(60.0,testeEquilatero.calcularAreaEquilatero());
    }

    @Test
    void getIstanceEquilatero() {
    }

    @Test
    void getIstanceRetangulo() {
    }
}