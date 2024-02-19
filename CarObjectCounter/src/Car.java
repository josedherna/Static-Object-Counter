public class Car {
    private String brand;
    private String model;
    private int year;
    public static int objectCounter = 0;
    Car() {
        brand = "";
        model = "";
        year = 0;
        objectCounter++;
    }
    public void printObjectCounter() {
        System.out.println("There are " + objectCounter + " car objects.");
    }
}
