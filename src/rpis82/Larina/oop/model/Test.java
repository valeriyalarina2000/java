package rpis82.Larina.oop.model;

public class Test {
    public static void main(String[] args) {
        lab1tests();
    }

    public static void lab1tests(){
        Person testPerson1 = new Person("Baranova","Inna");
        Person testPerson2 = new Person("Petrova","Olga");

        Vehicle testVehicle1 = new Vehicle("000","Lada","Vesta");
        Vehicle testVehicle2 = new Vehicle("001","Lada","Granta");
        Vehicle empty = new Vehicle();
        Person person = Person.UNKNOWN_PERSON;

        Space testSpace1 = new Space(testPerson1,testVehicle1);
        Space testSpace2 = new Space(testPerson2,testVehicle2);
        Space emptySpace = new Space(person,empty);

        OwnersFloor testFloor1 = new OwnersFloor(2);
        testFloor1.add(testSpace1);
        testFloor1.add(testSpace2);
        testFloor1.add(emptySpace);
        testFloor1.add(emptySpace);

        OwnersFloor testFloor2 = new OwnersFloor();
        testFloor2.add(testSpace2);
        testFloor2.add(testSpace2);
        testFloor2.add(emptySpace);

        Parking parking = new Parking(3);
        parking.add(testFloor1);
        parking.add(testFloor2);

        OwnersFloor[] sorted = parking.getSortedBySizeFloors();
        System.out.println(sorted[1].getSize());
    }
}
