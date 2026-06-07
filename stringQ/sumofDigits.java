package stringsQ;

public class sumofDigits {
    public static void main(String[] args) {
        String str = "A1b2c3D4";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) { //checks if the string contains any digit
                sum += Integer.parseInt(ch + "");
            }
        }
        System.out.println(str + " sum = " + sum);
    }
}

/*
 * -------------------------------
 * Q.write a program that can
 * calculate the sum of all the digits present
 * in a Given String
 * Ex: str="A1B2C3D4"
 * O/p: 10
 * -------------------------------
 */