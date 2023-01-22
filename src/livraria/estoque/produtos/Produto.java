package livraria.estoque.produtos;

abstract public class Produto {
    private String nome;
    private Integer id;
    private Double preco;
    private Integer quantidade = 1;

    public Produto(String nome, Integer id, Double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void editarProduto (String nome, Double preco) {
        this.setNome(nome);
        this.setPreco(preco);
    }

    @Override
    public String toString() {
        return "[Nome: " + this.nome + ", id: " + this.id + ", Preço: " + this.preco + "]";
    }
}
