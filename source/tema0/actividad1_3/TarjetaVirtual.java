package tema0.actividad1_3;

import java.util.Scanner;

public class TarjetaVirtual extends TarjetaBancaria implements ITarjetaVirtual{

    private int pin;
    private double monedero;

    public TarjetaVirtual(double monedero, int pin, double limite, IFechaDeCaducidad fechaDeCaducidad, ICuentaCorriente cuentaCorriente) {
        super(cuentaCorriente.getTitular(), limite, fechaDeCaducidad, cuentaCorriente);
        this.monedero = 0;
        this.pin = pin;
    }

    public void recargarMonedero(double cantidad, int pin) {
        if (comprobarPin(pin)==true) {
            if (super.sacarDinero(cantidad)==true) {
                this.monedero += cantidad;
            }
        }
    }

    public boolean compra(double cantidad) {
        boolean compra = false;
        if (comprobarPin(pin)==true) {
            if (this.monedero>=cantidad) {
                this.monedero -= cantidad;
                compra = true;
            }
        }

        return compra;
    }

    public void cambiarPin(int pin, int newPin) {
        if (this.pin==pin) {
            this.pin = newPin;
        }
        this.pin = pin;
    }

    private boolean comprobarPin(int pin) {
        boolean igual=false;
        if (this.pin==pin) {
            igual = true;
        }
        return igual;
    }

    public String getTitular() {
        return null;
    }

    public String getNumero() {
        return super.getNumero();
    }

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
