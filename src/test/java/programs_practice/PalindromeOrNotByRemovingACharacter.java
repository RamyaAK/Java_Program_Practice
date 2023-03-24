package programs_practice;

public class PalindromeOrNotByRemovingACharacter {
    public static void main(String[] args) {
        String str = "kanaka";

        Boolean isPalindrome = palindromeByRemovingChar(str);
        System.out.println(isPalindrome);
    }

    private static Boolean palindromeByRemovingChar(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s,left+1,right)||isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
