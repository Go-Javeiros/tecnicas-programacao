import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex2Consumer {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta",   3.50));
        produtos.add(new Produto("Mochila",  120.00));
        produtos.add(new Produto("Caderno",  45.00));
        produtos.add(new Produto("Notebook", 3200.00));
        produtos.add(new Produto("Régua",    8.00));

        // Criar um Consumer<Produto> com lambda que imprima no formato abaixo
        Consumer<Produto> imprimirProduto = produto -> System.out.println(produto);

        // Usar produtos.forEach() passando o consumer
        produtos.forEach(imprimirProduto);
    }
}
