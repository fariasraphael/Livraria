package livraria.venda;

import livraria.estoque.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras <P extends Produto> {
    private Double dinheiro;
    List<P> carrinho = new ArrayList<>();

    private Boolean adicionarProdutoAoCarrinho (P produto){
       return carrinho.add(produto);
    }

    private void verItensDoCarrinho (){
        if(carrinho != null) {
            carrinho.forEach(System.out::println);
        } else {
            System.out.println("Seu carrinho está vazio");
        }
    }
}