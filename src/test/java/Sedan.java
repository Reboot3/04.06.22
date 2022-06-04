public class Sedan extends Car {

    String groundClearance;
    String chassis;

    public Sedan(String model, int year, String engineType) {
        super(model, year, engineType);
    }

    public void comfortModeDrive() {
        System.out.println("More comfort drive");
    }

    String drive() {
        System.out.println("DRIVING AS A SEDAN");
        return "DRIVING AS A SEDAN MORE COMFORT";
    }


}
