import java.util.*;

public class ducknumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String n = sc.next();

        System.out.print(isDuck(n) ? "Duck Number" : "Not a Duck Number");
    }

    public static boolean isDuck(String n){
        // check first digit
        if(n.charAt(0) == '0'){
            return false;
        }

        // check for zero
        for(int i = 1; i < n.length(); i++){
            if(n.charAt(i) == '0'){
                return true;
            }
        }

        return false;
    }
}