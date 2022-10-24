public class BankAccount {
}
/*public class BankAccount {
    String name;
    String username;
    String password;
    String accountType;
    double balance;
    int transferLimit;
    double deifference;
    String confirmPassword;

    void login(){
        if (password.equals(confirmPassword)) {
            System.out.println("You may spend your money!");

        }else {
            System.out.println("You are broke!");
        }
    }
    void transfer(int sendMoney){
        if (sendMoney<balance) {
             deifference=balance-sendMoney;
            System.out.println("Transfer is succesful. Your remaining balance is "+deifference);
        }else {
            System.out.println("Not enough balance");
        }
    }
    void savings(String accountName){
        if (accountType.equals(accountName)){
            System.out.println("This is "+accountName);
        }else {
            System.out.println("Invalid");
        }
    }
    }



[8:13 PM]
public class BAccount {
    public static void main(String[] args) {
        BankAccount puskar = new BankAccount();

        puskar.password="blabla";
        puskar.balance=3000.99;
        puskar.confirmPassword="blabla";
        puskar.accountType="savings";
        puskar.login();
        puskar.savings("savings");

        puskar.transfer(500);

        public class OopAccount {
    String userName;
    String passWord;
    String accountType;
    double balance;
    double sendMony;
    double transferLimit;
    double remain;
    String output = null;

    void login(String comfirmedpass){
        if(!userName.isEmpty() && !passWord.isEmpty()){
            if(passWord.equals(comfirmedpass)){
                output = "You have successfully logged in.";
            }else{
                output = "You have entered wrong password";
            }
        }else{
            output = "Username and password should not be empty";
        }
        System.out.println(output);
    }
    void transferBalance(String nextAccount){
        if(!accountType.equalsIgnoreCase(nextAccount)){
            if(sendMony<balance){
                remain = balance-sendMony;
                output = "you have successfully transfer $" +sendMony+" to "+nextAccount+
                        " account.You have remaining balance is $"+remain;
            }else{
                output = "You do not have enough balance to transfer";
            }

        }else{
            output = "you cannot transfer balance to same account type";
        }
        System.out.println(output);

    }

}



[9:53 PM]
public class gettingInfo {
    public static void main(String[] args) {
        OopAccount prakriti = new OopAccount();
        prakriti.userName ="puskrity";
        prakriti.passWord = "balti123";
        prakriti.accountType = "checking";
        prakriti.balance = 5000;
        prakriti.sendMony = 1000;

        prakriti.login("balti123");
        prakriti.transferBalance("checking");
    }


}





    }
}*/