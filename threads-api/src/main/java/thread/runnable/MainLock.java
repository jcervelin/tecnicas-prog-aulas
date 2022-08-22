package thread.runnable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainLock {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        Runnable run1 =() -> {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " conseguiu pegar o lock e vai aguardar 3 segundos");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println(Thread.currentThread().getName() + " liberou o lock");
                lock.unlock();
            }
        };

        new Thread(run1, " Gabrel").start();
        new Thread(run1, " Eric").start();

    }
}
