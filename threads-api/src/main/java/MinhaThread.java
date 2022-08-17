public class MinhaThread extends Thread {

    public MinhaThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Minha thread é: " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        System.out.println("Minha Thread foi executada");
    }

}
