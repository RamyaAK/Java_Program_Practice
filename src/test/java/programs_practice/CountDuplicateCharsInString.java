package programs_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountDuplicateCharsInString {
    public static void main(String[] args) {
        String input = "INCOMPREHENSIVE";

        int length = input.length()-1;
        Map<Character, Integer> map = new LinkedHashMap<>();

        char ch[] = input.toCharArray();

        for(char c: ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
