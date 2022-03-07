import java.util.ArrayList;

public class Infra_estrutura {
    private ArrayList salasEmUso = new ArrayList<Sala>();
    private ArrayList salasLivres = new ArrayList<Sala>();

    public void  Alocar_sala(String num_sala, Professor pfResponsável){
        Sala sala = new Sala(num_sala,pfResponsável);
        salasEmUso.add(sala);
    }

    public void LivrarSala(String num_sala){
        salasLivres.add(num_sala);
    } //todo necessary?

}
