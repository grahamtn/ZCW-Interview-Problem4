package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

    public String isPalindrome(String input) {
        char[] charArrayofString = input.toCharArray();

        if (checkPossiblePalindrome(createAnagramPalindromeMap(charArrayofString))) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public HashMap createAnagramPalindromeMap(char[] charArray) {
        HashMap<Character, Integer> anagramMap = new HashMap<Character, Integer>();
        for (char letter : charArray) {
            if (anagramMap.containsKey(letter)) {
                Integer newItemCount = anagramMap.get(letter);
                newItemCount++;
                anagramMap.put(letter, newItemCount);
            } else {
                anagramMap.put(letter, 1);
            }
        }
        return anagramMap;
    }

    public boolean checkPossiblePalindrome(HashMap<Character, Integer> anagramMap) {
        int oddCount = 0;
        for (Map.Entry<Character, Integer> letter : anagramMap.entrySet()) {
            if (letter.getValue() % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 1) {
            return false;
        }
        return true;
    }


}
