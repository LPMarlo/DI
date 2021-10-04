package tema0.actividad1_3;

public interface ITarjetaVirtual {
    public double getMonedero();

    public void recargarMonedero(double cantidad, int pin);

    public boolean compra(double cantidad);

    public void cambiarPin(int pin, int newPin);
}
