package streamsApi;

import javaOptional.Carro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMain {


    public static void main(String[] args) {

        Cliente ana = new Cliente("Ana",25);
        Cliente alandesson = new Cliente("Alandesson",23);
        Cliente bruno = new Cliente("Bruno",23);
        Cliente bianca = new Cliente("Bianca",23);
        Cliente carlos = new Cliente("Carlos",28);
        Cliente cesar = new Cliente("Cesar",30);

        List<List<Cliente>> listaDeListas = new ArrayList<>() {{
           add(List.of(ana, alandesson));
           add(List.of(ana, alandesson));
           add(List.of(bruno, bianca));
           add(List.of(carlos, cesar));
        }};

        // para achatar os dois streams, use flatMap
        final Stream<Stream<String>> streamStreamNomes = listaDeListas.stream()
                .map(clientes -> clientes // -> trocar map por flatMap
                        .stream()
                        .map(cliente -> cliente.getNome())
                );

        final List<String> nomes = listaDeListas.stream()
                .flatMap(clientes -> clientes
                        .stream()
                        .map(cliente -> cliente.getNome())
                )
                .collect(Collectors.toList());

        System.out.println(nomes);
    }

    // flatMap achata STREAM. Nao achata listas

}
