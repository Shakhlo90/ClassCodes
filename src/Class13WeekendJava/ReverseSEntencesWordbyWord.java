package Class13WeekendJava;

public class ReverseSEntencesWordbyWord {
    public static void main(String[] args) {
        String str="is it Saturday? it is raining? Do we have Java classes today?";
      String[]  s=str.split("[?]");
      int num=0;
        for(int i=0; i<s.length;i++){
            num++;}
        System.out.println(num);

   String ss="this is sentences i want to reverse";



  String[]  w =ss.split(" ");


 String sp="";


    for(String ww:w){
      String rev="";
   for (int j=ww.length()-1; j>=0; j--)
        rev=rev+ww.charAt(j);
    sp=sp+rev+" ";}

        System.out.println(sp);


}

    }





