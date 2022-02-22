public class Ator implements Funcionario{
    private String nome;
    private String funcao;


    public Ator(String nome){
        this.nome= nome;
        this.funcao="Ator";
    }
    @Override
    public void setFuncao(){
        this.funcao = "Ator";
    }

    @Override
    public String getFuncao(){
        return funcao;
    }

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome(){
        return nome;
    }
}
