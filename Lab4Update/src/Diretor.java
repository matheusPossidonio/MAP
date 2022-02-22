public class Diretor implements Funcionario{
    private String nome;
    private String funcao;

    public Diretor(String nome){
        this.nome = nome;
        //this.funcao = funcao;
        this.setFuncao();
        }

    @Override

    //REALMENTE NECESSÁRIO???
    public void setFuncao(){
        //this.funcao = funcao;
        this.funcao = "Diretor";
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
