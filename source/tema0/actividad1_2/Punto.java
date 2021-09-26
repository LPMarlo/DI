package tema0.actividad1_2;

public class Punto implements IPunto{

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanciaEuclidea(Punto p) {
        double dE = Math.sqrt(Math.pow(p.getX()-this.x,2)+Math.pow(p.getY()-this.y,2));
        return dE;
    }
}
