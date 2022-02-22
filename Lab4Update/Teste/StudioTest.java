import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudioTest {
Studio std = null;

    @BeforeEach
    void setUp() {
        std = new Studio("Columbia");

    }

    @Test
    void verificarFuncionario() {
        Diretor diretor = new Diretor("Columbos");
        std.criarFilme("Herois","2019");
        std.empregarFuncionario("Herois",diretor);
        assertEquals("Herois, ",std.verificarFuncionario(diretor));

    }

    @Test
    void criarFilme() {
        std.criarFilme("chaos","2012");
        assertTrue(std.filmeExiste("chaos"));

    }



    @Test
    void empregarFuncionario() {
        Roterista roterista = new Roterista("Jhons");
        std.criarFilme("Losts","2022");
        std.empregarFuncionario("Losts",roterista);
        assertEquals("Losts, ",std.verificarFuncionario(roterista));
    }


}