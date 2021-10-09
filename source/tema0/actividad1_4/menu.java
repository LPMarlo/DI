package tema0.actividad1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        int opt = 0;

        System.out.println("Welcome!\n");
        do {
            showMainMenu();

            try {
                System.out.println("Choose a option:");
                opt = Integer.parseInt(sc.nextLine());

                mainMenu(opt, teachers, students);
            } catch (NumberFormatException e){
                System.out.println("Error. Introduce a number.");
            }



            if (opt < 1 || opt > 9) System.out.println("Error. Choose a option between 1 and 9.");

        } while (opt!=9);
    }
    private static void showMainMenu() {

        System.out.println("Choose a option:");
        System.out.println("1. Add a teacher.");
        System.out.println("2. Add a student.");
        System.out.println("3. Remove a teacher.");
        System.out.println("4. Remove a student.");
        System.out.println("5. Change teacher's information.");
        System.out.println("6. Change student's information.");
        System.out.println("7. Teacher information.");
        System.out.println("8. Student information.");
        System.out.println("9. Exit.");
    }

    private static void mainMenu(int opt, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        String id;
        String name;
        String surname;
        int age;
        boolean contain = false;

        try {
            switch (opt) {
                case 1 -> {
                    System.out.println("ID: ");
                    id = sc.nextLine().toUpperCase();

                    System.out.println("Name: ");
                    name = sc.nextLine();

                    System.out.println("Surname: ");
                    surname = sc.nextLine();

                    System.out.println("Age: ");
                    age = Integer.parseInt(sc.nextLine());

                    System.out.println("Department: ");
                    String depart = sc.nextLine();

                    teachers.add(new Teacher(id, name, surname, age, Department.valueOf(depart)));
                }
                case 2 -> {
                    System.out.println("ID: ");
                    id = sc.nextLine().toUpperCase();

                    System.out.println("Name: ");
                    name = sc.nextLine();

                    System.out.println("Surname: ");
                    surname = sc.nextLine();

                    System.out.println("Age: ");
                    age = Integer.parseInt(sc.nextLine());

                    System.out.println("Enrollment's code: ");
                    String enrollment = sc.nextLine();

                    Student s = new Student(id, name, surname, age, enrollment);

                    System.out.println("How many subjects do you want to add?");
                    int numSubjects = Integer.parseInt(sc.nextLine());

                    if (numSubjects != 0) {
                        System.out.println("Subjects: IT, PHYSICS, CHEMISTRY, BIOLOGY, LITERATURE, MATHEMATICS, HISTORY");

                        for (int i = 0; i < numSubjects; i++) {
                            String subject;
                            System.out.println("Subject [" + (i + 1) + "]: ");
                            subject = sc.nextLine();

                            s.addSubject(Subject.valueOf(subject));
                        }
                    }
                    students.add(s);
                }
                case 3 -> {
                    System.out.println("Teacher's ID: ");
                    id = sc.nextLine().toUpperCase();

                    for (int i = 0; i < teachers.size(); i++) {
                        if (teachers.get(i).checkId(id)) {
                            contain = teachers.remove(teachers.get(i));
                        }
                    }

                    if (contain) {
                        System.out.println("Teacher removed.");
                    } else {
                        System.out.println("Teacher not removed.");
                    }
                }
                case 4 -> {
                    System.out.println("Student's ID: ");
                    id = sc.nextLine().toUpperCase();

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).checkId(id)) {
                            contain = students.remove(students.get(i));
                        }
                    }

                    if (contain) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not removed.");
                    }
                }
                case 5 -> {
                    System.out.println("Teacher's ID:");
                    id = sc.nextLine().toUpperCase();

                    for (Teacher teacher : teachers) {
                        contain = teacher.checkId(id);
                    }

                    if (!contain) {
                        System.out.println("Teacher's ID not found.");
                    } else {
                        int teacherOpt;
                        do {
                            System.out.println("Choose a option:");
                            teacherOpt = Integer.parseInt(sc.nextLine());

                            showTeacherMenu();
                            teacherMenu(teachers, id, opt);

                            if (teacherOpt < 1 || teacherOpt > 7) System.out.println("Error. Choose a option between 1 and 7.");

                        } while (teacherOpt!=7);
                    }
                }
                case 6 -> {
                    System.out.println("Student's ID:");
                    id = sc.nextLine().toUpperCase();

                    for (Student student : students) {
                        contain = student.checkId(id);
                    }

                    if (!contain) {
                        System.out.println("Student's ID not found.");
                    } else {
                        int studentOpt;
                        do {
                            System.out.println("Choose a option:");
                            studentOpt = Integer.parseInt(sc.nextLine());

                            showStudentMenu();
                            studentMenu(students, id, studentOpt);

                            if (studentOpt < 1 || studentOpt > 5) System.out.println("Error. Choose a option between 1 and 5.");

                        } while (studentOpt!=5);
                    }
                }
                case 7 -> {
                    System.out.println("Teacher's ID:");
                    id = sc.nextLine().toUpperCase();

                    for (Teacher teacher : teachers) {
                        contain = teacher.checkId(id);
                    }

                    if (!contain) {
                        System.out.println("Teacher's ID not found.");
                    } else {
                        for (Teacher teacher : teachers) {
                            System.out.println(teacher.toString());
                        }
                    }


                }
                case 8 -> {
                    System.out.println("Student's ID:");
                    id = sc.nextLine().toUpperCase();

                    for (Student student : students) {
                        contain = student.checkId(id);
                    }
                    if (!contain) {
                        System.out.println("Student's ID not found.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student.toString());
                        }
                    }
                }
                default -> {
                }
            }
        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showStudentMenu() {
        System.out.println("Information to change:");
        System.out.println("1. Name.");
        System.out.println("2. Surname.");
        System.out.println("3. Age.");
        System.out.println("4. ID.");
        System.out.println("5. Exit.");
    }

    private static void studentMenu(ArrayList<Student> students, String id, int opt) {
        switch (opt) {
            case 1 -> {
                System.out.println("New name:");
                String newName = sc.nextLine();

                for (Student student : students) {
                    if (student.checkId(id)) {
                        student.setName(newName);
                    }
                }
            }
            case 2 -> {
                System.out.println("New surname:");
                String newSurname = sc.nextLine();

                for (Student student : students) {
                    if (student.checkId(id)) {
                        student.setSurname(newSurname);
                    }
                }
            }
            case 3 -> {
                System.out.println("New age:");
                int newAge = Integer.parseInt(sc.nextLine());

                for (Student student : students) {
                    if (student.checkId(id)) {
                        student.setAge(newAge);
                    }
                }
            }
            case 4 -> {
                System.out.println("New ID:");
                String newId = sc.nextLine().toUpperCase();

                for (Student student : students) {
                    if (student.checkId(id)) {
                        student.setId(newId);
                    }
                }
            }
            default -> {
            }
        }
    }
    private static void showTeacherMenu() {
        System.out.println("Information to change:");
        System.out.println("1. Name.");
        System.out.println("2. Surname.");
        System.out.println("3. Age.");
        System.out.println("4. ID.");
        System.out.println("5. Add student to teacher.");
        System.out.println("6. Remove student to teacher.");
        System.out.println("7. Exit.");
    }

    private static void teacherMenu(ArrayList<Teacher> teachers, String id, int opt) {
        switch (opt) {
            case 1 -> {
                System.out.println("New name:");
                String newName = sc.nextLine();
                for (Teacher teacher : teachers) {
                    if (teacher.checkId(id)) {
                        teacher.setName(newName);
                    }
                }
            }
            case 2 -> {
                System.out.println("New surname:");
                String newSurname = sc.nextLine();
                for (Teacher teacher : teachers) {
                    if (teacher.checkId(id)) {
                        teacher.setSurname(newSurname);
                    }
                }
            }
            case 3 -> {
                System.out.println("New age:");
                int newAge = Integer.parseInt(sc.nextLine());
                for (Teacher teacher : teachers) {
                    if (teacher.checkId(id)) {
                        teacher.setAge(newAge);
                    }
                }
            }
            case 4 -> {
                System.out.println("New ID:");
                String newId = sc.nextLine().toUpperCase();
                for (Teacher teacher : teachers) {
                    if (teacher.checkId(id)) {
                        teacher.setId(newId);
                    }
                }
            }
            case 5 -> {
                boolean checked = false;

                System.out.println("Student's ID:");
                id = sc.nextLine().toUpperCase();

                for (Teacher teacher : teachers) {
                    for (int j = 0; j < teacher.getStudentsList().size(); j++) {
                        if (teacher.getStudentsList().get(j).checkId(id)) {
                            checked = true;
                            teacher.addStudent(teacher.getStudentsList().get(j));
                        }
                    }
                }

                if (!checked) {
                    System.out.println("Student not found.");
                }
            }
            case 6 -> {
                boolean checked2 = false;

                System.out.println("Student's ID:");
                id = sc.nextLine().toUpperCase();

                for (Teacher teacher : teachers) {
                    for (int j = 0; j < teacher.getStudentsList().size(); j++) {
                        if (teacher.getStudentsList().get(j).checkId(id)) {
                            checked2 = true;
                            teacher.removeStudent(teacher.getStudentsList().get(j));
                        }
                    }
                }

                if (!checked2) {
                    System.out.println("Student not found.");
                }
            }
            default -> {
            }
        }
    }
}
