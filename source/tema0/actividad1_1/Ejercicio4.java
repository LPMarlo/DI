package tema0.actividad1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Marlo Lebrón Pareja
 */
public class Ejercicio4 {

    public static final int numRatas = 20;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> pesoRatas = new ArrayList<Integer>();
        for (int i = 0; i < numRatas; i++) {
            System.out.println("Introduce la rata #" + (i + 1) + ":");
            pesoRatas.add(Integer.parseInt(teclado.nextLine()));
        }

        Collections.sort(pesoRatas);
        int cantidad = 1;

        for (int i = 0; i < numRatas - 1; i++) {

            if (pesoRatas.get(i) == pesoRatas.get(i + 1)) {
                cantidad++;
                if (i == numRatas - 2) {
                    System.out.println("Hay " + cantidad + " ratas que pesan " + pesoRatas.get(i) + " g.");
                }
            } else if (pesoRatas.get(i) != pesoRatas.get(i + 1)) {
                System.out.println("Hay " + cantidad + " ratas que pesan " + pesoRatas.get(i) + " g.");
                cantidad = 1;
                if (i+1==numRatas-1) {
                    System.out.println("Hay " + cantidad + " ratas que pesan " + pesoRatas.get(i+1) + " g.");
                }
            }
        }

        int suma = 0;
        for (int i = 0; i < numRatas; i++) {
            suma += pesoRatas.get(i);
        }

        System.out.println("El peso medio es: " + (suma / numRatas) + "g.");
    }

}