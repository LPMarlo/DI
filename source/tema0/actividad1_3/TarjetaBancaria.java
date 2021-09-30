package tema0.actividad1_3;

public class TarjetaBancaria implements ITarjetaBancaria {

    private String titular;
    private double limite;
    private IFechaDeCaducidad fechaDeCaducidad;
    private ICuentaCorriente cuentaCorriente;

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
