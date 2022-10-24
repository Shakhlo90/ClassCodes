package Class17HW;

public class BankAccount {
    static String bankname;
    String username;
    String password;
    double balance;
    double sendAmount;
    double remainingBalance;

    BankAccount(String username, String password) {

        this.username = username;
        this.password = password;

    }

    BankAccount(String username, String password, double balance, double sendAmount) {
        this(username, password);
        this.balance = balance;
        this.sendAmount = sendAmount;

    }

    void logIn() {
        if (username.equals("Stukhtaeva")) {
            System.out.println("usename has been entered successfully");


            if (password.equals("123pass")) {
                System.out.println("You have successfully logged in");
            } else {
                System.out.println("Please enter valid  password");}

        }else{
            System.out.println("Please enter valid crediancials");
        }




    }

    String calculation() {
        if (balance > sendAmount)
            return "You have successfully send required amount";
        else if (balance < sendAmount) {


        }
        return "You do not have required amount";
    }


    double remain() {
        double ra = (int)balance - sendAmount;
        return ra;
    }

}
