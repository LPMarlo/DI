package tema0.actividad1_3;

public class TarjetaBancaria implements ITarjetaBancaria {

    private double limite;
    private String numero;
    private IFechaDeCaducidad fechaDeCaducidad;
    private ICuentaCorriente cuentaCorriente;


    public TarjetaBancaria(String numero, double limite, FechaDeCaducidad fechaDeCaducidad, CuentaCorriente cuentaCorriente) {
        this.numero = numero;
        this.limite = limite;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.cuentaCorriente = cuentaCorriente;
    }


    public boolean sacarDinero(double cantidad) {
        boolean hecho=false;
        if (cuentaCorriente.getSaldo() >= cantidad && this.limite<=cantidad) {
            cuentaCorriente.cargo(cantidad);
            hecho =true;
        }
        return hecho;
    }

    @Override
    public String getTitular() {
        return this.cuentaCorriente.getTitular();
    }

    public String getNumero() {
        return this.numero;
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
