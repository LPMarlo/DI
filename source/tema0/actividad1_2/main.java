package tema0.actividad1_2;

import java.util.Scanner;

/**
 * @author Marlo Lebrón Pareja
 */
public class main {

    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Estructura: P(x1,y1) y Q(x2,y2)");
        System.out.println("Introduce el valor de x1: ");
        double x1 = teclado.nextInt();

        System.out.println("Introduce el valor de y1: ");
        double y1 = teclado.nextInt();

        Punto p1 = new Punto(x1,y1);

        System.out.println("Introduce el valor de x2: ");
        double x2 = teclado.nextInt();

        System.out.println("Introduce el valor de y2: ");
        double y2 = teclado.nextInt();

        Punto p2 = new Punto(x2,y2);

        System.out.println("Distancia euclídea: "+p1.distanciaEuclidea(p2));
    }
}
