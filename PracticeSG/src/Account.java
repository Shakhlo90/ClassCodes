public class Account {
   String name;
    String id;
   String passuser;
    Double balance, sendMoney,  remaining;
    String password="Shakhlo987"; String userid="Shakhlo90";
   void login() {
       if (passuser.equals(password) && id.equals(userid)) {
           System.out.println("you have successfully confirmed");


       }
       else {
           System.out.println("You have incorrect password and userid");
       }
   }


   void remain(){
       if(balance>sendMoney){
           remaining=balance-sendMoney;
           System.out.println("Your reaming balance is "+remaining);
       }
       else {
           System.out.println("You do not have enough balance");
       }
   }
}
