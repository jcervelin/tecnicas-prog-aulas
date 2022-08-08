package funcoes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class MainConsumer {
    public static void main(String[] args) {
       // Consumer void accept(T t);
        // consome algo e retorna void

        Cliente c1 = new Cliente("Afonso",21);
        Cliente c2 = new Cliente("Pedro",15);





        Consumer<Cliente> clienteConsumer =
                cliente -> {
            cliente.setNome(String.valueOf(cliente.getIdade()));
            System.out.println(cliente);
        };

        clienteConsumer.accept(c1);

        List.of(c1, c2).forEach(clienteConsumer);

        Set.of(c1, c2).forEach(clienteConsumer);

        // void accept(T t);

        Consumer<String> st6 = System.out::println;
        Consumer<String> st7 = (string) -> System.out.println(string);

        Consumer<String[]> st8 = MainConsumer::recebeVarArgs;

        st8.accept(new String[]{"a","e","i"});

        st6.accept("Meu consumer: Juliano");

    }

    private static void recebeVarArgs(String[] args) {
        Arrays.toString(args);
    }


}
