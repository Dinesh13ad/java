import java.util.*;
public class sumofodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print(sum(n));
    }

    public static int sum(int n){
        int ans=0;
        while(n>0)
        {
            int m=n%10;
            if(m%2!=0)
            {
                ans = ans + m;
            }
            n=n/10;

        }
        return ans;
    }
}