package streamsApi;



public class ClienteDeMenor extends Cliente {

    public ClienteDeMenor(Cliente cliente) {
        super(cliente.getNome(), cliente.getIdade());
    }
}
