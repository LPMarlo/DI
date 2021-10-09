package tema0.actividad1_4;

public abstract class Person {

    private String id;
    private String name;
    private String surname;
    private int age;

    public Person(String id, String name, String surname, int age) throws PersonException {
        checkIdFormat(id);
        this.name = name;
        this.surname = surname;
        checkAge(age);
    }

    private void checkIdFormat(String id) throws PersonException{
        if (!(id.length()==9 || Character.isLetter(id.indexOf(8)))) {
            for (int i = 0; i < id.length()-1; i++) {
                if (!Character.isDigit(id.indexOf(i))) {
                    throw new PersonException("Incorrect ID.");
                }
            }
        }
        this.id = id;
    }

    private void checkAge(int age) throws PersonException {
        if (age<0) throw new PersonException("Incorrect Age.");
        this.age = age;
    }

    public boolean checkId(String id) {
        return this.id.equals(id);
    }

    public String toString() {
        return "ID: " + id +
                "; Name: " + name +
                "; Surname: " + surname +
                "; Age: " + age;
    }

    public void setId(String id) {
        if (checkId(id)) this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
