package livraria.venda;

import livraria.estoque.Estoque;
import livraria.estoque.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private Double dinheiro;
    private List<Produto> carrinho = new ArrayList<>();

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public <P extends Produto> void adicionarProdutoAoCarrinho (Estoque e, P produto){
       if (e.verificadorDeItemEmEstoque(produto)) {
           carrinho.add(produto);
       } else {
           System.out.println("Produto não disponível em estoque");
       }
    }
    public <P extends Produto> void retrirarProdutoDoCarrinho (P produto) {
        if (carrinho.contains(produto)){
            carrinho.remove(produto);
        } else {
            System.out.println("Produto não está no carrinho");
        }
    }

    public void verItensDoCarrinho (){
        if(carrinho.isEmpty()) {
            System.out.println("Seu carrinho está vazio");
        } else {
            System.out.println("Itens no carrinho:");
            carrinho.forEach(System.out::println);
        }
    }
}