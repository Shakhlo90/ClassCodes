package Class13WeekendJava;

import java.util.Scanner;

public class Task2Sunday {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter string combination");
        String str = sc.nextLine();
        char s;
        int num = 0;
        int letters = 0;
        int upl = 0;
        char sch = 0;

        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i);
            if (s >= 'a' && s <= 'z') {
                letters++;
            } else if (s >= 'A' && s <= 'Z') {
                upl++;
            } else if (s >= '0' && s <= '9') {
                num++;
            } else sch++;
        }

        System.out.println(letters);
        System.out.println(upl);
        System.out.println(num);
        System.out.println(sch);


    }
}
