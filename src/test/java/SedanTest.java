import org.junit.Assert;
import org.testng.annotations.Test;

public class SedanTest {

    @Test
    public void testName() {
        Sedan myNewCar = new Sedan("Camry", 2001, "4cyl");
        myNewCar.turnLeft();
        myNewCar.comfortModeDrive();
    }

    @Test
    public void testAnotherCar() {
        Car justACar = new Car("Some Car", 2020, "4cyl");

        String drive = justACar.drive();

        Assert.assertTrue(drive.contentEquals("DRIVING AS A CAR"));

        Sedan anotherCar = new Sedan("Honda", 2002, "4cyl");

        anotherCar.comfortModeDrive();

        String comfortDriverMessage = anotherCar.drive();

        boolean isEqual = comfortDriverMessage.equalsIgnoreCase("DRIVING AS A SEDAN MORE COMFORT");

        Assert.assertTrue(isEqual);
    }
}
