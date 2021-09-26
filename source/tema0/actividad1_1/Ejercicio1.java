package tema0.actividad1_1;

import java.util.Scanner;

/**
 * @author Marlo Lebrón Pareja
 */
public class Ejercicio1 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un número:");
        int num = Integer.parseInt(teclado.nextLine());

        int num1 = num % 10;
        int num2 = num % 100;
        int num3 = num % 1000;

        if ((num1 > num2) && (num2 > num3)) {
            System.out.println("Orden Decreciente");
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("Orden Creciente");
        } else {
            System.out.println("Error. No es ni decreciente ni creciente.");
        }


    }

}
