package tema0.actividad1_3;

public class CuentaCorriente implements ICuentaCorriente {

    private String numero;
    private double saldo;
    private String titular;

    public CuentaCorriente(String numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public void abono(double cantidad) {
        this.saldo += cantidad;
    }

    @Override
    public void cargo(double cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public String getNumero() {
        return null;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String getTitular() {
        return this.titular;
    }
}
