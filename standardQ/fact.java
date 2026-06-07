package standardQ;

import java.util.Scanner;

//Factorial of a Number
public class fact {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
}
