package stringsQ;

import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String: ");
        String s=sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
            
        }
        if(s.toLowerCase().equals(rev.toLowerCase()))
            System.out.println(s+" is a Plaindrome");
        else
            System.out.println(s+" not a Palindrome");            
    }
}
