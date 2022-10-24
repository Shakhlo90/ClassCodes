package Class13WeekendJava;

public class HWPractice {
    public static void main(String[] args) {
        String s2 = "This is sentences i want to reverse";

        String[] rr = s2.split(" ");

        String out = "";

        for (String arr2 : rr) {
            String rev = "";
            for (int j = arr2.length() - 1; j >= 0; j--){

                rev = rev+arr2.charAt(j);}

            out = out + rev+" " ;
        }

            System.out.println(out );

    }
}
