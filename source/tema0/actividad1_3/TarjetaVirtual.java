package tema0.actividad1_3;

import java.util.Scanner;

public class TarjetaVirtual extends TarjetaBancaria implements ITarjetaVirtual{

    private int pin;
    private double monedero;

    public TarjetaVirtual(String numTarjetaBancaria, int pin, double limite, FechaDeCaducidad fechaDeCaducidad, CuentaCorriente cuentaCorriente) {
        super(numTarjetaBancaria,limite, fechaDeCaducidad, cuentaCorriente);
        this.monedero = 0;
        this.pin = pin;
    }

    public double getMonedero() {
        return monedero;
    }

    public void recargarMonedero(double cantidad, int pin) {
        if (comprobarPin(pin)==true) {
            if (super.sacarDinero(cantidad)==true && (this.monedero+cantidad)<=super.getLimite()) {
                this.monedero += cantidad;
            }
        }
    }

    public boolean compra(double cantidad) {
        boolean compra = false;
        if (comprobarPin(pin)==true) {
            if (this.monedero>=cantidad ) {
                this.monedero-=cantidad;
                compra = true;
            }
        }

        return compra;
    }

    public void cambiarPin(int pin, int newPin) {
        if (this.pin==pin) {
            this.pin = newPin;
        }
    }

    private boolean comprobarPin(int pin) {
        boolean igual=false;
        if (this.pin==pin) {
            igual = true;
        }
        return igual;
    }

    public String getTitular() {
        return super.getTitular();
    }

    public String getNumero() {
        return super.getNumero();
    }

    public IFechaDeCaducidad getFechaDeCaducidad() {
        return super.getFechaDeCaducidad();
    }

    public ICuentaCorriente getCuentaCorriente() {
        return super.getCuentaCorriente();
    }

    public double getLimite() {
        return super.getLimite();
    }




}
