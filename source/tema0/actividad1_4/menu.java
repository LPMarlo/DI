package tema0.actividad1_4;

import java.util.ArrayList;

import static tema0.actividad1_4.Departament.FP;

public class menu {

    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        showMainMenu();

    }
    private static void showMainMenu() {
        System.out.println("Welcome!\n");
        System.out.println("Choose a option:");
        System.out.println("1. Add a teacher.");
        System.out.println("2. Add a student.");
        System.out.println("3. Delete a teacher.");
        System.out.println("4. Delete a student.");
        System.out.println("5. Edit student's information.");
        System.out.println("6. Edit teacher's information.");
    }
}
