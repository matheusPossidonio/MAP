import java.util.ArrayList;
import java.util.Objects;

public class Studio {

    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Filme> filmes = new ArrayList<>();


    public Studio(String nome){
        this.nome = nome;
    }


    public String verificarFuncionario(Funcionario fn){

        StringBuilder str = new StringBuilder();
        for (Filme filme : filmes) {
            if (filme.verificaFuncionario(fn)) {
                str.append(filme.nomeFilme()).append(", ");
            }
        }

        return str.toString();

    }

    public void criarFilme(String nomeFilme,String ano){
        Filme filme = new Filme(nomeFilme, ano );
        this.filmes.add(filme);
    }



    public void empregarFuncionario(String nomeFilme,Funcionario funcionario){
        for (int i = 0; i <filmes.size() ; i++) {
            if(filmes.get(i).nomeFilme() == nomeFilme)
                filmes.get(i).adicionarfuncionario(funcionario);
        }
    }

    public Filme retornaFilme(String nomeFilme){
        for (int i = 0; i <filmes.size() ; i++) {
            if(filmes.get(i).nomeFilme() == nomeFilme)
                return filmes.get(i);
        }
        return null;
    }

    public boolean filmeExiste(String nomeFilme){
        for (Filme filme : filmes) {
            if (Objects.equals(filme.nomeFilme(), nomeFilme))
                return true;
        }
       return false;
    }


}
