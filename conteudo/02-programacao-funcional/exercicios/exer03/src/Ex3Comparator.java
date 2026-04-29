import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ex3Comparator {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta",   3.50));
        produtos.add(new Produto("Mochila",  120.00));
        produtos.add(new Produto("Caderno",  45.00));
        produtos.add(new Produto("Notebook", 3200.00));
        produtos.add(new Produto("Régua",    8.00));

        Consumer<Produto> imprimirProduto = produto -> System.out.println(produto);

        // Criar Comparator por preço crescente e ordenar a lista
        Comparator<Produto> porPrecoCrescente = (
                produto1, produto2) ->
                Double.compare(produto1.getPreco(), produto2.getPreco());

        produtos.sort(porPrecoCrescente);

        // Imprimir a lista ordenada por preço
        System.out.println("Produtos ordenados por preço crescente:");
        produtos.forEach(imprimirProduto);

        // Criar Comparator por nome alfabético e ordenar a lista
        Comparator<Produto> porNomeAlfabetico = (
                produto1, produto2) ->
                produto1.getNome().compareTo(produto2.getNome());

        produtos.sort(porNomeAlfabetico);

        // Imprimir a lista ordenada por nome
        System.out.println("\nProdutos ordenados por nome alfabético:");
        produtos.forEach(imprimirProduto);
    }
}
