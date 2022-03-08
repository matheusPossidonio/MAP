import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceiroTest {

    Financeiro fn= new Financeiro();
    @Test
    void efetuarPagamentoECheckarPagamento() {
        fn.EfetuarPagamento("14514","1400$");
        assertEquals("Codigo Funcionario: 14514 Salario Recebido: 1400$\n",fn.checkFolhaPagamento());
    }


}