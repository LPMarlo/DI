package tema0.actividad1_4;

import java.util.ArrayList;

public class Student extends Person {

    private String enrollment;
    private ArrayList<SubjectArea> subjects;


    public Student(String id, String name, String surname, int age, String enrollment) throws PersonException {
        super(id, name, surname, age);
    }

    public void addSubject(SubjectArea subject) throws PersonException {
         if (!subjects.add(subject)) throw new PersonException("Incorrect Subject.");
    }
}
