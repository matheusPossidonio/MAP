public class SIG  {
    private Administrativo adm = new Administrativo();
    private  Financeiro fn = new Financeiro();
    private  Almoxarifado al = new Almoxarifado();
    private  Infra_estrutura fr = new Infra_estrutura();
    private Professores pf = new Professores();
    private Rdm rdm = new Rdm();

    public void contratar(String cod,String nome,String salario) throws Exception {
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

    public void matricularAluno(String matricula,String nome,String curso) throws Exception {
        rdm.cadastraAluno(nome,matricula,curso);
    }

    public String exibirSalasOcupadas(){
        return fr.mostrarSalasEmUso();
    }

    public void removerAlmoxarifado(String cod){
        al.removerProdutoDoEstoque(cod);
    }

    public String retornaAlunos(){
        return rdm.listarAlunos();
    }



}
