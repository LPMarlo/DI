package tema5.Actividad6_1.Ejercicio2;

/**
 * Clase que representa un número complejo
 * @author Marlo Lebrón Pareja
 */
public class NumComplejo {

    private float real;
    private float imaginario;

    public NumComplejo() {

    }

    public NumComplejo(float real, float imag) {
        this.real = real;
        this.imaginario = imag;
    }

    /**
     * Este método devuelve la suma de dos números complejos.
     * @param c
     * @return aux
     */
    public NumComplejo sumar(NumComplejo c) {
        NumComplejo aux = new NumComplejo();
        aux.real = real + c.real;
        aux.imaginario = imaginario + c.imaginario;
        return aux;
    }

    /**
     * Este método devuelve la resta de dos números complejos.
     * @param c
     * @return aux
     */
    public NumComplejo dividir(NumComplejo c) {
        NumComplejo aux = new NumComplejo();
        aux.real = (real * c.real + imaginario * c.imaginario) / (c.real * c.real + c.imaginario * c.imaginario);
        aux.imaginario = (imaginario * c.real - real * c.imaginario) / (c.real * c.real + c.imaginario * c.imaginario);
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumComplejo that = (NumComplejo) o;
        return Float.compare(that.real, real) == 0 && Float.compare(that.imaginario, imaginario) == 0;
    }
}
