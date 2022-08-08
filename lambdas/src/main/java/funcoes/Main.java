package funcoes;

import java.util.Comparator;
import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {


        Comparator<Cliente> comparator = new Comparator<>() {

            public int compare(Cliente o1, Cliente o2) {
                return o1.getIdade().compareTo(o2.getIdade());
            }
        };

        Comparator<Cliente> comparator1 = (Cliente o1, Cliente o2) -> {
                return o1.getIdade().compareTo(o2.getIdade());
        };


        Comparator<Cliente> comparator2 = (o1, o2) -> {
            return o1.getIdade().compareTo(o2.getIdade());
        };

        Comparator<Cliente> comparator3 =
                (o1, o2) -> o1.getIdade().compareTo(o2.getIdade());

        Comparator<Cliente> comparator4 =
                Comparator.comparing(cliente -> cliente.getIdade());

        // Method Reference
        Comparator<Cliente> comparator5 =
                Comparator.comparing(Cliente::getIdade);


        Comparator<Cliente> comparator6 =
                comparing(Cliente::getIdade);



    }
}


// @FunctionalInterface
// Essa anotacao so pode ser usada em uma interface com um unico metodo
// Ela tambe pode:
//      sobresecrever metodos de object
//      metodos default