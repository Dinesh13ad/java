import java.util.*;
public class fibonaccinumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        fibonacci(0,1,n);
    }
    
    public static void fibonacci(int n1,int n2,int n)
    {
        for(int i=0;i<=n;i++)
        {
            if(i==n)
            {
                System.out.print(n1 +" ");
            }
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            
        }

    }
}
