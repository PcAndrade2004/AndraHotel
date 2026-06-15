import com.empresa.andrahotel.model.Hospedagem;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedagemTest {

    @Test
    void aplicarDesconto() {
        Hospedagem hospedagem = new Hospedagem("1", LocalDate.of(2026, 06, 8),
                LocalDate.of(2026, 06, 11), 200.0, 10, "Hotel Fazenda") {
            @Override
            public double calcularTotal() {
                return 0;
            }

            @Override
            public String gerarDescrisaoFatura() {
                return "";
            }
        };

        hospedagem.aplicarDesconto(10);
        assertEquals(180.0, hospedagem.getValorDiaria());
    }
}
