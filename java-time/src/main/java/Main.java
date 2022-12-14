import domains.Campanha;
import services.BuscadorFusoHorario;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Fuso horario do seu sistema
        // America/Sao_Paulo

        Clock.systemDefaultZone();
        System.out.println(Clock.systemDefaultZone().getZone().getId());
        System.out.println(Clock.systemUTC().getZone().getId());
        // Na cloud é UTC

        LocalTime horasLondres = LocalTime.now(ZoneId.of("Europe/London"));
        LocalTime horasBrasil = LocalTime.now();

        final LocalTime localTime = horasLondres.truncatedTo(ChronoUnit.MINUTES);

        final LocalTime localTimeMais4Segundos = localTime.plus(4, ChronoUnit.SECONDS);
        final LocalTime localTimeMais4SegundosUsandoPlusSeconds = localTime.plusSeconds(4);

        final LocalTime localTimeMais4SegundosUsandoMinusSeconds  = localTime.minusSeconds(4);


        localTime.withHour(13);


        final LocalTime localTimeCustomizado = LocalTime.of(20, 32, 20);


        System.out.println("Horas Londres Horas e minutos, somente" + horasLondres.truncatedTo(ChronoUnit.MINUTES));
        System.out.println("Horas Londres Horas e minutos, + 4 segundos" + localTimeMais4Segundos);
        System.out.println("Horas Brasil " + horasBrasil);


        final LocalDate horaLocal = LocalDate.now();

        final LocalDateTime localDateTime = LocalDateTime.of(horaLocal, localTimeCustomizado);


        // Sydney - Australia - 04:43 - quinta-feira, 4 de agosto de 2022 (GMT+10)
        // Perth - Australia -  02:43 - quinta-feira, 4 de agosto de 2022 (GMT+8)


        BuscadorFusoHorario busca = BuscadorFusoHorario.getInstance();

        List<String> fusosEncontrados = busca.porPais("Australia");

        final String maisCedo = busca.maisCedo(fusosEncontrados);
        final String maisTarde = busca.maisTarde(fusosEncontrados);

        System.out.println("Fuso mais cedo " + maisCedo);
        System.out.println("Fuso mais tarde " + maisTarde);

        final Campanha campanha = Campanha.builder()
                .id("Campanha123")
                .pais("Australia")
                .inicio(LocalDateTime.now(ZoneId.of(maisCedo)))
                .fim(LocalDateTime.now(ZoneId.of(maisTarde)).plusDays(3))
                .build();

        System.out.println("domains.Campanha: " + campanha);


        final LocalDateTime _6AM = LocalDateTime.now().withHour(6);
        final LocalDateTime _8PM = LocalDateTime.now().withHour(20);
        final LocalDateTime _3PM = LocalDateTime.now().withHour(15);

        System.out.println(ehHoraUtil(_6AM));
        System.out.println(ehHoraUtil(_8PM));
        System.out.println(ehHoraUtil(_3PM));

    }

    private static final int INICIO_HORA_UTIL = 9;
    private static final int FIM_HORA_UTIL = 18;

    public static boolean ehHoraUtil(LocalDateTime localDateTime) {
        return localDateTime.getHour() >= INICIO_HORA_UTIL && localDateTime.getHour() < FIM_HORA_UTIL;
    }

    // ZoneId -> Fuso horario America/Sao_Paulo
    // Offset -> GMT +/- numero Ex. GMT-03:00


}
