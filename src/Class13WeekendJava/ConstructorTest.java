package Class13WeekendJava;

public class ConstructorTest {
    String n;
    String b;
    int t;
     ConstructorTest(String n, String b, int t){
         this.n=n;
         this.b=b;
         this.t=t;

     }
     double d;
     ConstructorTest(String n, String b, int t, double d){
         this.n=n;
         this.b=b;
         this.d=d;

     }
     ConstructorTest(int t,  String n, String b ){

     }
}
class Tester{
    public static void main(String[] args) {
        ConstructorTest test= new ConstructorTest("Hello","Hello",89);
        System.out.println();
        ConstructorTest test1= new ConstructorTest("Hello","Hello",89, 67.0);


    }}