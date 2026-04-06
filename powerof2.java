import java.util.*;
public class powerof2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        System.out.print(power(n)? "yes":"no");
    }
    public static boolean power(int n)
    {
        if(n%2==0)
        return true;
        return false;
    }
}
