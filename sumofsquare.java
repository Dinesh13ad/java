import java.util.*;
public class sumofsquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print(square(n) );
    }

    public static int square(int n){
         
        int sum=0;
        while(n>0){

            int m=n%10;
            sum=sum +(m*m);
            n=n/10;
        }
        return(sum);
    }
}