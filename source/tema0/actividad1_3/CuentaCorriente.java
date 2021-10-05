package tema0.actividad1_3;

public class CuentaCorriente implements ICuentaCorriente {

    private String titular;
    private String numero;
    private double saldo;

    public CuentaCorriente(String numero, String titular, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void abono(double cantidad) {
        this.saldo += cantidad;
    }

    public void cargo(double cantidad) {
        this.saldo -= cantidad;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }
}
