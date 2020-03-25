package rpis82.Larina.oop.model;

public class Space {

    private Person person;
    private Vehicle vehicle;

    public Space(Person person, Vehicle vehicle) {
        this.person = person;
        this.vehicle = vehicle;
    }

    public Space() {
        this(Person.UNKNOWN_PERSON, new Vehicle());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return this.vehicle == null || this.vehicle.getRegistrationNumber().equals("");
    }

    @Override
    public String toString() {
        return "Space{" +
                "person=" + person +
                ", vehicle=" + vehicle +
                '}';
    }
}
