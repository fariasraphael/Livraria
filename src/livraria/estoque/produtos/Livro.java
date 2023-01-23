package livraria.estoque.produtos;

public class Livro extends Produto {
    private String autor;
    private String editora;

    public Livro(String nome, Integer id, Double preco, String autor, String editora) {
        super(nome, id, preco);
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

}
