import java.util.*;
public class cube{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print(cube(n)? "Perfect cube " : "Not perfect cube");
    }

    public static boolean cube(int n){
            int c=0;
        for(int i=1;i*i*i<=n;i++)
        {
            if(i*i*i==n)
            {
                return true;
            }
        }
        return false;
    }
}