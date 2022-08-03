package services;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class BuscadorFusoHorario {

    private static LocalDateTime STATIC_DATE = LocalDateTime.now();

    private static BuscadorFusoHorario SINGLETON;

    private BuscadorFusoHorario() {
    }

    public static BuscadorFusoHorario getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new BuscadorFusoHorario();
        }
        return SINGLETON;
    }

    public List<String> porPais(String pais) {
        String[] fusos = TimeZone.getAvailableIDs();
        List<String> fusosEncontrados = new ArrayList<>();
        for (String fuso : fusos) {
            if (fuso.toUpperCase().contains(pais.toUpperCase())) {
                fusosEncontrados.add(fuso);
            }
        }
        return fusosEncontrados;
    }


    public String maisCedo(List<String> fusos) {
        ZoneOffset current = ZoneOffset.MIN;
        String fusoMaisCedo = fusos.get(0);

        for (String fuso : fusos) {

            final ZoneOffset offset = STATIC_DATE.atZone(ZoneId.of(fuso)).getOffset();
            if (offset.compareTo(current) < 0) {
                current = offset;
                fusoMaisCedo = fuso;
            }
        }
        return fusoMaisCedo;
    }

    public String maisTarde(List<String> fusos) {
        ZoneOffset current = ZoneOffset.MAX;
        String fusoMaisTarde = fusos.get(0);

        for (String fuso : fusos) {

            final ZoneOffset offset = STATIC_DATE.atZone(ZoneId.of(fuso)).getOffset();
            if (offset.compareTo(current) > 0) {
                current = offset;
                fusoMaisTarde = fuso;
            }
        }
        return fusoMaisTarde;
    }
}
