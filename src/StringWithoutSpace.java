import java.util.Scanner;

public class StringWithoutSpace {
    public static void main(String[] args) {
        System.out.println("Please enter the sentence");
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();

        System.out.println(st.replace(" ", ""));

    }
}
