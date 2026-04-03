import java.util.*;
public class sunnyno{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();

        System.out.print(sunny(n) ? "Sunny number" : "Not sunny number");

    }
    public static boolean sunny(int n){
        int next = n + 1;
        for(int i=1; i*i<=next; i++){
            if(i*i == next){
                return true;
            }
        }
        return false;
    }

}