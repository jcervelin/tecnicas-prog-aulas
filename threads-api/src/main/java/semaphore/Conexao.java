package semaphore;

import java.util.concurrent.Semaphore;

public class Conexao {

    private static Conexao INSTANCE = new Conexao();

    private int numConexoes;

    private Semaphore semaforo = new Semaphore(10, true);

    private Conexao () {
    }

    public static Conexao getInstance() {
        return INSTANCE;
    }

    public void conectar() {
        try {
            //IMPORTANTE
            semaforo.acquire();
            synchronized (this) {
                numConexoes++;
                System.out.println(" Numero de conexoes abertas: " + numConexoes);
            }

            Thread.sleep(2000);

            synchronized (this) {
                numConexoes--;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (semaforo != null) {
                //IMPORTANTE
                semaforo.release();
            }
        }

    }

}
