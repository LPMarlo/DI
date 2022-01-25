package tema6.Actividad6_1.Ejercicio1;

/**
 * Clase Calculadora.
 * Este código es apartir de Java 14.
 * Record hace referencia a una clase que tiene un constructor, getters y setters predeterminados de los atributos.
 * @author Marlo Lebrón Pareja.
 */
public record Calculadora(int num1, int num2) {

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }
}
