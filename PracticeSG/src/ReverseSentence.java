public class ReverseSentence {
    public static void main(String[] args) {
         String str="Welcome Java Class";
         String[] result=str.split(" ");
         String[]r;
         for(int i=0; i<result.length;i++)
         {
             for (int j=result[i].length()-1;j>=0;j--){

                 System.out.print(result[i].charAt(j));}
             System.out.print(" ");

         }
         }
    }

