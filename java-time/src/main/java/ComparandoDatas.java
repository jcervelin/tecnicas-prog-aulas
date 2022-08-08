import domains.Campanha;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class ComparandoDatas {

    public static void main(String[] args) {

        final LocalDateTime tudo10 = LocalDateTime.of(2022, 10, 10, 10, 10);
        final LocalDateTime tudo10MenosMinuto = LocalDateTime.of(2022, 10, 10, 10, 5);

        final long between = ChronoUnit.DAYS.between(tudo10, tudo10MenosMinuto);

        System.out.println("ChronoUnit.DAYS.between(tudo10, tudo10MenosMinuto): " + between);

        final Campanha campanha = Campanha.builder()
                .id("Campanha123")
                .pais("Australia")
                .inicio(tudo10MenosMinuto)
                .fim(tudo10)
                .build();

        campanha.validaDuracao();

        System.out.println(campanha);


        final YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);

        // Checa se ano bissexto
        boolean ehAnoBissexto = yearMonth.isLeapYear();


        // Converte numeros para unidades de tempo
        int numMinutos = 90;
        // 01:30

        // LocalTime.MIN = 00:00

        final LocalTime localTime = LocalTime.MIN.plus(Duration.ofMinutes(numMinutos));

        System.out.println(localTime);


    }
}
