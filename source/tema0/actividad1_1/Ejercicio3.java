package tema0.actividad1_1;

import java.util.Scanner;

/**
 * @author Marlo Lebrón Pareja
 */
public class Ejercicio3 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;

        System.out.println("Estructura: f(x) = ax^2 +bx +c");
        System.out.println("Introduce el valor de a:");
        a = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce el valor de b:");
        b = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce el valor de c:");
        c = Integer.parseInt(teclado.nextLine());

        if (a == 0) {
            System.out.println("x = " + ((c * (-1)) / b));
        } else {
            if ((b ^ 2 - 4 * a * c) < 0) {
                System.out.println("Resultado: Número complejo");
            } else {
                System.out.println("x = " +  Math.round(((-b + Math.sqrt(b ^ 2 - 4 * a * c))*1000) / (2 * a)) / 1000);
                System.out.println("x = " +  Math.round(((-b - Math.sqrt(b ^ 2 - 4 * a * c))*1000) / (2 * a)) / 1000);
            }
        }
    }

}
