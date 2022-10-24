package Class13WeekendJava;

import java.util.Scanner;

public class Class13SB {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter your sentence");
        String str=new String();
     str=sc.nextLine();
     String result=str.replaceAll(" ","");
        System.out.println(result);
    }
}
