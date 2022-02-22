import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    Diretor dr = null;
    @BeforeEach
    void setUp() {
        dr= new Diretor("Crhistopher Nolan");
    }



    @Test
    void getFuncao() {
        assertEquals("Diretor",dr.getFuncao());
    }



    @Test
    void getNome() {
        assertEquals("Crhistopher Nolan",dr.getNome());
    }
}