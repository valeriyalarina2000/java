package rpis82.Larina.oop.model;

public class Person {

    public static Person UNKNOWN_PERSON = new Person("", "");

    private String lastName; // принимающий параметр Фамилия
    private String firstName; //Имя

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override // переопределение базового класса
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

}
