import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessoresTest {

    Professores pf = new Professores();
    Financeiro fn = new Financeiro();

    @Test
    void cadastrarProfessor() throws Exception {
        pf.cadastrarProfessor("0101","maria","1400R$",fn);
        assertEquals("maria Codigo: 0101 Recebe: 1400R$\n",pf.retornaProfessores());
    }



    @Test
    void retornaProfessor() throws Exception {
        pf.cadastrarProfessor("0101","maria","1400R$",fn);
        pf.cadastrarProfessor("0202","Charles","1400R$",fn);
        assertEquals("maria Codigo: 0101 Recebe: 1400R$\nCharles Codigo: 0202 Recebe: 1400R$\n",pf.retornaProfessores());
    }


}