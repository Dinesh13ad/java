import java.util.*;
public class spynumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print(sum(n) ? "Spy Number" : "Not a Spy Number");
    }

    public static boolean sum(int n){
        int ans=0;
        int sum=1;
        while(n>0)
        {
            int m=n%10;
            ans =ans+m;
            sum =sum*m;
            n=n/10;

        }
        return sum==ans;
    }
}