package thread.runnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainFilaEntrega {

    public static void main(String[] args) {

       // FilaEntrega<String> fila = new FilaEntrega<>(3);

        BlockingQueue<String> fila = new ArrayBlockingQueue<>(3);

        Carregador carregador1 = new Carregador(fila, "Arroz");
        Carregador carregador2 = new Carregador(fila,"Feijao" );
        Carregador carregador3 = new Carregador(fila,"Abobrinha" );
        Carregador carregador4 = new Carregador(fila,"Beterraba" );
        Carregador carregador5 = new Carregador(fila,"Cebola" );
        Carregador carregador6 = new Carregador(fila,"Jilo" );

        Caminhao caminhaoArroz = new Caminhao(fila,2000);
        Caminhao caminhaoFeijao = new Caminhao(fila,4000);
        Caminhao caminhaoAbobrinha = new Caminhao(fila, 6000);
        Caminhao caminhaoBeterraba = new Caminhao(fila, 8000);
        Caminhao caminhaoCebola = new Caminhao(fila, 10000);
        Caminhao caminhaoJilo = new Caminhao(fila, 12000);

        new Thread(caminhaoArroz,"Hack").start();
        new Thread(caminhaoFeijao,"Arthur").start();
        new Thread(caminhaoAbobrinha,"Zé da Boina").start();
        new Thread(caminhaoBeterraba,"Eric").start();
        new Thread(caminhaoCebola,"Guilherme").start();
        new Thread(caminhaoJilo,"Joao").start();

        new Thread(carregador1, "Edmar").start();
        new Thread(carregador2, "Gabriel").start();
        new Thread(carregador3, "Lamarao").start();
        new Thread(carregador4, "Rafael").start();
        new Thread(carregador5, "Matheus").start();
        new Thread(carregador6, "Alandesson").start();
    }

}
