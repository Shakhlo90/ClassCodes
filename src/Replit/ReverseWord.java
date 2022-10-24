package Replit;

public class ReverseWord {
   public static String reverse(String a){
        return new StringBuilder(a).reverse().toString()+" ";
    }
    public  static String vowels(String b){
       String st;
       st=b.replaceAll("[^aeiuo]", " ");
       return st;


    }

    public static void main(String[] args) {
        System.out.println(ReverseWord.reverse("Hello"));

        System.out.println(ReverseWord.vowels("Hello Shakhlo"));
    }
}
