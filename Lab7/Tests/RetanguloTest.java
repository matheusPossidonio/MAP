import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    Retangulo retangulo = new Retangulo(10,20);
    VisitorIF calculaArea = new VisitorCalcularArea();
    RetanguloTest() throws Exception {
    }



    @Test
    void retanguloExpetion(){
        Assertions.assertThrows(Exception.class, () -> {
            Retangulo retangulo = new Retangulo(-4,20);

        });
    }
    @Test
    void retanguloIgualExpetion(){
        Assertions.assertThrows(Exception.class, () -> {
            Retangulo retangulo = new Retangulo(20,20);

        });
    }
    @Test
    void getBase() {
        assertEquals(10,retangulo.getBase());
    }

    @Test
    void getAltura() {
        assertEquals(20,retangulo.getAltura());
    }


}