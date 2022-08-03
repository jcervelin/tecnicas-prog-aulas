import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainZonedDateTime {

    public static void main(String[] args) {

        final ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println(now);

        final OffsetDateTime offsetDateTime = OffsetDateTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println("OffsetDateTime: " + offsetDateTime);
    }
}
