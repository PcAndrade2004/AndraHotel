import com.empresa.andrahotel.model.Reserva;
import com.empresa.andrahotel.model.StatusReserva;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaTest {

    @Test
    void calcularTotal()  {

        Reserva reserva = new Reserva("1",
                LocalDate.of(2026, 06, 26),
                LocalDate.of(2026, 06, 29),
                400.0,
                10.0,
                "Teste",
                20,
                true,
                StatusReserva.CONCLUIDA
        );

        double total = reserva.calcularTotal();
        assertEquals(1200.0, total);

    }
}
