public class ClassicThreads {


    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        System.out.println("Ola Mundo 1!");
        System.out.println("Ola Mundo 2!");
        System.out.println("Ola Mundo 3!");
        System.out.println("Ola Mundo 4!");

        ContadorHistorias contadorHistorias = new ContadorHistorias();

        final Thread gabriel = new Thread(() -> {
            contadorHistorias.contarHistorias("Historia do " + Thread.currentThread().getName());
            System.out.println("Minha thread é: " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " foi executado");
        }, "Gabriel");
        gabriel.start();

        final Thread mateusMorais = new Thread(() -> {
            contadorHistorias.contarHistorias("Historia do " + Thread.currentThread().getName());
            System.out.println("Minha thread é: " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " foi executado");
        }, "Mateus Morais");
        mateusMorais.start();

        final Thread rafaelBarbosa = new Thread(() -> {
            contadorHistorias.contarHistorias("Historia do " + Thread.currentThread().getName());
            System.out.println("Minha thread é: " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " foi executado");
        }, "Rafael Barbosa");
        rafaelBarbosa.start();


    }
}


// PID kill

// THREAD 1 20% 35%
// THREAD 2 10% 40%
// THREAD 3 15% 25%