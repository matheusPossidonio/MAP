import java.util.List;
import java.util.ArrayList;

public class Filme {

    

    private String nomeFilme;
    private String ano;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    ArrayList<Funcionario> grupo = new ArrayList<>();

    public Filme(String nomeFilme,String ano){
        this.nomeFilme = nomeFilme;
        this.ano= ano;
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

       StringBuilder saida = new StringBuilder();

        for (int i = 0 ; i< grupo.size(); i++){
            saida.append(grupo.get(i).getNome());
            if(i!= grupo.size()-1) saida.append(", ");
        }

        return saida.toString();
    }

    public String retornarInfo(){
        return "Nome: " + this.nomeFilme()+" Lançado em: " + this.getAno() +  " criado por: " + this.mostrarGrupo();
    }

    public Boolean verificaFuncionario(Funcionario func){
        return grupo.contains(func);
    }

}
