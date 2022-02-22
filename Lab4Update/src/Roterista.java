public class Roterista implements Funcionario {
    //precisa implementar a interface Funcionario

    private String nome;
    private String funcao;

    public Roterista(String nome){
        this.nome= nome;
        this.funcao="Roteirista";
    }

    @Override
    public void setFuncao() {
        this.funcao="Roteirista";
    }

    @Override
    public String getFuncao() {
        return this.funcao;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
