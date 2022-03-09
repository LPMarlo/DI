package tema5.Actividad6_1.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase que implementa los test de la clase NumComplejo
 * @author Marlo Lebrón Pareja
 */
class NumComplejoTest {

    /**
     * Test que comprueba que el método multiplicar funciona correctamente
     */
    @Test
    void sumar() {
        NumComplejo a = new NumComplejo(1, 2);
        NumComplejo b = new NumComplejo(3, 4);
        NumComplejo c = new NumComplejo(4, 6);
        assertEquals(c, a.sumar(b));
    }

    /**
     * Test que comprueba que el método multiplicar funciona correctamente
     */
    @Test
    void dividir() {
        NumComplejo a = new NumComplejo(1, 2);
        NumComplejo b = new NumComplejo(3, 4);
        NumComplejo c = new NumComplejo(0.44f, 0.08f);
        assertEquals(c, a.dividir(b));

    }
}