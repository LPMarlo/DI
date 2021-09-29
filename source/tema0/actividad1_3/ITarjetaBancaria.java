package tema0.actividad1_3;

public interface ITarjetaBancaria {
    public String getTitular();
    public String getNumero();
    public IFechaDeCaducidad getFechaDeCaducidad();
    public ICuentaCorriente getCuentaCorriente();
    public double getLimite();
    // Método compra
    public boolean compra(double cantidad);

}
