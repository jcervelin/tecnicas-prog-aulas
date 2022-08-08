package funcoes;

import java.util.function.Consumer;

public class ConsumerImplementado implements Consumer<Cliente> {
    @Override
    public void accept(Cliente cliente) {
        cliente.setNome(String.valueOf(cliente.getIdade()));
        System.out.println(cliente);
    }
}
