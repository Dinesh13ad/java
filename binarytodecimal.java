import java.util.*;
public class binarytodecimal{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print(sum (n));
    }
    public static int sum(int n)
    {
        int sum=0,x=1;
        while(n>0){
        sum=sum+(n%10*x);
        x*=2;
        n/=10;
        }
        return sum;
    }
}