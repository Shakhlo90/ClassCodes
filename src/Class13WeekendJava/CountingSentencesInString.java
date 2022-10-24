package Class13WeekendJava;

import java.util.Scanner;

public class CountingSentencesInString {
    public static void main(String[] args) {



         /*
         *
         *
         *
         *
         *   Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            for(int i=0; i<word.length()-1;i+=2){*/






       /* Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        // write your code below


        for(int i =0; i<s.length();i++){

            System.out.print(s.charAt(i)+" ");}*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
int num=sc.nextInt();
        String[] arr = new String[num];
;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the name");
            arr[i] = sc.next();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j].substring(0,3));
        }

    }
}








