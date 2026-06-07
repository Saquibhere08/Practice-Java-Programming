package stringsQ;
//imp. interview Question.
//Check weather a String is Palindrome or not Without reversing it.
class PalindromeStr1{
    public static void main(String[] args) {
        String s="Madam";
        s=s.toLowerCase();
        System.out.println(s);
        char [] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                System.out.println(s+"Not a Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println(s+" is Palindrome");
    }
}