package tema0.actividad1_3;

public class TarjetaVirtual extends TarjetaBancaria implements ITarjetaVirtual{

    private int pin;
    private double monedero;

    public TarjetaVirtual(double monedero) {
        this.monedero = monedero;
    }

    public void recargarMonedero(double cantidad) {
        this.monedero += cantidad;
    }
    public boolean compra(double cantidad) {
        return false;
    }


    @Override
    public String getTitular() {
        return null;
    }

    @Override
    public String getNumero() {
        return super.getNumero();
    }

    @Override
    public IFechaDeCaducidad getFechaDeCaducidad() {
        return super.getFechaDeCaducidad();
    }

    @Override
    public ICuentaCorriente getCuentaCorriente() {
        return super.getCuentaCorriente();
    }

    @Override
    public double getLimite() {
        return super.getLimite();
    }




}
