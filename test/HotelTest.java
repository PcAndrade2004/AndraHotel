import com.empresa.andrahotel.model.Gerente;
import com.empresa.andrahotel.model.Hotel;
import com.empresa.andrahotel.model.Recepcionista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelTest {

    @Test
    void calcularFolhaPagamento() {
        Hotel hotel = new Hotel(
                "Hotel Andrade",
                "12.345.678/0001-99",
                "Rua das Flores, 100",
                4
        );

        Recepcionista recepcionista = new Recepcionista(
                "M001",
                "Ana Lima",
                "123.456.789-00",
                2500.0,
                "Manhã"

        );

        Gerente gerente = new Gerente(
                "M002",
                "Carlos Eduardo",
                "987.654.321-00",
                5000.0,
                "Hospedagem",
                20.0
        );

        hotel.adicionarFuncionario(recepcionista);
        hotel.adicionarFuncionario(gerente);

        double total =  hotel.calcularFolhaPagamento();
        assertEquals(7197.5 , total);

    }
}
