package thread.runnable;

import java.util.concurrent.BlockingQueue;

public class Carregador implements Runnable {

    private BlockingQueue<String> fila;
    private String carga;

    public Carregador(BlockingQueue<String> fila, String carga) {
        this.fila = fila;
        this.carga = carga;
    }

    @Override
    public void run() {
        try {
            fila.put(carga);
            System.out.println(Thread.currentThread().getName() + " carregou um caminhao com " + carga);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
