package leetcode;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReverseString {

    @Test
    public void testSolutionFromDiscussion() {
        char[] input = new char[]{'1', '2', '3', 'n', 'a', 'h'};

        reverseString(input);

        System.out.println(Arrays.toString(input));
    }

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[end];
            s[end--] = s[start];
            s[start++] = temp;
        }
    }
}
