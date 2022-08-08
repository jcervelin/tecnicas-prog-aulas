package funcoes;

public class EscopoLambda {
    public static void main(String[] args) {
        LambImpl lamb = new LambImpl();
        System.out.println(lamb.diferencasEscopo());
    }
}

interface LambInterface {
    String method(String string);
}

class LambImpl {
    private String value = "Valor do escopo da classe";

    public String diferencasEscopo() {
        LambInterface fooIC = new LambInterface() {
            String value = "Valor da classe interna";

            @Override
            public String method(String string) {
                return this.value;
            }
        };
        String resultIC = fooIC.method("");

        LambInterface fooLambda = parameter -> {
            String value = "Lambda value";
            return this.value;
        };
        String resultLambda = fooLambda.method("");

        return "Results: resultIC = " + resultIC +
                ", resultLambda = " + resultLambda;
    }
}