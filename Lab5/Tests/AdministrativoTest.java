import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativoTest {
    Administrativo administrativo = new Administrativo();
    @Test
    void marcarReuniaoEConsultarReuniões() {
        Professor pf = new Professor("1231","maria","5000R$");
        administrativo.marcarReuniao("14:00",pf);
        assertEquals("Horario: 14:00Marcado por: maria\n",administrativo.consultar_reunioes());

    }


}