package Class13WeekendJava;

public class CountingAlphanumiricString {
    public static void main(String[] args) {

        String str = "YZCbgyu123$%*";
        char s;
        int sch = 0;
        int num = 0;
        int upp = 0;
        int low = 0;
        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i);
            if (s >= 'a' && s <= 'z') {
                low++;
            } else if (s >= 'A' && s <= 'Z') {
                upp++;
            } else if (s >= '0' && s <= '9') {
                num++;
            } else
                sch++;
        }
        System.out.println(str);
        System.out.println("The number of Upper case  is " + upp);
        System.out.println("The number of lower case is " + low);
        System.out.println("The number of numbers is is " + num);
        System.out.println("The number of special characters is  " + sch);
    }
}


