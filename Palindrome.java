public class Palindrome {
    public static void main(String[] args) {

        int n = 121;
        int original = n;
        int rev = 0;

        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if(original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
