import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorTest {

    @Test
    void shouldNotHaveAnythingToDeclare() {
        Trabalhador trabalhador = new Trabalhador("123456","João", 1900, 1000.0);
        assertEquals(0.0, trabalhador.getImpostoDeRenda());
    }

    @Test
    void shouldHaveSomethingToDeclare() {
        Trabalhador trabalhador = new Trabalhador("123456","Juliette", 32000, 10500.59);
        assertNotEquals(0.0, trabalhador.getImpostoDeRenda());
    }
}