import java.util.*;
public class happyno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print(happy(n) ? "Happy number" : "Not a happy number");
    }

    public static boolean happy(int n){

       while( n!=1 && n!=4){
        int sum=0;
        while(n>0){

            int m=n%10;
            sum=sum +(m*m);
            n=n/10;

        }
         n=sum;
       } 
       return n==1;
    } 
}