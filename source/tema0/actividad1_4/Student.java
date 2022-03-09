package tema0.actividad1_4;

import java.util.ArrayList;

public class Student extends Person {

    /**
     * Matrícula del alumno.
     */
    private String enrollment;
    /**
     * Asignaturas.
     */
    private ArrayList<Subject> subjects;


    /**
     * Constructor
     * @param id
     * @param name
     * @param surname
     * @param age
     * @param enrollment
     * @throws PersonException
     */
    public Student(String id, String name, String surname, int age, String enrollment) throws PersonException {
        super(id, name, surname, age);
        subjects = new ArrayList<>();
        this.enrollment = enrollment;
    }

    /**
     * Añadir asignatura.
     * @param subject
     * @throws PersonException
     */
    public void addSubject(Subject subject) throws PersonException {
        if (!subjects.add(subject)) throw new PersonException("Incorrect Subject.");
        subjects.add(subject);
    }

    public String toString() {
        return super.toString() + "; Enrollment: " + enrollment;
    }
}