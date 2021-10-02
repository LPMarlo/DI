package tema0.actividad1_3;

public class FechaDeCaducidad implements IFechaDeCaducidad {

    private int ano;
    private int mes;

    public FechaDeCaducidad(int ano, int mes) {
        this.ano = ano;
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    @Override
    public int getMes() {
        return this.mes;
    }

    @Override
    public String toString() {
        return  ano + "/" + mes;
    }
}
