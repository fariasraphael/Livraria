import livraria.estoque.Estoque;
import livraria.estoque.produtos.*;
import livraria.venda.CarrinhoDeCompras;
import livraria.venda.RegistroDeVenda;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
       Livro codigoLimpo = new Livro("Código Limpo", 101, 50.00, "Robert Cecil Martin", "Alta Books");
       Livro javaEfetivo = new Livro("Java Efetivo", 102, 60.00, "Joshua Bloch", "Alta Books");

       Jogo callofDuty = new Jogo("Call of Duty: Modern Warfare II", 201, 200.00, "Steam", "Tiro", "INFINITY WARD");
       Jogo FIFA23 = new Jogo("FIFA 23", 202, 300.00, "SONY", "Esporte", "Eletronic Arts");

       Filme harryPotterEAPedraFilosofal = new Filme("Harry Potter e a Pedra Filosofal",301, 10.00, "Warner","Chris Columbus", "Fantasia", "David Heyman");
       Filme metalLords = new Filme("Peter Sollett", 302, 25.00, "Kingsgate", "Peter Sollett", "Comédia", "Greg Shapiro");

       Album dookie = new Album("Dookie", 401, 50.00,"Green Day", "Punk Rock", "Reprise Records");
       Album imunidadeMusical = new Album("Imunidade Musical", 402, 27.00, "Charlie Brown Jr.", "Rock","EMI");

       Brinquedo bola = new Brinquedo("Bola", 501, 10.00, "Esporte");
       Brinquedo dama = new Brinquedo("Dama", 502, 5.00, "Jogo de tabuleiro");


       RegistroDeVenda caixa = new RegistroDeVenda();
       Estoque estoque = new Estoque();
       CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
       estoque.adicionarItemNoEstoque(dookie);

       estoque.adicionarItemNoEstoque(dama);

       estoque.adicionarItemNoEstoque(bola);
       estoque.adicionarItemNoEstoque(bola);
       estoque.verTodosOsItensEmEstoque();
       estoque.quantidadeDeItemEmEstoque(bola);

       estoque.verTodosOsItensDeUmTipoDeEstouqe("album");
       carrinho.adicionarProdutoAoCarrinho(estoque, dama);
       carrinho.adicionarProdutoAoCarrinho(estoque, bola);
       carrinho.verItensDoCarrinho();

       caixa.venderProdutos(carrinho, estoque);


       System.out.println(caixa.getDinheiroNocaixa());
       carrinho.verItensDoCarrinho();




       }

}