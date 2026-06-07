package standardQ;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number times fibonacci Number: ");
        int n=scan.nextInt();
        int first=0,second=1,next=0;
        System.out.println(first+" ");
        System.out.println(second+" ");
    //using for loop to print rest of the finbonacci series
        for(int i=2;i<=n;i++){
            next=first+second;
            System.out.println(next+" ");
            first=second; //interchanging the digits
            second=next;
        }
    }
}
