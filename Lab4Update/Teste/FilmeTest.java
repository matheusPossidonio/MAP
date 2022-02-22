import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    Filme filme = null;


    @BeforeEach
    public void setUp() {
        filme = new Filme("Vida","2014");

    }





    @Test
    void Setter_GetterAno() {
        filme.setAno("2014");
        assertEquals("2014",filme.getAno());

    }


    @Test
    void setNome() {
        filme.setNome("Novo nome");
        assertEquals("Novo nome", filme.nomeFilme());
    }



    @Test
    void adicionarfuncionario() {
        Diretor dr = new Diretor("Cristopher Nolan");
        filme.adicionarfuncionario(dr);
        filme.verificaFuncionario(dr);
        assertTrue(filme.verificaFuncionario(dr));
    }

    @Test
    void mostrarGrupo() {

        Diretor dr = new Diretor("Cristopher Nolan");
        Roterista rt = new Roterista("James Hunt");
        filme.adicionarfuncionario(dr);
        filme.adicionarfuncionario(rt);

        assertEquals("Cristopher Nolan, James Hunt",filme.mostrarGrupo());
    }

    @Test
    void verificaFuncionario() {
        Diretor dr = new Diretor("Steven Spielberg");
        filme.adicionarfuncionario(dr);
        filme.verificaFuncionario(dr);
        assertTrue(filme.verificaFuncionario(dr));

    }
}