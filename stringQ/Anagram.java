package stringsQ;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="keep";
        String str2="peek";

        if(isAnagram(str1, str2))
            System.out.println(str1+" and "+str2+ " are Anagram");
        else
            System.out.println(str1+" and "+str2+ " are not Anagram");

    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        else{
            char []ch1=str1.toCharArray(); //converting into char []  array from Strings
            char []ch2=str2.toCharArray();

            Arrays.sort(ch1); //sorted the array in ascending order
            Arrays.sort(ch2);
            System.out.println(ch1);
            System.out.println(ch2);

            if(Arrays.equals(ch1,ch2)) //checking if both the char [] are equal or not using Arrays equal ().
                return true;
            else
                return false;
        }
    }
}
