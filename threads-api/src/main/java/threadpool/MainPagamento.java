package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainPagamento {


    public static void main(String[] args) {

        final ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());
        executorService.execute(new Pagamento());

        executorService.shutdown();

    }
}
