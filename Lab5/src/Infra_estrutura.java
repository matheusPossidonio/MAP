import java.util.ArrayList;

public class Infra_estrutura {
    private ArrayList<Sala> salasEmUso = new ArrayList<Sala>();


    public void  Alocar_sala(String num_sala, Professor pfResponsável){
        Sala sala = new Sala(num_sala,pfResponsável);
        salasEmUso.add(sala);
    }

    public String mostrarSalasEmUso(){
        StringBuilder str = new StringBuilder();
        str.append("Salas em uso no momento: ");
        for (int i = 0; i < salasEmUso.size(); i++) {
            str.append(salasEmUso.get(i).getNum()+ " por professor: "
                    + salasEmUso.get(i).getProfessorResponsavel().getNome());
            str.append("\n");
        }
        return  str.toString();
    }



}
