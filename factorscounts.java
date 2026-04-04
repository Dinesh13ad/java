import java.util.*;
public class factorscounts{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print(countoffactors(n));
    }

    public static int countoffactors(int n){
            int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        return c;
    }
}