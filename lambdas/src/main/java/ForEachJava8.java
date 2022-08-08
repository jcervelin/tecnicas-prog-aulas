import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachJava8 {

    public static void main(String[] args) {

        List<Integer> listaNumeros = List.of(3,-7,22,54,-15);

        final List<Integer> listaPositivos = new ArrayList<>();

        // Antes da setinha é o parametro de entrada
        // Depois da setinha é a implementacao / retorno0
        Predicate<Integer> isNegative3 = integer -> integer < 0;


        Predicate<Integer> isNegative4 = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 0;
            }
        };




        Consumer<Integer> inteiros =  (i) -> listaPositivos.add(i);

        listaNumeros
                .stream()
                .filter(isNegative3)
                .forEach(inteiros);

        listaNumeros
                .stream()
                .filter(ForEachJava8::ehNegativo)
                .forEach(listaPositivos::add);
    }

    private static boolean ehNegativo(Integer valor) {
        return valor < 0;
    }

}
