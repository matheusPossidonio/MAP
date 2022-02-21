import java.util.List;
import java.util.ArrayList;

public class Filme {

    

    private String nomeFilme;
    ArrayList<Funcionario> grupo = new ArrayList<>();

    public Filme(String nomeFilme){
        this.nomeFilme = nomeFilme;
    }

    public void setNome(String nomeFilme){
        this.nomeFilme = nomeFilme;
    }

    public String nomeFilme(){
        return nomeFilme;
    }

    public void adicionarfuncionario(Funcionario funcionario){
        this.grupo.add(funcionario);
    }

    public String mostrarGrupo(){
        String aux = grupo.get(0).getNome();
        aux+="funciona";
        return aux;
    }

    public Boolean verificaFuncionario(Funcionario func){
        return grupo.contains(func);
    }

}
