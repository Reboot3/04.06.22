import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListsAndArrays {

    @Test
    public void testName() {
        ArrayList<String> arrayList = new ArrayList<>();

        List<String> strings = Arrays.asList("spam", "String 02", "String 03");

        arrayList.add("String 01");
        arrayList.add("String 02");
        arrayList.add("String 03");
        arrayList.add("String 04");
        arrayList.add("String 05");

        boolean isEqual = arrayList.size() == 5;

        Assert.assertEquals(isEqual, true);
    }

    @Test
    public void testArrays() {
        String[] array = new String[]{"spam", "String 02", "String 03"};

        array[1] = "dsfasdf";
    }

    @Test
    public void testArraysOfStudents() {
        Student[] arrayStudents = new Student[3];

        arrayStudents[0] = new Student("Name", "LastName");

        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
    }

    @Test
    public void testHowManyLettersIn() {
        String sentence = "Hello World";

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character each : sentence.toLowerCase().toCharArray()) {
            if (map.containsKey(each)) {
                int timesPresented = map.get(each);
                map.replace(each, timesPresented, ++timesPresented);
            } else {
                map.put(each, 1);
            }
        }

        Assert.assertEquals(map.size(), 8);

        Assert.assertEquals(map.get('l').intValue(), 3);
    }
}
