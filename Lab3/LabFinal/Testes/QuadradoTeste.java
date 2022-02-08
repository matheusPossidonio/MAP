package Testes;
import static org.junit.Assert.*;
import org.junit.Test;

import Src.Quadrado;
import Src.ValorInvalido;


public class QuadradoTeste {

    @Test
    public void testarAreaQuadrado()throws ValorInvalido{
        Quadrado quadrado = new Quadrado(2);
        assertEquals(4, quadrado.calcularArea());
    }

    @Test
    public void testarPeriemtroQuadrado()throws ValorInvalido{
        Quadrado quadrado = new Quadrado(2);
        assertEquals(8, quadrado.calcularPerimetro()); 
    }

    @Test
    public void testarValorInvalidoQuadrado(){
        assertThrows(ValorInvalido.class, ()->{
            new Quadrado(-2);
        });
    }
}
