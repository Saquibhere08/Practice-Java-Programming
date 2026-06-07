package recursionQ;
//Factorial using Recursion
import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int fact=1;
        factNum(num , fact);
    }
    public static void factNum(int num, int fact){
        
        if(num<=0){
            System.out.println("Factorial: "+fact);
            return;
        }
        fact=fact*num; 
        factNum(--num,fact);
    }
}
