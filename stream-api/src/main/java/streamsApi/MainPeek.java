package streamsApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPeek {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Eric", 19);
        Cliente c2 = new Cliente("Caio", 32);
        Cliente c3 = new Cliente("Rafael", 75);
        Cliente c4 = new Cliente("Rogerio", 21);
        Cliente c5 = new Cliente("Guilherme", 36);

        final Stream<Cliente> clienteStream = Stream.of(c1, c2, c3, c4, c5);

        final List<Cliente> collect = clienteStream
                .filter(cliente -> cliente.getIdade() > 21)
                .peek(cliente -> cliente.setNome("*" + cliente.getNome()))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
