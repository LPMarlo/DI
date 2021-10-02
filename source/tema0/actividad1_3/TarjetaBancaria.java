package tema0.actividad1_3;

public class TarjetaBancaria implements ITarjetaBancaria {

    private String titular;
    private double limite;
    private FechaDeCaducidad fechaDeCaducidad;
    private CuentaCorriente cuentaCorriente;


    public TarjetaBancaria( double limite, FechaDeCaducidad fechaDeCaducidad, CuentaCorriente cuentaCorriente) {
        this.titular = cuentaCorriente.getTitular();
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
        return this.fechaDeCaducidad;
    }

    @Override
    public ICuentaCorriente getCuentaCorriente() {
        return this.cuentaCorriente;
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
