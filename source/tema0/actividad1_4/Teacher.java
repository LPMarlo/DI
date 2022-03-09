package tema0.actividad1_4;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<Student> studentsList;
    private Department department;

    /**
     * Constructor
     * @param id
     * @param name
     * @param surname
     * @param age
     * @param department
     * @throws PersonException
     */
    public Teacher(String id, String name, String surname, int age, Department department) throws PersonException {
        super(id, name, surname, age);
        this.department = department;
        studentsList = new ArrayList<>();
    }

    /**
     * Añade estudiante a cargo.
     * @param student
     */
    public void addStudent(Student student) {
        studentsList.add(student);
    }

    /**
     * Elimina un estudiante a cargo.
     * @param student
     */
    public void removeStudent(Student student) {
        studentsList.remove(student);
    }

    /**
     * Obtener lista de estudiantes a cargo.
     * @return
     */
    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public String toString() {
        return super.toString() + "; Department: " + department.toString();
    }
}
