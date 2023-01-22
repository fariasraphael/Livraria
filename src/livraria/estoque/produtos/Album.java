package livraria.estoque.produtos;

public class Album extends Produto{
    private String artista;
    private String genero;
    private String selo;

    public Album(String nome, Integer id, Double preco, String artista, String genero, String selo) {
        super(nome, id, preco);
        this.artista = artista;
        this.genero = genero;
        this.selo = selo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }
}