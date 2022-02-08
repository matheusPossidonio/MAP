package Testes;
import static org.junit.Assert.*;

import org.junit.Test;

import Src.Retangulo;
import Src.ValorInvalido;

public class RetanguloTeste {

    @Test
    public void testaAreaRetangulo()throws ValorInvalido{
        Retangulo retangulo = new Retangulo(2, 3);
        assertEquals(6, retangulo.calcularArea());
    }

    @Test 
    public void testarPeriemtroRetangulo()throws ValorInvalido{
        Retangulo retangulo = new Retangulo(2,3);
        assertEquals(10, retangulo.calcularPerimetro());
    }
    
    @Test
    public void testarValorInvalidoRetangulo()throws ValorInvalido{
        assertThrows(ValorInvalido.class, ()->{
            new Retangulo(0, 3);
        });
    }

    @Test
    public void testarValoresIguaisRetangulo()throws ValorInvalido{
        assertThrows(ValorInvalido.class, ()->{
            new Retangulo(2, 2);
        });
    }

}
