package tema0.actividad1_1;

import java.util.Scanner;

/**
 * @author Marlo Lebrón Pareja
 */
public class Ejercicio2 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Primer lado:");
        int lado1 = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Segundo lado:");
        int lado2 = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Tercer lado:");
        int lado3 = Integer.parseInt(teclado.nextLine());
        
        if (lado1==lado2 && lado2==lado3) {
            System.out.println("Triángulo equilatero");
        }
        else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
            System.out.println("Triángulo escaleno");
        }
        else {
            System.out.println("Triángulo isósceles");
        }
    }
}
