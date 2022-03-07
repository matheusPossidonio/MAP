public class SIG  {
    Administrativo adm = new Administrativo();
    Financeiro fn = new Financeiro();
    Almoxarifado al = new Almoxarifado();
    Infra_estrutura fr = new Infra_estrutura();
    Professores pf = new Professores();
    Rdm rdm = new Rdm();

    public void contratar(String cod,String nome,String salario){ //todo disciplian
        pf.cadastrarProfessor(cod,nome,salario,fn);
    }

    public void alorcarSala(String num_sala,String codProfessor){
        Professor prof  = pf.retornaProfessor(codProfessor);
        fr.Alocar_sala(num_sala,prof);
    }

    public String exibirContratados(){
        return pf.retornaProfessores();
    }

    public void marcarReuniao(String horario,String codigoProfessor){
        Professor prof = pf.retornaProfessor(codigoProfessor);
        adm.marcarReuniao(horario,prof);
    }

    public void AdicionarAoAlmoxarifado(String codigo,String nome){
        Produto produto = new Produto(codigo,nome);
        al.addProduto(produto);
    }

    public String mostrarReuniao(){
        return adm.consultar_reunioes();
    }

    public String consultarAlmoxarifado(){
        return this.al.consulta();
    }

    public void matricularAluno(String matricula,String nome,String curso){
        rdm.cadastraAluno(nome,matricula,curso);
    }

    public String retornaAlunos(){
        return rdm.listarAlunos();
    }



}
