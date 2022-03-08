public class MAIN {

    public static void main(String[] args) throws Exception {
        SIG sigFacade = new SIG();

        //Professores
        sigFacade.contratar("0151","Juliana","4.000 R$");
        System.out.println(sigFacade.exibirContratados());

        //Alocar Sala
        sigFacade.alorcarSala("45","0151");
        System.out.println(sigFacade.exibirSalasOcupadas());


        //Reuniao
        sigFacade.marcarReuniao("14:00h","0151");
        System.out.println(sigFacade.mostrarReuniao());


        //Almoxarifado
        sigFacade.AdicionarAoAlmoxarifado("01","Apagadores");
        sigFacade.AdicionarAoAlmoxarifado("02","SlideShow");
        sigFacade.removerAlmoxarifado("01");
        System.out.println(sigFacade.consultarAlmoxarifado());

        //Alunos
        sigFacade.matricularAluno("Matheus","12345","Computação");
        System.out.println(sigFacade.retornaAlunos());



    }
}
