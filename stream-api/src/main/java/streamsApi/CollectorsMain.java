package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsMain {

    public static void main(String[] args) {

        Cliente ana = new Cliente("Ana",25);
        Cliente alandesson = new Cliente("Alandesson",23);
        Cliente bruno = new Cliente("Bruno",23);
        Cliente bianca = new Cliente("Bianca",23);
        Cliente carlos = new Cliente("Carlos",28);
        Cliente cesar = new Cliente("Cesar",30);

        final List<Cliente> clientes = List.of(ana, alandesson, bruno, bianca, carlos, cesar);


        final Map<String, Cliente> chaveNomeValorCliente = clientes.stream()
                .collect(Collectors.toMap(Cliente::getNome, Function.identity()));

        System.out.println("chaveNomeValorCliente " + chaveNomeValorCliente);

        final Map<Integer, Cliente> chaveIdadeValorCliente = clientes.stream()
                .collect(Collectors.toMap(Cliente::getIdade, Function.identity(),
                        (clienteAcumulador, clienteAtual) ->  clienteAtual));
        System.out.println("chaveIdadeValorCliente " + chaveIdadeValorCliente);

        // e se eu quiser todos de 23 anos?


    }
}
