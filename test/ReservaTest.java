import com.empresa.andrahotel.model.Quarto;
import com.empresa.andrahotel.model.Reserva;
import com.empresa.andrahotel.model.StatusReserva;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaTest {

    @Test
    void calcularTotal() {
        Quarto quarto = new Quarto(
                "101",
                1,
                "Standard",
                2,
                400.0
        );


        Reserva reserva = new Reserva(
                "1",
                LocalDate.of(2026, 6, 26),
                LocalDate.of(2026, 6, 29),
                400.0,
                0.8,
                "Teste",
                20,
                true,
                StatusReserva.CONCLUIDA,
                quarto
        );

        double total = reserva.calcularTotal();

        assertEquals(1464.192, total);

    }

    @Test
    void calcularTotal2() {
        Quarto quarto = new Quarto(
                "101",
                1,
                "Standard",
                2,
                400.0
        );


        Reserva reserva = new Reserva(
                "1",
                LocalDate.of(2026, 6, 26),
                LocalDate.of(2026, 6, 29),
                400.0,
                0.8,
                "Teste",
                20,
                false,
                StatusReserva.CONCLUIDA,
                quarto
        );

        double total = reserva.calcularTotal();

        assertEquals(1200.0, total);

    }

    @Test
    void calcularTotal3() {
        Quarto quarto = new Quarto(
                "101",
                1,
                "Standard",
                2,
                400.0
        );


        Reserva reserva = new Reserva(
                "1",
                LocalDate.of(2026, 6, 26),
                LocalDate.of(2026, 6, 29),
                400.0,
                0.8,
                "Teste",
                20,
                true,
                StatusReserva.CONCLUIDA,
                quarto
        );

        double total = reserva.calcularTotal();

        assertEquals(1356.0, total);

    }



}
