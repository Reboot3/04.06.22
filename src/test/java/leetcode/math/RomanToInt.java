package leetcode.math;

import org.testng.annotations.Test;

import java.util.HashMap;

public class RomanToInt {

    private HashMap<Character, Integer> vals;

    @Test
    public void testRomanToInt() {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }

    public int romanToInt(String s) {
        initVals();

        int value1, value2;
        int sum = 0;
        char currentChar, nextChar;

        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            value1 = vals.get(currentChar);
            if (i != s.length() - 1) {
                nextChar = s.charAt(i + 1);
                value2 = vals.get(nextChar);
                if (value2 > value1) {
                    sum += (value2 - value1);
                    i++;
                } else sum += value1;
            } else sum += value1;
        }
        return sum;
    }

    private void initVals() {
        vals = new HashMap<>();
        vals.put('I', 1);
        vals.put('V', 5);
        vals.put('X', 10);
        vals.put('L', 50);
        vals.put('C', 100);
        vals.put('D', 500);
        vals.put('M', 1000);
    }

}
