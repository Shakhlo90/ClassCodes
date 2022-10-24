package Replit;

public class Main1 {

    public static String mixString(String s1, String s2) {
        String str = "";
        for (int i = 0; i < s1.length(); i++) {
            str += s1.charAt(i);
            if (i < s2.length()) {
                str += s2.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);
    }


}