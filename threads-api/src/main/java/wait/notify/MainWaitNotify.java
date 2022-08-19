package wait.notify;

public class MainWaitNotify {


    public static void main(String[] args) {

        FluxoEntregaDaCarta fluxo = new FluxoEntregaDaCarta();

        Runnable processoLerCarta = () -> {
            System.out.println("Quero ler minha carta!");
            fluxo.lerCarta();
        };

        new Thread(processoLerCarta).start();

        Runnable entregaCarta = () -> {
            System.out.println("Carteiro saindo para entrega");
            fluxo.sairParaEntrega();
        };

        new Thread(entregaCarta).start();

    }




}
