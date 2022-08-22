package semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SemaforoMain {

    public static void main(String[] args) {

        final ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i <= 300 ; i++) {
            executorService.submit(
                    () -> Conexao.getInstance().conectar()
            );
        }

        executorService.shutdown();
    }
}
