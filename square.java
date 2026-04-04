import java.util.*;
public class square{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print(square(n)? "Perfect Square " : "Not perfect square");
    }

    public static boolean square(int n){
            int c=0;
        for(int i=1;i*i<=n;i++)
        {
            if(i*i==n)
            {
                return true;
            }
        }
        return false;
    }
}