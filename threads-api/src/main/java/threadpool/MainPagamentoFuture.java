package threadpool;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainPagamentoFuture {

    public static void main(String[] args) {
        final PagamentoMonitorado pagamentoMonitorado = new PagamentoMonitorado();

        final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        final List<CompletableFuture<String>> comprovantesFuturos = IntStream.rangeClosed(1, 20)
                .boxed()
                .map(fatura ->
                        CompletableFuture.supplyAsync(() ->
                        pagamentoMonitorado.pagar(String.valueOf(fatura)), scheduledExecutorService
                        )
                )
                .parallel()
                .collect(Collectors.toList());


        // fazendo outras coisas. chamando servicos

        final List<String> comprovantes = comprovantesFuturos.stream()
                .map(f -> f.join())
                .collect(Collectors.toList());

        System.out.println(comprovantes);
        scheduledExecutorService.shutdown();
    }
}

// 10_000 = 1 segundo
// 1 pagamento => 1 segundo
// 1000

