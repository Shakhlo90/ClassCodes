package Class17HW;

public class TestBankAccount {
    public static void main(String[] args) {
       BankAccount ba=new BankAccount("Stukhtaeva", "123pass");
    ba.logIn();
    BankAccount bb= new BankAccount("Stukhtaeva", "123pass",20000, 1000);
        System.out.println("Your reamain balance is "+bb.remain());
        System.out.println(bb.calculation());



    }


}
