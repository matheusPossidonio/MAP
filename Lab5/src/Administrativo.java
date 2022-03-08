import java.util.ArrayList;

public class Administrativo {

    ArrayList<String[]> horariosReuniao = new ArrayList<String[]>();


    public void  marcarReuniao(String horario,Professor mestre){
        String[] reuniao ={horario, mestre.getNome()};
        horariosReuniao.add(reuniao);


    }

    public String consultar_reunioes(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < horariosReuniao.size(); i++) {
            str.append("Horario: " +horariosReuniao.get(i)[0] + "Marcado por: " +  horariosReuniao.get(i)[1]);
            str.append("\n");
        }
        return str.toString();
    }

}
