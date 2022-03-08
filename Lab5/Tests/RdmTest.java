import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RdmTest {
    Rdm rdm = new Rdm();

    @Test
    void cadastraAluno() throws Exception {
        rdm.cadastraAluno("14125","Matheus","Computação");
        assertEquals("Matheus\n",rdm.listarAlunos());

    }

    @Test
    void verificaAlunoRepetido() throws Exception{
        Assertions.assertThrows(Exception.class, () -> {
            rdm.cadastraAluno("14125","Matheus","Computação");
            rdm.cadastraAluno("14125","Maria","Computação");
        },"Aluno Repetido");

    }

    @Test
    void verifyAluno() throws Exception {
        rdm.cadastraAluno("14125","Matheus","Computação");
        assertTrue(rdm.verifyAluno("14125"));
    }

    @Test
    void listarAlunos() throws Exception {
        rdm.cadastraAluno("14125","Matheus","Computação");
        rdm.cadastraAluno("13128","Maria","Computação");
        assertEquals("Matheus\nMaria\n",rdm.listarAlunos());
    }
}