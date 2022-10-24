public class ReverseSEntences {
    public static void main(String[] args) {
        String st="welcome Java Class";
        String []st1=st.split(" ");

        for(int j=0; j<st1.length-1;j++){


        for(int i=st1[j].length()-1;i>=0;i--)

            System.out.print(st1[j].charAt(i));
            System.out.print(" ");}

        }
        }


   /*public class BankAccount {
        String name;
        String username;
        String password;
        String accountType;
        double balance;
        int transferLimit;

        void login(String confirmPassword){
            if (password.equals(confirmPassword)) {
                System.out.println("You may spend your money!");

            }else {
                System.out.println("You are broke!");
            }
        }
        void transfer(int sendMoney){
            if (sendMoney<balance) {
                System.out.println("Transfer is succesful");
            }else {
                System.out.println("Not enough balance");
            }
        }
    }public class BAccount {
        public static void main(String[] args) {
            BankAccount puskar = new BankAccount();

            puskar.password="blabla";
            puskar.balance=3000.99;

            puskar.login("blabla5");

            puskar.transfer(500);
        }
    }*/