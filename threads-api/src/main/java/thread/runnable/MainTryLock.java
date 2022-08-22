package thread.runnable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainTryLock {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();


        Runnable run1 =() -> {
                if (lock.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " conseguiu pegar o lock e vai aguardar 3 segundos");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        System.out.println(Thread.currentThread().getName() + " liberou o lock");
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " nao conseguiu pegar o lock");
                }
                
        };


        new Thread(run1, " Gabrel").start();
        new Thread(run1, " Eric").start();

    }
}
