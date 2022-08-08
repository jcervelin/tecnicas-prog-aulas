package funcoes;

@FunctionalInterface
public interface OutroExemploFuncional {

     String fazOutraCoisa(String texto);

     default boolean fazOutraCoisaDefault(String texto) {
        return false;
    };
}
