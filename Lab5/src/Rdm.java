import java.util.ArrayList;

public class Rdm {
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastraAluno(String cod_rdm,String nome,String curso) throws Exception {
        if (this.verifyAluno(cod_rdm))
            throw new Exception("Aluno já cadastrado");
        Aluno aluno = new Aluno(cod_rdm,nome,curso);
        alunos.add(aluno);

    }


    public boolean verifyAluno(String cod) throws Exception {
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getMatricula()==cod)
                return true;
        }
        return false;
    }

    public String listarAlunos(){

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < alunos.size(); i++) {
            str.append(this.alunos.get(i).getNome());
            str.append("\n");
        }
        return str.toString();
    }
}
