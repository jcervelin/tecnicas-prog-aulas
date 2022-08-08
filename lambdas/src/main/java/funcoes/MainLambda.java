package funcoes;

import java.util.function.Function;

public class MainLambda {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Caio",23);

        CerberusInteface<Cliente> fun1 = cliente ->
            new Cliente("123" + cliente.getNome(),cliente.getIdade());

        final Cliente clienteFeliz = fun1.fazUmLambdaFeliz(c1);

        System.out.println(clienteFeliz);


        CerberusInteface<String> fun = (s) -> s + " algo";

        System.out.println(fun.fazUmLambdaFeliz("Testando"));
    }

    public String concatenaTexto(String string, Function<String, String> funcao) {
        return funcao.apply(string);
    }
}

// java.util.function.Function
// java.util.function.Consumer
// java.util.function.Supplier
// java.util.function.Predicate

