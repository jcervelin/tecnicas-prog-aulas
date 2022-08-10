package javaOptional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalMain {


    public static void main(String[] args) {
        final Carro carro = criaCarro();

        if (carro != null && carro.getMotor() != null &&
                carro.getMotor().getEngrenagem() != null &&
                carro.getMotor().getEngrenagem().getAlgumaCoisa() != null) {
            System.out.println(carro.getMotor().getEngrenagem().getAlgumaCoisa());
        }

       //System.out.println(carro.getMotor().getEngrenagem().getAlgumaCoisa());

        Optional<String> algumaCoisa = Optional.ofNullable(carro)
                .map(Carro::getMotor)
                .map(Motor::getEngrenagem)
                .map(Engrenagem::getAlgumaCoisa);

        String algumaCoisa3 = Optional.ofNullable(carro)
                .map(Carro::getMotor)
                .map(Motor::getEngrenagem)
                .map(Engrenagem::getAlgumaCoisa)
                .orElse("Motor default");

        Supplier<RuntimeException> supExcecao = RuntimeException::new;

        String algumaCoisa1 = Optional.ofNullable(carro)
                .map(Carro::getMotor)
                .map(Motor::getEngrenagem)
                .map(Engrenagem::getAlgumaCoisa)
                .orElseThrow(supExcecao);

        System.out.println(algumaCoisa);


        if (algumaCoisa.isPresent()) {
            String conteudo = algumaCoisa.get();
            System.out.println(conteudo);
        } else {
            System.out.println("Nao achou");
        }

        algumaCoisa
                .ifPresent(s -> System.out.println(s));

    }

    private static Carro criaCarro() {
        final Carro carro = new Carro();
        carro.setMotor(new Motor());
        carro.getMotor().setEngrenagem(new Engrenagem());
        carro.getMotor().getEngrenagem().setAlgumaCoisa("Conteudo do motor carro");

        return carro;
    }


}
