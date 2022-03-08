import java.util.ArrayList;
import java.util.SimpleTimeZone;



public class Professores {
    ArrayList<Professor> professores = new ArrayList<Professor>();



    public void cadastrarProfessor(String cod, String nome,String salario, Financeiro fn) throws Exception {
        Professor professor = new Professor(cod,nome,salario);
        if (this.verifyTeatcher(cod)) throw new Exception("Professor Repetido");
        professores.add(professor);
        fn.EfetuarPagamento(cod,salario);
    }


    public boolean verifyTeatcher(String cod) throws Exception {
        for (int i = 0; i < professores.size(); i++) {
            if(professores.get(i).getCodigo()==cod)
                return true;
        }
        return false;
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
            str.append(professores.get(i).getNome() +" Codigo: " +  professores.get(i).getCodigo()
            + " Recebe: " +  professores.get(i).getSalario());
            str.append("\n");
        }
        return str.toString();
    }




}
