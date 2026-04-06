import java.util.*;
public class powerof3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        System.out.print(power(n)? "yes":"no");
    }
    public static boolean power(int n)
    {    
        if(n<=0)
        return false;

        while(n%3==0)
        {
            n=n/3;
        } 
        return n==1;
    }
}
