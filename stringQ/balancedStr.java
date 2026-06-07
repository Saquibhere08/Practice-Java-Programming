package stringsQ;

public class balancedStr {
    public static void main(String[] args) {
        String str="{[)()]}";
        while(str.contains("[]")||str.contains("{}")|| str.contains("()")){
            str=str.replace("[]","");
            str=str.replace("{}","");
            str=str.replace("()","");
        }

        if(str.isEmpty())
            System.out.println("Balanced");
        
        else
            System.out.println("Not Balanced");
    }   

}
