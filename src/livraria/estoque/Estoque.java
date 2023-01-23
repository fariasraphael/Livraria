package livraria.estoque;

import livraria.estoque.produtos.Produto;
import java.util.*;


public class Estoque {
    private final Collection<Object> produtosT = new HashSet<>();

    public Collection<Object> getProdutosT() {
        return produtosT;
    }
    public <P extends Produto> boolean adicionarItemNoEstoque(P produto) {
        if (this.produtosT.contains(produto)) {
            produto.setQuantidade(produto.getQuantidade() + 1);
        }
        return this.produtosT.add(produto);
    }

    public <P extends Produto> void quantidadeDeItemEmEstoque (P produto) {
        if(produto.getQuantidade() == null){
            System.out.println("Item não cadastrado no estoque");
        }
        else {
            System.out.println("Quantidade de " + produto.getNome() + " em estoque: " + produto.getQuantidade() + " unidade(s)");
        }
    }

    public <P extends Produto> void reduzirQuantidadeDoItemNoEstoque (P produto) {
        if(produto.getQuantidade() == 0 || produto.getQuantidade() == null){
            System.out.println("Venda do item " + produto.getNome() +" não realizada, pois não a saldo do item em estoque.");
        }
        else{
            produto.setQuantidade(produto.getQuantidade()-1);
        }
    }

    public <P extends Produto > Boolean verificadorDeItemEmEstoque(P produto) {
        return this.produtosT.contains(produto);
    }

    public void verTodosOsItensEmEstoque () {
        System.out.println("Todos os produtos em estoque:");
        this.getProdutosT().forEach(System.out::println);
    }

    public void verTodosOsItensDeUmTipoDeEstouqe (String tipo) {

        for (Object p: produtosT.toArray()) {
            if (p.getClass().getSimpleName().toString().toUpperCase().equals(tipo.toUpperCase())){
                System.out.println(p);
            }
        }
    }
    @Override
    public String toString () {
        return produtosT.toString();
    }
}
