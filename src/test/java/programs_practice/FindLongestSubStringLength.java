package programs_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubStringLength {
    public static void main(String[] args) {
        String inputStr = "INCOMPREHENSIVE";
        findLongestSubstringAndLenth(inputStr);
    }

    private static void findLongestSubstringAndLenth(String str) {
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>(); // linkedHashMap bcos insertion Order is preserved here.

        int lengthOfLongestSubString = 0;
        String longestSubString = null;

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > lengthOfLongestSubString) {
                lengthOfLongestSubString = map.size();
                longestSubString = map.keySet().toString();
            }
        }
        System.out.println("LongestSubString: " + longestSubString + " " + "Length of substring: " + lengthOfLongestSubString);
    }
}
