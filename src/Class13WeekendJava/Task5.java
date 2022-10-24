package Class13WeekendJava;

public class Task5 {
    public static void main(String[] args) {
        String s = "bob";

        boolean q = false;
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        if (s.equals(t)) {
            q = true;
        } else if (!s.equals(t)) {
            q = false;
        }
        System.out.println(q);
    }
}


