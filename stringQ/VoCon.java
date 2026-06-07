package stringsQ;

import java.util.Scanner;

//count vowels and Consonents present inside the String.
public class VoCon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.next();
        str=str.toLowerCase();
        System.out.println(str);
        int countV=0; //for Vowels
        int countC=0; //for Consonents
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                countV++;
            }else
                countC++;    
        }
        System.out.println("Vowels: "+countV);
        System.out.println("Consonents: "+countC);   
    }
}
