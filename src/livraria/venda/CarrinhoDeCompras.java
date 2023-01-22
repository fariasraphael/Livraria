package livraria.venda;

import livraria.estoque.Estoque;
import livraria.estoque.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras <P extends Produto> {
    private Double dinheiro;
    List<P> carrinho = new ArrayList<>();

    private Boolean adicionarProdutoAoCarrinho (Estoque e, P produto){
       if (e.verificadorDeItemEmEstoque(produto)) {
           carrinho.add(produto);
       } else {
           System.out.println("Produto não disponível em estoque");
       }
    }

    private void verItensDoCarrinho (){
        if(carrinho.isEmpty()) {
            System.out.println("Seu carrinho está vazio");
        } else {
            carrinho.forEach(System.out::println);
        }
    }
}