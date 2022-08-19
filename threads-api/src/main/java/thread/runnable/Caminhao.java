package thread.runnable;

import java.time.LocalDateTime;
import java.util.concurrent.BlockingQueue;

public class Caminhao implements Runnable {

    private BlockingQueue<String> fila;

    private long duracao;

    public Caminhao(BlockingQueue<String> fila, long duracao) {
        this.fila = fila;
        this.duracao = duracao;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duracao);
            final String carga = fila.take();
            System.out.println("Horario " + LocalDateTime.now() + " - " + Thread.currentThread().getName() + " Completou o carreto de " + carga);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}