import java.util.*;
public class sumoffibb{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        fibonacci(0,1,n);
    }
    
    public static void fibonacci(int n1,int n2,int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+n1;
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            
        }
        System.out.print(sum);

    }
}
