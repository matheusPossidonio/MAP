public class MAIN {

    public static void main(String[] args) {
        SIG sigFacade = new SIG();

        sigFacade.contratar("0151","Juliana","4.000 R$");

        sigFacade.alorcarSala("45","0151");

        System.out.println(sigFacade.exibirContratados());


        sigFacade.marcarReuniao("14:00h","0151");

        System.out.println(sigFacade.mostrarReuniao());

        sigFacade.AdicionarAoAlmoxarifado("01","Apagadores");

        sigFacade.AdicionarAoAlmoxarifado("02","SlideShow");

        System.out.println(sigFacade.consultarAlmoxarifado());

        sigFacade.matricularAluno("Matheus","12345","Computação");

        System.out.println(sigFacade.retornaAlunos());


    }
}
