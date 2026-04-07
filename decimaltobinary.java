import java.util.*;
public class decimaltobinary{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print(sum (n));
    }
    public static String sum(int n)
    {
        String sum=" ";
        while(n>0){
        sum=n%2 +sum;
        n=n/2;
        }
        return sum;
    }
}