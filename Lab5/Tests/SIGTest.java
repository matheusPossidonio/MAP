import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class SIGTest {
    SIG sig = new SIG();

    @BeforeEach
    void setUp() {
        SIG sig = new SIG();
    }

    @Test
    void contratar() throws Exception {
        sig.contratar("0000","nomeTeste","4.000 R$");
        assertEquals("nomeTeste Codigo: 0000 Recebe: 4.000 R$\n",sig.exibirContratados());
    }

    @Test()
    void professorRepetidoExpetion() throws Exception{

        Assertions.assertThrows(Exception.class, () -> {
             sig.contratar("0000","nomeTeste","4.000 R$");
             sig.contratar("0000","nomeTeste","4.000 R$");
        },"Professor Repetido");


    }

    @Test
    void alorcarSala() {
        sig.alorcarSala("45","0151");
    }

    @Test
    void exibirContratados() throws Exception {
        sig.contratar("0000","nomeTeste","4.000 R$");
        assertEquals("nomeTeste Codigo: 0000 Recebe: 4.000 R$\n",sig.exibirContratados());
    }



    @Test
    void adicionarAoAlmoxarifado() {
        sig.AdicionarAoAlmoxarifado("01","Apagadores");
        assertEquals("Apagadores\n",sig.consultarAlmoxarifado());
    }



    @Test
    void consultarAlmoxarifado() {
        sig.AdicionarAoAlmoxarifado("01","Apagadores");
        sig.AdicionarAoAlmoxarifado("02","Lapis");

        assertEquals("Apagadores\nLapis\n",sig.consultarAlmoxarifado());
    }

    @Test
    void matricularAluno() throws Exception {
        sig.matricularAluno("Matheus","12345","Computação");
        assertEquals("Matheus\n",sig.retornaAlunos());
    }

    @Test
    void retornaAlunos() throws Exception {
        sig.matricularAluno("Matheus","12345","Computação");
        sig.matricularAluno("Marias","14041","Computação");
        assertEquals("Matheus\nMarias\n",sig.retornaAlunos());
    }
}