package tema0.actividad1_3;

public class TarjetaBancaria implements ITarjetaBancaria {

    private String titular;
    private double limite;
    private IFechaDeCaducidad fechaDeCaducidad;
    private ICuentaCorriente cuentaCorriente;

    public TarjetaBancaria(String titular, double limite, IFechaDeCaducidad fechaDeCaducidad, ICuentaCorriente cuentaCorriente) {
        this.titular = titular;
        this.limite = limite;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.cuentaCorriente = cuentaCorriente;
    }


    public boolean sacarDinero(double cantidad) {
        boolean hecho=false;
        if (cuentaCorriente.getSaldo() >= cantidad) {
            cuentaCorriente.cargo(cantidad);
            hecho =true;
        }
        return hecho;
    }

    @Override
    public String getTitular() {
        return this.titular;
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
        boolean compra = false;
        if (cuentaCorriente.getSaldo()>=cantidad) {
            cuentaCorriente.cargo(cantidad);
            compra = true;
        }
        return compra;
    }
}
