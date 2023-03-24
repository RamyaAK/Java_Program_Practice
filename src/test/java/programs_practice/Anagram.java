package programs_practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 ="God";
        String str2="Dog";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Not an Anagram");
        }

    }
}
