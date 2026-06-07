package stringsQ;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String: ");
        String s=sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
            
        }
        System.out.println(new String(rev));
            
        
    }
}
