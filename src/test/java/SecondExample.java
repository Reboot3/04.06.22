import org.testng.annotations.Test;

public class SecondExample {


    @Test
    public void testName() {
        int variableOne = 1;
        int variableTwo = 67;

        printTwoNumbers(variableOne, variableTwo);
    }

    public void printTwoNumbers(int firstParameter, int secondParameter) {
        System.out.println(firstParameter + " " + secondParameter);
    }

    @Test
    public void testNameTwo() {
        int variableOne = 1234;
        int variableTwo = 234;

        printTwoNumbers(variableOne, variableTwo);
    }


    @Test
    public void test001() {
        float floatValue = (float) 4.5;

        System.out.println(floatValue);
    }

    @Test
    public void testBooleans() {
        boolean booleanVariable = true;

        int amountOfLinks = 5;
        int amountOfClicks = 5;

        boolean isThereAreStillLinksToClick = amountOfLinks > amountOfClicks; // true

        if (isThereAreStillLinksToClick) {
            System.out.println("Keep clicking on links");
        }
    }

    public boolean isThereStillSomeTimeToClick(int currentTime, int timeSinceTestStarted) {
        boolean result = false;
        result = (currentTime - timeSinceTestStarted) > 1000;
        return result;
    }

    @Test
    public void testMoreLogical() {
        int amountOfLinks = 5;
        int amountOfClicks = 5;

        boolean elementOneIsVisible = true;

        boolean isThereAreStillLinksToClick = amountOfLinks > amountOfClicks;

        int currentTime = 5000;
        int timeSinceTestStarted = 3000;

        boolean isThereStillSomeTime = isThereStillSomeTimeToClick(currentTime, timeSinceTestStarted);

        if (elementOneIsVisible && isThereAreStillLinksToClick && isThereStillSomeTime) {
            System.out.println("Keep clicking on links");
        } else {
            System.out.println("Some conditions are not met");
        }


    }

    @Test
    public void testMoreLogicalMore() {
        int amountOfLinks = 5;
        int amountOfClicks = 4;

        boolean elementOneIsVisible = true;

        boolean isThereAreStillLinksToClick = amountOfLinks > amountOfClicks;

        int currentTime = 5000;
        int timeSinceTestStarted = 3000;

        boolean isThereStillSomeTime = isThereStillSomeTimeToClick(currentTime, timeSinceTestStarted);

        if (elementOneIsVisible && isThereAreStillLinksToClick && isThereStillSomeTime) {
            System.out.println("Keep clicking on links");
        } else {
            System.out.println("Some conditions are not met");
        }


    }

    @Test
    public void testEscMark() {
        boolean yesItsTrue = true;
        System.out.println(!yesItsTrue);
    }

    @Test
    public void testEx4() {
        String a = "Wow";
        String b = "Wow";

        boolean b1 = a.equals(b);
        boolean b2 = a.equals(b + "!");
        boolean b3 = !a.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6};

        String firstCar = "Volvo";
        String secondCar = "Toyota";
        String thirdCar = "Tesla";

        String[] garage = {firstCar, secondCar, thirdCar};

        for (int i = 0; i < garage.length; i++) {
            System.out.println("Car" + "[" + i + "]=" + garage[i]);
        }

        for (String eachCar : garage) {
            System.out.println("Car:" + eachCar);
        }
    }

    @Test
    public void testWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println("WHILE IS STILL ON");
            i++;
        }
    }

    @Test
    public void testArraysEx() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = numbers[3];
        char[] chars = new char[length];
        chars[chars.length - 1] = 'y';
        chars[0] = 's';
        chars[1] = 'o';
        chars[2] = 'n';
        System.out.println("Done!");
    }
}
