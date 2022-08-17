import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

    // [0-9]{2}\/[0-9]{2}\/[0-9]{2,4}


    // ([0-9]{2})\/([0-9]{2})\/([0-9]{2,4})

    // Pattern
    // Matcher
    public static void main(String[] args) {
        String regex = "^([0-9]{2})\\/([0-9]{2})\\/([0-9]{2,4})$";
        final Pattern compile = Pattern.compile(regex);

        String data = "12/09/1980sadasdasda30/10/2015";
        String dataInvalida = "182/09/1980";

        final Matcher matcher = compile.matcher(data);

        // So da true uma vez por match
        while (matcher.find()) {
            System.out.println("Dia: " + matcher.group(1));
            System.out.println("Mes: " + matcher.group(2));
            System.out.println("Ano: " + matcher.group(3));
        }

        final Matcher matcherInvalido = compile.matcher(dataInvalida);

        if (matcherInvalido.find()) {
            System.out.println("valido");
        } else {
            System.out.println("Invalido");
        }

    }
}
