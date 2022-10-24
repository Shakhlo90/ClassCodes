import java.util.Scanner;

public class Usage
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Account bank=new Account();
        System.out.println("enter your userid");
    bank.id=sc.nextLine();
        System.out.println("enter your password");
    bank.passuser=sc.nextLine();
    bank.login();
        System.out.println("enter your balance");
        bank.balance=sc.nextDouble()
;
        System.out.println("enter your Sending amount");
        bank.sendMoney=sc.nextDouble();
        bank.remain();




    }
}
