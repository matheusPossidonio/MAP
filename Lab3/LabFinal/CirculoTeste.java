import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTeste{
    
    @Test
    public void testaAreaCirculo()throws ValorInvalido{
        Circulo circulo = new Circulo(3);
        assertEquals(18, circulo.calcularArea());
    }

    @Test
    public void testaPerimetroCirculo()throws ValorInvalido{
        Circulo circulo = new Circulo(3);
        assertEquals(28, circulo.calcularPerimetro());   }

    @Test
    public void testarValorInvalido(){
        assertThrows(ValorInvalido.class, ()->{
            new Circulo(0);
        }
        );
    }
}