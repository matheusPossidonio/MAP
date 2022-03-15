import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {



    @Test
    void testaIsoscelesDoisLadosIguais() throws Exception{

        Assertions.assertThrows(Exception.class, () -> {
            Triangulo teste = Triangulo.getIstanceIsosceles(18, 20, 31);


        },"Triangulo Não Isosceles");
    }

    @Test
    void testaEquilateroIgual() throws Exception{

        Assertions.assertThrows(Exception.class, () -> {
            Triangulo teste = Triangulo.getIstanceEquilatero(18, 18, 31);


        },"Triangulo não Equilatero");
    }


    @Test
    void getIstanceIsosceles() throws Exception {
        Triangulo teste = Triangulo.getIstanceIsosceles(20, 20, 31);
        assertEquals(195.90798222635036,teste.calcularAreaIsosceles());
    }

    @Test
    void calcularAreaIsosceles() throws Exception {
        Triangulo teste = Triangulo.getIstanceIsosceles(20, 20, 31);
        assertEquals(195.90798222635036,teste.calcularAreaIsosceles());
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
        assertEquals(27.0,teste3.calcularAreaRetangulo());
    }

    @Test
    void calcularAreaEquilatero() throws Exception {
        Triangulo testeEquilatero = Triangulo.getIstanceEquilatero(15, 15, 15);
        assertEquals(97.42785792574934,testeEquilatero.calcularAreaEquilatero());
    }

    @Test
    void getIstanceEquilatero() {
    }

    @Test
    void getIstanceRetangulo() {
    }
}