import org.junit.Assert;
import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void testName() {
        Car myCar = new Car("Toyota", 2001, "4 cyl");

        myCar.drive();
        myCar.turnLeft();
        myCar.turnRight();

        boolean isEqual = myCar.year == 2001;
        myCar.year = 2004;
        isEqual = myCar.year == 2004;
        boolean isVolvo = myCar.getModel().equalsIgnoreCase("Volvo");

        Assert.assertFalse(isVolvo);
        Assert.assertTrue(isEqual);
    }
}
