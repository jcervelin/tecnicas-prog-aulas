package thread.runnable;

import java.util.LinkedList;
import java.util.Queue;

public class FilaEntrega<E> {

    private int capacidade;

    private Queue<E> filaEntrada = new LinkedList<>();

    public FilaEntrega(int capacidade) {
        this.capacidade = capacidade;
    }

    public synchronized void carregar (E elemento) throws InterruptedException {
        while (filaEntrada.size() == capacidade) {
            wait();
        }
        filaEntrada.add(elemento);
    }

    public synchronized E descarregar() throws InterruptedException {
        while (filaEntrada.isEmpty()) {
            wait();
        }

        E elemento = filaEntrada.remove();
        notifyAll();
        return elemento;
    }

}
