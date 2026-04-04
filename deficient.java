import java.util.*;
public class deficient{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print(deficientno(n)? "Deficient number" : "Not deficient number");
    }

    public static boolean deficientno(int n){
        int sum =0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return (sum<n);
    }
}