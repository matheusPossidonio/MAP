import java.util.ArrayList;

public class Almoxarifado {
    private ArrayList<Produto> estoque = new ArrayList<Produto>();


    public void addProduto(Produto produto){
        this.estoque.add(produto);
    }

    public String consulta(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < estoque.size(); i++) {
            str.append(this.estoque.get(i).getNome());
            str.append("\n");
        }
        return str.toString();
    }

    public void removerProdutoDoEstoque(String codProduto){
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getCodigo() == codProduto){
                estoque.remove(i);
            }

        }
    }


    public Boolean existeNoEstoque(String codProduto){
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getCodigo() == codProduto){
               return true;
            }

        }
        return false;
    }
}
