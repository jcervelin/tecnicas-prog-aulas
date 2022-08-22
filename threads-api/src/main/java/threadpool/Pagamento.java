package threadpool;

import java.util.concurrent.TimeUnit;

public class Pagamento implements Runnable {


    public void pagar() {
        try {

            TimeUnit.SECONDS.sleep(2);
            System.out.println(System.currentTimeMillis() + ": Pagou!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        pagar();
    }
}
