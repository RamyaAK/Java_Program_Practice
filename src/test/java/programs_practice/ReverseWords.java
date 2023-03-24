package programs_practice;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "I love java Programming";
        String s[] = str.split(" ");
        String result = "";

        for (int i = s.length - 1; i >= 0; i--) {
            result = result + s[i] + " ";
        }
        System.out.println("Input String: " + str);
        System.out.println("Reversed String: " + result);
    }

}
