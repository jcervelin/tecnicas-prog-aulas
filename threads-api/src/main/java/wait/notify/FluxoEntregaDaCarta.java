package wait.notify;

public class FluxoEntregaDaCarta {

    private boolean cartaChegou = false;

    public void lerCarta() {
        synchronized (this) {
            if(!cartaChegou) {
                try {
                    wait();
                    System.out.println("Chegou!!!");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Ah... é boleto para pagar...");
        }
    }

    public void sairParaEntrega() {
        synchronized (this) {
            try {
                Thread.sleep(5000);
                this.cartaChegou = true;
                notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
