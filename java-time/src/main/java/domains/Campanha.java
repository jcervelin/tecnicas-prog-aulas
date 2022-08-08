package domains;

import exceptions.DuracaoInvalidaException;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Builder
public class Campanha {

    private String id;
    private String pais;
    private LocalDateTime inicio;
    private LocalDateTime fim;


    public void validaDuracao() {
        if (inicio.isAfter(fim)) {
            String mensagemErro = "Datas invalidas: inicio [%s], fim [%s]";
            throw new DuracaoInvalidaException(String.format(mensagemErro, inicio, fim));
        }
    }

    private String formatarData(LocalDateTime hora) {
        // yyyy-MM-dd -> DateTimeFormatter.ISO_LOCAL_DATE
        // dd/MM/yyyy -> customizado
        return hora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }


    @Override
    public String toString() {
        return "Campanha{" +
                "id='" + id + '\'' +
                ", pais='" + pais + '\'' +
                ", inicio=" + formatarData(inicio) +
                ", fim=" + formatarData(fim) +
                '}';
    }
}
