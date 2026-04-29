import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Ex4RemoveIfSupplier {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        // a) Usar removeIf com lambda para remover os ímpares
        numeros.removeIf(numero -> numero % 2 != 0);
        System.out.println("removeIf: " + numeros);

        // b) Criar Supplier<List<Integer>> que retorne lista só com pares de 1 a 10
        Supplier<List<Integer>> pares = () -> Arrays.asList(2, 4, 6, 8, 10);

        // c) Chamar pares.get(), imprimir e comparar com numeros usando .equals()
        List<Integer> numerosPares = pares.get();
        System.out.println("Supplier: " + numerosPares);
        System.out.println("Iguais: " + numeros.equals(numerosPares));
    }
}
