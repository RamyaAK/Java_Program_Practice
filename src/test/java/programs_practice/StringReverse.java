package programs_practice;

public class StringReverse {
    public static void main(String[] args) {
        String inputString = "vinay are you great?";
        char[] ch = inputString.toCharArray();
        reverseString(ch);
        String rev = new String(ch);
        System.out.println(rev);
        
    }

    private static void reverseString(char[] ch) {
        int r = ch.length-1;
        int l =0;
        while(l<r)
        {
            if(!Character.isAlphabetic(ch[l])){
                l++;
            } else if (!Character.isAlphabetic(ch[r])) {
                r--;
            }
            else{
                char temp = ch[r];
                ch[r] = ch[l];
                ch[l]=temp;
                l++;
                r--;
            }
        }
    }
}
