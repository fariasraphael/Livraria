package livraria.venda;

import livraria.estoque.produtos.Produto;

import java.util.ArrayList;

public interface OperacaoDeVenda {
    public <T extends Produto> Boolean venderProduto (Double preco, ArrayList<T> arrayList);
}
