package tema6.Actividad6_1.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas de la clase Calculadora
 * @author Marlo Lebrón Pareja
 */
class CalculadoraTest {

    /**
     * Test para verificar que la suma funciona correctamente.
     */
    @Test
    void sumar() {
        Calculadora c = new Calculadora(2,3);
        int resultado = c.sumar();
        assertEquals(5, resultado);
        assertNotEquals(4, resultado);
    }

    /**
     * Test para verificar que la división funciona correctamente.
     */
    @Test
    void restar() {
        Calculadora c = new Calculadora(2,3);
        int resultado = c.restar();
        assertEquals(-1, resultado);
        assertNotEquals(4, resultado);
    }

    /**
     * Test para verificar que la multiplicación funciona correctamente.
     */
    @Test
    void multiplicar() {
        Calculadora c = new Calculadora(2,3);
        int resultado = c.multiplicar();
        assertEquals(6, resultado);
        assertNotEquals(4, resultado);
    }
}