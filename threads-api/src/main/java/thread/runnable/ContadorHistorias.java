package thread.runnable;

import java.util.concurrent.atomic.AtomicInteger;

public class ContadorHistorias {

    AtomicInteger contador = new AtomicInteger();

    public void contarHistorias(String minhaHistoria) {
        System.out.println(minhaHistoria + contador.incrementAndGet() + " " + System.currentTimeMillis());
    }

}

// passo 1: Gabriel -> contador +1 = 1 -> executou linha 6
// passo 2: Rafael -> contador + 1 = 2 -> executou linha 6
// passo 3: Mateus -> contador + 1 = 3 -> executou linha 6
// passo 3: Mateus -> contador + 1 = 3 -> executou linha 6

//

