import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Infra_estruturaTest {

    Infra_estrutura ifr = new Infra_estrutura();
    @Test
    void alocar_e_Exibir_Salas() {
        Professor pf = new Professor("1231","maria","5000R$");
        ifr.Alocar_sala("14",pf);
        assertEquals("Salas em uso no momento: 14 por professor: maria\n",ifr.mostrarSalasEmUso());
    }


}