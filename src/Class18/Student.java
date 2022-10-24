package Class18;

public class Student {
    String name;
    String address;
    public  Student( String name, String address){
         this.name=name;
         this.address=address;
     }
     void displayinfo(){
         System.out.println("name "+name+" address "+address);

     }

    public static void main(String[] args) {
        new Student("John", "Juanita Ln 123").displayinfo();
    }
}
