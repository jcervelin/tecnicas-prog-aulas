package thread.runnable;

public class MeuRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Minha thread é: " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + " foi executado");
    }
}
