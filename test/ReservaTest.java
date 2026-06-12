import com.empresa.andrahotel.model.Quarto;
import com.empresa.andrahotel.model.Reserva;
import com.empresa.andrahotel.model.StatusQuarto;
import com.empresa.andrahotel.model.StatusReserva;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaTest {

    @Test
    void calcularTotal() {
        Quarto quarto = new Quarto(
                "101",
                1,
                "Standard",
                2,
                400.0,
                StatusQuarto.DISPONIVEL,
                false,
                false
        );


        Reserva reserva = new Reserva(
                "1",
                LocalDate.of(2026, 6, 26),
                LocalDate.of(2026, 6, 29),
                400.0,
                10.0,
                "Teste",
                20,
                false,
                StatusReserva.CONCLUIDA,
                quarto
        );

        double total = reserva.calcularTotal();

        assertEquals(1200.0, total);

    }

}
