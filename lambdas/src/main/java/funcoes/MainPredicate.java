package funcoes;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        // Predicate boolean test(T t);
        // recebe algo para validar

        Integer valor = 10;
        Integer valorNegativo = -10;

        Predicate<Integer> isNegative = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 0;
            }
        };

        Predicate<Integer> isNegative1 = (integer) -> {
                return integer < 0;
        };

        Predicate<Integer> isNegative2 = integer -> integer < 0;

        if (isNegative2.test(valorNegativo)) {
            System.out.println("é negativo");
        } else {
            System.out.println("nao é negativo");
        }

        Predicate<Integer> isNegative3 = integer -> integer < 0;


    }
}
