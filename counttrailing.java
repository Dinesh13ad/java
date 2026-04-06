import java.util.*;
public class counttrailing{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        count(n);

    }
    public static void count(int n){

        int sum=1;
        for (int i=1;i<=n;i++){
            sum=sum*i; 
        }
        int c=0;
        for (int i=1;i<=sum;i++)
        {
            int m=sum%10;
            if(m==0)
            c++;
            sum=sum/10;
        }
        System.out.print(c);
    }
}