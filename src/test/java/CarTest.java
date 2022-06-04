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

    @Test
    public void testOverriding() {
        Car myCar = new Car("Toyota", 2001, "4 cyl");

        myCar.drive();
    }

    @Test
    public void testOverriding001() {
        Sedan myCar = new Sedan("Toyota", 2001, "4 cyl");

        myCar.drive();
    }

    @Test
    public void testOverriding002() {
        Car myCar = new Car("Toyota", 2001, "4 cyl");

        myCar.drive();

        Car anotherCar = new Sedan("Toyota", 2001, "4 cyl");

        anotherCar.drive();
    }

    @Test
    public void testOverloading() {
        Sedan anotherCar = new Sedan("Toyota", 2001, "4 cyl");

        anotherCar.increaseSpeed();
        anotherCar.increaseSpeed("20");
        anotherCar.increaseSpeed(20);
    }
}
