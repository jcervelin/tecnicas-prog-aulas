package javaOptional;

import java.util.Optional;

public class OptionalMain {


    public static void main(String[] args) {
        final Carro carro = criaCarro();

        if (carro != null && carro.getMotor() != null &&
                carro.getMotor().getEngrenagem() != null &&
                carro.getMotor().getEngrenagem().getAlgumaCoisa() != null) {
            System.out.println(carro.getMotor().getEngrenagem().getAlgumaCoisa());
        }

       // System.out.println(carro.getMotor().getEngrenagem().getAlgumaCoisa());

        Optional<String> algumaCoisa = Optional.ofNullable(carro)
                .map(Carro::getMotor)
                .map(Motor::getEngrenagem)
                .map(Engrenagem::getAlgumaCoisa);

        System.out.println(algumaCoisa);
    }

    private static Carro criaCarro() {
        return new Carro();
    }


}
