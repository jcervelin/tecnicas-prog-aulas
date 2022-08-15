package streamsApi;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ReduceMain {

    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana",25);
        Cliente bruno = new Cliente("Bruno",23);
        Cliente alandesson = new Cliente("Alandesson",23);
        Cliente bianca = new Cliente("Bianca",23);
        Cliente carlos = new Cliente("Carlos",28);
        Cliente cesar = new Cliente("Cesar",30);

        final List<Cliente> clientes = List.of(ana, alandesson, bruno, bianca, carlos, cesar);

        // reduce reduz uma lista a 1 unico item
        String nomesConcatenados = clientes.stream()
                .map(Cliente::getNome)
                .sorted(Comparator.reverseOrder())
                .reduce((acumulado, valorAtual) -> acumulado.concat(valorAtual)
                ).orElse(null);

        String nomesConcatenados1 = clientes.stream()
                .map(Cliente::getNome)
               // .sorted(Comparator.reverseOrder())
                .reduce((acumulado, valorAtual) -> acumulado.concat(valorAtual)
                ).orElse(null);


        String nomesConcatenados2 = clientes.stream()
                .map(Cliente::getNome)
                 .sorted(Comparator.reverseOrder())
              //  .reduce((acumulado, valorAtual) -> acumulado.concat(valorAtual)
                .collect(Collectors.joining());

        System.out.println(nomesConcatenados);
        System.out.println(nomesConcatenados2);
    }
}
