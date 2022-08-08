import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantMain {

    public static void main(String[] args) {

        // Instant
        final LocalDateTime nowBr = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(nowBr);

        System.out.println(nowBr.toInstant(ZoneOffset.of("-3")));

        final ZonedDateTime zonedDateTime = nowBr.atZone(ZoneId.of("America/Sao_Paulo"));

        // ao usar Instant do zonedDateTime, eu nao preciso setar o ZoneId
        final Instant instantDoZonedDateTime = zonedDateTime.toInstant();

        final long epochMilli = instantDoZonedDateTime.toEpochMilli();

        System.out.println("Millisegundos desde 1 Jan 1970: [" + epochMilli + "]");

        final long epochSeconds = instantDoZonedDateTime.getEpochSecond();

        System.out.println("Segundos desde 1 Jan 1970: [" + epochSeconds + "]");

        final Instant milErasNoFuturo = instantDoZonedDateTime.plus(1000, ChronoUnit.DAYS);

        System.out.println("milErasNoFuturo: " + milErasNoFuturo);
    }

}
