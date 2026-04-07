import java.util.*;
public class karprekarno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isKaprekar(n)) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }

    public static boolean isKaprekar(int n) {
        if (n == 1) return true; // 1 is Kaprekar

        int square = n * n;
        int digits = String.valueOf(n).length();

        int divisor = (int) Math.pow(10, digits);

        int right = square % divisor;   // last digits
        int left = square / divisor;    // remaining part

        return (left + right) == n && right != 0;
    }
}