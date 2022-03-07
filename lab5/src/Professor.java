import java.util.ArrayList;

public class Professor {
    private String salario;
    private String codigo;
    private String nome;
    ArrayList disc = new ArrayList<>();



    public Professor(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }



    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
