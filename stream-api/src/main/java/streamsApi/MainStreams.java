package streamsApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStreams {

    public static void main(String[] args) {

        final List<Integer> paresEImpares = List.of(2, 5, 9, 7, 8, 10);

        // .filter Filtra
        // .map Transforma / mapeia

        double minhaMedia = paresEImpares
                .stream()
                .filter(integer -> integer % 2 != 0)
                .mapToInt(inteiro -> inteiro + 2)
                .average()
                .orElse(0);


        int minhaSoma = paresEImpares
                .stream()
                .filter(integer -> integer % 2 != 0)
                .mapToInt(inteiro -> inteiro + 2)
                .sum();

        final List<Integer> listaImparesMais2 = paresEImpares
                .stream()
                .filter(integer -> {
                    return integer % 2 != 0;
                })
                .map(inteiro -> {
                    return inteiro + 2;
                }).collect(Collectors.toList());

        System.out.println(listaImparesMais2);

        // Isso dá erro
        //System.out.println(listaImparesMais2.collect(Collectors.toList()));
    }
}
