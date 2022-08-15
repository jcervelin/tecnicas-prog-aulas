package streamsApi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MinMaxMain {

    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana",25);
        Cliente bruno = new Cliente("Bruno",23);
        Cliente alandesson = new Cliente("Alandesson",23);
        Cliente bianca = new Cliente("Bianca",23);
        Cliente carlos = new Cliente("Carlos",28);
        Cliente cesar = new Cliente("Cesar",30);

        final List<Cliente> clientes = List.of(ana, alandesson, bruno, bianca, carlos, cesar);

        final Optional<Cliente> min = clientes.stream()
                .min(Comparator
                        .comparing(Cliente::getIdade)
                        .thenComparing(Cliente::getNome));

        System.out.println(min.get());

        final List<Integer> numeros = List.of(1, 8, 5, 9, 2 - 3);

        final OptionalInt min1 = numeros.stream()
                .mapToInt(Integer::intValue)
                .min();

        System.out.println(min1.getAsInt());

        final OptionalDouble media = numeros.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(media.getAsDouble());




    }
}
