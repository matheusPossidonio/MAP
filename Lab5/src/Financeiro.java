import java.util.ArrayList;

public class Financeiro {

    private ArrayList<String[]> folhaPagamento = new ArrayList<String[]>();

    public void EfetuarPagamento(String cod,String salario){
        String[] str = {cod,salario};
        this.folhaPagamento.add(str);

    }

    public String checkFolhaPagamento(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < folhaPagamento.size(); i++) {
            str.append("Codigo Funcionario: " + this.folhaPagamento.get(i)[0]
            +" Salario Recebido: "+this.folhaPagamento.get(i)[1]);

            str.append("\n");
        }



        return str.toString();
    }
}
