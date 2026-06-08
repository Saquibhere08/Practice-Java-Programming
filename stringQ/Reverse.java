package stringsQ;
//Reverse Each word in the String
public class Reverse {
    public static void main(String[] args) {
        String s="Hello World Hii";
        System.out.println(s);
        String [] ss=s.split(" ");
        String result="";
        for(int i=0;i<ss.length;i++){
            if(i==ss.length-1){
                result+=reverse(ss[i]);
            }
            else
                result+=reverse(ss[i]+" ");
        }
        System.out.println(result);
    }

    public static String reverse(String s){
        String res=" ";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }

}
