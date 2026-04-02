import java.util.*;
public class countofevenodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sum(n);
    }

    public static void sum(int n){
        int ans=0;
        int sum=0;
        while(n>0)
        {
            int m=n%10;
            if(m%2==0)
            {
                ans++;
            }
            else{
                sum++;
            }
            n=n/10;

        }
        System.out.print("even = " + ans);
        System.out.print(",odd = " + sum);
    }
}