public class Main {
    public static void main(String[] args){
        Filme filme = new Filme("Senhor das estrelas");
        Funcionario diretor = new Diretor("arthur");
        Filme filme2 = new Filme("carros");

        filme.adicionarfuncionario(diretor);
        System.out.println(filme.mostrarGrupo());

        System.out.println(filme.verificaFuncionario(diretor));
        System.out.println(filme2.verificaFuncionario(diretor));
    }
}
