import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmoxarifadoTest {
    Almoxarifado almoxarifado = new Almoxarifado();

    @Test
    void addProduto() {
        Produto pr = new Produto("1","apagador");
        almoxarifado.addProduto(pr);
        assertTrue(almoxarifado.existeNoEstoque("1"));
    }

    @Test
    void consulta() {
        Produto pr = new Produto("1","apagador");
        Produto pr1 = new Produto("2","Lapis");
        almoxarifado.addProduto(pr);
        almoxarifado.addProduto(pr1);
        assertEquals("apagador\nLapis\n",almoxarifado.consulta());
    }

    @Test
    void removerProdutoDoEstoque() {
        Produto pr = new Produto("1","apagador");
        Produto pr1 = new Produto("2","Lapis");
        almoxarifado.addProduto(pr);
        almoxarifado.addProduto(pr1);
        almoxarifado.removerProdutoDoEstoque("1");
        assertFalse(almoxarifado.existeNoEstoque("1"));
    }

    @Test
    void existeNoEstoque() {
    }
}