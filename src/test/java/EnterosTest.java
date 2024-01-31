import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnterosTest {

    @Test
    void r_factorial() {
        assertEquals(24, Enteros.r_factorial(4));
    }

    @Test
    void factorial() {
        assertEquals(24, Enteros.factorial(4));
    }

    @Test
    void alreves() {
        assertEquals("aloH", Enteros.alreves("Hola"));
    }

    @Test
    void capicua() {
        assertTrue(Enteros.capicua(12321));
        assertFalse(Enteros.capicua(12345));
    }

    @Test
    void divisible() {
        assertTrue(Enteros.divisible(15,5));
        assertTrue(Enteros.divisible(15,3));
    }

    @Test
    void multiplo() {
        assertTrue(Enteros.multiplo(15,5));
        assertFalse(Enteros.multiplo(15,2));
    }

    @Test
    void esPrimo() {
        assertTrue(Enteros.esPrimo(17));
        assertFalse(Enteros.esPrimo(14));
    }

    @Test
    void n_primos() {
        assertEquals(4, Enteros.n_primos(10));
    }

    @Test
    void primosHasta() {
        int[] esperado={2,3,5,7};
        assertArrayEquals(esperado, Enteros.primosHasta(10));
    }

    @Test
    void primerosPrimos() {
        int[] esperado={2,3,5,7};
        assertArrayEquals(esperado,Enteros.primerosPrimos(4));
    }
}