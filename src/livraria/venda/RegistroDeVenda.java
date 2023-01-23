package livraria.venda;

import livraria.estoque.Estoque;
import livraria.estoque.produtos.Produto;

public class RegistroDeVenda {

    private Double dinheiroNocaixa = 0.0;

    public Double getDinheiroNocaixa() {
        return dinheiroNocaixa;
    }

    public <P extends Produto> void venderProdutos(CarrinhoDeCompras carrinho, Estoque estoque) {

        for (int i = 0; i < carrinho.getCarrinho().size(); i++) {
            if (carrinho.getCarrinho().get(i).getQuantidade() != 0) {
                this.dinheiroNocaixa += carrinho.getCarrinho().get(i).getPreco();
                estoque.reduzirQuantidadeDoItemNoEstoque(carrinho.getCarrinho().get(i));

            }else{
                estoque.reduzirQuantidadeDoItemNoEstoque(carrinho.getCarrinho().get(i));
            }

        }
        carrinho.getCarrinho().clear();
    }
}
