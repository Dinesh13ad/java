import java.util.*;
public class checkfibb{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        System.out.print (fibonacci(0,1,n)? "yes": "no");
    }
    
    public static boolean fibonacci(int n1,int n2,int n)
    {
    
        for(int i=1;i<=n;i++)
        {
            if(n1==n){
                return true ;
            }
            
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            
        }
        
    return false;
    }
}

