package threadpool;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainPagamentoMonitorado {

    public static void main(String[] args) {
        final PagamentoMonitorado pagamentoMonitorado = new PagamentoMonitorado();

        // final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(20);

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "20");

        final List<String> comprovantes = IntStream.rangeClosed(1, 20)
                .boxed()
                .parallel()
                .map(fatura -> pagamentoMonitorado.pagar(String.valueOf(fatura)))
                .collect(Collectors.toList());

        comprovantes.forEach(System.out::println);



    }
}
