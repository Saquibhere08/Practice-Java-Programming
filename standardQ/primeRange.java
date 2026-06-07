package standardQ;
import java.util.Scanner;

public class primeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start: ");
        int start = sc.nextInt();
        System.out.println("End: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num + " is a Prime");
            }
        }
    }
}