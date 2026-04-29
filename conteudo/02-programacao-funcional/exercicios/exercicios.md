# Exercícios — Programação Funcional em Java

---

### Exercício 1 — Filtrando com Predicate

Dada a classe `Produto` e a lista abaixo, implemente o método `filtrar()` usando `Predicate<Produto>` e chame-o com um lambda que selecione apenas os produtos com preço acima de R$ 50,00.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }
    public String toString() { return nome + " (R$ " + preco + ")"; }
}

public class Ex1Predicate {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta",   3.50));
        produtos.add(new Produto("Mochila",  120.00));
        produtos.add(new Produto("Caderno",  45.00));
        produtos.add(new Produto("Notebook", 3200.00));
        produtos.add(new Produto("Régua",    8.00));

        // TODO: chamar filtrar() com um lambda que filtre produtos acima de R$ 50,00
    }

    private static void filtrar(List<Produto> lista, Predicate<Produto> criterio) {
        // TODO: percorrer a lista e imprimir os produtos onde criterio.test() retornar true
    }
}
```

**Saída esperada:**
```
Mochila (R$ 120.0)
Notebook (R$ 3200.0)
```

---

### Exercício 2 — Consumindo com Consumer

Usando a mesma classe `Produto` e lista do exercício anterior, crie um `Consumer<Produto>` com lambda que imprima cada produto no formato abaixo, e aplique-o com `forEach`.

```java
import java.util.function.Consumer;

public class Ex2Consumer {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta",   3.50));
        produtos.add(new Produto("Mochila",  120.00));
        produtos.add(new Produto("Caderno",  45.00));
        produtos.add(new Produto("Notebook", 3200.00));
        produtos.add(new Produto("Régua",    8.00));

        // TODO: criar um Consumer<Produto> com lambda que imprima no formato abaixo
        // TODO: usar produtos.forEach() passando o consumer
    }
}
```

**Formato de saída esperado:**
```
Produto: Caneta | Preço: R$ 3,50
Produto: Mochila | Preço: R$ 120,00
...
```

> Dica: `String.format("Produto: %s | Preço: R$ %.2f", ...)` pode ajudar.

---

### Exercício 3 — Ordenando com Comparator

Crie dois `Comparator<Produto>` com lambdas para ordenar a lista de produtos:
1. Por preço crescente
2. Por nome em ordem alfabética

Para cada ordenação, imprima a lista resultante.

```java
import java.util.Comparator;

public class Ex3Comparator {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta",   3.50));
        produtos.add(new Produto("Mochila",  120.00));
        produtos.add(new Produto("Caderno",  45.00));
        produtos.add(new Produto("Notebook", 3200.00));
        produtos.add(new Produto("Régua",    8.00));

        // TODO: criar Comparator por preço crescente e ordenar a lista
        // TODO: imprimir a lista ordenada por preço

        // TODO: criar Comparator por nome alfabético e ordenar a lista
        // TODO: imprimir a lista ordenada por nome
    }
}
```

> Dica: use `Double.compare(a, b)` para comparar `double` com segurança.

---

### Exercício 4 — removeIf e Supplier

Dada a lista de números abaixo:

a) Use `removeIf` com lambda para remover todos os números ímpares da lista.

b) Crie um `Supplier<List<Integer>>` que forneça uma nova lista contendo apenas os números pares de 1 a 10, sem usar `removeIf`.

c) Imprima as duas listas e verifique se são iguais.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Ex4RemoveIfSupplier {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        // a) TODO: usar removeIf com lambda para remover os ímpares
        System.out.println("removeIf: " + numeros);

        // b) TODO: criar Supplier<List<Integer>> que retorne lista só com pares de 1 a 10
        Supplier<List<Integer>> pares = null; // substituir pelo lambda

        // c) TODO: chamar pares.get(), imprimir e comparar com numeros usando .equals()
    }
}
```

**Saída esperada:**
```
removeIf: [2, 4, 6, 8, 10]
Supplier: [2, 4, 6, 8, 10]
Iguais: true
```
