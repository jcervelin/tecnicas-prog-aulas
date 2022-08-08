
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeFormat {


    public static void main(String[] args) {
        final DateTimeFormatter formatoCustomizado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");

        // dia/mes/ano horas:minutos

        final LocalDateTime tudo10 = LocalDateTime.of(2022, 10, 10, 10, 10);
        final LocalDateTime tudo10MenosMinuto = LocalDateTime.of(2022, 10, 10, 10, 5, 30, 234567843);

        final ZonedDateTime testeComFuso = tudo10MenosMinuto.atZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println("Data formatada com fuso" + formatarData(testeComFuso));

        String stringDataPadrao = "2022-10-10T10:05:30.234";

        final LocalDateTime localDateTimePadrao = LocalDateTime.parse(stringDataPadrao);

        System.out.println("Com Modelo padrao: " + localDateTimePadrao);

        String stringData = "10/10/2022 10:05:30.234";
        final LocalDateTime parse = LocalDateTime.parse(stringData, formatoCustomizado);

        System.out.println("Modelo padrao: " + parse);

    }

    private static String formatarData(ZonedDateTime hora) {
        // yyyy-MM-dd -> DateTimeFormatter.ISO_LOCAL_DATE
        // dd/MM/yyyy -> customizado
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        return hora.format(DateTimeFormatter.ofPattern("'Dia: 'dd/MM/yyyy HH:mm:ss.SSS VV Z"));
    }

}
