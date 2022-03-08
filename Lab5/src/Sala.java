public class Sala {
    private String num;
    private Professor professorResponsavel;


    public Sala(String num, Professor professorResponsavel) {
        this.num = num;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
