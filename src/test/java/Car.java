public class Car {

    public int year;
    private String model;
    private String engineType;

    public Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engineType;
    }

    String drive() {
        System.out.println("DRIVING AS A CAR");
        return "DRIVING AS A CAR";
    }

    void turnLeft() {
        System.out.println("TURNED LEFT");
    }

    void turnRight() {
        System.out.println("TURNED RIGHT");
    }
}
