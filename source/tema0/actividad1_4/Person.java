package tema0.actividad1_4;

import java.sql.Time;

public abstract class Person {

    private String id;
    private String name;
    private String surname;
    private int age;

    public Person(String id, String name, String surname, int age) throws PersonException {
        validateId(id);
        this.name = name;
        this.surname = surname;
        validateAge(age);
    }

    private void validateId(String id) throws PersonException{
        if (!(id.length()==9 || Character.isLetter(id.indexOf(8)))) {
            for (int i = 0; i < id.length()-1; i++) {
                if (!Character.isDigit(id.indexOf(i))) {
                    throw new PersonException("Incorrect ID.");
                }
            }
        }
        this.id = id;
    }

    private void validateAge(int age) throws PersonException {
        if (age<0) throw new PersonException("Incorrect Age.");
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "; Name: " + name +
                "; Surname: " + surname +
                "; Age: " + age;
    }
}
