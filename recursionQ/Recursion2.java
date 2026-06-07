package recursionQ;

import java.util.Scanner;

//Reverse a String using recursion
public class Recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String s = sc.next();
        
        char[] arr = s.toCharArray(); // we cannot reverse an String without converting it into char Array.
        int i = 0;
        int j = s.length() - 1;
        // System.out.println();reverseStr(i,j,arr);
        reverseStr(i, j, arr);
    }

    public static void reverseStr(int i, int j, char arr[]) {
        if (i == j) {
            System.out.println(new String(arr));
            return;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseStr(i++, --j, arr);
    }
}
