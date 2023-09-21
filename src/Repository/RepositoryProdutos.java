package Repository;
import java.util.ArrayList;

import Interface.InterfaceProdutos;
import Models.Produto;

public class RepositoryProdutos implements InterfaceProdutos {
    
    ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public void removerProduto(int indice){
        if(! produtos.isEmpty()){
            for(int i =0 ; i < produtos.size(); i++){
            produtos.remove(indice);
            }
        }
    }

    public void listarProdutos(){
        if(!produtos.isEmpty()){
            for(int i = 0; i < produtos.size(); i++){
                System.out.println( i+1 +" "+produtos.get(i));
            }
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    
}
