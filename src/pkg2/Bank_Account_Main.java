package pkg2;

public class Bank_Account_Main {

    public static void main(String[] args) {

        Bank_Account ba1 = new Bank_Account(13244, "Kevin Alani", 100);
        ba1.deposite(25);
        ba1.withdraw(50);
        ba1.display();
    }

}
