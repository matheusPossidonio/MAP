import java.util.ArrayList;
import java.util.SimpleTimeZone;



public class Professores {
    ArrayList<Professor> professores = new ArrayList<Professor>();



    public void cadastrarProfessor(String cod, String nome,String salario, Financeiro fn){
        Professor professor = new Professor(cod,nome);
        professores.add(professor);
        fn.EfetuarPagamento(cod,salario);
    }

    public void adicionarDisciplina(){


    }

    public Professor retornaProfessor(String cod){
        for (int i = 0; i < professores.size(); i++) {
            if(professores.get(i).getCodigo()==cod)
                return professores.get(i);
        }
        return null;
    }

    public String retornaProfessores(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < professores.size(); i++) {
            str.append(professores.get(i).getNome() +" " +  professores.get(i).getCodigo());
            str.append("\n");
        }
        return str.toString();
    }




}
