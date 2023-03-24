package programs_practice;

import java.util.HashMap;

public class CountDuplicateWordsInString {
    public static void main(String[] args) {
        String inputString = "Ramya Ramya Sachin Sachin Ramya Sachin ramya sachin";
        HashMap<String, Integer> map = new HashMap<>();
        String[] str = inputString.split(" ");
        for (String words : str) {
            if (map.containsKey(words)) {
                map.put(words, map.get(words) + 1);
            } else {
                map.put(words, 1);
            }
        }
        System.out.println(map);
    }
}
