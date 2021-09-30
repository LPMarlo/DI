package tema0.actividad1_3;

public class TarjetaVirtual extends TarjetaBancaria implements ITarjetaVirtual{

    private int pin;
    private double monedero;

    @Override
    public String getTitular() {
        return null;
    }

    @Override
    public String getNumero() {
        return null;
    }

    @Override
    public IFechaDeCaducidad getFechaDeCaducidad() {
        return null;
    }

    @Override
    public ICuentaCorriente getCuentaCorriente() {
        return null;
    }

    @Override
    public double getLimite() {
        return 0;
    }

    @Override
    public boolean compra(double cantidad) {
        return false;
    }
}
