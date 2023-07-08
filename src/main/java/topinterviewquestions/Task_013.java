package topinterviewquestions;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/?envType=featured-list&envId=top-interview-questions
public class Task_013 {

    public int romanToInt(String roman) {
        Map<Character, Integer> romanMap = getRomanMap();
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            char currentChar = roman.charAt(i);

            if (i > 0 && romanMap.get(currentChar) > romanMap.get(roman.charAt(i - 1))) {
                result +=  romanMap.get(currentChar) - ( 2 * romanMap.get(roman.charAt(i - 1)) );
            } else {
                result += romanMap.get(currentChar);
            }
        }

        return result;
    }

    private Map<Character, Integer> getRomanMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }
}