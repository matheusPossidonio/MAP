import java.util.ArrayList;

public class Financeiro {

    private ArrayList folhaPagamento = new ArrayList<String[]>();

    public void EfetuarPagamento(String cod,String salario){
        String[] str = {cod,salario};
        this.folhaPagamento.add(str);

    }

    public String checkFolhaPagamento(){
        return this.folhaPagamento.toString();
    }
}
