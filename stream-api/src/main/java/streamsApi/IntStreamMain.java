package streamsApi;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamMain {

    public static void main(String[] args) {
        final LocalDateTime now = LocalDateTime.now();
        final List<LocalDateTime> dateTimes = IntStream.rangeClosed(0, 200)
                .boxed()
                .map(now::plusDays)
                .collect(Collectors.toList());
        System.out.println(dateTimes);

    }
}
