package Interface;
import java.util.ArrayList;

import Models.Produto;

public interface InterfaceProdutos {


    public void adicionarProduto(Produto p);

    public void removerProduto(int indice);

    public void listarProdutos();

    public ArrayList<Produto> getProdutos();


}
