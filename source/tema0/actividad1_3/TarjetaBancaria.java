package tema0.actividad1_3;

public class TarjetaBancaria implements ITarjetaBancaria {

    private double limite;
    private String numero;
    private IFechaDeCaducidad fechaDeCaducidad;
    private ICuentaCorriente cuentaCorriente;

    //CONSTRUCTOR
    public TarjetaBancaria(String numero, double limite, IFechaDeCaducidad fechaDeCaducidad, ICuentaCorriente cuentaCorriente) {
        this.numero = numero;
        this.limite = limite;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.cuentaCorriente = cuentaCorriente;
    }

    public boolean compra(double cantidad) {
        boolean compra = false;
        if (cuentaCorriente.getSaldo() >= cantidad && this.limite >= cantidad) { //Comprueba la disponibilidad y controla el limite establecido
            cuentaCorriente.cargo(cantidad);
            compra = true;
        }
        return compra;
    }

    public String getTitular() {
        return this.cuentaCorriente.getTitular();
    }

    public String getNumero() {
        return this.numero;
    }

    public IFechaDeCaducidad getFechaDeCaducidad() {
        return this.fechaDeCaducidad;
    }

    public ICuentaCorriente getCuentaCorriente() {
        return this.cuentaCorriente;
    }

    public double getLimite() {
        return this.limite;
    }

}
