import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ConversorTest {

    @BeforeClass
    public static void antesDeTudo() {
        System.out.println("Inicio dos testes da classe Conversor...\n");
    }

    @AfterClass
    public static void depoisDeTudo() {
        System.out.println("\nFim dos testes da classe Conversor.");
    }

    @Before
    public void antesDeCada() {
        System.out.println("Iniciando um teste...");
    }

    @After
    public void depoisDeCada() {
        System.out.println("Teste finalizado.");
    }

    @Test
    public void testeCelsiusParaFahrenheit0() {
        assertEquals(32.0, Conversor.celsiusParaFahrenheit(0), 0.001);
    }

    @Test
    public void testeCelsiusParaFahrenheit100() {
        assertEquals(212.0, Conversor.celsiusParaFahrenheit(100), 0.001);
    }

    @Test
    public void testeCelsiusParaFahrenheitNegativo() {
        assertEquals(14.0, Conversor.celsiusParaFahrenheit(-10), 0.001);
    }

    @Test
    public void testeFahrenheitParaCelsius32() {
        assertEquals(0.0, Conversor.fahrenheitParaCelsius(32), 0.001);
    }

    @Test
    public void testeFahrenheitParaCelsius212() {
        assertEquals(100.0, Conversor.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    public void testeFahrenheitParaCelsiusNegativo() {
        assertEquals(-17.777, Conversor.fahrenheitParaCelsius(0), 0.001);
    }

    @Test
    public void testeCelsiusParaFahrenheitDecimal() {
        assertEquals(98.6, Conversor.celsiusParaFahrenheit(37), 0.001);
    }

    @Test
    public void testeFahrenheitParaCelsiusDecimal() {
        assertEquals(37.0, Conversor.fahrenheitParaCelsius(98.6), 0.001);
    }

    @Test
    public void testeCelsiusParaFahrenheitMuitoAlto() {
        assertEquals(1832.0, Conversor.celsiusParaFahrenheit(1000), 0.001);
    }

    @Test
    public void testeFahrenheitParaCelsiusMuitoAlto() {
        assertEquals(537.777, Conversor.fahrenheitParaCelsius(1000), 0.001);
    }
}
