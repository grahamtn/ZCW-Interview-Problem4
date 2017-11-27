package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Problem4Test {

    Problem4 problem4 = new Problem4();
    char[] actualArray = {'A','B','B','C','C','C'};

    @Test
    public void isPalindromeTest(){
        String expected = "YES";
        String actual = problem4.isPalindrome("cdcdcdcdeeeef");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void createAnagramPalindromeMap(){
        HashMap<Character, Integer> expected = new HashMap<Character, Integer>();
        expected.put('A',1);
        expected.put('B',2);
        expected.put('C', 3);

        char[] actualArray = {'A','B','B','C','C','C'};
        HashMap<Character,Integer> actual = problem4.createAnagramPalindromeMap(actualArray);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkPossiblePalindrome(){
        HashMap<Character, Integer> expectedMap = new HashMap<Character, Integer>();
        expectedMap.put('A',1);
        expectedMap.put('B',2);
        expectedMap.put('C', 4);

        boolean expected = true;
        boolean actual = problem4.checkPossiblePalindrome(expectedMap);

        Assert.assertEquals(expected,actual);
    }
}
