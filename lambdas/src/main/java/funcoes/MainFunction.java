package funcoes;

import java.util.function.Function;

public class MainFunction {

    public static void main(String[] args) {
        Function<Integer, String> minhaFuncao = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                // fazendo algo
                return String.valueOf(integer + 2);
            }
        };

        Function<Integer, String> minhaFuncao2 = (integer) -> {
                return String.valueOf(integer + 2);
        };

        Function<Integer, String> minhaFuncao3 = integer ->
             String.valueOf(integer + 2);

        final String _7 = minhaFuncao3.apply(5);
        final String _12 = minhaFuncao3.apply(10);

        System.out.println(_7);
        System.out.println(_12);
    }
}
