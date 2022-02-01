package tema0.actividad1_4;


public abstract class Person {

    //Atributos
    private String id;
    private String name;
    private String surname;
    private int age;

    /**
     * Constructor
     * @param id
     * @param name
     * @param surname
     * @param age
     * @throws PersonException
     */
    public Person(String id, String name, String surname, int age) throws PersonException {
        checkIdFormat(id);
        this.name = name;
        this.surname = surname;
        checkAge(age);
    }

    /**
     * Formato del id: 8 números y 1 letra.
     * @param id
     * @throws PersonException
     */
    private void checkIdFormat(String id) throws PersonException {
        if (!(id.length() == 9 || Character.isLetter(id.indexOf(8)))) {
            for (int i = 0; i < id.length() - 1; i++) {
                if (!Character.isDigit(id.indexOf(i))) {
                    throw new PersonException("Incorrect ID.");
                }
            }
        }
        this.id = id;
    }

    /**
     * Valida que la edad esté entre 0 y 100.
     * @param age
     * @throws PersonException
     */
    private void checkAge(int age) throws PersonException {
        if (age < 0 || age > 100) throw new PersonException("Incorrect Age.");
        this.age = age;
    }


    /**
     * Valida que sea el id de esta persona.
     * @param id
     * @return
     */
    public boolean checkId(String id) {
        return this.id.equals(id);
    }

    /**
     * Información de una persona.
     * @return string
     */
    public String toString() {
        return "ID: " + id +
                "; Name: " + name +
                "; Surname: " + surname +
                "; Age: " + age;
    }


    // Setters
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
