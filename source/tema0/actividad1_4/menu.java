package tema0.actividad1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        showMainMenu();
        System.out.println("Choose a option:");
        int opt = Integer.parseInt(sc.nextLine());

        mainMenu(opt, teachers);


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

    private static void mainMenu(int opt, ArrayList<Teacher> teachers) {
        try {
        switch (opt) {
            case 1:
                System.out.println("ID: ");
                String id = sc.nextLine();

                System.out.println("Name: ");
                String name = sc.nextLine();

                System.out.println("Surname: ");
                String surname = sc.nextLine();

                System.out.println("Age: ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.println("ID: ");
                String depart = sc.nextLine();


                    teachers.add(new Teacher(id, name, surname, age, Departament.valueOf(depart) ));

                break;

            case 2:
                System.out.println("ID: ");
                String id2 = sc.nextLine();

                System.out.println("Name: ");
                String name2 = sc.nextLine();

                System.out.println("Surname: ");
                String surname2 = sc.nextLine();

                System.out.println("Age: ");
                int age2 = Integer.parseInt(sc.nextLine());

                System.out.println("Enrollment's code: ");
                String enrollment = sc.nextLine();

                Student s = new Student(id2, name2, surname2, age2, enrollment);

                System.out.println("How many subjects do you want to add?");
                int numSubjects = Integer.parseInt(sc.nextLine());

                if (numSubjects!=0) {
                    System.out.println("Subjects: IT, PHISICS, CHEMISTRY, BIOLOGY, LITERATURE, MATHEMATICS, HISTORY");
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.println("Subject ["+(i+1)+"]: ");
                        s.addSubject(SubjectArea.valueOf(sc.nextLine()));
                    }
                }
                break;
            case 3:
                for (Teacher teacher : teachers) {
                    System.out.print(teacher.toString() + " ");
                }
                System.out.println("Introduce the teacher's ID: ");
                String id3 = sc.nextLine();

                boolean removed = false;
                boolean again = false;

                do {
                    for (int i = 0; i < teachers.size(); i++) {
                        if (teachers.get(i).validateId(id3)) {
                            removed = teachers.remove(teachers.get(i));
                        }
                    }

                    if (removed) {
                        System.out.println("Teacher deleted.");
                    } else {
                        System.out.println("Error. Teacher has not deleted.");
                        System.out.println("Do you want to try it again?");
                        again = sc.nextBoolean();
                    }
                } while (again);

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                break;
        }
        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }
    }
}
