package funcoes;

import java.util.TimeZone;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {
        //  Supplier   T get();
        //  sem entrada e retorna algo

        Supplier<Double> db = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        Supplier<Double> db1 = () -> {
                return Math.random();
        };

        Supplier<Double> db2 = () -> Math.random();

        Supplier<Double> db3 = Math::random;

        db.get();

        Supplier<String> st = new Supplier<String>() {
            @Override
            public String get() {
                return TimeZone.getDefault().getDisplayName();
            }
        };

        Supplier<String> st4 = TimeZone.getDefault()::getDisplayName;

        System.out.println(st4);
    }
}
