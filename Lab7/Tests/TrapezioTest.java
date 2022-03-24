import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezioTest {
    VisitorIF calculaArea = new VisitorCalcularArea();
    Trapezio trapezio = new Trapezio(12, 15, 20, 15, 15);

    TrapezioTest() throws Exception {
    }


    @Test
    void trapezioExpetion(){
        Assertions.assertThrows(Exception.class, () -> {
            Trapezio trapezio = new Trapezio(-12, 15, 20, 15, 15);

        });

    }

    @Test
    void getLado1() {
        assertEquals(15,trapezio.getLado1());
    }

    @Test
    void getLado2() {
        assertEquals(15,trapezio.getLado2());
    }

    @Test
    void getbaseMenor() {
        assertEquals(12,trapezio.getbaseMenor());
    }

    @Test
    void getbaseMaior() {
        assertEquals(20,trapezio.getbaseMaior());
    }

    @Test
    void getAltura() {
        assertEquals(15,trapezio.getAltura());
    }
}