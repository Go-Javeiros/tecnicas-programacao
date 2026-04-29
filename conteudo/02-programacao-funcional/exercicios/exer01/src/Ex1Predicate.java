import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1Predicate {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta",   3.50));
        produtos.add(new Produto("Mochila",  120.00));
        produtos.add(new Produto("Caderno",  45.00));
        produtos.add(new Produto("Notebook", 3200.00));
        produtos.add(new Produto("Régua",    8.00));

        // Chamar filtrar() com um lambda que filtre produtos acima de R$ 50,00
        filtrar(produtos, produto -> produto.getPreco() > 50.00);
    }

    private static void filtrar(List<Produto> lista, Predicate<Produto> criterio) {
        // Percorrer a lista e imprimir os produtos onde criterio.test() retornar true
        for (Produto produto : lista) {
            if (criterio.test(produto)) {
                System.out.println(produto);
            }
        }
    }
}
