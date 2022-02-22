

public class Main {


    public static void main(String[] args){

        Studio estudio = new Studio("Globo Filmes");
        Funcionario diretor = new Diretor("Arthur Garcia");
        Funcionario ator = new Ator("Jorge Pestanha");
        Funcionario roteirista = new Roterista("Marcio Costa");

        estudio.criarFilme("Senhor das Estrelas","2011");
        estudio.criarFilme("Terror noturno","1981");

        // (a) Acadastrar todos os envolvidos em um filme informando sua(s)
        //função(ões);
        estudio.empregarFuncionario("Senhor das Estrelas",diretor);
        estudio.empregarFuncionario("Senhor das Estrelas",ator);
        estudio.empregarFuncionario("Senhor das Estrelas",roteirista);


        estudio.empregarFuncionario("Terror noturno",diretor);
        estudio.empregarFuncionario("Terror noturno",roteirista);

       // b) informar a filmografia indicando sua função específica;
        System.out.println(estudio.retornaFilme("Senhor das Estrelas")
                .mostrarGrupo());

        System.out.println("Filmes do diretor Arthur: "
                + estudio.verificarFuncionario(diretor) );


        //c) informar todas as características de um dado filme (nome,
        //diretor, roteirista, elenco, trilha sonora, ano, etc.).
        System.out.println(estudio.retornaFilme("Terror noturno").retornarInfo());



    }


}
