import java.util.*;
public class sumofprime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number:");
        int n=sc.nextInt();
        sum(n);
    }

    public static void sum(int n){
        int sum=0;
        while(n>0){
            int m=n%10;
                if( m==2 || m==3 || m==5 || m==7 )
                sum=sum+m;
            
        n=n/10;
        }
        System.out.print(sum);
    }
}