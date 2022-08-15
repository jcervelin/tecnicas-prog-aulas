package streamsApi;

import java.util.List;
import java.util.Optional;

public class MatchMain {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana",25);
        Cliente juninho = new Cliente("Juninho",12);
        Cliente bruno = new Cliente("Bruno",23);
        Cliente alandesson = new Cliente("Alandesson",23);
        Cliente bianca = new Cliente("Bianca",23);
        Cliente carlos = new Cliente("Carlos",28);
        Cliente cesar = new Cliente("Cesar",30);

        final List<Cliente> clientes = List.of(juninho, ana, alandesson, bruno, bianca, carlos, cesar);

        // Quero saber se ter menores de 18 anos na lista
        final Optional<Cliente> algumClienteMenorDe18 = clientes.stream()
                .filter(cliente -> cliente.getIdade() <= 18)
                .findAny();

        final Optional<Cliente> primeiroPorOrdemDeInclusaoClienteMenorDe18_1 = clientes.stream()
                .filter(cliente -> cliente.getIdade() <= 18)
                .findFirst();

        final long numeroDeClienteMenores18  = clientes.stream()
                .filter(cliente -> cliente.getIdade() <= 18)
                .count();

        final boolean temPeloMenos1ClienteMenore18  = clientes.stream()
                .anyMatch(cliente -> cliente.getIdade() <= 18);

        final boolean nenhumClienteMenore18  = clientes.stream()
                .noneMatch(cliente -> cliente.getIdade() <= 18);

        final boolean todosClientesMenore18  = clientes.stream()
                .allMatch(cliente -> cliente.getIdade() <= 18);

            System.out.println("temPeloMenos1ClienteMenore18 " + temPeloMenos1ClienteMenore18);

            System.out.println("nenhumClienteMenore18 " +nenhumClienteMenore18);

            System.out.println("todosClientesMenore18 " + todosClientesMenore18);
    }
}
