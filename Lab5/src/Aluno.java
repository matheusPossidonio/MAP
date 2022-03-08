public class Aluno {
    private String matricula;
    private String Nome;
    private String curso;


    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        Nome = nome;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
