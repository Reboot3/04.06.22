import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testName() {
        String testParamOne = "Alex";
        String testParamTwo = "Barabash";

        Student studentOne = new Student(testParamOne, testParamTwo);

        studentOne.printName();
        studentOne.graduate();

        //boolean isNameCorrect = studentOne.name.contentEquals("Alex"); // name == "Alex"
        assertEquals(studentOne.name, "Alex");
    }

    @Test
    public void testName032() {
        String testParamOne = "StudentName001";
        String testParamTwo = "StudentLastName001";

        Student studentOne = new Student(testParamOne, testParamTwo);

        studentOne.printName();
        studentOne.graduate();

        //boolean isNameCorrect = studentOne.name.contentEquals("Alex"); // name == "Alex"
        String expectedName = "StudentName001";

        assertEquals(studentOne.name, expectedName);

        assert expectedName.equals(studentOne.name) : "Expected name " + expectedName + ", for" + studentOne.name;
    }
}
