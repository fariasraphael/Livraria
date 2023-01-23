import livraria.estoque.Estoque;
import livraria.estoque.produtos.*;
import livraria.venda.CarrinhoDeCompras;
import livraria.venda.RegistroDeVenda;

public class Sistema {
    public static void main(String[] args) {
       //CRIANDO OS PRODUTOS
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

      //CRIANDO O PONTO DE VENDA
       RegistroDeVenda caixa = new RegistroDeVenda();

       //CRIANDO O ESTOQUE
       Estoque estoque = new Estoque();

       //CRIANDO O CARRINHO DE COMPRAS
       CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

       //ADICIONANDO ITENS NO ESTOQUE
       estoque.adicionarItemNoEstoque(dookie);
       estoque.adicionarItemNoEstoque(dama);
       estoque.adicionarItemNoEstoque(bola);
       estoque.adicionarItemNoEstoque(bola);
       estoque.adicionarItemNoEstoque(imunidadeMusical);
       estoque.adicionarItemNoEstoque(dookie);
       estoque.adicionarItemNoEstoque(dookie);
       estoque.adicionarItemNoEstoque(dookie);

       //VENDO OS ITENS DO ESQUQUE
       System.out.println("VENDO OS ITENS DO ESQUQUE");
       estoque.verTodosOsItensEmEstoque();
       System.out.println();
       System.out.println("VENDO A QUANTIDADE DE UM ITEM ESPECIFICO NO ESTOQUE");
       estoque.quantidadeDeItemEmEstoque(bola);
       estoque.quantidadeDeItemEmEstoque(dookie);
       System.out.println();
       System.out.println("VENDO TODOS OS ITENS DO TIPO ALBUM EM ESTOQUE");
       estoque.verTodosOsItensDeUmTipoDeEstouqe("album");

       //ADICIONANDO PRODUTOS AO CARRINHO
       carrinho.adicionarProdutoAoCarrinho(estoque, dama);
       carrinho.adicionarProdutoAoCarrinho(estoque, bola);
       carrinho.adicionarProdutoAoCarrinho(estoque, bola);
       System.out.println();
       System.out.println("VENDO OS ITENS DO CARRINHO");
       carrinho.verItensDoCarrinho();

       //CONFIRMANDO A VENDA
       caixa.venderProdutos(carrinho, estoque);

       //VERIFICANDO DINHEIRO NO CAIXA
       System.out.println();
       System.out.println("Dinheiro no caixa após a venda: R$" + caixa.getDinheiroNocaixa());

       System.out.println();
       System.out.println("APÓS A VENDA O CARRINHO ESVAZIA");
       carrinho.verItensDoCarrinho();
       System.out.println();

       //FAZENDO MAIS UMA COMPRA
       System.out.println("NOVA COMPRA");
       carrinho.adicionarProdutoAoCarrinho(estoque, bola);
       carrinho.adicionarProdutoAoCarrinho(estoque, dookie);
       carrinho.verItensDoCarrinho();
       caixa.venderProdutos(carrinho, estoque);

      //VERIFICANDO DINHEIRO NO CAIXA APÓS A SEGUNDA VENDA
       System.out.println();
       System.out.println("Dinheiro no caixa após a segunda venda: R$" + caixa.getDinheiroNocaixa());
       carrinho.verItensDoCarrinho();
       }

}