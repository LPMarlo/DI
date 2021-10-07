package tema0.actividad1_4;

import java.util.ArrayList;

public class Teacher extends Person{

    ArrayList<Student> studentsList;
    private Departament departament;

    public Teacher(String id, String name, String surname, int age, Departament departament) throws PersonException {
        super(id, name, surname, age);
        this.departament = departament;
        studentsList = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        return studentsList.add(student);
    }

    public boolean removeStudent(Student student) {
        return studentsList.remove(student);
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public String toString() {
        return super.toString();
    }

    public boolean containStudent(Student student) {
        return studentsList.contains(student);
    }
}
