package comparacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparacoes {
    public static void main(String[] args) {
        List<Pessoa> list = new ArrayList<>() {{
                add(new Pessoa("Joao", 11));
                add(new Pessoa("Maria", 9));
        }};


        Collections.sort(list, new Comparator<Pessoa>() {
                    @Override
                    public int compare(Pessoa o1, Pessoa o2) {
                        return 0;
                    }
                }

        );
    }
}
