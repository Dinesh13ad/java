import java.util.*;

public class powerno{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter base :");
        int base=sc.nextInt();
        
        System.out.print("Enter power :");
        int power=sc.nextInt();
        System.out.print(powerno(base,power));
    
    }

    public static int powerno(int base , int power){
        int sum=1;
            for(int i=1;i<=power;i++)
            {
                sum=sum*base;
            }
            
        return sum;
    }
}
