public class Compositor implements Funcionario {

    private String nome;
    private String funcao;

    public Compositor(String nome) {
        this.nome = nome;
        this.funcao = "compositor";

    }

    @Override
    public void setFuncao() {
        this.funcao = "Compositor";
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
    //precisa implementar a interface Funcionario
}
