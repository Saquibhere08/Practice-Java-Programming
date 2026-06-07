package standardQ;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("To Check Palindrome or Not?");
        System.out.println("Enter any Number: ");
        int n=sc.nextInt();
        int r, sum=0;
        int temp=n;

        while(n>0){
            r=n%10; //separate the last value
            n=n/10; //remove the last value
            sum=sum * 10 + r; //takes from the last value
        }//after n becomes 0, it will go out of the loop.

        if(temp==sum)
            System.out.println(temp+" is a plaindrome");
        else
            System.out.println(temp+" is not a Palindrome");

    }   
}
